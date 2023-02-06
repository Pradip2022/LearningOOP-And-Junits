package Interface;




interface FirstInterface{
    public void myFirstInterfaceMethod();
}
interface SecondInterface{
    public void mySecondInterfaceMethod();
}

class useTwoInterface implements FirstInterface, SecondInterface{
    public void myFirstInterfaceMethod(){
        System.out.println("Some text...");
    }
    public void mySecondInterfaceMethod(){
        System.out.println("Some other text");
    }
}

class MultipleInterface {
    public static void main(String[] args){
        useTwoInterface myObj = new useTwoInterface();
        myObj.myFirstInterfaceMethod();
        myObj.mySecondInterfaceMethod();
    }
}
