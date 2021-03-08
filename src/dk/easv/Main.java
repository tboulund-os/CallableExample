package dk.easv;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {

        // Creates an instance of the callable that will return a random number
        Callable<Integer> randomizer = new CallableRandomGenerator(100);

        // Prepares an executor service to take care of the asynchronous work
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Add the randomizer to the executor service and retrieve a future value.
        Future<Integer> future = executorService.submit(randomizer);

        Integer result = null;
        try {
            // Blocks the calling thread until a result is ready.
            result = future.get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(result);
        executorService.shutdown();

    }
}
