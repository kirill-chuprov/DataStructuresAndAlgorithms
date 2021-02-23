import structures.exercises.Array;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Array array = new Array(5);
        array.push(1);
        array.push(6);
        array.push(3);
        array.push(2);
        array.push(5);

        array.remove(2);
    }
}
