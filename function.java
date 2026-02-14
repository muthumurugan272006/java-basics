/*In Java, a function is called a method.
A method is a block of code that performs a specific task and runs when it is called.
 */
public class function { 
    void greeting(){
        System.out.println("HEllo WOrld");
        hy();//=> we can able to call function inside another function
    }
    void hy(){
        System.out.println("HIII");
    }
    public static void main(String[] args) {
        /*Syntax
        returnType methodName(parameters) {  => here return type may be int,String etc.. 
    // code
}
        */
        function f1 = new function();
        f1.greeting();//=> function called so prints hello world
    }
}
