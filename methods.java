/**
 *
 * @author gombost84
 */

import java.util.Scanner;

public class methods {
    static String getName() {
        Scanner nameInput = new Scanner(System.in); 
        System.out.print("What is your name? ");
        String myName = nameInput.next();
        return myName;
    }
    static int getAge() {
        Scanner ageInput = new Scanner(System.in);
        System.out.print("What is your age? ");
        int myAge = ageInput.nextInt();
        return myAge;
    }
    static void myFirstMethod() {
        System.out.println("Hello World from inside a method!");
    }
    static void mySecondMethod(String name, int age) {
        System.out.println("Hello " + name + "! " + "You are " + age + " years old.");
    }
    static int myThirdMethod(int x) {
        return x * x;
    }

public static void main(String[] args) {
    
    String inputName = getName();
    int inputAge = getAge();
    
    myFirstMethod();
    mySecondMethod(inputName, inputAge);
    int z = myThirdMethod(inputAge);
    System.out.printf("The square of %d is: " + z, inputAge);
}
    
}
