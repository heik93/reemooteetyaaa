import java.rmi.*;
import java.rmi.server.*;


public class alku {

	public static void main(String[] args) throws RemoteException{
		if (System.getSecurityManager()==null){
			System.setSecurityManager(new RMISecurityManager());
		}
		
		ServiceServer a = new ServiceServer();
		
		try{
		Naming.bind("metodi1", a);
		System.out.println("bind succesful");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
			
	}

}
