package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IServer extends Remote
{
  void createAccount(String accountNo,String password,double deposit) throws RemoteException;
  void withdrawMoney(double amount) throws RemoteException;
  void insertMoney(double amount) throws RemoteException;

}
