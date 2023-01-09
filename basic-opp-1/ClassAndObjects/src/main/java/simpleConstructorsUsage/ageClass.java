package simpleConstructorsUsage;

public class ageClass {
    int age;

    //When creating instance of the class age will default into whatever the constructor has
    public ageClass(){
     age = 19;
    }

    public static void main(String[] args){
        ageClass myAge = new ageClass();
        System.out.println("My age is: "+ myAge.age);
    }
}
