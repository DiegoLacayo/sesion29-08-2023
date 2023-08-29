import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        // Condicional switch-condicional multiple.
        // Break; = Cerrar caso y no dijitar el defaul.
            System.out.println("---Menu de opciones---");
            System.out.println("a) Sumar");
            System.out.println("b) Restar");
            System.out.println("c) Multiplicar");
            System.out.println("d) Dividir");
            System.out.println("e) Potencial o Exponencial");
            System.out.println("f) Raiz");
            System.out.println("g) Salir del menu");
            System.out.println("Ingrese un numero para acceder a la accion del menu: ");
            char opc = lector.next().charAt(0);
            double valorA, valorB, resultado, Resultado;

        switch (opc) {
            case 'a':
            System.out.println("a) Sumar (a + b) ");
            System.out.println("Ingrese el valor de a: ");
            valorA = lector.nextDouble();
            System.out.println("Ingrese el valor de b: ");
            valorB = lector.nextDouble();
            resultado = (valorA + valorB);
            System.out.println("El resultado de la suma "+ valorA +" + "+ valorB +" es de: " + resultado);
                break;

            case 'b':
            System.out.println("b) Resta (a - b) ");
            System.out.println("Ingrese el valor de a: ");
            valorA = lector.nextDouble();
            System.out.println("Ingrese el valor de b: ");
            valorB = lector.nextDouble();
            resultado = (valorA - valorB);
            System.out.println("El resultado de la resta "+ valorA +" - "+ valorB +" es de: " + resultado);
                break;

            case 'c':
            System.out.println("c) Multiplicacion (a x b) ");
            System.out.println("Ingrese el valor de a: ");
            valorA = lector.nextDouble();
            System.out.println("Ingrese el valor de b: ");
            valorB = lector.nextDouble();
            resultado = (valorA * valorB);
            System.out.println("El resultado de la multiplicacion "+ valorA +" x "+ valorB +" es de: " + resultado);
                break;

            case 'd':
            System.out.println("d) Divicion (a / b) ");
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
            
            case 'e':
            System.out.println("e) Potencia a^b  ");
            System.out.println("Ingrese el valor de a: ");
            valorA = lector.nextDouble();
            System.out.println("Ingrese el valor de b: ");
            valorB = lector.nextDouble();
            resultado = Math.pow(valorA, valorB);
            System.out.println("El resultado de la potencia "+ valorA +" ^ "+ valorB +" es de: " + resultado);
                break;

            case 'f':
            System.out.println("d) Raiz de a ");
            System.out.println("Ingrese el valor de a: ");
            valorA = lector.nextDouble();
            if (valorA <= 0){
                System.out.println("El valor de b no puede ser 0, ingrese cualquiern numero menos el 0 porfas");
            }else{
                Resultado = Math.sqrt(valorA);
                System.out.println("El resultado de la raiz cuadrada de "+ valorA +" es de: " + Resultado);
            }
                break;

            case 'g':
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
