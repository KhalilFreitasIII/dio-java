import java.util.Scanner;

public class ContaTerminal{
   public static void main(String[] args){
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Por favor, digite o seu nome: ");
    nomeCliente = sc.nextLine();
    System.out.println("Por favor, digite o numero da sua Agencia: ");
    agencia = sc.nextLine();
    System.out.println("Por favor, digite o numero da sua conta:");
    numero = sc.nextInt();
    System.out.println("Por favor, digite o saldo da sua conta:");
    saldo = sc.nextDouble();

    System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia e "
       + agencia+ ", conta "+ numero + " e seu saldo "+saldo+" ja esta disponivel para saque.");
   }
}
