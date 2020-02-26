package Client.networking.CustomerClient;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CustomerClientMain
{
  public static void main(String[] args)
  {
    try{
      CustomerClient adminClient = new CustomerClient();
      Registry registry = LocateRegistry.getRegistry(1250);
      registry.lookup("server");
    }catch (RemoteException | NotBoundException e){
      e.printStackTrace();
    }



  }
}
