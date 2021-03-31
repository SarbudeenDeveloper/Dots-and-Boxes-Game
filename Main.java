import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

    static void initMatrix(int[][] matrix, int r, int c) {
        int count = 1;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if ((i + 1) % 2 != 0 && (j + 1) % 2 != 0) {
                    matrix[i][j] = count++;
                } else {
                    matrix[i][j] = -1;
                }
            }
        }
    }

    static void printMatrix(int[][] matrix, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == -1)
                    System.out.print("  ");
                else if (matrix[i][j] == 0) {
                    char symbol = (i % 2 == 0) ? '-' : '|';
                    System.out.print(symbol + " ");
                } else if (matrix[i][j] == -2) {
                    System.out.print("p1 ");
                } else if (matrix[i][j] == -3) {
                    System.out.print("p2 ");
                } else
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean checkEmpty(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == -1) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean getPlayer1Input(int[][] board, int rLen, int cLen, boolean isUser) {
        String player = (isUser == true) ? "P1:":"P2:";
        System.out.println("Enter Input for Player " + player);
        int r, c;
        r = s.nextInt();
        c = s.nextInt();

        if (r + 1 == c) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == r) {
                        if(j == board[i].length - 1) {
                            return false;
                        }
                        if (board[i][j + 1] == -1) {
                            board[i][j + 1] = 0;
                        } else {
                            return false;
                        }
                        break;
                    }
                }
            }
        } else if (r - 1 == c) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == r) {
                        if(j == 0) {
                            return false;
                        }
                        if (board[i][j - 1] == -1) {
                            board[i][j - 1] = 0;
                        } else {
                            return false;
                        }
                        break;
                    }
                }
            }
        } else if (r + cLen == c) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == r) {
                        if (board[i + 1][j] == -1) {
                            board[i + 1][j] = 0;
                        } else {
                            return false;
                        }
                        break;
                    }
                }
            }
        } else if (r - cLen == c) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == r) {
                        if (board[i - 1][j] == -1) {
                            board[i - 1][j] = 0;
                        } else {
                            return false;
                        }
                        break;
                    }
                }
            }
        } else {
            return false;
        }

        return true;
    }

    static boolean checkSquare(int[][] board, boolean isUser) {
        boolean isSquare = false;

        for(int i=1; i<board.length; i += 2)
        {
            for(int j=0; j<board[i].length - 2; j += 2) {
                if(board[i][j] == 0 && board[i][j+1] == -1) {
                    if(board[i][j+2] == 0 && board[i+1][j+1] == 0 && board[i-1][j+1] == 0) {
                        isSquare = true;
                        if(isUser) {
                            board[i][j+1] = -2;
                        } else {
                            board[i][j+1] = -3;
                        }
                    }
                }
            }
        }


        return isSquare;
    }

    static void printScore(int[][] board) {
        int p1 = 0, p2 = 0;
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[i].length; j++)
            {
                if(board[i][j] == -2)
                {
                    p1 += 1;
                } else if(board[i][j] == -3)
                {
                    p2 += 1;
                }
            }
        }

        if(p1 == p2) {
            System.out.println("Game tied");
        } else {
            System.out.println("Player 1 Score : "+p1);
            System.out.println("Player 2 Score : "+p2);
        }
        
    }
    public static void main(String[] args) {
        int r, c;
        boolean playerTurn = true;
        do {
        System.out.println("Enter R and C : ");
        r = s.nextInt();
        c = s.nextInt();
        } while(r <= 1 || c <= 1);

        int rlen, clen;
        rlen = r + (r - 1);
        clen = c + (c - 1);
        int[][] board = new int[rlen][clen];
        initMatrix(board, rlen, clen);
        printMatrix(board, rlen, clen);
        while (checkEmpty(board)) {
            if(getPlayer1Input(board, r, c, playerTurn)) {
                if(!checkSquare(board, playerTurn))
                {
                    playerTurn = !playerTurn;
                }
                printMatrix(board, rlen, clen);
            }
        }

        printScore(board);
    }
}