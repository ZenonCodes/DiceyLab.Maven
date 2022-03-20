import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Simulation {
    int numberOfDies;
    int numberOfTosses;
    int maxTossSum;
    int minTossSum;
    Dice dice;
    Bins bin;


    public Simulation(int numberOfDies, int numberOfTosses) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        dice = new Dice(numberOfDies);
        maxTossSum = 6 * numberOfDies;
        minTossSum = 1 * numberOfDies;
        bin = new Bins(minTossSum, maxTossSum);
    }

    public void runSimulation() {
        for (int i = 0; i < numberOfTosses; i++) {
            bin.incrementBin(dice.tossAndSum());
        }
    }

    public void printResults() {

        System.out.println("***\n" +
                    "Simulation of " + numberOfDies + " dice tossed for " + numberOfTosses + " times.\n" +
                    "***");
            for(int i = minTossSum; i <= maxTossSum; i ++) {
                System.out.printf("%3d : \t %5d: %.2f ", i, bin.getBin(i), bin.getBin(i)/(numberOfTosses*1.0));
                for (int j = 0; j < i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

    }
    public static void main(String[] args){
        Simulation sim = new Simulation(2, 100000);
        sim.runSimulation();
        sim.printResults();
    }
}
