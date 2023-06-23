public class Main {
    public static void main(String[] args) {
    int balance = 5000;
    double interestRate = 0.17;
    double interest = balance * interestRate;
    System.out.println("Your interest due after one month is $" + interest + ".");
    interest = interest * 2;
    System.out.println("Your interest due after two months is $" + interest + ".");
    }
}
