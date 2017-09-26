import java.util.Scanner;
public class main {
    public static void main(String[] args){
        System.out.println("i like pizza");
        System.out.println("do you?");
        Scanner sc = new Scanner(System.in);
        String bees = sc.nextLine();
        if(bees.equals("yes")){
            System.out.println("dank.");
        }else{
            System.out.println("that's odd, you misspelled yes.");
        }

    }
}
