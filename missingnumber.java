public class missingnumber {
    public static void main(String[] args) {
        int a[]={1,5,3,4};
        int c;
        int l=5;
        int temp=0;
        for(int i=1;i<=l;i++){   
            c=0;         
            for(int x:a){
                if(i==x){
                    c++;
                }           
            }
            if(c==1){
                System.out.println("Found"+i);
            }
            else if(c==0){
                System.out.println("Missing"+i);
                temp=i;
            }
        }
        System.out.println(temp);
    }
}
