import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()

        System.out.println("Kunal" + new ArrayList<>());
//        System.out.println("Kunal" + new Integer(56));
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);

        System.out.println("a" + 'b');
        // '+' operator is overloaded for Strings
        // '+' operator in Java is only used for primitives and String (If any of the one operand is string
        // then it can be used for any type of value used

        // new Integer(56) + new ArrayList<>() --> Result in Error
        // new Integer(56) + "" + new ArrayList<>() --> Correct, All class objects will be casted to string and will result in
        // a Concatenated String
    }
}