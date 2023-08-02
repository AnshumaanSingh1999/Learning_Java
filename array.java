import java.util.Arrays;

public class array {
    public int a[]={5,10,8,1,7};
    int l=a.length;
    public static int[] rev(){
        array obj=new array();
        int x=obj.a.length;
        
        return(Arrays.sort(obj.a));
        
    }
    static int high(){
        int b=2;
        return(b);
    }
    static int secondhigh(){
        int b=2;
        return(b);
    }
    static int secondlow(){
        int b=2;
        return(b);
    }

    
    public static void main(String agrs[]){
        array obj=new array();
        System.out.println(obj.l); 
        System.out.println(obj.a); 


    }   
}
