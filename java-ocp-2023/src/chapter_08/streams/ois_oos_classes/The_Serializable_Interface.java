package chapter_08.streams.ois_oos_classes;

/**
 * Created by Syed Wajahat on 1/5/2020.
 * In order to make an object serializable, we need to mark the class Serializable
 * using the Serializable interface.
 * To ensure, a class is properly marked Serializable, we need to ensure that
 * all the referenced object instance variables in the class also have Serializable
 * in their class definition otherwise NotSerializableException can occur.
 * We can use the transient if some of the reference objects in the class definition are
 * not Serializable.
 * transient and static objects would not be stored and their information will be lost.
 * We also need to use the serialVersionUID constant
 */
public class The_Serializable_Interface {
}
