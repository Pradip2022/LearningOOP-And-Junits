package simpleModifiers;

public class Final {
    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        Final canNotChange = new Final();
        //canNotChange.x = 20; //const can not be changed
        //canNotChange.PI = 25; //const can not be changed
        System.out.println(canNotChange.x);
    }
}
