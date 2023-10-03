
/*explain following operation of class string
1)to find length of string
2)TO compare two string
3)
 */
package College_Exam;
public class FindLengthOfString {

    public static void main(String[] args) {

        char str[]={'p','q','r','s','t'};
        String S = new String(str);
        System.out.println(" The string S is"+S);
        System.out.println("The length of string is"+S.length());
        for(int i=0;i<S.length();i++){
            System.out.print(str[i]);
        }
    }
}
