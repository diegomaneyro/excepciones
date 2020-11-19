package excepciones;
import java.util.*;

import javax.swing.JOptionPane;
public class Areas_Peso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner entrada=new Scanner(System.in);
		System.out.println("Elije una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");
		
		try{
		figura=entrada.nextInt() ;
	
		}catch(Exception e){
			System.out.println("error");
			
		}finally{
			
			entrada.close();//cierra el vinculo que abrio scanner para ingresar datos
				
		}
		
	
		switch(figura){		
		case 1:
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			System.out.println(Math.pow(lado, 2));
			break;
		case 2:
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce el base"));
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce el altura"));
			System.out.println("El area del triangulo es "+base*altura);
			break;
		case 3:
			base=Integer.parseInt(JOptionPane.showInputDialog("Introduce base"));
			altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce altura"));
			System.out.println("El area del triangulo es "+(base*altura)/2);
			break;
		case 4:
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			System.out.println("El area del circulo es: ");
			System.out.println(Math.PI*(Math.pow(radio,2)));
			break;
		default:
			System.out.println("la opcion no es correcta");
		}
		//============================================================================================================
	
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura en Cm"));
		System.out.println("Si eres hombre tu peso ideal es: "+(altura-110)+"kg");
		System.out.println("Si eres mujer tu peso ideal es: "+(altura-120)+"kg");
		
		
	}
	
	static int figura;

}
