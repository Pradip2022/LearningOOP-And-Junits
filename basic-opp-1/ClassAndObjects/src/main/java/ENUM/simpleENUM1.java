package ENUM;

public class simpleENUM1 {
    //An enum is special "class" that represents a group of contants
    //to create an enum use the enum keyword (instead of class or interface), and
    //separate the constants with comma,
    //they should be in uppercase letter

    /*
    enum Level{
        LOW,
        MEDIUM,
        High
    }
     */
    // can have access to enum constants with dot syntax
    //Level myVar = Level.MEDIUM;


    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args){
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
    }
}
