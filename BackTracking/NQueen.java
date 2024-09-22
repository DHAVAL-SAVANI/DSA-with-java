public class NQueen {
    static int count=0;

    public  static void nQueenInNxN(char board[][], int row){
        //base case
        if(row==board.length){
            printBoard(board);
            System.out.println();
            return;
        }
        //recursion
        for(int i=0; i<board[0].length; i++){
            board[row][i] = 'Q';
            nQueenInNxN(board, row+1);
            board[row][i] = '_';
        }
    }

    public static void nQueen(char board[][], int row) {
        if (row == board.length) {
            printBoard(board);
            System.out.println();
            System.out.println();
            count++; // for counting solutions
            return;
            // return true; //for taking only one solution 
        }
        for(int j=0; j<board[0].length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueen(board, row+1);
                // if(nQueen(board,row+1)){ // ---for taking only one solution
                //     return true;
                // }
                board[row][j] = '_';
            }
        }
        //return false; //for taking only one solution 
    }

    public static boolean isSafe(char board[][], int row, int col){
        //vertical up
        for(int i=row; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //diagonaly left up
        for(int i=row, j=col; i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //diagonaly right up
        for(int i=row, j=col; i>=0 && j<board[0].length; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char board[][]){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {
        int n = 3;
        char board[][] = new char[n][n];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                board[i][j] = '_';
            }
        }
        nQueen(board, 0);
        // if(nQueen(board,0)){ // --------------for only one solution needed
        //     System.out.println("Solution is Possible.");
        // }else{
        //     System.out.println("Solution is not Possible.");
        // }
        System.out.println("Possible way for puting "+n+" Queen in "+n+"x"+n+" board is "+count);
    }
}