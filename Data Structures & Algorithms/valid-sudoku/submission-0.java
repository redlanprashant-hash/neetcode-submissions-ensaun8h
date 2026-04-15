class Solution {
    public boolean isValidSudoku(char[][] board) {
    
    int N = 9;
    HashSet<Character>[] rows = new HashSet[N];
    HashSet<Character>[] cols = new HashSet[N];
    HashSet<Character>[] boxes = new HashSet[N];

    for(int i = 0; i < N; i++){
        rows[i] = new HashSet<>();
        cols[i] = new HashSet<>();
        boxes[i] = new HashSet<>();
    }

    for(int row = 0; row < N; row++){
        for(int col = 0; col < N; col++){
            char value = board[row][col];

            if(value == '.'){
                continue;
            }

            //for rows
            if(rows[row].contains(value)){
                return false;
            }
            rows[row].add(value);

            //for cols
           if(cols[col].contains(value)){
                return false;
            }
            cols[col].add(value); 

            //for boxes
            int index = (row/3) * 3 + (col/3);
            if(boxes[index].contains(value)){
                return false;
            }
            boxes[index].add(value);

        }

    }
    return true;

    }
}
