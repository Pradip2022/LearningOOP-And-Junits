package simpleObjectUse;

public class myThirdClass {
    int x;

    public static void main(String[] args){
        myThirdClass first = new myThirdClass();
        first.x = 10;
        myThirdClass second = new myThirdClass();
        second.x = 20;
        System.out.println("The first instance of the class is equal to " + Integer.toString(first.x) + "\nThe second instance of the class is equal to "+ Integer.toString(second.x));
    }
}
