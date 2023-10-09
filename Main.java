import entities.Car;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // #2.

        /*int[] arr = {3, 5, 7, 9, 4, 6, 8, 1, 2, 0};

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
                }else{
                    System.out.println("Correct num");
                }


            }catch (Exception ex){
                System.out.println("confirming");
            }finally{
                input.close();
            }*/

        //#3

        //int km, litri;

        Car usedcar = new Car("Mercedes", 20, 45);
        int[] arr = new int[]{(int) usedcar.getPetrolLtrs(), (int) usedcar.getKm()};
        Scanner input = new Scanner(System.in);

        try {

            System.out.println("enter km: ");

            System.out.println("How many litres of petrol?: ");
            int petrolConsumed = Integer.parseInt(input.nextLine());
            arr[0] = petrolConsumed;

            System.out.println("How many km traveled: ");
            int carKilometre = Integer.parseInt(input.nextLine());
            arr[1] = carKilometre;

            double petrolPerKm = Math.floor((arr[0] * 100) / arr[1]);

            System.out.println("You consumed " + petrolPerKm + " litres during your " + arr[1] + " km trip");


        } catch (Exception ex) {
            System.out.println("Confirm input");
        } finally {
            input.close();
        }
    }
}
