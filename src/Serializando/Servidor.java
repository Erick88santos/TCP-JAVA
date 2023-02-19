package Serializando;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) {

		try {
			
			ServerSocket servidor = new ServerSocket(8000);
			System.out.println("Servidor está iniciado...");
			
			
			while(true) {
				
				AtendeCliente ac = new AtendeCliente(servidor.accept());
				ac.start();
							
			}
			
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro!");
		}
		
		

	}

}
