package sp.com.AopUsingJavaConfigAnnotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import sp.com.AopUsingJavaConfigAnnotation.Aspect.LoggingAsp;
import sp.com.AopUsingJavaConfigAnnotation.Services.BankTransaction;

@Configuration
@EnableAspectJAutoProxy
public class SpringConfigFileJava {
    
    @Bean
    public BankTransaction bankObj() {
        BankTransaction bt = new BankTransaction();
        return bt;
    }
    
    @Bean
    public LoggingAsp logObj() {
        LoggingAsp la = new LoggingAsp();
        return la;
    }
}
