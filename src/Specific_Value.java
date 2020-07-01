public class Specific_Value
{ public static boolean contains
        (int[]arr,int item)
{
    for(int n:arr)//apply for loop
    {
        if(item==n)
        {
            return true;
        }
    }
    return false;

}
public static void main(String[] args)//create main method
    {
        int array[]={1,2,3,4,5,6};
        System.out.println(contains(array,6));//print result
        System.out.println(contains(array,23));//print result

    }

}
