package Day06.Ex02_Encapsulation;

public class Bank {

	public static void main(String[] args) {
		Account account = new Account(0, "국민은행", "282401-04-109955", "한성호");
		
		// deposit 변수는 private 으로 지정했기 때문에, 접근불가
		// (에러) account.deposit = 10000;
		account.setDeposit(10000);
		
		int money = account.getDeposit();
		System.out.println(account);
		System.out.println("예금액 : " + money);
	}
}
