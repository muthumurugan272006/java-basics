// logical operator &&(and) ||(or)  !(not)
public class logicaloperator {
    public static void main(String[] args) {
        // And operator (&&)  true when both the conditions are true 
        /*  if first condition is false it does not checks the second condition*/
        int a =10;
        if(a%3==0 && a%5==0){
            System.out.println("The number is divisible by 3 and 5");
        }else{
            System.out.println("Not divisible by 3 and 5");
        }

        // Or operator (||)
        /*if the first condition is true it does not check the second condition*/
        int theoryMarks = 30;
        int practicalMarks = 40;

        if (theoryMarks > 35 || practicalMarks > 35) {
            System.out.println("Student Passed");
        } else {
            System.out.println("Student Failed");
        }

        // Not operator
        /*It is used to reverse (invert) a boolean value.  for example !(true)=false */
        boolean isBlocked = false;
        if (!isBlocked) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }
    }
}
