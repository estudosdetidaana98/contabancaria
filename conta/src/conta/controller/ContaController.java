package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {
	
	private static final Object conta = null;
	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null)
		    conta.visualizar();
		else
			System.out.println("\nA Conta número: " + numero + "Não foi encontrada!");
	}

	@Override
	public void listarTodas() {
		for (var conta: listaContas) {
			conta.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("\nA Conta número:"  + conta.getNumero() + "Foi criado com sucesso!"); 
		
	}

	@Override
	public void atualizar(Conta conta) {
		var buscaConta = buscarNaCollection(conta.getNumero());
		
		if (buscaConta !=null) {
			listaContas.set(listaContas.indexOf(buscaConta), conta);
			System.out.println("\nA Conta número:"  + conta.getNumero() + "Foi atualizada com sucesso!");
		}else 
			System.out.println("\nA Conta número:"  + conta.getNumero() + "Não foi encontrada!");
	}

	@Override
	public void deletar(int numero) {
		var buscaConta = buscarNaCollection(numero);
		
		if (buscaConta !=null) {
			if (listaContas.remove(conta) == true)
		    	  System.out.println("\nA Conta número:"  + numero + "Foi atualizada com sucesso!");
		}else 
			System.out.println("\nA Conta número:"  + numero + "Não foi encontrada!");
	}

	@Override
	public void sacar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if (conta !=null) {
			if (conta.sacar(valor) == true)
				System.out.println("\nO Saque na Conta número:"  + numero + "Foi efetuado com sucesso!");
			
		}else 
			System.out.println("\nA Conta número:"  + numero + "Não foi encontrada!");
		
		
	}

	@Override
	public void depositar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if (conta !=null) {
			conta.depositar(valor);
            System.out.println("\nO Depósito na Conta número:"  + numero + "Foi efetuado com sucesso!");
			
		}else 
			System.out.println("\nA Conta número:"  + numero + "Não foi encontrada ou a Conta destino não é uma Conta Corrente!");
			
		}
     
		

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		var contaOrigem = buscarNaCollection(numero);
		var contaDestino = buscarNaCollection(numero);
		
		if (contaOrigem !=null && contaDestino !=null) {
			if (contaOrigem.sacar(valor) == true) {
				contaDestino.depositar(valor);
				System.out.println("\nA Transferência foi efetuada com sucesso!");
				
			}else 
				System.out.println("\nA Conta de Origem e/ou Destino não foram encontradas!");
				
			}
		}
	
		
    public int gerarNumero() {
    	 return ++ numero;
    }
	
    public Conta buscarNaCollection(int numero) {
    	for (var conta : listaContas) {
    		if (conta.getNumero() == numero) {
    			return conta;
    		}
    	}
		return null;
    	
    }
}
