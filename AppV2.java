import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        //Condicional switch-condicional multiple
            System.out.println("---Menu de opciones---");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("5) Salir del menu");
            System.out.println("Ingrese un numero para acceder a la accion del menu: ");
            byte opc = lector.nextByte();
            double valorA, valorB, resultado, Resultado;

        switch (opc) {
            case 1:
            System.out.println("1) Sumar (a + b) ");
            System.out.println("Ingrese el valor de a: ");
            valorA = lector.nextDouble();
            System.out.println("Ingrese el valor de b: ");
            valorB = lector.nextDouble();
            resultado = (valorA + valorB);
            System.out.println("El resultado de la suma "+ valorA +" + "+ valorB +" es de: " + resultado);
                break;

            case 2:
            System.out.println("2) Resta (a - b) ");
            System.out.println("Ingrese el valor de a: ");
            valorA = lector.nextDouble();
            System.out.println("Ingrese el valor de b: ");
            valorB = lector.nextDouble();
            resultado = (valorA - valorB);
            System.out.println("El resultado de la resta "+ valorA +" - "+ valorB +" es de: " + resultado);
                break;

            case 3:
            System.out.println("3) Multiplicacion (a x b) ");
            System.out.println("Ingrese el valor de a: ");
            valorA = lector.nextDouble();
            System.out.println("Ingrese el valor de b: ");
            valorB = lector.nextDouble();
            resultado = (valorA * valorB);
            System.out.println("El resultado de la multiplicacion "+ valorA +" * "+ valorB +" es de: " + resultado);
                break;

            case 4:
            System.out.println("4) Divicion (a / b) ");
            System.out.println("Ingrese el valor de a: ");
            valorA = lector.nextDouble();
            System.out.println("Ingrese el valor de b: ");
            valorB = lector.nextDouble();
            if (valorB == 0){
                System.out.println("El valor de b no puede ser 0, ingrese cualquiern numero menos el 0 porfas");
            }else{
                Resultado = (valorA / valorB);
                System.out.println("El resultado de la Divicion "+ valorA +" / "+ valorB +" es de: " + Resultado);
            }
                break;

            case 5:
            System.out.println("-- Usted a salido con exito del Menu --");
            System.out.println("-- Sistema Finalizado Correctamente --");
                break;

            default:
            System.out.println("Oe chatel ingresa un valor correcto para que funcione mi super sistema maje, Anuar gut");
            System.out.println("-- Sistema Finalizado Correctamente --");
                break;     
        }
        lector.close();
    }
}
