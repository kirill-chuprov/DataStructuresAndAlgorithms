import algoritms.ArrayWithSortingFeatures;

public class Runner {
    public static void main(String[] args) {
        ArrayWithSortingFeatures arrayWithSortingFeatures = new ArrayWithSortingFeatures(10);
        arrayWithSortingFeatures.insert(10);
        arrayWithSortingFeatures.insert(9);
        arrayWithSortingFeatures.insert(8);
        arrayWithSortingFeatures.insert(7);
        arrayWithSortingFeatures.insert(6);
        arrayWithSortingFeatures.insert(5);
        arrayWithSortingFeatures.insert(4);
        arrayWithSortingFeatures.insert(3);
        arrayWithSortingFeatures.insert(2);
        arrayWithSortingFeatures.insert(1);
//        for (int i = 0; i < 10; i++) {
//            int random = (int)(Math.random()*100);
//            arrayWithSortingFeatures.insert(random);
//        }

        int[] sortedArray = arrayWithSortingFeatures.shellSort();
        System.out.println(sortedArray.length);

    }
}
