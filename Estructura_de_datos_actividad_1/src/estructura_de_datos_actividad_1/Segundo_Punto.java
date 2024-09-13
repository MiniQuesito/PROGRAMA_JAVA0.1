/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura_de_datos_actividad_1;

/**
 *
 * @author 303
 */
public class Segundo_Punto {
    //Se declara para poder usar el objeto scanner
    Scanner sc= new Scanner(System.in);

    //Se solicittan datos al usuario
    System.out.println("Ingrese un numero: ");
    float num1 = sc.nextFloat();
    System.out.println("Ingrese otro numero");
    float num2 = sc.nextFloat();

    //Se declaran las variables donde se opera
    float suma = num1 + num2;
    float mult = num1 * num2;

    //Se muetran en pantalla los resultados de la operacion de los numeros dados
    System.out.println("El resultado de la suma de los numeros es: " + suma);
    System.out.println("El resultado de la multiplicacion es: " + mult);


    //EL volumen del cilindro
    System.out.println("Ingrese un el radio del cilindro: ");
    float radio = sc.nextFloat();
    System.out.println("Ingrese la altura del cilindro: ");
    float altura = sc.nextFloat();
    
    
    //Se aplica a la formula 
    float volumen = 3.1416(radio * altura);
    
    System.out.println("EL volumen del cilindro es: " + volumen);
    
}
