package chapter_08.streams;

/**
 * Created by Syed Wajahat on 1/4/2020.
 * Byte vs Character streams
 * The ones with Stream keyword in the name are classes
 * which reach bytes or chunks of bytes while the classes
 * with Reader/Writer in their names read characters/string of characters
 * in single of chunks.
 * <p>
 * All data can be read using the Byte (Stream) classes like String or character as well
 * as eventually everything is binary or bytes but Reader/Writer classes are more focused
 * on helping with strings and characters. They are considered convenience classes when dealing
 * with text.
 *
 * Every class in Reader/Writer have corresponding classes of Input and Output except for Print.
 * We have PrintWriter and PrintStream which do not have any corresponding classes.
 */
public class Different_Streams {
    public static void main(String[] args) {

    }
}
