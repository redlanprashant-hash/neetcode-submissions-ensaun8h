class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        HashSet<Character>[] rows = new HashSet[n];
        HashSet<Character>[] cols = new HashSet[n];
        HashSet<Character>[] boxes = new HashSet[n];

        for(int i = 0; i < n; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){

                char val = board[row][col];
                if(val == '.'){
                    continue;
                }

                // checking for rows
                if(rows[row].contains(val)){
                    return false;
                }
                rows[row].add(val);

                //checking for cols
                if(cols[col].contains(val)){
                    return false;
                }
                cols[col].add(val);

                //checking for boxex
                int index = (row/3) + 3 * (col/3);
                if(boxes[index].contains(val)){
                    return false;
                }
                boxes[index].add(val);

            }
        }
        return true;

    }
}
