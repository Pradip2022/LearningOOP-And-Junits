package simpleModifiers.Inheritance;

public class childLife extends parentMoney{
    static int childMoney = 9000;

    public static void main(String[] args) {
        parentMoney pmoney = new parentMoney();
        pmoney.parentMoney();
        System.out.println("and after their death, I inherited all of the $" + pmoney.money );
        System.out.println("As a result it brings the total to: $"+ (childMoney + pmoney.money));
    }
}
