package conta;

import java.util.Scanner;

import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while (true) {
			System.out.println(conta.util.Cores.TEXT_YELLOW + conta.util.Cores.ANSI_BLACK_BACKGROUND
			                +  "***********************************************************************");
			System.out.println("                                                                       ");
			System.out.println("                       Twins Bank Agency                               ");
			System.out.println("                                                                       ");
			System.out.println("***********************************************************************");
			System.out.println("                                                                       ");
			System.out.println("                                                                       ");
			System.out.println("            1 - Criar Conta                                            ");
			System.out.println("            2 - Listar todas as Contas                                 ");
			System.out.println("            3 - Buscar Conta por Número                                ");
			System.out.println("            4 - Atualizar Dados da Conta                               ");
			System.out.println("            5 - Apagar Conta                                           ");
			System.out.println("            6 - Sacar                                                  ");
			System.out.println("            7 - Depositar                                              ");
			System.out.println("            8 - Transferir valores entre Contas                        ");
			System.out.println("            9 - Sair                                                   ");
			System.out.println("                                                                       ");
			System.out.println("***********************************************************************");
			System.out.println("Entre com a opção desejada:                                            ");
			System.out.println("                                                                       "+conta.util.Cores.TEXT_RESET);
            opcao = leia.nextInt();
			
			if (opcao == 9) {
				System.out.println(conta.util.Cores.TEXT_WHITE_BOLD +"\nTwins Bank Agency - Nossa Missão será lhe proporcionar o nosso Melhor!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println(conta.util.Cores.TEXT_WHITE_BOLD +"Criar Conta\n\n");
				
				break;
			case 2:
				System.out.println(conta.util.Cores.TEXT_WHITE_BOLD +"Listar todas as Contas\n\n");
				
				break;	
			case 3:
				System.out.println(conta.util.Cores.TEXT_WHITE_BOLD +"Consultar Dados da Conta  - por número\n\n");
				
				break;
			case 4:
				System.out.println(conta.util.Cores.TEXT_WHITE_BOLD +"Atualizar Dados da Conta\n\n");
				
				break;	
			case 5:
				System.out.println(conta.util.Cores.TEXT_WHITE_BOLD +"Apagar a Conta\n\n");
				
				break;
			case 6:
				System.out.println(conta.util.Cores.TEXT_WHITE_BOLD +"Saque\n\n");
				
				break;	
			case 7:
				System.out.println(conta.util.Cores.TEXT_WHITE_BOLD +"Depósito\n\n");
				
			    break;
			case 8:
				System.out.println(conta.util.Cores.TEXT_WHITE_BOLD +"Transferência entre Contas\n\n");
				
				break;	
			default:
				System.out.println(conta.util.Cores.TEXT_RED_BOLD +"\nOpção Inválida!\n");	
				break;
			}
		}
	}

	private static void sobre() {
		System.out.println("\n***********************************************************************");
		System.out.println("Desenvolvido por: Ana Eliza                                              ");
		System.out.println("Generation Brasil - estudo.ti.ana@gmai.com                               ");
		System.out.println("github.com/estudosdetidaana98                                            ");
		System.out.println("*************************************************************************");

	}

}
