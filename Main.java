import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        try {
            int firstInt;
            int secondInt;
            String operation;
            int ans = 0;

            System.out.println("Enter your first int");
            firstInt = sc.nextInt();

            System.out.println("Enter operation: *, +, /, -");
            operation = sc.next();

            System.out.println("Enter your second int");
            secondInt = sc.nextInt();

            if(operation.equals("*")) {
                ans = firstInt * secondInt;
            }
            else if(operation.equals("+")) {
                ans = firstInt + secondInt;
            }
            else if(operation.equals("/")) {
                ans = firstInt / secondInt;
            }
            else if(operation.equals("-")) {
                ans = firstInt - secondInt;
            }
            else {
                System.out.println("Invalid operation!");
            }

            System.out.println(ans);
        }
        catch(InputMismatchException e) {
            System.out.println("Invalid input! Please enter whole numbers only");
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic exception! Dividing by 0 is not possible!");
        }
        catch(Exception e) {
            System.out.println("Error in operation! Please adhere to instructions.");
        }
        finally {
            sc.close();
        }
    }
}