public class Multiples {
    public static void main(String[] args) {

        for (int i=1; i <= 1000; i++) {

            if ((i % 3 == 0) || (i % 5 == 0)) {
                System.out.print("\n" + i);
            }
        }
    }
}