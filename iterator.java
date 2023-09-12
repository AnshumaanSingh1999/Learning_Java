import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
public class iterator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<String> a=new LinkedList<String>();
        a.add("Volvo");
        a.add("Scania");
        a.add("Maruti");
        for(String x: a){
            System.out.println(x);
        }
        Iterator<String> c=a.iterator();
        while(c.hasNext()){
            System.out.println(c.next());
        }
    }
}
