package chapter_08.review_questions;

import java.io.Serializable;

/**
 * Created by Syed Wajahat on 1/5/2020.
 */
public class Zebra implements Serializable {
    private static final long serialUID = 1L;
    private transient String name = "George";
    private static String birthPlace = "Africa";
    private transient Integer age;
    private java.util.List<Zebra> friends = new java.util.ArrayList<>();
    private Object tail = null;

    {
        age = 10;
    }

    public Zebra() {
        this.name = "Sophia";
    }
}
