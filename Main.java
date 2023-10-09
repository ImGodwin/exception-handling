import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // #2.

        int[] arr = {3, 5, 7, 9, 4, 6, 8, 1, 2, 0};

        Scanner input = new Scanner(System.in);


            try{
                System.out.println("enter num: ");
                int arrPositionUpdate = Integer.parseInt(input.nextLine());
                for (int i = 0; i < arr.length; i++) {
                    arr[4] = arrPositionUpdate;
                }
                String stringArr = Arrays.toString(arr);

                System.out.println(stringArr);
                //System.out.println(arrPositionUpdate);
                if(arrPositionUpdate != 0) {
                    System.out.println("enter num again");
                }


            }catch (Exception ex){
                System.out.println("confirming");
            }finally{
                input.close();
            }
        }





    }
