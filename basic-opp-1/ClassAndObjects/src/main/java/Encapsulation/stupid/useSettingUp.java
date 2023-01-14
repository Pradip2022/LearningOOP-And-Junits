package Encapsulation.stupid;
import java.util.Scanner;
public class useSettingUp {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        settingUp information = new settingUp();
        if(information.getisMale() == null || information.getName() == null || (information.getAge() == null )){
            information.setIsMale(true);


            System.out.println("Enter name: ");
            String name = prompt.nextLine();
            information.setName(name);

            System.out.println("Enter age: ");
            int age = prompt.nextInt();
            information.setAge(age);

            System.out.println(information.getName() + " is "+ information.getAge() + " years old and the gender male is " + information.getisMale());
        }



    }
}
