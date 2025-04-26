 import java.util.*;
 
 public class Index{
	public static void main(String[] args) {
	 Calculadora calculadora = new Calculadora();
     boolean decisao = true;
       Scanner scanner = new Scanner(System.in);
     while ( true){
  
    System.out.println("--Calculadora--");
    System.out.println("1- Somar");
    System.out.println("2- Subtrair");
    System.out.println("3- Multiplicar ");
    System.out.println("4- Dividir");
    System.out.println("5 - Sair");
    System.out.println("Escolha uma opção: ");
    int opcao = scanner.nextInt();
   if ( opcao < 5){
       
        System.out.println("Digite o primeiro numero ");
       int  numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero ");
       int  numero2 = scanner.nextInt();
      
       switch (opcao){
       
       case 1:
           System.out.println ("Reslutado " +calculadora.somar(numero1,numero2));
           break;
        case 2 :
            System.out.println("Resultado " + calculadora.subtrair(numero1,numero2));
            break;
        case 3 :
            System.out.println("Resultado " + calculadora.multiplicar(numero1,numero2));
            break;
        default:
            if (numero1 == 0 || numero2==0){
                System.out.println("Erro : não é possivel dividir por zerao");
            }else{
            System.out.println(" Reusltado " + calculadora.dividir(numero1,numero2));}
   }
   }
    if (opcao == 5){
        System.out.println("-----FIM------");
        break;    
        
      
    }  decisao = false;
     }    
	}
}
