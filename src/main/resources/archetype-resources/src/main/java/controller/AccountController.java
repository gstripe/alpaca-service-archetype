#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import ${package}.entity.Account;
import ${package}.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

/**
 * Class Description goes here.
 *
 * @author gstripe@gmail.com
 */
@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("{username}")
    public Object findByUsername(@PathVariable(value = "username") String username) {
        return accountService.findByUsername(username);
    }

    @PostMapping("")
    public Object saveAccount(@RequestBody Account account) {
        // 加密一下密码
        String password = account.getPassword();
        password = new BCryptPasswordEncoder().encode(password);
        account.setPassword(password);
        int row = accountService.save(account);
        return row == 1 ? true : false;
    }

}
