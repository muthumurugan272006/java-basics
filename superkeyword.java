class parent{
    String color ="blue";
    int age =67;
    void sound(){
        System.out.println("heyyyy");
    }
}
class child extends parent{
    String color = "pink";
    void printcolor(){
        System.out.println(super.color); // to access parent class variables
        System.out.println(color);
    }
    void sound(){
        System.out.println("hiiii");
    }
    void disp(){
        super.sound();
        sound();
    }
}
class animal{
    animal(){
        System.out.println("animal");
    }
}
class dog extends animal{
    dog(){
        super();// calls parent class constructor
        System.out.println("dog");
    }
}
public class superkeyword {
    public static void main(String[] args) {
        child c1 = new child();
        c1.printcolor();// access parent class method/function
        
    }
}
