public class ExceptionHandling{
    public static void main(String args[]){
        try{
            int a[]={1,2,3};        
            System.out.println(a[2]);
        }
        catch(Exception e){
            int a[]={6};
            System.out.println(a[0]);
        }
        finally{
            System.out.println("2");
        }
    }
}