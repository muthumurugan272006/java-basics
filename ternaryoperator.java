// The ternary operator in Java is a short form of if-else statement.
public class ternaryoperator {
    public static void main(String[] args) {
        /* Syntax 
        variable = (condition) ? if true : if false;
        */
        String ans = 5>2? "yes":"no";
        System.out.println(ans);
        int a=3,b=5,c=2;
        int res = (a>b && a>c)? a:(b>c)? b:c;
        System.out.println(res);
    }
}
