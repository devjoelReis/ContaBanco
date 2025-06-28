import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {

		// Objeto de entrada
		Scanner scan = new Scanner(System.in);

		// Solicitando dados do cliente

		System.out.println("Digite o número da Conta: ");
		int numeroConta = scan.nextInt();
		// cosumindo o \n que ficou no buffer
		scan.nextLine();

		System.out.println("Digite o numero da Agencia: ");
		String agenciaCliente = scan.nextLine();

		scan.nextLine();

		System.out.println("Digite o seu nome: ");
		String nomeCliente = scan.nextLine();

		System.out.println("Por Favor Informe o valor do deposito : ");
		double saldo = scan.nextDouble();

		// mensagem de finalização da conta

		String mensagem = "Olá " + nomeCliente.concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
				.concat(String.valueOf(agenciaCliente)).concat(", conta ").concat(String.valueOf(numeroConta))
				.concat(" e seu saldo ").concat(String.valueOf(saldo)).concat(" já está disponível para saque.");

		System.out.println(mensagem);

		scan.close();

	}

}
