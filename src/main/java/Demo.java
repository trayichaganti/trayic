public class Demo{
    public Object Prime(int n) {
        //Scanner in = new Scanner(System.in);
        //System.out.println("Enter the value to be checked");

        //int n = in.nextInt();
        int count = 0;
        for (int i = 1; i < n / 2; i++) {
            if (n % i == 0) {
                count++;

            }
        }
        if (count == 2) {
            return "it is not a prime number";
        } else {
            return "it is a prime number";

        }
    }
}



