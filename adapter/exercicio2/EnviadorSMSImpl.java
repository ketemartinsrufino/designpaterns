package exercicio2;


public class EnviadorSMSImpl implements EnviadorSMS{

	public void enviarSMS(String destino, String origem, String[] msgs) throws Exception {
		StringBuilder sb = new StringBuilder("Enviando SMS [");
		sb.append("destino: ").append(destino).append(",");
		sb.append("origem: ").append(origem).append(",");
		sb.append("msgs: ").append(destino).append(",");
		for(String m: msgs){
			sb.append(m).append("-");
		}
		sb.substring(0, sb.length() -2);
		sb.append("]");
		
		System.out.println(sb);
	}
}
