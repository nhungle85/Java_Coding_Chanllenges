import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordComplexity {
    static final String PASSWORD_REGEX = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
    /**
     * It contains at least 8 characters and at most 20 characters -> .{8,20}
     * It contains at least one digit. -> (?=.*[0-9])
     * It contains at least one upper case alphabet. -> (?=.*[A-Z])
     * It contains at least one lower case alphabet. -> (?=.*[a-z])
     * It contains at least one special character which includes !@#$%&*()-+=^. -> (?=.*[@#$%^&-+=()])
     * It doesn’t contain any white space.-> (?=\\S+$)
     * $ represents the end of the string.
     * @param password as string
     * @return true/false
     */
    static boolean isPasswordComplex(String password) {
        Pattern p = Pattern.compile(PASSWORD_REGEX);
        Matcher m = p.matcher(password);
        return m.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = scanner.nextLine();
        System.out.println("Is the password complex? " + isPasswordComplex(password));
    }
}
