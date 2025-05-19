public class 3aTextProcessing {

    public static boolean compare(String str1, String str2) {
        return str1.equals(str2);
    }

    public static String concat(String str1, String str2) {
        return str1 + str2;
    }

    public static String copy(String str1) {
        return new String(str1);
    }

    public static void main(String[] args) {
        String str1 = "cool";
        String str2 = "Cool";
        System.out.println("Are string 1 and string 2 equal? " + compare(str1, str2));
        System.out.println("New string after concatenation: " + concat(str1, str2));
        String original = "HELLO";
        String copy = copy(original);
        System.out.println("Original string: " + original);
        System.out.println("Copy of string: " + copy);
    }
}
