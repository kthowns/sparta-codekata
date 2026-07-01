import java.time.*;
import java.time.format.*;
import java.util.*;

class PrivacyExpired {
    // 71-lev4-개인정보 수집 유효기간
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Term> termList = Arrays.stream(terms)
            .map((term) -> new Term(term)).toList();
        
        List<Privacy> privacyList = new ArrayList<>();
        
        for(int i=0; i<privacies.length; i++){
            privacyList.add(new Privacy(i, privacies[i], termList));
        }
        
        return privacyList.stream()
            .filter((privacy) -> privacy.isExpiredAt(today))
            .mapToInt((privacy) -> privacy.index)
            .toArray();
    }
}

class Term {
    String type;
    int expiredMonth;
    
    public Term(String termString) {
        String[] tmp = termString.split(" ");
        
        this.type = tmp[0];
        this.expiredMonth = (int)Integer.parseInt(tmp[1]);
    };
}

class Privacy {
    int index;
    Term term;
    LocalDate agreedAt;
    LocalDate expiredAt;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
    
    public Privacy(int index, String privacyString, List<Term> terms) {
        this.index = index + 1;
        String[] tmp = privacyString.split(" ");
        this.agreedAt = LocalDate.parse(tmp[0], this.formatter);
        for(Term term : terms){
            if(term.type.equals(tmp[1])){
                this.term = term;
            }
        }
        
        this.expiredAt = agreedAt.plusMonths(this.term.expiredMonth);
    }
    
    public boolean isExpiredAt(String today){
        LocalDate todayDate = LocalDate.parse(today, this.formatter);
        if(todayDate.isAfter(expiredAt) || todayDate.equals(expiredAt)){
            return true;
        }
        return false;
    }
}
