package codes;

public class Watermelon {
    public String solution(int n) {
        String result = "";
        for(int i=0; i<n; i++){
            if(i%2==0){
                result += "수";
            } else{
                result += "박";
            }
        }
        
        return result;
    }
}
