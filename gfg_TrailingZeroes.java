public class gfg_TrailingZeroes {
    public static void main(String[] args) {
        int n=5;
        int f=1;
        int d=0;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        int c=0;
        while(f>0){
            d=f%10;
            if(d==0){
                c++;
            }
            f=f/10;
        }
        System.out.println(c);
    }
    
}
