package Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server implements IServer
{
  public Server() throws RemoteException
  {
    UnicastRemoteObject.exportObject(this,0);
  }

  @Override public void createAccount(String accountNo, String password, double deposit) throws RemoteException
  {

  }

  @Override public void withdrawMoney(double amount) throws RemoteException
  {

  }

  @Override public void insertMoney(double amount) throws RemoteException
  {

  }
}
