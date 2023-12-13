package chapter_06.exceptions;

import java.io.IOException;

/**
 * Created by Syed Wajahat on 12/24/2019.
 */
public class Multi_Catch_Examples {
    public static void main(String[] args) {
        /*try{
            throw new IOException();
        }catch (IOException | FileNotFoundException e){
            //This catch block does not compile because
            //FileNotFoundException is a sub class of IOException
        }*/

        //Multi-catch is effectively final
        try {
            throw new IOException();
        } catch (IOException | RuntimeException e) {
            //not allowed following line:
            //e = new RuntimeException();
            //above is allowed in normal catch
        }
    }
}
