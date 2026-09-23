class Solution {
    public int wateringPlants(int[] p, int c) {

        int hold = c;
        int count = 0;
        for (int i = 0; i < p.length; i++) {
            if (hold < p[i]) {
                count += 2 * i;
                hold = c;
            }

            hold -= p[i];
            count++;
        }

        return count;
    }
}