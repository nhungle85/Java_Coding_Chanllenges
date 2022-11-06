import java.util.Scanner;

public class OddOrEven {

    static boolean isEven(int n) {
        //return (n & 1) == 0 --> faster but hard to read
        return n%2 == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userNum = scanner.nextInt();
        System.out.println("Is the number even? " + isEven(userNum));

    }
}
