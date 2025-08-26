import java.util.Random;

public class projectfour {

    // Method to generate a Bernoulli-distributed value (0 or 1)
    public static int bernoulliSample(double p) {
        // Clamp p to valid range [0, 1] without throwing errors
        if (p < 0) {
            p = 0;
        } else if (p > 1) {
            p = 1;
        }

        Random rand = new Random();
        double r = rand.nextDouble(); // Generates a random number in [0, 1)

        if (r < p) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        double p = 0.7; // Example probability

        // Generate and print 10 samples
        for (int i = 0; i < 10; i++) {
            int sample = bernoulliSample(p);
            System.out.println("Sample " + (i + 1) + ": " + sample);
        }
    }
}