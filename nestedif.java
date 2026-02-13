/* An if statement is inside another if statement */
// if the outer if is false inside if will not be executed
public class nestedif {
    public static void main(String[] args) {
        int age = 20;
        boolean hasVoterID = true;

        if (age >= 18) {
            if (hasVoterID) {
                System.out.println("Eligible to Vote");
            }
        }
    }
}
