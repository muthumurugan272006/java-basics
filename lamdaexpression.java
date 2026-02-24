/*A lambda expression in Java is a short way to write anonymous functions (methods without name).
It is mainly used with functional interfaces (interfaces that contain only one abstract method).*/
interface a {
    void disp();
}
public class lamdaexpression {
    public static void main(String[] args) {
        a a1 = new a ();// shows error because for interface we cannot able to create object
        //instead
        a ob1= ()->{
            System.out.println("HI");
        };
    }
}
