import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main(String[] args) {
        int dollar = 1;
        double penny = 0.01;
        double nickle = 0.05;
        double dime = 0.1;
        double quarter = 0.25;

        System.out.println("Enter number of pennies: ");
        Scanner scanner =  new Scanner(System.in);
        int numberOfPennies = scanner.nextInt();

        System.out.println("Enter number of nickles: ");
        int numberOfNickles = scanner.nextInt();

        System.out.println("Enter number of dimes: ");
        int numberOfDimes = scanner.nextInt();

        System.out.println("Enter number of quarters: ");
        int numberOfQuarters = scanner.nextInt();

        scanner.close();

        double sum = numberOfPennies * penny + numberOfNickles * nickle + numberOfDimes * dime + numberOfQuarters * quarter;

        if(sum == dollar){
            System.out.println("Congratulations you won!");
        } else if (sum < dollar) {
            double shortAmount = dollar - sum;
            System.out.printf("Unfortunately you were %.2f short %n", shortAmount);
        }
        else{
            double overAmount = sum - dollar;
            System.out.printf("Unfortunately you went %.2f over $1 %n", overAmount);
        }
    }
}

