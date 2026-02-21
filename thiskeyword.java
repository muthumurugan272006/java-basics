//The this keyword in Java is a reference variable that refers to the current object (the object that is calling the method or constructor).
public class thiskeyword {
    String myname;
    void setname(String myname){
        this.myname=myname;//=> here this.myname refers to the above string myname not the parameter in the function
    }
    public static void main(String[] args) {
        thiskeyword t1 = new thiskeyword();
        System.out.println(t1.myname);
    }
}
