public class Equality_of_2_Arrays
{
    public static void main(String[] args) //create main method
    {
        int row1, col1, row2, col2;
        boolean condition = true;
        int a[][] = {
                {1, 2, 3},
                {8, 4, 6},
                {4, 5, 7}
        };
        int b[][] = {
                {1, 2, 3},
                {8, 4, 6},
                {4, 5, 7}
        };
        row1 = a.length;//calculate numbers of row and column in first matrix
        col1 = a[0].length;

        row2 = b.length;//Calculates  numbers of rows and columns in second matrix
        col2 = b[0].length;

        if(row1 != row2 || col1 != col2)//apply if condition and check both matrix are equal or not
        {
            System.out.println("Matrices are not equal");
        }
        else {
            for(int i = 0; i < row1; i++){
                for(int j = 0; j < col1; j++){
                    if(a[i][j] != b[i][j]){
                        condition = false;
                        break;
                    }
                }
            }

            if(condition)
                System.out.println("Matrices are equal");
            else
                System.out.println("Matrices are not equal");
        }
    }
}


