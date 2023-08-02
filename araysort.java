import java.util.Arrays;
public class araysort {
    public static void main(String args[]){
        int a[]={3,4,5,1,10};
        Arrays.sort(a);
        for(int i:a){
            System.out.println(i);
        }
        int x=a.length;
        for(int j=x-1;j>=0;j--){
            System.out.println(a[j]);
        }
        System.out.println(a);
    }   
}
