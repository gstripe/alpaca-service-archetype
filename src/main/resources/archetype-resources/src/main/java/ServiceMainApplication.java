#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 账号服务
 *
 * @author gstripe@gmail.com
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("${package}.mapper")
public class ServiceMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceMainApplication.class, args);
    }
}
