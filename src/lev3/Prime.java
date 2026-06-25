package lev3;

public class Prime {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		
		System.out.println(solution(nums));
	}
	
    public static int solution(int[] nums) {
        int n = nums.length;
        System.out.println("length : " + n);
        int answer = 0;
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    boolean isPrime = true;
                    for(int l=2; l<sum; l++){
                        if(sum%l==0){
                            isPrime = false;
                        }
                    }
                    if(isPrime){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
