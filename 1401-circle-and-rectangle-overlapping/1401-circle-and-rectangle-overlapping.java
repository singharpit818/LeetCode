class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        if(x1<xCenter && x2>xCenter && y1<yCenter && y2>yCenter){
            return true;
        }
       int r = radius*radius;
       double a = Math.pow((x1-xCenter),2);
       double b = Math.pow((y1-yCenter),2);
       double c = Math.pow((x2-xCenter),2);
       double d = Math.pow((y2-yCenter),2);
       for(int i = y1 ; i<=y2 ; i++){
        if(a+Math.pow((i-yCenter),2)<=r) return true;
        if(c+Math.pow((i-yCenter),2)<=r) return true;
       }
       for(int i = x1 ; i<=x2 ; i++){
        if(b+Math.pow((i-xCenter),2)<=r) return true;
        if(d+Math.pow((i-xCenter),2)<=r) return true;
       }
        return false;
        
    }
}