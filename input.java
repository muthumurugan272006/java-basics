// to get input from the user
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();// here if we use string ater int then it takes nextline as empty character so string is not executed so this line is used
        String name = scan.nextLine();
        // etc.. we can able to get input from the user for all the data types
    }
}
