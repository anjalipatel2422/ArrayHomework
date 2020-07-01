import java.util.Scanner;

public class Ascending_Order
{
    public static void main(String[] args)//create main method
    {
        int arr[] = new int[]{2,3,4,2,6,5};

        for (int i = 0; i <arr.length ; i++)//apply for loop
        {

        }
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j])//apply if condition
                {
                   int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Array numbers in Ascending Order: ");
        for (int i = 0; i < arr.length - 1; i++)
        {
            System.out.print(arr[i] + ", ");
        }

    }
}

