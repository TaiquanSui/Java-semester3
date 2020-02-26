package Client.networking.CustomerClient;

import Server.Server;

import java.rmi.RemoteException;

public class CustomerClient implements ICustomerClient
{
  private Server server;

  @Override public void withdrawMoney(double amount) throws RemoteException
  {
    server.withdrawMoney(amount);
  }
}
