package arrays2D;

public class transpose {
    public static void main(String[] args) {
        int row =2;
        int col=4;
        int og_matrix[][]={{1,2,3,4},{5,6,7,8}};
        int tr_matrix[][]=new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                tr_matrix[j][i]=og_matrix[i][j];
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(tr_matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
