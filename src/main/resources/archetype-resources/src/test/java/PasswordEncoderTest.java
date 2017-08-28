#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Class Description goes here.
 *
 * @author gstripe@gmail.com
 */
public class PasswordEncoderTest {
    public static void main(String[] args) {
        String p = "${symbol_dollar}2a${symbol_dollar}04${symbol_dollar}CMJE65NNtb6yZzcfr/IDiOcE.Vb228yca0MFJQDyPyN1mwwQQQPy6";
        for (int i = 4; i <= 31; i++) {
            String password = new BCryptPasswordEncoder(4).encode("123456");
            System.out.println(i + " -> " + password);
        }

        System.out.println(new BCryptPasswordEncoder(5).matches("123456", p));

    }
}
