package Client.networking.AdministratorClient;

import Client.Model.Account;
import Server.Server;

import java.rmi.RemoteException;

public class AdminAdminClient implements IAdminClient
{

  private Server server;


  @Override
  public void createAccount(String accountNo, String password, double deposit) throws RemoteException {
    server.createAccount(accountNo, password, deposit);
  }


}
