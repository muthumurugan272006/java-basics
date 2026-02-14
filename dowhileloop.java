/*A do-while loop is similar to a while loop, but with one important difference:
 It executes the block at least once, even if the condition is false.
 */
import java.util.Scanner;
public class dowhileloop {
    public static void main(String[] args) {
        /*syntax
        do {
    // code to execute
    } while (condition);
        */   
        Scanner scan = new Scanner(System.in);
        int count =0;
        do{
            System.out.print("enter the number greater than 18");
            count = scan.nextInt();
        }while(count<18);
    }
}
