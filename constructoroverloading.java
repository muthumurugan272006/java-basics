//Constructor overloading means having multiple constructors in the same class with different parameter lists (different number, type, or order of parameters).
class hello{
    hello(int a,int b){
        System.out.println(a+b);
    }
    hello(int a,String b){
        System.out.println(b);
    }
    hello(){
        System.out.println("Hello World");
    }
}
public class constructoroverloading {
    public static void main(String[] args) {
        hello h1=new hello();
        hello h2 = new hello(1, "Muthu");
        hello h3 = new hello(10, 20);
        
    }
}
