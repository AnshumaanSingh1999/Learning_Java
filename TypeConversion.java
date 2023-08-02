public class TypeConversion{
    public static void main(String args[]){
        try{
            /*Implicit Conversion or Widening*/ 
            int a=5;        
            double b=a;
            System.out.println(a);
            System.out.println(b);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            /*Explicit Conversion or Narrowing*/ 
            double a=5.0;        
            int b=(int) a; 
            System.out.println(a);
            System.out.println(b);
        }
    }
}