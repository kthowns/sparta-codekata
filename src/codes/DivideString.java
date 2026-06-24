package codes;

class DivideString {
    public int solution(String s) {
        int result = 0;
        int cntSame = 0;
        int cntDiff = 0;
        char first = s.charAt(0);
        
        for(int i=0; i<s.length(); i++){
            if(cntSame==cntDiff){
                result++;
                cntSame=0;
                cntDiff=0;
                first=s.charAt(i);
            }
            
            if(first==s.charAt(i)){
                cntSame++;
            }else{
                cntDiff++;
            }
        }
        
        return result;
    }
}