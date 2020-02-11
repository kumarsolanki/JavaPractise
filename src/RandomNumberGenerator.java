import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        System.out.println("Program starts..");
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt(2)); // return random number between 0 to (2-1)
            System.out.println(random.nextFloat());
            System.out.println(random.nextDouble());
        }
        System.out.println("Using Math Random..");
        System.out.println(Math.random()); // returns +ve  double value between 0.0 and 1.0
        System.out.println("using Thread Local Random..");
        System.out.println(ThreadLocalRandom.current().nextBoolean());
        System.out.println(ThreadLocalRandom.current().nextInt(10));
        System.out.println(ThreadLocalRandom.current().nextLong(2));
        System.out.println(ThreadLocalRandom.current().nextFloat());
        for (int i = 0; i < 100; i++) {
            System.out.println(ThreadLocalRandom.current().nextDouble(1.0, 10.0));
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(ThreadLocalRandom.current().nextBoolean());
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(ThreadLocalRandom.current().nextInt(10));
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(ThreadLocalRandom.current().nextLong(10));
        }
        System.out.println("Program ends..");
    }
}
