package exercicio2;

public class SMSSenderImpl implements SMSSender {

	@Override
	public boolean sendSMS(SMS sms) {
		System.out.println("Sending SMS -> " + sms);
		return true;
	}
	

}
