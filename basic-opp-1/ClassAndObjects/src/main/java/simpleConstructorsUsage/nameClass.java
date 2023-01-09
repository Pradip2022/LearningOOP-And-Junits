package simpleConstructorsUsage;

public class nameClass {
    String name;
    public nameClass(String nameHolder){
        name = nameHolder;
    }

    public static void main(String[] args) {
        nameClass myName = new nameClass("Pradip");
        System.out.println(myName.name);
    }
}
