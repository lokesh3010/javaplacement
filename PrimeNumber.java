public class PrimeNumber {
    public static void main(String[] args) {

        int number = 17;
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is Prime");
        }
        else {
            System.out.println(number + " is Not Prime");
        }
    }
}