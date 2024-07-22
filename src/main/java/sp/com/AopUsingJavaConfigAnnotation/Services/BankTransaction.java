package sp.com.AopUsingJavaConfigAnnotation.Services;

public class BankTransaction {
	
	public void UpiPayment() {
		
		System.out.println("==========Payment using Upi==============");
	}
	
	

	public void WalletPaymetn() {
		System.out.println("==========Payment using Wallet==============");
		
	}
	

	public void NetBankingPayment() {
		
		System.out.println("==========Payment using NetBanking==============");
	}

}
