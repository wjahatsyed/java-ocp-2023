package chapter_07.review_Questions;

import java.util.concurrent.ForkJoinTask;

/**
 * Created by Syed Wajahat on 1/1/2020.
 */
public abstract class MyTask extends ForkJoinTask {
    @Override
    public Object getRawResult() {
        return null;
    }

    @Override
    protected void setRawResult(Object value) {

    }

    @Override
    protected boolean exec() {
        return false;
    }
}
