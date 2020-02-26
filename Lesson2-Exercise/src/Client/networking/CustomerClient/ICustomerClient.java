package Client.networking.CustomerClient;

import Client.networking.ClerkClient.IClerkClient;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICustomerClient extends Remote
{
  void withdrawMoney(double amount) throws RemoteException;
}
