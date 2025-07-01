package calculadora;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculadora extends UnicastRemoteObject implements ICalculadora {

    public Calculadora() throws RemoteException {
        super();
    }

    @Override
    public double somar(double a, double b) throws RemoteException {
        System.out.println("Cliente solicitou soma: " + a + " + " + b);
        return a + b;
    }

    @Override
    public double subtrair(double a, double b) throws RemoteException {
        System.out.println("Cliente solicitou subtra��o: " + a + " - " + b);
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) throws RemoteException {
        System.out.println("Cliente solicitou multiplica��o: " + a + " * " + b);
        return a * b;
    }

    @Override
    public double dividir(double a, double b) throws RemoteException {
        System.out.println("Cliente solicitou divis�o: " + a + " / " + b);
        if (b == 0) throw new RemoteException("Divis�o por zero n�o � permitida.");
        return a / b;
    }
}
