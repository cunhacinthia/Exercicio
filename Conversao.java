import java.util.Scanner;
// Converter graus Celsius em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F)
public class Conversao {

	public static void main(String[] args) {
		double c, k, re, ra, f;
		String escolha;
		
		Scanner insere = new Scanner(System.in);
		System.out.println("Digite o graus Celsius: ");
		c = insere.nextDouble();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual grau quer converter? ");
		System.out.println("f para Fahrenheit, k para Kelvin, re para Reaumur, ra para Rankine");
		escolha = scan.nextLine();
				
		f = c * 1.8 + 32;
		k = c + 273.14;
		re = c * 0.8;
		ra = c * 1.8 + 32 + 459.67;
		
		switch (escolha) {
		case "f":
			System.out.println("A conversao para Fahrenheit e " + f);
			break;
		case "k":
			System.out.println("A conversao para Kelvin e " + k);
			break;
		case "re":
			System.out.println("A conversao para Réaumur e " + re);
			break;
		case "ra":
			System.out.println("A conversao para Rankine e " + ra);
			break;
		default:
			System.out.println("Escolha indisponível!");
			
		}
		
	}

}
