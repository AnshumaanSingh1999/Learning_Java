import java.util.Scanner;
import java.util.HashSet;
public class HashSetLearning {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<String> a=new HashSet<String>();
        int l=sc.nextInt();
        for(int i=1;i<=l;i++){
            a.add(sc.nextLine());
        }
        for(String k:a){
            System.out.println(k);
        }
    }
}
