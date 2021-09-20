import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeNumbersTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
            41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97})
    public void isPrime_SmallPrimeNumbers_True(int primeNumber) {
        assertTrue(PrimeNumbers.isPrime(primeNumber));
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 22, 40,
            42, 44, 45, 46, 48, 49, 50, 143, 144, 145, 146, 147, 148, 150})
    public void isPrime_SmallCompositeNumbers_False(int compositeNumber) {
        assertFalse(PrimeNumbers.isPrime(compositeNumber));
    }

    @ParameterizedTest
    @ValueSource(ints = {62539, 83437, 111467})
    public void isPrime_LargePrimeNumbers_True(int primeNumber) {
        assertTrue(PrimeNumbers.isPrime(primeNumber));
    }

    @ParameterizedTest
    @ValueSource(ints = {41041, 32791, 111468})
    public void isPrime_LargeCompositeNumbers_False(int compositeNumber) {
        assertFalse(PrimeNumbers.isPrime(compositeNumber));
    }

    @Test
    public void isPrime_MaxInt_True() {
        assertTrue(PrimeNumbers.isPrime(Integer.MAX_VALUE));
    }

    @Test
    public void isPrime_NearMaxIntCompositeNumber_False() {
        assertFalse(PrimeNumbers.isPrime(2147483646));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -3, -5, -6, -10, -17, -79, -97, -144, -150, -1000, -10000})
    public void isPrime_NegativeNumbers_False(int negativeNumber) {
        assertFalse(PrimeNumbers.isPrime(negativeNumber));
    }

    @Test
    public void isPrime_ZeroAndOne_False() {
        assertFalse(PrimeNumbers.isPrime(0));
        assertFalse(PrimeNumbers.isPrime(1));
    }
}
