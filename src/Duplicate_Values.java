public class Duplicate_Values
{
    public static void main(String[] args) //create main method
    {
        int arr[]= new int []{2,3,5,6,2,5,4,6};//declaration and instantiation number
        System.out.println("Duplicate numbers are");

        for(int a=0;a<arr.length;a++)//apply for loop
        {
            for (int b = a + 1; b < arr.length; b++) {
                if (arr[a] == arr[b])
                    System.out.println(arr[b]);
                {

                }
            }
        }}}

