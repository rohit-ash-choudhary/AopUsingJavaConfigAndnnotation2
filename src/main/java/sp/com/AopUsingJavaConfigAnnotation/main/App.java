package sp.com.AopUsingJavaConfigAnnotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sp.com.AopUsingJavaConfigAnnotation.Resource.SpringConfigFileJava;
import sp.com.AopUsingJavaConfigAnnotation.Services.BankTransaction;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        // Correctly reference the configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFileJava.class);
        
        // Retrieve the bankObj bean
        BankTransaction bt = (BankTransaction) context.getBean("bankObj");
        bt.NetBankingPayment();
        System.out.println();
        bt.WalletPaymetn();
        System.out.println();
        bt.UpiPayment();
    }
    
}
