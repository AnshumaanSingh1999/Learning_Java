public class AccessSpecifierStaticVsPublic {
    int a[]={10,8,9,1,7};
    int l=a.length;
    public void test1(){
        System.out.println(l);
        l=6;
        System.out.println("Public one");
        System.out.println(l);
    }
    static void test2(){
        AccessSpecifierStaticVsPublic obj=new AccessSpecifierStaticVsPublic();
        System.out.println(obj.l);
        obj.l=7;
        System.out.println("static one");
        System.out.println(obj.l);
    }
    static int test3(){
        return 0;
    }
    public static void main(String[] args) {
        AccessSpecifierStaticVsPublic obj=new AccessSpecifierStaticVsPublic();
        System.out.println(obj.l);
        obj.test1();
        test2();  
        System.out.println(test3());
    }
}
