package cursojava.executavel;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		//DIVISAO DE CARROS ENTRE PESSOAS E MOSTRANDO O RESTO
		/*String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		
		int divisao = (int) (carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divis�o?");
		
		JOptionPane.showMessageDialog(null, "Divis�o para pessoas deu " + divisao + " os carros que restaram s�o " + (int) resto);
		
		//System.out.println("Divis�o para pessoas deu " + divisao + " os carros que restaram s�o " + resto);
		
		
		
		/*System.out.println("Meu primeiro projeto do curso JDEV");
		System.out.println("orienta��o a objetos");*/
		
		//PROGRAMA DE M�DIA*****************************
		
		String nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno: "); 
		
		
		String nota1 = JOptionPane.showInputDialog("informe a nota 1: ");
		String nota2 = JOptionPane.showInputDialog("informe a nota 2: ");
		String nota3 = JOptionPane.showInputDialog("informe a nota 3: ");
		String nota4 = JOptionPane.showInputDialog("informe a nota 4: ");
		
		double nota01 = Double.parseDouble(nota1);
		double nota02 = Double.parseDouble(nota2);
		double nota03 = Double.parseDouble(nota3);
		double nota04 = Double.parseDouble(nota4);
		
		double media = (nota01 + nota02 + nota03 + nota04) / 4;
		
		//media deve ser maior que 7 para aprova��o
		
		boolean aprovado;
		
		if(media >= 7) {
			aprovado = true;
		}else {
			aprovado = false;
		}
		
		
		
		JOptionPane.showMessageDialog(null, " Notas do aluno " + nomeAluno
				+ "\n nota 1: " + nota1
				+ "\n nota 2: " + nota2
				+ "\n nota 3: " + nota3
				+ "\n nota 4: " + nota4
				+ "\n\nA m�dia das notas informadas �: " + media
				+ "\n\n O aluno foi " + (aprovado == true ? "APROVADO" : "REPROVADO"));
		
		
	}

}
