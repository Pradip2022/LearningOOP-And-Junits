package Encapsulation.stupid;

public class settingUp {
    private String name;
    private Integer Age;
    private Boolean isMale;

    public String getName(){
        return name;
    }
    public void setName(String nameSetter){
        this.name = nameSetter;
    }

    public Integer getAge(){
        return Age;
    }
    public void setAge(int AgeSetter){
        this.Age = AgeSetter;
    }

    public Boolean getisMale(){
        return isMale;
    }
    public void setIsMale(Boolean trueOrFalse){
        this.isMale = trueOrFalse;
    }
}
