package chapter_07.review_Questions;

/**
 * Created by Syed Wajahat on 1/1/2020.
 */

public class FindMin extends MyTask {
    private Integer[] elements;
    private int a;
    private int b;

    public FindMin(Integer[] elements, int a, int b) {
        this.elements = elements;
        this.a = a;
        this.b = b;
    }

    public Integer compute() {
       /* if ((b -a)<2)
        return Math.min(elements[a], elements[b]);
        else{
            int m = a + ((b-a)/2);
            System.out.println(a + "," + m + "," + b);
            MyTask t1 = new FindMin(elements, a, m);
            //int result = t1.fork().join();
            return Math.min(new FindMin(elements, m, b).compute(), result);
        }*/
        return 1;
    }
}