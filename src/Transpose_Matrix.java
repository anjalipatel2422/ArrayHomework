public class Transpose_Matrix
{
    public static void main(String[] args) {

            int a[][] = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int rows = a.length; //Calculates number of rows and columns in given matrix
            int cols = a[0].length;

            int num[][] = new int[cols][rows];//Declare array  with reverse dimensions


            for(int i = 0; i < cols; i++){
                for(int j = 0; j < rows; j++)//Converts the row of original matrix into column of transposed matrix
                {
                    num[i][j] = a[j][i];
                }
            }

            System.out.println("Transpose of given matrix: ");
            for(int i = 0; i < cols; i++){
                for(int j = 0; j < rows; j++){
                    System.out.print(num[i][j] + " ");
                }
                System.out.println();
            }
        }
    }



