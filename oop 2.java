import java.util.Scanner;

public class NewClass2 
{

    static void checkPassword(String password) 
    {
        int length = password.length();

        boolean Letter = password.matches(".[a-zA-Z].");
        boolean Digit = password.matches(".[0-9].");
        boolean Special = password.matches(".[!@#$%^&].*");

        if (length < 6) 
        {
            System.out.println("Too Short");
        } 
        else if (length <= 10) 
        {
            if ((Letter && !Digit) || (!Letter && Digit)) 
            {
                System.out.println("Weak");
            } 
            else if (Letter && Digit) 
            {
                System.out.println("Medium");
            } 
            else 
            {
                System.out.println("Weak");
            }
        } 
        else 
        {
            if (Letter && Digit && Special) 
            {
                System.out.println("Strong");
            } 
            else 
            {
                System.out.println("Medium");
            }
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password to check: ");
        String password = sc.nextLine();
        checkPassword(password);

        sc.close();
    }
}
