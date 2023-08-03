import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String,String> h=new HashMap<String,String>();
        h.put("India", "New Delhi");
        System.out.println(h.size());
        h.put("UK", "London");
        System.out.println(h.size());
        System.out.println(h);
        System.out.println(h.get("India"));
        h.remove("UK");
        System.out.println(h.get("UK"));
        h.clear();
        System.out.println(h);
        System.out.println(h.size());
    }
    
}
