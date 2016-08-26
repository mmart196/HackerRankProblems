
package HackerRank;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        String sr = ""; //Encoded string
        int d = 0; //Placeholder for ascii code
        for(int i = 0; i<s.length(); i++)
        {
            if (Character.isAlphabetic(s.codePointAt(i)))
            {
                d = s.codePointAt(i);
                if (d+k>122 && k != 0 && Character.isLowerCase(d))//If z
                {
                    if(k>=26 && d+(k%26)>122)
                    {
                        d = d + (k%26) - 26;
                    }
                    else if(k>=26 && d+(k%26)<=122)
                    {
                        d = d + (k%26);
                    }
                    else
                    {
                        d=d+k-26;
                    }
                } 
                else if (d+k>90 && k != 0 && Character.isUpperCase(d))//If Z
                {
                    if (k>=26 && d+(k%26)>90)
                    {
                        d = d + (k%26) - 26;
                    }
                    else if (k>=26 && d+(k%26)<=90)
                    {
                        d = d + (k%26);
                    }
                    else
                    {
                        d=d+k-26;
                    }
                } 
                else {d=d+k;}
                sr = sr+""+String.valueOf(Character.toChars(d));
            }
            else
            {
                sr = sr+""+String.valueOf(Character.toChars(s.codePointAt(i)));
            }
        }
        System.out.println(sr);
    }
}
