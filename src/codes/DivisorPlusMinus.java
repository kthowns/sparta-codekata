package codes;

public class DivisorPlusMinus {
    public int solution(int left, int right) {
        int result = 0;
        for(int i=left; i<=right; i++){
            if(countYaksu(i)%2==0){
                result += i;
            }else{
                result -= i;
            }
        }
        
        return result;
    }
    
    public static int countYaksu(int n){
        if(n<1){
            return 0;
        }
        int cnt = 1;
        
        for(int i=2; i<=n; i++){
            if(n%i==0){
                cnt++;
            }
        }
        
        return cnt;
    }
}
