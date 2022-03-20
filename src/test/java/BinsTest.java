import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinsTest {
    @Test
    public void BinResultsIncrementsBin(){
        //Given
        Bins results = new Bins(2,12);
        Integer numberOfTens = results.getBin(10);
        Integer actual = 5;
        for (int i = 0; i < actual; i++) {
            results.incrementBin(10);
        }
        System.out.println("Number of tens before incrementing:");
        System.out.println(numberOfTens);
        System.out.println("Number of tens after incrementing:");
        System.out.println(results.getBin(10));
        // When
        Integer expected = results.getBin(10);

        //Then
        assertEquals(expected,actual);

    }

    @Test
    public void BinResultsIncrementsBinNegativeTest(){
        //Given
        Integer start = 2;
        Integer end = 12;
        Integer tossSum = -20;
        Bins results = new Bins(2,12);
        Integer numberOfTens = results.getBin(10);
        Integer actual = 5;
        // When
        Exception expected = assertThrows(RuntimeException.class, () ->{
                    for (int i = 0; i < actual; i++) {
                        results.incrementBin(tossSum);
                    }
                });
        String expectedMessage = "Your tossSum of " + tossSum +
                " is out of the Bin's range of " + start + " and " + end;
        String actualMessage = expected.getMessage();

        //Then
        assertTrue(actualMessage.contains(expectedMessage));
    }

}