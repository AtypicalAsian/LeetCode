class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        // diag = l^2 + w^2
        // Area = l * r
        int maxDiag = 0;
        int[] maxDiagTup = {0,0};
        int rows = dimensions.length;

        for (int[] row : dimensions){
            int diag = (int) Math.pow(row[0],2) + (int) Math.pow(row[1],2);         //avoid square root since it's a costly operation
            if (diag > maxDiag){
                maxDiag = diag;
                maxDiagTup[0] = row[0];
                maxDiagTup[1] = row[1];
            } else if (diag == maxDiag){
                int area1 = maxDiagTup[0] * maxDiagTup[1];
                int area2 = row[0] * row[1];
                maxDiagTup[0] = area2 > area1 ? row[0] : maxDiagTup[0];
                maxDiagTup[1] = area2 > area1 ? row[1] : maxDiagTup[1];
            }
        }
        return maxDiagTup[0] * maxDiagTup[1];
    }
}