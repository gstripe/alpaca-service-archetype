#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import ${package}.entity.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.nutz.json.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * Class Description goes here.
 *
 * @author gstripe@gmail.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void findByIdToMap() throws Exception {
        Map record = accountService.findByIdToMap(1L);
        System.out.println("record type = " + record.getClass().getCanonicalName());
        System.out.println("Json.toJson(record) = " + Json.toJson(record));
    }


    @Test
    public void findByIdToMap2() throws Exception {
        Account record = accountService.findByIdToMap2(9L);
        System.out.println("record type = " + record.getClass().getCanonicalName());
        System.out.println("Json.toJson(record) = " + Json.toJson(record));
    }

    @Test
    public void findByIdToAccount() throws Exception {
        Account record = accountService.findByIdToAccount(10L);
        System.out.println("record type = " + record.getClass().getCanonicalName());
        System.out.println("Json.toJson(record) = " + Json.toJson(record));
    }


}