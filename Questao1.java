
import javax.swing.JOptionPane;

public class Questao1 {

    public static void main (String [] args) {
		
		//Declarando variáveis
		int indice = 13, soma = 0, k = 0;

        //Efetuando o cálculo
        while(k < indice) {
            k = k +1;
            soma = soma + k;
        }

        JOptionPane.showMessageDialog(null, soma);
    }
    
}
