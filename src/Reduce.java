public class Reduce {
    public static void main(String[] args) {

        int steps = 0;
        int n = 100;

        while (n != 0) {

            if (n % 2 == 0) { //if n is even, divide it by 2
                n /= 2;
            }
            else { //if n is odd, subtract 1
                n--;
            }
            steps++;
            //System.out.println("Step " + steps + ": n = " + n);
        }
        System.out.println("\nIt takes " + steps + " steps for 100 to reach 0.");
    }
}
