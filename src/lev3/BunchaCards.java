package lev3;

public class BunchaCards {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // 55-카드뭉치, Lev3
        int pt1 = 0, pt2 = 0;
        
        for (String word : goal) {
            if (pt1 < cards1.length && word.equals(cards1[pt1])) {
                pt1++;
            } else if (pt2 < cards2.length && word.equals(cards2[pt2])) {
                pt2++;
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}
