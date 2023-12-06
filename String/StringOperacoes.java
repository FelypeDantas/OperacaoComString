package String;

public class StringOperacoes {

	public static void main(String[] args) {
		
		String s1 = "Write Once";
		String s2 =  s1 + "Run AnyWhere";
		String s3 = new String("Java Virtual Machine");
		
		char[] array = { 'J', 'a', 'v', 'a'};
		String s4 = new String(array);
		
		int tamanho = s1.length();
		char letra = s1.charAt(0);
		String texto = s1.toString();
		
		int posicao = s3.indexOf("Virtual");
		int ultima = s3.lastIndexOf('a');
		boolean vazia = s3.isEmpty();
		System.out.println(posicao);
		
		String xti = "XTI";
		boolean x = xti.equalsIgnoreCase("xti");
		System.out.println(x);
	}

}
