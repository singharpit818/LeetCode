class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int dig=9;

        StringBuilder s = new StringBuilder();
        if(sum>(9*num)){
            return s.toString();
        }
        while(num!=0){
            if(sum-dig>=0){
                sum=sum-dig;
                s.append(dig);
                num--;
            }
            else dig--;
        }
return s.toString();

        
    }
}