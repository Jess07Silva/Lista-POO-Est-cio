package listaQuatro;
import java.util.Scanner;
public class VendaImovel {

	public static void main(String[] args) {
		Scanner s1 = new Scanner (System.in);
		int escolha = s1.nextInt();
		int escolha2 = s1.nextInt();
		
		if (escolha == 1) {
			Novo i1 = new Novo (120000, "Rua Robson, n123");
			System.out.println(i1.toString());
		}
		
		else if (escolha == 2) {
			Usado i2 = new Usado (100000, "Rua Danillo é frango, n69");
			System.out.println(i2.toString());
		}
		
		else{
			System.out.println("Insira um valor valido.");
			System.out.println("Deseja inserir outro valor: 1- Sim 2-Não");
			
			if (escolha2 == 1) {
				System.out.println("Insira o tipo de Imovel : 1-Novo 2-Usado"); 
				
			}
			else if (escolha2 == 2) {
				System.out.println("Programa finalizado"); 
			}
			
		}
	}

}
