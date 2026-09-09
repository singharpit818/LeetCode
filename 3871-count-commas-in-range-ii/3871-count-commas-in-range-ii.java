class Solution {
    public long countCommas(long n) {
        return Math.max(n-999,0) 
        + Math.max(n-999999,0) 
        + Math.max(n-999999999L,0L) 
        + Math.max(n-999999999999L,0L) 
        + Math.max(n-999999999999999L,0L);
        
    }
}