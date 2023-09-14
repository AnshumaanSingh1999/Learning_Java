import java.util.Arrays;
import java.util.Scanner;
public class gfg_MissingNumberInArray {
    static int printthenonotavailable(int array[], int n){
        int c=0;
        int t=0;
        Arrays.sort(array);
        for(int i=0;i<n-1;i=i+1){
            if(array[i]==i+1){
                c++;
            }
        if(c==0){
            t=i;
        }
    } 
        return t;  
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            a[i]=sc.nextInt();
        }
        //Printing the array for test
        for(int i=0;i<n-1;i++){
            System.out.println(a[i]);
        }
        System.out.println(printthenonotavailable(a,n));
    }
}
