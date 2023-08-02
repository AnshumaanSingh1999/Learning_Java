public class MethodsTest {
    int a=5;
    static int fun(){
        int b=2;
        return(b);
    }
    public static void main(String agrs[]){
        MethodsTest obj=new MethodsTest();
        System.out.println(obj.a+fun());
    }   
}
