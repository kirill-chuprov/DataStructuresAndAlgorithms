package structures;

public class SortedArray {
    private final long[] array;
    private int numberOfElements;

    public SortedArray(int max) {
        array = new long[max];
        numberOfElements = 0;
    }

    public int size() {
        return numberOfElements;
    }

    public void insert(long value) {
        int j;
        for (j = 0; j < numberOfElements; j++)
            if (array[j] > value)
                break;
        for (int k = numberOfElements; k > j; k--)
            array[k] = array[k - 1];
        array[j] = value;
        numberOfElements++;
    }

    public boolean delete(long value) {
        int j = find(value);
        if (j == numberOfElements)
            return false;
        else {
            for (int k = j; k < numberOfElements; k++)
                array[k] = array[k + 1];
            numberOfElements--;
        }
        return true;
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = numberOfElements - 1;
        int curIn;
        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (array[curIn] == searchKey)
                return curIn;
            else if (lowerBound > upperBound)
                return array.length;
            else {
                if (array[curIn] < searchKey)
                    lowerBound = curIn + 1;
                else
                    upperBound = curIn - 1;
            }
        }
    }

    public static void printPrimes(int n) {
        boolean[] primes = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            primes[i] = true;
        }
        for (int divisor = 2; divisor * divisor <= n; divisor++) {
            if (primes[divisor]) {
                for (int i = 2 * divisor; i <= n; i = i + divisor) {
                    primes[i] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (primes[i]) System.out.println(" " + i);
        }
    }
}
