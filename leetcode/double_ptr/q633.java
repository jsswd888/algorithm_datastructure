import java.util.Arrays;
public class q633
{
    public static void main(String[] args) {

        String s = "Hello";
        String[] s_char = s.split("");
        String vowel = "aeiouAEIOU";
        for (int i = 0; i < s_char.length / 2; i++) {
            for (int j = s_char.length-1 ; j >= s_char.length / 2; j--) {
                System.out.println(s_char[i] + ", " + s_char[j]);
                if (vowel.contains(s_char[i]) && vowel.contains(s_char[j])) {
                    System.out.println("NEED TO SWITCH");
                    String temp = s_char[i];
                    s_char[i] = s_char[j];
                    s_char[j] = temp;
                    i++;
            }
            }
        }

        //convert s_char string array to string;
        String s_char_str = "";
        for (int i = 0; i < s_char.length; i++) {
            s_char_str += s_char[i];
        }
        System.out.println(s_char_str);
    }

}