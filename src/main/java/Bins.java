import java.util.HashMap;

public class Bins {
    Integer minSum;
    Integer maxSum;
    HashMap<Integer,Integer> bins = new HashMap<>();


    public Bins(Integer minSum, Integer  maxSum) {
        if (minSum <= 0) {
            minSum = 1;
        }
        this.minSum = minSum;
        this.maxSum = maxSum;

        for (int i = minSum; i <= maxSum; i++) {
            bins.put(i, 0);
        }
    }

    public void incrementBin(int tossSum) {
        if (tossSum < minSum || tossSum > maxSum) {
            String errorMessage = "Your tossSum of %d is out of the Bin's range of %d and %d";
            throw new RuntimeException(String.format(errorMessage,tossSum, minSum, maxSum));
        } else {
            bins.put(tossSum, (bins.get(tossSum) + 1));
        }
    }

    public Integer getBin(int binNumber) {
        return bins.get(binNumber);
    }
}
