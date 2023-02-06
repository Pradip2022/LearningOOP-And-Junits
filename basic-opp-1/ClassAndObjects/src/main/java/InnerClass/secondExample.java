package InnerClass;


class OutterClass {
    int x = 10;

    private class InerClass{
        int y = 5;
    }
}

public class secondExample {
    public static void main(String[] args) {
        OutterClass myOutter = new OutterClass();
      //  OutterClass.InerClass myInerError = myOutter.new InerClass();
       // System.out.println(myInerError.y + myOutter.x);
    }
}
