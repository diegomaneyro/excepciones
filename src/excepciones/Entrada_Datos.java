package excepciones;
import java.io.IOException;
import java.util.*;
public class Entrada_Datos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("¿Que deseas hacer?");
			System.out.println("1. Introducir datos");
			System.out.println("2. Salir delprograma");
			
		Scanner entrada=new Scanner(System.in);
		int desicion=entrada.nextInt();
		
		if(desicion==1){
			try{
			pedirDatos();
			}catch(InputMismatchException e){
				System.out.println("¿Que demonios has ingresado?");
			}
			}else{
			System.out.println("Adios");
			System.exit(0);//sale del programa
		}
			entrada.close();
	}
		static void pedirDatos()throws InputMismatchException{//clausula throws que captura una Exception
//			try{
			Scanner entrada=new Scanner(System.in);
			
			System.out.println("Introduce nombre");
			String nombre_usuario=entrada.nextLine();
			
			System.out.println("introduce edad");
			int edad=entrada.nextInt();
			
			System.out.println("hola " + nombre_usuario + ". El año proximo tendras " + (edad+1) + " años" + " años");
			entrada.close();
	//		}catch(Exception e){//usa la Excepcion 
		//		System.out.println("Que demonios has introducido en la edad");
			//}
			System.out.println("hemos terminado");
		}

	}
