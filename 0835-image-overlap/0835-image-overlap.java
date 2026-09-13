class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {

        int n = img1.length;

        ArrayList<int[]> a = new ArrayList<>();
        ArrayList<int[]> b = new ArrayList<>();

        // Store coordinates of 1s in img1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (img1[i][j] == 1) {
                    a.add(new int[]{i, j});
                }
            }
        }

        // Store coordinates of 1s in img2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (img2[i][j] == 1) {
                    b.add(new int[]{i, j});
                }
            }
        }

        HashMap<String, Integer> map = new HashMap<>();

        int ans = 0;

        for (int[] x : a) {
            for (int[] y : b) {

                int dr = y[0] - x[0];
                int dc = y[1] - x[1];

                String key = dr + "," + dc;

                int count = map.getOrDefault(key, 0) + 1;

                map.put(key, count);

                ans = Math.max(ans, count);
            }
        }

        return ans;
    }
}