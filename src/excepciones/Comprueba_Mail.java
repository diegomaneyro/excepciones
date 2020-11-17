package excepciones;
import java.io.EOFException;
import java.io.IOException;

import javax.swing.*;
public class Comprueba_Mail {

	public static void main(String[] args) {
			
		String el_mail=JOptionPane.showInputDialog("Introduce mail");
		
		try {
			examina_mail(el_mail);
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			System.out.println("El mail no es correcto");
		}
	}

		static void examina_mail(String mail) throws EOFException{
			
			int arroba=0;
			
			boolean punto=false;
			
			
			if(mail.length()<=3){//si el email es menor o igual a 3 lanzar una excepcion
				 
				throw new EOFException();
		
			}
			
			for(int i=0;i<mail.length();i++){
				
				if(mail.charAt(i)=='@'){
					arroba++;
				}
			if(mail.charAt(i)=='.'){
				punto=true;
			}
		}
			if(arroba==1 && punto==true){
				System.out.println("Es correcto");
			}else{
				System.out.println("no es correcto");
			}
		}
}

