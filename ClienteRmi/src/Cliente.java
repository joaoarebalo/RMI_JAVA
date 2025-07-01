import calculadora.ICalculadora;

import java.rmi.Naming;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita IP ou hostname do servidor
            System.out.print("Digite o IP ou hostname do servidor (ex: 127.0.0.1 ou localhost): ");
            String endereco = scanner.nextLine().trim();

            // Monta a URL RMI
            String url = "rmi://" + endereco + "/CalculadoraService";

            // Conecta ao servi�o remoto
            ICalculadora calculadora = (ICalculadora) Naming.lookup(url);

            System.out.println("\n== Cliente RMI da Calculadora ==");
            System.out.println("Opera��es dispon�veis: soma, subtrai, multiplica, divide");
            System.out.println("Digite 'sair' para encerrar");

            while (true) {
                System.out.print("\nOpera��o: ");
                String comando = scanner.nextLine().trim().toLowerCase();

                if (comando.equals("sair")) {
                    System.out.println("Encerrando o cliente...");
                    break;
                }

                try {
                    System.out.print("Digite o primeiro n�mero: ");
                    double a = Double.parseDouble(scanner.nextLine());

                    System.out.print("Digite o segundo n�mero: ");
                    double b = Double.parseDouble(scanner.nextLine());

                    double resultado;

                    switch (comando) {
                        case "soma":
                            resultado = calculadora.somar(a, b);
                            break;
                        case "subtrai":
                            resultado = calculadora.subtrair(a, b);
                            break;
                        case "multiplica":
                            resultado = calculadora.multiplicar(a, b);
                            break;
                        case "divide":
                            resultado = calculadora.dividir(a, b);
                            break;
                        default:
                            System.out.println("Opera��o inv�lida.");
                            continue;
                    }

                    System.out.println("Resultado: " + resultado);

                } catch (NumberFormatException e) {
                    System.out.println("Entrada inv�lida. Use n�meros v�lidos.");
                } catch (Exception e) {
                    System.out.println("Erro ao executar opera��o: " + e.getMessage());
                }
            }

        } catch (Exception e) {
            System.err.println("Erro ao conectar ao servidor RMI: " + e.getMessage());
        }
    }
}
