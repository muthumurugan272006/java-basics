interface a {
    void sound();
}
interface b{
    public void sound();
}
class c implements a,b{
    public void sound(){
        System.out.println("heyyy");
    }
}
public class multipleinheritance {
    public static void main(String[] args) {
        c c1 = new c();
        c1.sound();
    }
}
