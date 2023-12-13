/**
 * Created by Syed Wajahat on 3/30/2020.
 */
public class PrintRecursive {
    public static void main(String[] args){
        printRecursive(1,3);
    }
    public static void printRecursive(int start,
                                      int end) {
        System.out.println(start);
        if (start < end) {
            start++;
            printRecursive(start, end);
        } else {
            start--;
        }
    }
}
