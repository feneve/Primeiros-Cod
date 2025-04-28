import java.util.Scanner;
import java.util.Random;
public class Jogo_Adivinhe{

	public static void main(String[] args) {
	Random random = new Random ();
	Scanner scanner = new Scanner(System.in);
	
	int sorteado = random.nextInt(50) + 1;
	int i = 1;
	int chute = 43;
	System.out.println("Jogo Adivinhe o NUMERO SORTEADO");
	System.out.println("-------------------------------");
	System.out.println("VC tem 7 chances");
    while(i <= 7){	
        System.out.println( i + " Chance, chute outro numero");
     	 chute = scanner.nextInt();
	    if (chute < sorteado){
	        System.out.println("O numero sorteado é maior ");
	    }else if(chute > sorteado){
	        System.out.println("O numero sorteado é menor ");
	   } else if (chute == sorteado){
	        System.out.println("PARABENS!!!!! VC ACERTOU");
	        System.out.println("Voce acertou na " + i + "chance");
	        break;}else{
	            System.out.println("");
	    }i++;
	}
	 if (chute != sorteado){
	     System.out.printf("Você errou o numero sorteado\n o numero sorteado era " + sorteado);
	 }
	
	scanner.close();
	}
}
