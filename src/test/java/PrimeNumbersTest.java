import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimeNumbersTest {

    @Test
    public void isPrime_SmallPrimeNumbers_True() {
        int[] smallPrimeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31,
                37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        for (int primeNumber : smallPrimeNumbers) {
            assertTrue(PrimeNumbers.isPrime(primeNumber));
        }
    }

    @Test
    public void isPrime_SmallCompositeNumbers_False() {
        int[] smallCompositeNumbers = {4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20,
                21, 22, 40, 42, 44, 45, 46, 48, 49, 50, 143, 144, 145, 146, 147, 148, 150};

        for (int compositeNumber : smallCompositeNumbers) {
            assertFalse(PrimeNumbers.isPrime(compositeNumber));
        }
    }

    @Test
    public void isPrime_LargePrimeNumbers_True() {
        int[] largePrimeNumbers = {62539, 83437, 111467};

        for (int primeNumber : largePrimeNumbers) {
            assertTrue(PrimeNumbers.isPrime(primeNumber));
        }
    }

    @Test
    public void isPrime_LargeCompositeNumbers_False() {
        int[] largeCompositeNumbers = {41041, 32791, 111468};

        for (int compositeNumber : largeCompositeNumbers) {
            assertFalse(PrimeNumbers.isPrime(compositeNumber));
        }
    }

    @Test
    public void isPrime_MaxInt_True() {
        assertTrue(PrimeNumbers.isPrime(2147483647));
    }

    @Test
    public void isPrime_NearMaxIntCompositeNumber_False() {
        assertFalse(PrimeNumbers.isPrime(2147483646));
    }

    @Test
    public void isPrime_NegativeNumbers_False() {
        int[] negativeNumbers = {-1, -3, -5, -6, -10, -17, -79, -97, -144, -150, -1000, -10000};

        for (int negativeNumber : negativeNumbers) {
            assertFalse(PrimeNumbers.isPrime(negativeNumber));
        }
    }

    @Test
    public void isPrime_ZeroAndOne_False() {
        assertFalse(PrimeNumbers.isPrime(0));
        assertFalse(PrimeNumbers.isPrime(1));
    }
}
