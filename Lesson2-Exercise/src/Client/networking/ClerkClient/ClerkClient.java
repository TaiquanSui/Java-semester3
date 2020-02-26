package Client.networking.ClerkClient;

import Server.Server;

import java.rmi.RemoteException;

public class ClerkClient implements IClerkClient
{

  private Server server;


  @Override public void insertMoney(double amount) throws RemoteException
  {
    server.insertMoney(amount);
  }

  @Override public void withdrawMoney(double amount) throws RemoteException
  {
    server.withdrawMoney(amount);
  }
}
