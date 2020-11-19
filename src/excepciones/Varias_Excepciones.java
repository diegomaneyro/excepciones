package excepciones;

import javax.swing.JOptionPane;

public class Varias_Excepciones {

	public static void main(String[] args) {
		//======Capturar excepcione sno controladas========
		try{
		division();
		}catch(ArithmeticException e){
			System.out.println("Estas dividiendo mal"+e.getClass().getName());
		}catch(NumberFormatException e){
			System.out.println("Introduce numeros reales");
			System.out.println(e.getMessage());
		}
	}



	static void division(){
		int num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
		int num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
		
		System.out.println("El resultado es: " + num1/num2);
		 
	}
}