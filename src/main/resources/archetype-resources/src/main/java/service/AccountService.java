#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import alpaca.park.common.AlpacaService;
import ${package}.entity.Account;
import ${package}.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * Class Description goes here.
 *
 * @author gstripe@gmail.com
 */
@Service
public class AccountService extends AlpacaService<Account>{

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private AccountMapper accountMapper;

    @Transactional(readOnly = true)
    public Account findByUsername(String username) {
        Account record = new Account();
        record.setUsername(username);
        Account account = accountMapper.selectOne(record);
        return account;
    }

    public boolean exists(Long id) {
        Account record = new Account();
        record.setId(id);
        return accountMapper.selectCount(record) == 1 ? true : false;
    }

    @Transactional(readOnly = true)
    public Map findByIdToMap(Long id) {
        return accountMapper.selectByIdToMap(id);
    }

    @Transactional(readOnly = true)
    public Account findByIdToMap2(Long id) {
        return accountMapper.selectByIdToMap2(id);
    }

    @Transactional(readOnly = true)
    public Account findByIdToAccount(Long id) {
        return accountMapper.selectByIdToAccount(id);
    }

}

