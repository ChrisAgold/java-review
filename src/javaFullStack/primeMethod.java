package javaFullStack;

public class primeMethod {
    public boolean isPrime(int num) {
// PRIME NUMBER
        int temp;
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public boolean isPrime(double doubleValue) {
int num = (int) doubleValue;
        int temp;
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
