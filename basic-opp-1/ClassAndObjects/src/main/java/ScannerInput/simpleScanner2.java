package ScannerInput;

import java.util.Scanner;

public class simpleScanner2 {
    public static void main(String[] args){
        Scanner question = new Scanner(System.in);
        System.out.println("Enter name, age, and salary");

        //String input
        String name = question.nextLine();

        //Numerical input
        int age = question.nextInt();
        double salary = question.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: "+ salary);
    }
}
