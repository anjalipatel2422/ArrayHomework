public class Sum_Values
{
    static int arr[] = {12,3,4,15,5};
    static int sum()//create method
    {
        int sum=0; // initialize sum

        for (int i = 0; i < arr.length; i++)//apply for loop
            sum +=  arr[i];

        return  sum;
    }
    public static void main(String[] args)//create main method
    {
        System.out.println("Sum of given array is " + sum());
    }
}

