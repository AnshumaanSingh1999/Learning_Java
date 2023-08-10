import java.util.Scanner;
public class recursion {
    public static void main(String[] args) {
        System.out.println("Please enter the upper range:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        printinreverse(a);
    }
    static void printinreverse(int a){
        if(a>0){
            System.out.println(a);
            printinreverse(a-1);
        }
        else{
            System.out.println("0");
        }
    }
}
