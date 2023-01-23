import java.util.Scanner;

public class ScannerExercise {

    // scanner exercise

    public static void main(String[] args) {

        // to see that input.next() method only reads until space is reached

        System.out.println("please enter your full name");
        Scanner s2= new Scanner(System.in);
        System.out.println("YOUR NAME IS = " + s2.next());

        // to see that input.next() method only reads until space is reached

        System.out.println("please enter your full name");
        Scanner s1 = new Scanner(System.in);
        System.out.println("YOUR NAME IS = " + s1.nextLine());

        System.out.println("please enter your age");
        System.out.println("YOUR AGE IS = " + s1.nextInt());

        System.out.println("please enter the department you are in ");
        Scanner department = new Scanner(System.in);
        System.out.println("YOUR DEPARTMENT IS = " + department.nextLine());

        System.out.println("to add bonus ");
        System.out.println(" please enter your final exam result");
        System.out.println(" your updated final exam result is : " + (s1.nextInt() + 10 ));

        // favorite number exercise
        System.out.println(" please enter your favorite number ");
        Scanner favoriteNum = new Scanner(System.in);
        System.out.println(" your favorite number is = " + favoriteNum.nextDouble());

    }
}
