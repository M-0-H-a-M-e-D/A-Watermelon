import java.util.Scanner;

public class Watermelon {

    public static String divideWatermelon(int x) {

        if (x >= 4) {

        if (x % 2 == 0) {
            if ((x - 2) % 2 == 0) {
              return  "Yes";
            }

            else {return  "No";}
        }
        else {return  "No";}}

        else {return  "No";}
    }
    public static void main(String args[])  //static method
    {Scanner inp = new Scanner(System.in);
        int y = inp.nextInt();
        System.out.println(divideWatermelon(y));
    }
}
