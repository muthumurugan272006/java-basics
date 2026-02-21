// used to send a value back from a method
class hello{ 
    int add()
    {
    int a =10;
    int b=20;
    int c =a+b;
    return c;
    }
}
public class returnkeyword {
    public static void main(String[] args) {
        hello h1 = new hello();
        int ans = h1.add();
        System.out.println(ans);
        
    }
}
