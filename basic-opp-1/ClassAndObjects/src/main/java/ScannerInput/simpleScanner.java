package ScannerInput;

import java.util.Scanner;

public class simpleScanner {
    public static void main(String[] args){
        Scanner question = new Scanner(System.in); //Create a Scanner object
        System.out.println("Enter username");

        String userNameStored = question.nextLine(); // Read user input
        System.out.println("Username is: " + userNameStored); // Output user input
    }
}
