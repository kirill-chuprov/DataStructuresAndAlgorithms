package structures;

public class Recursion {
    public static int triangle(int n) {
        System.out.println("Entering: n=" + n);
        if (n == 1) {
            System.out.println("Returning 1");
            return 1;
        } else {
            int temp = n + triangle(n - 1);
            System.out.println("Returning " + temp);
            return temp;
        }
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else {
            int value = (n * factorial(n - 1));
            return value;
        }
    }
}

