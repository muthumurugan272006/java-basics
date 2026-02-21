// A constructor in Java is a special method that is used to initialize objects. It is automatically called when an object of a class is created.
public class constructor {
    constructor(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        constructor c1 = new constructor();//=> object created constructor calls 
        // every time object created constructor called automatically
        constructor c2 = new constructor();
        /*output
        Hello
        Hello
        */
        
    }
}
