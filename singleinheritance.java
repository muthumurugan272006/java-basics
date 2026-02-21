//One child class inherits from one parent class. (i.e parent to child relationship)
class animal{
    void eat(){
        System.out.println("Eating");
    }
}
class dog extends animal{
    void play(){
        System.out.println("playing");
    }
}
public class singleinheritance {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.eat();
        d1.play();
    }
}
