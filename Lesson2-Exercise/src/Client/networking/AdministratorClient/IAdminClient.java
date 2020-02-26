package Client.networking.AdministratorClient;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IAdminClient extends Remote
{
  void createAccount(String accountNo, String password, double deposit) throws RemoteException;
}
