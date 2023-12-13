package chapter_06.using_try_with_resources;

import java.util.Scanner;

/**
 * Created by Syed Wajahat on 12/24/2019.
 */
public class Example_1 {
    public void myMethod(){
        try(Scanner s = new Scanner(System.in)){
            s.nextLine();
        }catch (Exception ex){
            /*
            Following line doest not compile because
            it is already closed at the end of the try block
             */
            //s.nextLine();
        }finally{
            //s is not available here as well
        }
    }
}
