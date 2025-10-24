import java.util.Scanner;

public class Question02 {
  static Question02 obj1 = new Question02();
  static Scanner inputs = new Scanner(System.in);

  double EnterBill(double billAmount) {
    return billAmount;
  }

  void splitBill() {
    System.out.println("Enter your restaurant total bill: ");
    double tAmount = inputs.nextDouble();

    System.out.println("Total Amount: " + obj1.EnterBill(tAmount));

    System.out.println("Enter persons limit: ");
    int peoples = inputs.nextInt();

    double amountPerPerson = tAmount / peoples;
    System.out.println("Amount per head: " + amountPerPerson);
  }

  public static void main(String[] args) {
    obj1.splitBill();
    inputs.close();
  }

}
