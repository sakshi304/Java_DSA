package Back_Tracking;
import java.util.Scanner;

class allSolutions {
    static int count=0;
    public static void solutions(char board[][], int row) {
        if (row == board.length) {
            count++;
            NQueens.print(board);
            return;
        }
        for (int j = 0; j < board.length; j++) {
            board[row][j] = 'Q';
            solutions(board, row + 1);
            board[row][j] = '.';               //as we back track we place queen in next column of the same row until col<=board.len()-1 .....so we need to remove the previous column queen         }
        }
    }
}

    class feasible {
    static int count=0;
        public static void fsolutions(char board[][], int row) {
            if (row == board.length) {
                count++;
                NQueens.print(board);
                return;
            }
            for (int j = 0; j < board.length; j++) {       // j is col
                if (isSafe(board, row, j)) {
                    board[row][j] = 'Q';

                    fsolutions(board, row + 1);
                    board[row][j] = '.';
                }

            }
        }

        public static boolean isSafe(char board[][], int row, int col) {
            //vertical check

            for (int i=row-1;i>=0;i--) {
                if (board[i][col] == 'Q') {

                    return false;
                }

            }
            //left diagonal
            for(int i=row-1,j=col-1;i >= 0 && j >= 0; i--,j--) {
                if (board[i][j] == 'Q') {


                    return false;
                }
            }
            //right diagonal
            for (int i=row-1,j=col+1;i >= 0 && j < board.length;i--,j++) {
                if (board[i][j] == 'Q') {

                    return false;
                }
            }
            return true;
        }
    }

    class yesNoSolution{                //if solution exists then print only single solution or return false if no solution exists
        public static boolean singlesolution(char[][]board,int row){
            if(row==board.length){
                return true;
            }
            for(int j=0;j< board.length;j++){
                if(feasible.isSafe(board,row,j)){
                        board[row][j]='Q';
                        if(singlesolution(board,row+1)){
                            return true;
                        }
                        board[row][j]='.';  // if above reaches till the end with a
                }
            }
            return false;
        }
    }

    public class NQueens {
        public static void print(char board[][]) {
            System.out.println("---------chess board---------");
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j]);
                    ;
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            int n = 4;
            char board[][] = new char[n][n];
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    board[i][j] = '.';
                }
            }
            System.out.println("Enter choice \n 1.All Solutions \n 2.Feasible Solutions \n 3.Yes/No Solution");
            int x = new Scanner(System.in).nextInt();
            switch (x) {
                case 1 -> {

                    allSolutions.solutions(board, 0);
                    System.out.println("All Solutions:  Total count = "+ allSolutions.count);

                }
                case 2 -> {

                    feasible.fsolutions(board, 0);
                    System.out.println("FEASIBLE SOLUTIONS:  Total count = "+feasible.count);

                }
                case 3 -> {
                    System.out.println("Yes/no SOLUTIONS");
                    if(yesNoSolution.singlesolution(board, 0)){
                        print(board);
                    }else{
                        System.out.println("No solution available");
                    }
                }

            }

        }
    }

