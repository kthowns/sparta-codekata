package lev3;

public class MinRectangle {
    //최소직사각형-Lev3-44
    public int solution(int[][] sizes) {
        int n = sizes.length;
        int xMax = 0;
        int yMax = 0;
        
        for(int i=0; i<n; i++){
            int x = sizes[i][0];
            int y = sizes[i][1];
            
            if(x<y){
                x = sizes[i][1];
                y = sizes[i][0];
            }
            
            if(x > xMax){
                xMax = x;
            }
            if(y > yMax){
                yMax = y;
            }
        }
        
        return xMax * yMax;
    }
}
