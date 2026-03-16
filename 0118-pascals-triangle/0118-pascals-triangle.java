class Solution {
    int ncr(int row, int col) {
        int res = 1;
        for (int i = 0; i < col; i++) {
            res = res * (row - i);
            res = res / (i + 1);
        }
        return res;

    }

    public List<List<Integer>> generate(int numRows) {
        int row = 0;
        int col = 0;
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                temp.add(ncr(i, j));
            }
            res.add(temp);

        }
        return res;
    }
}