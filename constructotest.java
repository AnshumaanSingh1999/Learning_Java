public class constructotest {
    static void staticobject(){
        System.out.println("I am a staticobject");
    }
    public void publicobject(){
        System.out.println("I am a publicobject");
    }
    public constructotest(){
        System.out.println("I am a constructor");
    }
    public static void main(String[] args) {
        constructotest sc=new constructotest();
        staticobject();
        sc.publicobject();   
    }  
}
