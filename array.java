import java.util.Arrays;
public class array {
    public int a[]={5,10,8,1,7};
    int y=a.length;
    int l=a.length;
    static void rev(){
        array obj=new array();
        int x=obj.a.length;    
        Arrays.sort(obj.a);
        for(int i:obj.a){
            System.out.println(i);
        }
    }
    public static void main(String agrs[]){
        array obj=new array();
        System.out.println(obj.l); 
        obj.rev(); 
    }   
}
