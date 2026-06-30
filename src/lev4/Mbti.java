class Mbti {
    // 69-lev4-성격 유형 검사하기
    public String solution(String[] survey, int[] choices) {
        String result = "";
        int n = survey.length;
        int[][] points = new int[4][2];
        
        for(int i=0; i<n; i++){
            String question = survey[i];
            int choice = choices[i];
            
            if(question.equals("RT")){
                if(choice < 4) {
                    points[0][0] += Math.abs(choice-4);
                } else if(choice > 4) {
                    points[0][1] += choice-4;
                }
            } else if(question.equals("TR")){
                if(choice < 4) {
                    points[0][1] += Math.abs(choice-4);
                } else if(choice > 4) {
                    points[0][0] += choice-4;
                }
            } else if(question.equals("CF")){
                if(choice < 4) {
                    points[1][0] += Math.abs(choice-4);
                } else if(choice > 4) {
                    points[1][1] += choice-4;
                }
            } else if(question.equals("FC")){
                if(choice < 4) {
                    points[1][1] += Math.abs(choice-4);
                } else if(choice > 4) {
                    points[1][0] += choice-4;
                }
            } else if(question.equals("JM")){
                if(choice < 4) {
                    points[2][0] += Math.abs(choice-4);
                } else if(choice > 4) {
                    points[2][1] += choice-4;
                }
            } else if(question.equals("MJ")){
                if(choice < 4) {
                    points[2][1] += Math.abs(choice-4);
                } else if(choice > 4) {
                    points[2][0] += choice-4;
                }
            } else if(question.equals("AN")){
                if(choice < 4) {
                    points[3][0] += Math.abs(choice-4);
                } else if(choice > 4) {
                    points[3][1] += choice-4;
                }
            } else if(question.equals("NA")){
                if(choice < 4) {
                    points[3][1] += Math.abs(choice-4);
                } else if(choice > 4) {
                    points[3][0] += choice-4;
                }
            }
        }
        
        if(points[0][0] >= points[0][1]){
            result += "R";
        } else {
            result += "T";
        }
        
        if(points[1][0] >= points[1][1]){
            result += "C";
        } else {
            result += "F";
        }
        
        if(points[2][0] >= points[2][1]){
            result += "J";
        } else {
            result += "M";
        }
        
        if(points[3][0] >= points[3][1]){
            result += "A";
        } else {
            result += "N";
        }
        
        return result;
    }
}