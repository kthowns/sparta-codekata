package lev4;

class FibonacciNum {
    // 78-lev4-피보나치 수
    public int solution(int n) {
        long[] f = new long[n+1];
        f[0] = 0;
        f[1] = 1;
        
        for(int i=2; i<=n; i++){
            f[i] = (f[i-2] + f[i-1]) % 1234567;
        }
        
        return (int)f[n];
    }
}
