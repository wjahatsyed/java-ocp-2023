package chapter_07.synchronize_data_access.protecting_data_with_atomic_classes;

import java.util.concurrent.atomic.*;

/**
 * Created by Syed Wajahat on 12/29/2019.
 * Atomic operation is the one which protects the data which it is accessing
 * until the operation is complete.
 * Atomic classes are for primitives and references
 */
public class Atomic_Classes {
    //There are a lot of corresponding AtomicClasses
    AtomicBoolean atomicBoolean; //boolean
    AtomicInteger atomicInteger; //int
    AtomicIntegerArray atomicIntegerArray; //int array
    AtomicLong atomicLong; //long
    AtomicLongArray atomicLongArray; //long array
    AtomicReference<String> stringAtomicReference; //reference of string
    AtomicReferenceArray<?> atomicReferenceArray; //array of T references
}
