//The for loop is used when you know how many times you want to repeat something.
public class forloop {
    public static void main(String[] args) {
        /* Syntax
        for(int i=0;i<arr.length;i=i+1)
        {
        // condition to be executed
        }
        i=0 -> start value
        i<arr.length -> end value
        i=i+1 -> step value
        */
        for(int i=1;i<=5;i=i+1)
        {
            System.out.println(i); // prints numbers from 1 to 5 
        }
        // program to count the no of even numbers from 1 to 10
        int count =0;
        for(int j=1;j<=10;j=j+1)
        {
            if(j%2==0)
            {
                count = count +1;
            }
        }
        System.out.println(count);
    }
}
