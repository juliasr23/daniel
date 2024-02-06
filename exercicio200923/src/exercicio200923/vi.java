package exercicio200923;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.*;

import imagens.img;
import exercicio200923.vi;



public class vi {
	public static void main(String[] args)
	{
			JFrame janela = new JFrame ();
			janela.setLayout(null);
			janela.setBounds(0, 0, 600, 500);
			
			ImageIcon  sun = new ImageIcon(img.imgpath+ "mais.png");
			ImageIcon san = new ImageIcon(img.imgpath1 + "menos.jpg");
			ImageIcon sen = new ImageIcon(img.imgpath2 + "vassoura.jpg");
			JButton mais = new JButton (sun);
			mais.setBounds(0, 0, 100, 100);
			janela.add(mais);
			
			JButton menos = new JButton (san);
			menos.setBounds(0, 0, 100, 100);
			janela.add(menos);
			
			JButton vassoura = new JButton (sen);
			vassoura.setBounds(0, 0, 100, 100);
			janela.add(vassoura);
	
			JProgressBar progress = new JProgressBar();
			progress.setMinimum(0);
			progress.setMaximum(99);
			progress.setBounds(0, 301, 600, 30); 
			janela.add(progress);
			janela.setVisible(true);
		
			}

		}



