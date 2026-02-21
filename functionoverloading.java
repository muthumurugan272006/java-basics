// function overloading or method overloading
// declaring multiple function with same name with different parameters
class hello{
    void add(int a, int b)
    {
        int c=a+b;
        System.out.println(c);
    }
    void add(int a)
    {
        System.out.println(a);
    }
    void add(int a, int b, int c){
        int d =a+b+c;
        System.out.println(d);
    }
}
public class functionoverloading {
    public static void main(String[] args) {
        hello h1 = new hello();
        h1.add(10);
        h1.add(10, 20);
    }
    
}
