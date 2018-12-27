package demos.example.code.sso.server.security.properties;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hxy on 2018/6/20
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 * 把配置文件中的值转化为bean使用
 */
@Configuration
@EnableConfigurationProperties(OAuth2Properties.class)
public class OAuth2CoreConfig {
}