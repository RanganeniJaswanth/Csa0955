import java.util.Scanner;
class vowel
 {
 public static void main(String[] args)
 {
 Scanner in = new Scanner(System.in);
 int count=0;
 System.out.print("Input the string: ");
 String str = in.nextLine();
 for (int i = 0; i < str.length(); i++)
 {
 if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
 || str.charAt(i) == 'o' || str.charAt(i) == 'u'||str.charAt(i) == 'A'||str.charAt(i) == 'E'||str.charAt(i) == 'I'||str.charAt(i) == 'O'||str.charAt(i) == 'U')
 {
 count++;
 }
 }
 System.out.print("Number of Vowels in the string: " + count);
}
}