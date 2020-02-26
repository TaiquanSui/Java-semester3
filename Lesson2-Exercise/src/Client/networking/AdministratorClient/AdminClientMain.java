package Client.networking.AdministratorClient;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AdminClientMain
{
  public static void main(String[] args)
  {
    try{
      AdminAdminClient adminClient = new AdminAdminClient();
      Registry registry = LocateRegistry.getRegistry(1250);
      registry.lookup("server");
    }catch (RemoteException | NotBoundException e){
      e.printStackTrace();
    }



  }
}
