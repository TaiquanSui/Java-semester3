package Client.networking.ClerkClient;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IClerkClient extends Remote
{
  void insertMoney(double amount) throws RemoteException;
  void withdrawMoney(double amount) throws RemoteException;
}
