public class ClassesAndObjects {
    int x=5;
    public static void main(String args[]){
        try{
            ClassesAndObjects obj=new ClassesAndObjects();
            obj.x=8;
            System.out.println(obj.x);            
        }
        catch(Exception e){
            ClassesAndObjects obj=new ClassesAndObjects();
            System.out.println(obj.x);
        }
        finally{
            ClassesAndObjects obj=new ClassesAndObjects();
            System.out.println(obj.x);
        }
    } 
}
