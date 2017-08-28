#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import ${package}.entity.Account;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Class Description goes here.
 *
 * @author gstripe@gmail.com
 */
public class EntityToJson {
    public static void main(String[] args) {
        Account account = new Account();

        account.setUsername("admin");
        account.setPassword("admin");
        account.setNickname("管理员");
        account.setMobilePhone("13800591505");
        account.setEmail("gstripe@gmail.com");
        account.setLocked(false);
        account.setExpired(false);
        account.setEnabled(true);
        account.setRoles("ROLE_ADMIN");
        ObjectMapper mapper = new ObjectMapper();
        try {
            System.out.println(mapper.writeValueAsString(account));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
}
