import java.util.Arrays;

public class HighestIndexOfArray {
    public static void main(String[] args) {

        int a[]={1,2,3,5,4};
        int n=a.length;
        int max=0;
        int tempi=0;
        
        // Arrays.sort(a);
        // int max=a[n-1];
        for(int i:a){
            if(max<i){
                max=i;
            }
        }

        for(int j=0;j<n;j++){
            if(max==a[j]){
                tempi=j;

            }
        }
        System.out.println(tempi);
    }
    
}
