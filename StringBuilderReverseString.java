public class StringBuilderReverseString {
    public static void main(String[] args) {
        String s="i.like.this.program.very.much";
        StringBuilder x=new StringBuilder();
        x.append(s);
        x.reverse();
        System.out.println(x);
    }
}
