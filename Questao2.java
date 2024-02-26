import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Questao2 {
	
	public static void main (String [] args) {
		
		//Declarando variáveis
		int num, num1 = 1, num2 = 0;
		ArrayList<Integer> fibonacci = new ArrayList<Integer>();
		
		
		//Interagindo com o usuário
		num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
		
		//Calculando a sequência de Fibonacci
		fibonacci.add(num2);
		fibonacci.add(num1);
		while (num > num1) {
			num1 = num1 + num2;
            num2 = num1 - num2;
            fibonacci.add(num1);
		}
		
		//Comparando o número digitado com a sequência e exibindo resultados
		if (num == num1) {
			JOptionPane.showMessageDialog(null, "A sequência de Fibonacci até o número " + num + " é: " + fibonacci + "\nO número " + num + " pertence à sequência de Fibonacci");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "A sequência de Fibonacci até o número " + num + " é: " + fibonacci + "\nO número " + num + " não pertence à sequência de Fibonacci");
		}
		
	}
}