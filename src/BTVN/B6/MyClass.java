package BTVN.B6;

public class MyClass {
    private String myString;
    public MyClass(){};
    public void setMyString(String myString){
        this.myString = myString;
    }
    public String getMyString(){
        return myString;
    }
    public String display(){
        return "My String: " + myString;
    }
}
