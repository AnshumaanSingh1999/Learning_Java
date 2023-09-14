import java.util.Scanner;
public class gfg_KeyPair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int c=0;
        int l1=0,l2=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int y=0;y<n;y++){
                if(i==y)
                {
                    continue;
                }
                c=a[i]+a[y];
                if(c==s){
                    l1=a[i];
                    l2=a[y];
                }  
            }
        }
        System.out.println(l1+"and"+l2);
    }
}
