import java.util.Scanner;

class foo {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, agencia;
        int conta;
        float saldo;

        System.out.println("Por favor, digite o seu Nome !");
        nome = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta !");
        conta = scanner.nextInt();

        System.out.println("Por favor, digite o Saldo !");
        saldo = scanner.nextFloat();


        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque\n", nome, agencia, conta, saldo);
        scanner.close();
    }
}