public class sorting{
    public static void main(String[] args) {
        int a[]={3,4,1,0,-1};
        int l=a.length;
        int temp=0;
        for(int i=0;i<l-1;i++){
            for(int j=i;j<l;j++){
                if(a[j]<a[i]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i:a){
            System.out.println(i);
        }
    }
}