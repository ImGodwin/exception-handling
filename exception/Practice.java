package exception;

public class Practice {

    public static void main(String[] args) {
        //exceptions are of 3 types
        //throwable extended by Exceptions and Errors
        //Exception you can handle
        //types (Checked and unchecked)
        //checked mean the error is known
        //types of checked are IOException and SQLException
        //unchecked means the error is not known
        //types of unchecked are Runtime exception
        //Runtime has lots of excpetions
        // e.g ArithmeticExcepton
        //Errors u cannot handle
        //when putting assignment in a block,
        // make sure your declaration assigns a value
        //Runtime extends Exception while Exception extends throwable


        //first example of an unchecked exception
        int i = 8, j = 2, k = 0;
        int[] a = new int[4];

        //System.out.println(k);

        try{
            k = 1/j;
            for (int l = 0; l < a.length; l++)
            {
                a[l] = l + 1;
            }

            for (int value : a)
            {
                System.out.println(value);
            }
        }catch(Exception e)
        {
            System.out.println("cannot divide by zero");
        }
        System.out.println(k);



    }
}
