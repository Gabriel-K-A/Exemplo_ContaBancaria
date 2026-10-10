package Exemplo_ContaBancaria;

import java.util.Scanner;

class ContaBancaria{
    
    private String numeroConta;
    private String titular;
    private double saldo;
    Scanner scan = new Scanner(System.in);
    
    public ContaBancaria(){
        
        this.numeroConta = "";
        this.titular = "";
        this.saldo = 0f;
    }
    
    public String getNumeroConta(){
        
        return this.numeroConta;
        
    }
    
    public String getTitular(){
        
        return this.titular;
        
    }
    
    public double getsaldo(){
        
        return this.saldo;
        
    }
    
    public void setNumeroConta(String numeroConta){
        
        this.numeroConta = numeroConta;
        
    }
    
    public void setTitular(String titular){
        
        this.titular = titular;
        
    }
    
    public void saldo(double saldo){
        
        this.saldo = saldo;
        
    }
    
    public void depositar(double valor){
       
        while(valor <= 0){
           
            System.out.println("Só é aceito valores acima de zero.\n");
            System.out.print("Digite o valor que deseja depositar: ");
            valor = scan.nextDouble();
            System.out.println();
           
        }
       
        this.saldo += valor;
       
        System.out.print("\nDepósito realizado com sucesso!");
        
    }
    
    public void sacar(double valor){
        
        while(valor < 0 || valor > this.saldo){
           
            System.out.println("Só é aceito valores acima de zero e que não exceda o saldo atual.\n");
            System.out.print("Digite o valor que deseja sacar: ");
            valor = scan.nextDouble();

            if(valor == 0){

                break;

            }
           
        }
       
        this.saldo -= valor;
       
        System.out.println("\nSaque realizado com sucesso!");
        
    }
    
    public void exibirDetalhes(){
        
        System.out.println("O número da conta é: " + this.numeroConta);
        System.out.println("O titular da conta é: " + this.titular);
        System.out.println("O saldo da conta é de: R$" + this.numeroConta);
        
    }
    
}
