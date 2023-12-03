class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for (int i = 1; i < points.length; i++) {
            int[] from = points[i-1];
            int[] to = points[i];
            int xDiff = Math.abs(from[0]-to[0]);
            int yDiff = Math.abs(from[1]-to[1]);
            time += Math.max(xDiff, yDiff);
        }
        return time;
    }
}
