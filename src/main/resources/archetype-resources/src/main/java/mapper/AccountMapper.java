#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mapper;

import alpaca.park.common.AlpacaMapper;
import ${package}.entity.Account;

import java.util.Map;

public interface AccountMapper extends AlpacaMapper<Account> {

    public Map selectByIdToMap(Long id);

    public Account selectByIdToMap2(Long id);

    public Account selectByIdToAccount(Long id);
}