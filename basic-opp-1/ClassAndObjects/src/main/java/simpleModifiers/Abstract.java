package simpleModifiers;


abstract class Abstract {
    public String fname = "Pradip";
    public int age = 24;
    public abstract void study(); // abstract method
}


class Student extends Abstract{
    public int graduationYear = 2022;
    public int graduationMonth = 8;
    public void study(){
        System.out.println("Studying all day long");
    }
}

class Second{
    public static void main(String[] args) {
        //create an object of the Student class (which inherits attributes and methods from Abstract)
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: "+ myObj.graduationYear);
        System.out.println("Graduation Month: "+ myObj.graduationMonth);
        myObj.study(); // call abstract method

    }
}