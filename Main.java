import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // #2.

        int[] arr = {3, 5, 7, 9, 4, 6, 8, 1, 2, 0};

        Scanner input = new Scanner(System.in);
        System.out.println("enter num: ");
        int arrPositionUpdate = Integer.parseInt(input.nextLine());
        do {

            try{

                for (int i = 0; i < arr.length; i++) {
                    arr[4] = arrPositionUpdate;
                }
                String stringArr = Arrays.toString(arr);

                System.out.println(stringArr);
                System.out.println(arrPositionUpdate);

                if(arrPositionUpdate == 0); break;


            }catch (Exception ex){
                System.out.println("confirming");
            }finally{
                input.close();
            }
        }while (arrPositionUpdate != 0);





    }
}
