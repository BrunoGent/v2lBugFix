//things to improve:
// method override


import java.util.Scanner;

public class StudentVersion {
    public static void main(String[] args) {
        boolean run = true;
        String choice;

        do {
            choice = displayMenu();
            if (choice.equals("x")){
                run = false;
            }
            else if (choice.equals("1")){
                double x = getNumber(1);
                double y = getNumber(2);
                //Changed variable type to "double"
                double total = sumMethod(x,y);
                //Variable missplelt
                display(total);
                run = checkFinish();
            }
            else if (choice.equals("2")){
                double x = getNumber(1);
                double y = getNumber(2);
                double total = subtractMethod(x,y);
                display(total);
                run = checkFinish();
            }
            else if (choice.equals("3")){
                double x = getNumber(1);
                double y = getNumber(2);
                // Syntax error, methods are case-sensitive
                double total = multiplyMethod(x,y);
                display(total);
                run = checkFinish();
            }
            //Change "else" for "else if"
            else if (choice.equals("4")){
                double x = getNumber(1);
                double y = getNumber(2);
                //Added a conditional to check for division by zero,
                //It will otherwise return "infinity", calculation error
                if (y != 0) {
                    double total = divideMethod(x, y);
                    display(total);
                }
                else{
                    System.out.println("Cannot divide by zero");
                }
                run = checkFinish();
            }
            else {
                System.out.println("Entry not recognised, please try again...");
            }

        } while (run);
    }

    public static double getNumber(int count){
        // "boolean numberWrong = true;" not needed
        while (true) {
            if (count == 1) {
                System.out.print("Enter 1st number: ");
            } else {
                System.out.println("Enter 2nd number: ");
            }
            Scanner reader = new Scanner(System.in);
            try {
                // No need to create and then store val in variable... double x = Double.parseDouble(reader.nextLine());
                //parse input to double
                return /*x*/ Double.parseDouble(reader.nextLine());
            } catch (Exception e){
                System.out.println("Number not recognised, please try again.");
            }
        }
        // Not needed "return 0;"
    }

    public static String displayMenu(){
        System.out.println(" Calculator Menu");
        System.out.println("1. Add numbers");
        System.out.println("2. Subtract numbers");
        System.out.println("3. Multiply numbers");
        System.out.println("4. Divide numbers");
        System.out.println("x. Exit program");
        System.out.println();
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter option (1,2,3,4,x): ");
        return reader.nextLine();
    }

    public static boolean checkFinish(){
        Scanner reader = new Scanner(System.in);
        //Variable "check" not used
        //boolean check = true; (not needed)
        System.out.print("Have you finished (y/n): ");
        String ans = reader.nextLine().trim().toLowerCase();
        if (ans.equals("y")){
            return false;
        }
        else{
            return true;
        }
    }

    public static double sumMethod(double n, double m){
        System.out.println("When adding the numbers");
        return (n * m);
    }

    public static double subtractMethod(double n, double m){
        System.out.println("When subtracting the numbers");
        return (n - m);
    }

    public static double multiplyMethod(double n, double m){
        System.out.println("When multiplying the numbers");
        return (n * m);
    }

    public static double divideMethod(double n, double m){
        System.out.println("When dividing the numbers");
        return ((double)n / m);
    }

    public static void display(double sum){
        // Missing ";"
        System.out.println("The answer is: " + sum);
    }
}