import java.util.Scanner;

public class Question03 {

  void checkPassword(String password) {

    boolean hasLetter = false;
    boolean hasDigit = false;
    boolean hasSpecialSymbol = false;

    if (password.length() < 6) {
      System.out.println("Too Short");
    } else if ((password.length() >= 6 && password.length() <= 10) && (hasLetter == true || hasDigit == false)
        || (hasLetter == false || hasDigit == true)) {
      System.out.println("Weak");
    } else if ((password.length() >= 6 && password.length() <= 10) && (hasLetter == true && hasDigit == false)) {
      System.out.println("Medium");
    } else if ((password.length() >= 10) && (hasLetter == true && hasDigit == false && hasSpecialSymbol == true)) {
      System.out.println("Medium");
    } else {
      System.out.println("Systematic Error!");
    }
  }

  public static void main(String[] args) {

    Scanner inputs = new Scanner(System.in);
    System.out.println("Enter password");
    String password = inputs.nextLine();

    Question03 obj1 = new Question03();
    obj1.checkPassword(password);

    inputs.close();
  }
}
