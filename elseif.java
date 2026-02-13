//else if is used when you need to check multiple conditions
public class elseif {
    public static void main(String[] args) {
        int mark=40;
        if(mark>40 && mark<=50){
            System.out.println("A");
        }else if(mark>=30 && mark<=39){
            System.out.println("B");
        }else if(mark>=20 && mark<=19)
        {
            System.out.println("C");
        }else{
            System.out.println("Fail");
        }
    }    
}
