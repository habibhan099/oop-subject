import java.util.Scanner;

public class Question01 {
  static Question01 obj1 = new Question01();

  void totalMarks(int m1, int m2, int m3) {
    int sum = m1 + m2 + m3;
    System.out.println("Total marks is: " + sum);
  }

  double averageMarks(int m1, int m2, int m3) {
    double average = (m1 + m2 + m3) / 3;
    return average;
  }

  char grade(double avg) {
    if (avg >= 85) {
      return 'A';
    } else if (avg >= 70 && avg < 85) {
      return 'B';
    } else if (avg >= 50 && avg < 70) {
      return 'B';
    } else {
      return 'F';
    }
  }

  public static void main(String[] args) {
    Scanner inputs = new Scanner(System.in);
    System.out.println("Enter first subject marks: ");
    int sub1 = inputs.nextInt();
    System.out.println("Enter second subject marks: ");
    int sub2 = inputs.nextInt();
    System.out.println("Enter third subject marks: ");
    int sub3 = inputs.nextInt();

    obj1.totalMarks(sub1, sub2, sub3);
    double graded = obj1.averageMarks(sub1, sub2, sub3);
    System.out.println("Average Marks: " + graded);
    System.out.println("Grade " + obj1.grade(graded));

    inputs.close();
  }
}