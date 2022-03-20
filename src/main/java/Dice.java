import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Dice {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    private Integer numOfDice;
    private Integer sum = 0;
    private HashMap<Integer,Integer> dieAndSide = new HashMap<Integer, Integer>();


    public Dice(Integer numOfDice) {
        if (numOfDice < 0){
            System.out.println("You can't have negative dice, so we converted your entry into a positive integer.");
            numOfDice *= -1;
        }
        if (numOfDice == 0) {
            numOfDice = 0;
        }

        this.numOfDice = numOfDice;
    }

    public Integer tossAndSum() {
        sum = 0;
        if (numOfDice == 0){
            return null;
        }
        for (int i = 1; i <= numOfDice; i++){
            dieAndSide.put(i, random.nextInt(1,7));
            sum += dieAndSide.get(i);
        }
        return sum;
    }

    public Integer getNumOfDice() {
        return numOfDice;
    }

    public void setNumOfDice(Integer numOfDice) {
        this.numOfDice = numOfDice;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public HashMap<Integer, Integer> getDieAndSide() {
        return dieAndSide;
    }

    public void setDieAndSide(HashMap<Integer, Integer> dieAndSide) {
        this.dieAndSide = dieAndSide;
    }
}
