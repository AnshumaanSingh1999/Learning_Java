import java.util.Scanner;
public class stringsplit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        String a[]=st.split(" ");
        for(String i: a){
            System.out.println(i);
        } 
        //System.out.println(a[2]);
    }
}
