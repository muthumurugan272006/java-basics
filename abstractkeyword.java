//The abstract keyword in Java is used to create incomplete classes and methods.
//It is mainly used when you want to hide implementation and show only functionality
//ABSTRACT MUST BE INSIDE ABSTRACT CLASS
// IF THERE IS AN ABSTRACT CLASS IN THE PARENT THEN ALL THE CHILD CLASS MUST NEED TO IMPLEMENT THE ABSTRACT CLASS
abstract class hii{
    abstract void greeting();
}
class hey extends hii{
    void greeting(){
        System.out.println("Hello");
    }
}
class bye extends hii{
    void greeting (){
        System.out.println("Byee");
    }
}
public class abstractkeyword {
    public static void main(String[] args) {
        bye b1 = new bye();
        b1.greeting();
    }
}
