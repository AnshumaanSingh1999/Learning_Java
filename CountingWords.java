import java.util.*;
public class CountingWords {
    public int counter(String x){
        String a[]=x.split(" ");
        int count=a.length;
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        CountingWords obj=new CountingWords();
        int y=obj.counter(s);
        System.out.println(y);
    }
}
