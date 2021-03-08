package dk.easv;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableRandomGenerator implements Callable<Integer> {

    // Field containing the maximum number to be returned.
    private int maximum;

    public CallableRandomGenerator(int maximum) {
        this.maximum = maximum;
    }

    @Override
    public Integer call() throws Exception {

        // Will cause the calling thread to sleep for 1 second.
        Thread.sleep(1000);

        // Generate and return a random number.
        Random random = new Random();
        return random.nextInt(maximum);
    }
}
