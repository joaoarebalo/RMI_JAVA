import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import calculadora.Calculadora;
import calculadora.ICalculadora;

public class Servidor {
    public static void main(String[] args) {
        try {
            ICalculadora calc = new Calculadora();

            Registry registry = LocateRegistry.createRegistry(1099);

            registry.rebind("CalculadoraService", calc);

            System.out.println("Servidor RMI de Calculadora disponível na porta 1099...");
        } catch (Exception e) {
            System.err.println("Erro no servidor: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
