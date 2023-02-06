package InnerClass;

class outsideClass{
    int x = 10;
    static class inClass{
        int y = 5;
    }
}
public class thirdExample {
    public static void main(String[] args){
        outsideClass.inClass first = new outsideClass.inClass();
        first.y = 10;
        System.out.println(first.y);

        outsideClass.inClass second = new outsideClass.inClass();
        System.out.println(second.y);
    }
}
