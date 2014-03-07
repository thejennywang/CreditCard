/**
 * Created by jyjwang on 3/6/14.
 */
public class CreditCard {
    public static void main(String[] args) {
        checkValid("1234567");
        checkValid("123456789101112");
        checkValid("1234567891011121314");
        checkValid("1234567dsjafhl");
        checkValid("1234567ds!!%$^hl");
    }

    public static boolean isNumber(String creditCardNum)
    {
        char[] c = creditCardNum.toCharArray();
        for(int i=0; i < creditCardNum.length(); i++)
        {
            if ( !Character.isDigit(c[i]))
            {
                return false;
            }
        }
        return true;
    }

    public static void checkValid(String creditCardNum) {
        //if credit card number is more than or equal to 14 chars, print 'valid'
        if (creditCardNum.length() >= 14 && creditCardNum.length() <=18 && isNumber(creditCardNum) == true ) {
            System.out.println("Valid");
        }
        else System.out.println("Invalid");
        //print 'invalid'
    }
}


