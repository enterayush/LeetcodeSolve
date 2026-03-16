class Solution{
    List<Integer> generateRow(int row){
        int res=1;
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        for(int col=1;col<row;col++){
            res=res*(row-col);
            res=res/(col);
            temp.add(res);
        }
        return temp;
    }

    public List<List<Integer>> generate(int numRows) {    
        List<List<Integer>> res = new ArrayList<>();
        for(int i =1;i<=numRows;i++){
            res.add(generateRow(i));
        }
        return res;
    }
}







// class Solution {                    BRUTE FORCE
//     int ncr(int row, int col) {    to generate element by row coloum using ncr
//         int res = 1;
//         for (int i = 0; i < col; i++) {
//             res = res * (row - i);
//             res = res / (i + 1);
//         }
//         return res;

//     }
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> res = new ArrayList<>();

//         for (int i = 0; i < numRows; i++) {
//             List<Integer> temp = new ArrayList<>();
//             for (int j = 0; j <= i; j++) {
//                 temp.add(ncr(i, j));
//             }
//             res.add(temp);
//         }
//         return res;
//     }
// }