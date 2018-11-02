import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int number = scanner.nextInt();
        if (number < 10 && number >= 0) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        }
        if (number >= 10 && number < 20) {
            switch (number) {
                case 10:
                    System.out.println("ten");
                case 11:
                    System.out.println("eleven");
                case 12:
                    System.out.println("twelve");
                case 13:
                    System.out.println("thirteen");
                case 14:
                    System.out.println("fourteen");
                case 15:
                    System.out.println("fifteen");
                case 16:
                    System.out.println("sixteen");
                case 17:
                    System.out.println("seventeen");
                case 18:
                    System.out.println("eighteen");
                case 19:
                    System.out.println("nineteen");

            }
        }

    }

}
