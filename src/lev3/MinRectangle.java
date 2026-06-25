package lev3;

public class MinRectangle {
    //최소직사각형-Lev3-44
    public int solution(int[][] sizes) {
        int n = sizes.length;
        int xMax = 0;
        int yMax = 0;
        
        for(int i=0; i<n; i++){
        	xMax = Math.max(xMax, Math.max(sizes[i][0], sizes[i][1]));
        	yMax = Math.max(yMax, Math.min(sizes[i][0], sizes[i][1]));
        }
        
        return xMax * yMax;
    }
}
