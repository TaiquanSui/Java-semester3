package Client.networking.ClerkClient;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClerkClientMain
{
  public static void main(String[] args)
  {
    try{
      ClerkClient adminClient = new ClerkClient();
      Registry registry = LocateRegistry.getRegistry(1250);
      registry.lookup("server");
    }catch (RemoteException | NotBoundException e){
      e.printStackTrace();
    }
  }
}
