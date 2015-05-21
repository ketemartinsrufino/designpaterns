package exercicio2;

public class Main {
	
	public static void main(String[] args) {
		
		SMSSender sender = new SMSSenderImpl();
		
		sendSMSMessage(sender);
		
	}
	
	public static void sendSMSMessage(SMSSender sender) {
		SMS sms = new SMS();
		sms.setTexto("Ola mundo");
		sms.setDestino("Destino");
		sms.setOrigem("Origem");
		
		sender.sendSMS(sms);
	}

}
