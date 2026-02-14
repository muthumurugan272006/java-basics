/*A while loop is used when we don’t know how many times the loop should run.
It runs until the condition becomes false.
 */
import java.util.Random;
public class whileloop {
    public static void main(String[] args) {
        /* syntax
        while (condition) {
        condition to be executed
}
        */
        int i=1;// start
        while(i<=10)// stop
        {
            System.out.println(i);
            i=i+1;// step
        }
        Random rand = new Random();
        int newnum = rand.nextInt();
        int a=0;
        while(a!=5){
            a=rand.nextInt();
            System.out.println(a);
        }
    }
}
