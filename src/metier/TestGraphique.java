package metier;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import application.FenetreATM;
import sdd.HistoriqueTransferts;

public class TestGraphique {

	public static void main(String[] args) {
		

		//LANCEMENT DU LOOP SETBRIGHTNESS
		 String[] command =
	    {
	        "cmd",
	    };
	    Process p = null;
		try {
			p = Runtime.getRuntime().exec(command);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
	    new Thread(new SyncPipe(p.getInputStream(), System.out)).start();
	    PrintWriter stdin = new PrintWriter(p.getOutputStream());
	    stdin.println("cd /");
	    stdin.println("cd \\_SEMESTRE 2_\\IHM\\ihm\\runnable");
	    stdin.println("LoopBrightness.jar");
	    stdin.close();
			    
		//OUVERTURE FENETRE
		new FenetreATM();
	}
}
