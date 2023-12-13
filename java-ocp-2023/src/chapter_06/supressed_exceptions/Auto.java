package chapter_06.supressed_exceptions;

/**
 * Created by Syed Wajahat on 12/24/2019.
 * Try with resources closes all resources right after the try block run and before catch/finally are run
 * Try with resources closes resources in reverse order
 */
public class Auto implements AutoCloseable {
    int num;

    @Override
    public void close() {
        System.out.println("Closing " +num);
    }

    public Auto(int num) {
        super();
        this.num = num;
    }

    public static void main(String[] args) {
        try(Auto auto1 = new Auto(1); Auto auto2 = new Auto(2)){
            throw new IllegalStateException();
        }catch (Exception e){
            System.out.println("ex");
        }finally {
            System.out.println("finally");
        }
    }
}
