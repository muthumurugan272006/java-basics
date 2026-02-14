/* A for loop inside another for loop
Outer loop runs first
For every one outer loop run,
Inner loop runs completely
*/
public class nestedforloop {
    public static void main(String[] args) {
        for(int i=1;i<=5;i=i+1)// no of rows
        {
            for(int j=1;j<=i;j=j+1)// no of starts
            {
                System.out.println("*");
            }
        }
        
    }
}
