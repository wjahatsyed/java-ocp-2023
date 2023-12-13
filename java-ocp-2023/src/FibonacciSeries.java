/**
 * Created by Syed Wajahat on 3/25/2020.
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        //
        System.out.println(getFib(7));
    }


    public static int getFib(int number) {
        if (number == 1 || number == 2) {
            return number;

        }
        return getFib(number - 1) + getFib(number - 2);

    }

}