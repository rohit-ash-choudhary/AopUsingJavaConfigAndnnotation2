package sp.com.AopUsingJavaConfigAnnotation.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect
public class LoggingAsp {
	
	
	@Before("execution(* sp.com.AopUsingJavaConfigAnnotation.Services.BankTransaction.UpiPayment(..)) || execution(* sp.com.AopUsingJavaConfigAnnotation.Services.BankTransaction.WalletPaymetn(..))")
	public void KeepUserDetailBefore() {
		
		System.out.println("===========Before Login Store user details===============");
	
		//joinPoint.proceed();
	}
	
	@After("execution(* sp.com.AopUsingJavaConfigAnnotation.Services.BankTransaction.UpiPayment(..)) || execution(* sp.com.AopUsingJavaConfigAnnotation.Services.BankTransaction.WalletPaymetn(..))")
	public void KeepUserDetailAfter() {
		
		System.out.println("===========Before Login Store user details===============");
	
		//joinPoint.proceed();
	}


	
	
	
}
