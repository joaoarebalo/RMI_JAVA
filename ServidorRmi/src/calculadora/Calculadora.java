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
        System.out.println("Cliente solicitou subtração: " + a + " - " + b);
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) throws RemoteException {
        System.out.println("Cliente solicitou multiplicação: " + a + " * " + b);
        return a * b;
    }

    @Override
    public double dividir(double a, double b) throws RemoteException {
        System.out.println("Cliente solicitou divisão: " + a + " / " + b);
        if (b == 0) throw new RemoteException("Divisão por zero não é permitida.");
        return a / b;
    }
}
