public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;

        while (i <= 15) {
            System.out.print(" " + i);
            i++;
        }

        long x = 2;

        do {
            System.out.println(x);
            x *= x;
        } while (x < 1000000);

        for (int y = 100; y >= -10; y -= 5) {
            System.out.println("y is: " + y);
        }

        for (long z = 2; z < 1000000; z *= z) {
            System.out.println(z);
        }
    }


}
