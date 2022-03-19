import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
public class DiceTest {
    @Test
public void tossAndSumTest () {
        //Given
        Dice dice = new Dice(2);
        //When
        Integer toss = dice.tossAndSum();
        HashMap<Integer, Integer> dieAndSide = dice.getDieAndSide();
        Integer firstDieSum = dieAndSide.get(1);
        Integer secondDieSum = dieAndSide.get(2);
        Integer expected = firstDieSum + secondDieSum;
        Integer actual = toss;
        //Then
        assertEquals(actual, expected);
    }

    @Test
    public void tossAndSumTestNegativeValues() {
        //Given
        Dice dice = new Dice(-2);
        //When
        Integer toss = dice.tossAndSum();
        HashMap<Integer, Integer> dieAndSide = dice.getDieAndSide();
        Integer firstDieSum = dieAndSide.get(1);
        Integer secondDieSum = dieAndSide.get(2);
        Integer expected = firstDieSum + secondDieSum;
        Integer actual = toss;
        //Then
        assertEquals(actual, expected);
    }

    @Test
    public void tossAndSumTestZeroValue() {
        //Given
        Dice dice = new Dice(0);
        //When
        Integer toss = dice.tossAndSum();
        HashMap<Integer, Integer> dieAndSide = dice.getDieAndSide();
        Integer firstDieSum = dieAndSide.get(1);
        Integer secondDieSum = dieAndSide.get(2);
        Integer expected = null;
        Integer actual = toss;
        //Then
        assertEquals(actual, expected);
    }
}