package listaDoisPontoQuatro;
import java.util.Scanner;

public class CompraIngresso {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Escolha o tipo de ingresso : 1- Normal 2- Vip");
		int escolha = s1.nextInt();
		
		if (escolha == 1) {
			Normal n1 = new Normal(50);
			n1.imprimevalor();
		}
		else {
			System.out.println("Escolha o tipo de ingresso VIP : 1- Camarote Inferior "
					+ "2 - Camarote Superior");
			escolha = s1.nextInt();
			if(escolha == 1) {
				CamaroteInferior n1 = new CamaroteInferior(50, "Assento A1");
				n1.imprimevalor();
			}
			else if (escolha == 2) {
				CamaroteSuperior n1 = new CamaroteSuperior(50, "Assento B2" );
				n1.imprimevalor();
			}
			
			else {
				System.out.println("Digite um valor valido");
			}
		}
	}

}
