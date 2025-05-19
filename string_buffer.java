import java.util.Scanner;

class string_buffer {
    public static void main(String[] args) {
        StringBuffer sb1= new StringBuffer();
        StringBuffer sb2= new StringBuffer("Hello");
        System.out.println("Capacity of empty string : "+sb1.capacity());
        System.out.println("Capacity of string : "+sb2.capacity());
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sting : ");
        String str_1=sc.nextLine();
        
        StringBuffer new_rev= new StringBuffer(str_1);
        new_rev.reverse();
        System.out.println("Reversed string : "+new_rev);
        String new_rev_upp=new_rev.toString().toUpperCase();
        System.out.println("Uppercase string : "+new_rev_upp);
        
        System.out.print("Enter a new string : ");
        String new_str=sc.nextLine();
        new_rev.append(new_str);
        System.out.println("String after appending : "+new_rev);
    }
}
