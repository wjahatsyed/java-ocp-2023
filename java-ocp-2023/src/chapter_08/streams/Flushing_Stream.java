package chapter_08.streams;


/**
 * Created by Syed Wajahat on 1/4/2020.
 * The data when output to a file is not directly written to a file.
 * If the application terminates accidentally then flush() method if called
 * will take all accumulated data from the cache and save it into the file.
 * In a normal operation, data will be saved when the flush() method is called
 * eventually by the close() method of Closeable() interface.
 *
 * There ia a cost to use the flush method as the flush() method requests all data in
 * cache to be saved a file (disk) immediately.
 *
 */
public class Flushing_Stream {
}
