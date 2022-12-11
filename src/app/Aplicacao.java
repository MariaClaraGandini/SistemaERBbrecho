package app;

import java.awt.Desktop;
import java.awt.Dimension;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Aplicacao {
	public static void main(String[] args) {
		// Interface gráfica do servidor
		JFrame frame = new JFrame();	
		frame.setTitle("Jetty");
		frame.setPreferredSize(new Dimension(180, 180));//TAMANHO DA PAG 
		frame.setLayout(null); //CENTRALIZADO
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// AO FECHAR PARAR APLICACAO
		frame.pack();
		frame.setLocationRelativeTo(null);
		
		JLabel label = new JLabel();
		label.setText("Servidor Jetty Iniciado!"); //TEXT
		label.setBounds(15, 15, 160, 100);
		frame.add(label);
		
		// Inicialização do servidor Jetty - Servidor HTTP		
		ServidorJettyRunnable jettyRunnable = new ServidorJettyRunnable();
		Thread thread = new Thread(jettyRunnable);			
		thread.start();
		//Verificar se existe um brownser, se sim, abra, se tiver erri vai desparar erro
		if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)){
			try {
				// Abrir o browser automaticamente
				Thread.sleep(5000);
				Desktop.getDesktop().browse(new URI(Constantes.SERVIDOR +":"+ Constantes.PORTA +"/index"));
			} catch (IOException | URISyntaxException | InterruptedException e) {
				e.printStackTrace();
			}
		}		
		System.out.println("Servidor Iniciado!");		
		frame.setVisible(true);
		
		
		
		
	}
}
