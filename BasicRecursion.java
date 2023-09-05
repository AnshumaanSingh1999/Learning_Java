public class BasicRecursion {
    static void gain(int a){
        System.out.println(a);
        if(a>0){
            gain(a-1);
        }
    }
    public static void main(String[] args) {
        int x=10;
        gain(x);
    }
}
