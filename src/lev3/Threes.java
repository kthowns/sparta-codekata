class Threes {
    // 42-lev3-삼총사
    public int solution(int[] number) {
        int result = 0;
        int n = number.length;
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(number[i] + number[j] + number[k] == 0){
                        result++;
                    }
                }
            }
        }
        
        return result;
    }
}
