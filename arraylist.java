import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<String>();
        a.add("Volvo");
        a.add("car");
        a.add("truck");
        for (String i : a) {
            System.out.println(i);
        }
        System.out.println(a.size());
        a.remove(a.size()-1);

        for (String i : a) {
            System.out.println(i);
        }
        a.clear();
        System.out.println(a.size());
        for (String i : a) {
            System.out.println(i);
        }       
    }
    
}
