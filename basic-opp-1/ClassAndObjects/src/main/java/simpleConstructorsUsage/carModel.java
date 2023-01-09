package simpleConstructorsUsage;

public class carModel {
    int modelYear;
    String modelName;

    public carModel(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        carModel myCar = new carModel(1969, "Musstang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
