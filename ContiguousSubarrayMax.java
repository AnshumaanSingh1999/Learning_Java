public class ContiguousSubarrayMax {
    public static void main(String[] args) {
        int al=9;
        int sal=3;
        int a[]={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<=al-3;i++){
            int e1=a[i];
            int e2=a[i+1];
            int e3=a[i+2];
            int b1=Math.max(e1,e2);
            int b2=Math.max(b1,e3);
            System.out.println(b2);
        }
    }   
}
