class hello{
    void greeting(int a,int b){
        int c =a+b;
        System.out.println(c);
    }
}
public class functionparameters {
    public static void main(String[] args) {
        hello h1 = new hello();
        h1.greeting(10, 20);
    }
}
