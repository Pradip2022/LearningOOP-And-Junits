package simpleObjectUse;

public class mySecondClass {
     String changed = "\u001B[31m";
     String name = "pradip";
    public static void main(String[] args){
        mySecondClass saveData = new mySecondClass();
        mySecondClass saveData2 = new mySecondClass();
        if ((saveData.name).equals("pradip")){
            saveData2.name = "new pradip";
            saveData2.changed = "\u001B[32m";
            System.out.println(saveData2.changed + saveData2.name + "\u001B[33m");
        }else{
            System.out.println(saveData.changed + saveData2.name);
        }
    }
}
