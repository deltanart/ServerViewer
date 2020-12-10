package run;

import java.sql.SQLException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import controller.DataController;
import model.Program;
import model.Server;

public class ServerViewer {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.print("Setup server connection... ");
		controller.ServerConnection obj_connectionTest = new controller.ServerConnection(1);
		System.out.println("done.");
		
		System.out.print("Start scanning... ");
		Map<Object, Program> scanresult = obj_connectionTest.getProgramVersions();
		System.out.println("done.");
		System.out.println(scanresult);
		
		
		
		
		
		Set<Entry<Object, Program>> st = scanresult.entrySet();
		 for( Entry<Object, Program> me:st)
		    {
			  Program output = me.getValue();
			  //System.out.println(output.getProgramName()+ "  -  "+output.getVersion());
			  DataController.SaveProgram(output, Server.getServerById(1));
			 
		    }
		 
		 System.out.println("---------------------------------------------------");
		 System.out.println("|                 FROM DATABASE                   |");
		 System.out.println("---------------------------------------------------");
		 var programms = DataController.getProgramsFromServer(Server.getServerById(1));
		 System.out.println(programms[0].getProgramName());
		 for(Program i : programms) {
			 System.out.println(i.getProgramName()+" + "+i.getVersion());
		 }
	}
}
