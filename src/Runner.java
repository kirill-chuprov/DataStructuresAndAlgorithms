import algoritms.ArrayWithSortingFeatures;

import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        ArrayWithSortingFeatures arrayWithSortingFeatures = new ArrayWithSortingFeatures(10);
        for (int i = 0; i < 10; i++) {
            Random rn = new Random();
            int range = 100 - 0 + 1;
            int randomNum =  rn.nextInt(range) + 0;
            arrayWithSortingFeatures.insert(randomNum);
        }
        arrayWithSortingFeatures.quickSort();
        arrayWithSortingFeatures.quickSort();
    }
}
