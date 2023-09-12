import java.util.ArrayList;
import java.util.Scanner;
public class ContiguousSubarrayMaxDynamic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int al=sc.nextInt();
            int sal=sc.nextInt();
            int a[]=new int[al];
            ArrayList<Integer> b=new  ArrayList<Integer>();
            for(int i=0;i<al;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<=al-sal;i++){
                int m=0;
                for(int j=i;j<i+sal;j++){
                    if(a[j]>m)
                    {
                        m=a[j];
                    }
                }
                b.add(m);
            }
            for(int f: b){
                System.out.println(b.get(f));
            } 
        }
        catch(Exception e){
            System.out.println("Gadbad hogai hai!");
        }   
    }
}
