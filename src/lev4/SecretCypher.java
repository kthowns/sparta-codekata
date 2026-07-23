package lev4;

class SecretCypher {
    // 67-lev4-둘만의 암호
    public String solution(String s, String skip, int index) {
        char[] plain = s.toCharArray();
        
        for(int i=0; i<plain.length; i++){
            int cnt = 0;
            while(cnt < index){
                plain[i] = (char)(plain[i] + 1);
                if(plain[i] > 'z'){
                    plain[i] = 'a';
                }
                if(skip.contains(String.valueOf(plain[i]))){
                    continue;
                }
                cnt++;
            }
        }
        // a : 97, z : 122
        
        return String.valueOf(plain);
    }
}