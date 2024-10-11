public class CoinFlip {
    CoinFlip() {

    }

    public String Flip() {
        // Math.random() * 2 returns 0 or 1
        // System.out.println((int) (Math.random() * 2));
        return (int) (Math.random() * 2) == 1 ? "heads" : "tails";
    }

    public double Simulate(int numOfFlips) {
        // double[] arr = new double[numOfFlips];
        double heads = 0;
        for (int i = 0; i < numOfFlips; i++) {
            // arr[i] = Math.random() * 2;
            heads += ((int) (Math.random() * 2) == 1) ? 1.0 : 0.0;
        }
        return heads / numOfFlips;
    }
}