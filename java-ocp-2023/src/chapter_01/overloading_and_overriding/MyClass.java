package chapter_01.overloading_and_overriding;

/**
 * Created by Syed Wajahat on 12/1/2019.
 */
public class MyClass {
    /*
    Overloading rules:
    1. A method can be overloaded in a same class or in sub class - clear the misconception here
    2. For overloading, anything such as the return type or signature may change.
        The number of method parameters must change or at least the sequence must change
        or the type of parameter must be different.
    3. Access modifier does not take part in overloading.
    4. If return type is the only thing changed then parameter rule no.2 has to be applied
     */

    /*
    4 ways multiple overloaded methods are matched
    1. Exact match by type
    2. Matching parameters to a superclass type
    3. Matching parameter to autoboxed types
    4. Varargs
     */

    /*
    For overriding, there are certain rules:
    1. The return type must be the same or covariant return type - subclass of the return type
    which is in the parent class
    2. The method must be of the same access level of more accessible - if protected in parent
    class then it must be protected or public.
    3. If a method throws a checked exception, then same exception must be thrown by overridden method
    in sub class or an exception which is child of that exception must be thrown

    An  method must not be static - static methods are hidden not overridden
     */
}
