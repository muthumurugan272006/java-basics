// logical operator &&(and) ||(or)  !(not)
public class logicaloperator {
    public static void main(String[] args) {
        // And operator (&&)  true when both the conditions are true 
        // eg
        int a =10;
        if(a%3==0 && a%5==0){
            System.out.println("The number is divisible by 3 and 5");
        }else{
            System.out.println("Not divisible by 3 and 5");
        }
    }
}
