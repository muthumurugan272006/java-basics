// An array is used to store multiple values of the same data type in one variable.
// array index starts from 0
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // to create array there are two methods
        // method 01
        int []arr = {1,2,3,4,5,6,7};
        // method 01
        int [] arrr = new int[5]; // here 5 is the size of the array
        // to store element in method 2 
        for(int i=0;i<arr.length;i=i+1){
            arrr[i]= scan.nextInt();
        }
        for (int j = 0; j < arrr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
