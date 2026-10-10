package Exemplo_ContaBancaria;

import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria();
        int opcao = 0;
        double valor = 0;
        
        
        do{
          
          System.out.print("\n1. Exibir detalhes da conta.\n2. Depositar.\n3. Sacar.\n4. Sair.\n\nDigite qual das ações deseja realizar: ");
          opcao = scan.nextInt();
          System.out.println();
          
          if(opcao < 1 || opcao > 4){
              
            System.out.println("Essa opção é inválida. Tente novamente!\n");
              
          }
          
          else if(opcao == 1){
              
            conta1.exibirDetalhes();
              
          }
          
          else if(opcao == 2){

            System.out.print("Digite um valor que deseja depositar: ");
            valor = scan.nextDouble();

            System.out.println();

            conta1.depositar(valor);
              
          }
          
          else if(opcao == 3){

            System.out.print("Digite um valor que deseja sacar: ");
            valor = scan.nextDouble();

            System.out.println();

            conta1.sacar(valor);
              
          }
           
        }while(opcao != 4); 
        
        scan.close();
    }
    
}
