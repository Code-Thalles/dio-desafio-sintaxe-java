import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Digite o número da agencia: ");
		String agencia = scan.nextLine();
		
		System.out.println("Digite o número da conta: ");
		int numero = scan.nextInt();
		
		System.out.println("Digite o saldo inicial que deseja inserir na conta: ");
		double saldo = scan.nextDouble();
		
		System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque"
);
	}
}
