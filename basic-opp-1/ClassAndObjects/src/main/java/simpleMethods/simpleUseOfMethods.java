package simpleMethods;

public class simpleUseOfMethods {
    static void myMethod(){
        System.out.println("Hello World");
    }

    //Now I will be creating a static and public methods

    static void myStaticMethod(){
        System.out.println("I am a static method that can not be called by a object");

    }

    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args){
        myMethod();

        //Calling the static method will always be like this
        myStaticMethod();

        //Calling the public method will allways be like this

        simpleUseOfMethods allowsToCallPublicMethod = new simpleUseOfMethods();
        allowsToCallPublicMethod.myPublicMethod();


        //Remember creating objects creates a brand new data
        //while static variables and methods are only one shared across the entire program
    }
}
