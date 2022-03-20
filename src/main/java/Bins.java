import java.util.HashMap;

public class Bins {
    Integer start;
    Integer end;
    HashMap<Integer,Integer> bins = new HashMap<>();


    public Bins(Integer start, Integer end) {
        if (start <= 0) {
            start = 1;
        }
        this.start = start;
        this.end = end;

        for (int i = start; i <= end; i++) {
            bins.put(i, 0);
        }
    }

    public void incrementBin(int tossSum) {
        if (tossSum < start || tossSum > end) {
            String errorMessage = "Your tossSum of %d is out of the Bin's range of %d and %d";
            throw new RuntimeException(String.format(errorMessage,tossSum, start, end));
        } else {
            bins.put(tossSum, (bins.get(tossSum) + 1));
        }
    }

    public Integer getBin(int binNumber) {
        return bins.get(binNumber);
    }
}
