package Servicios;

import Entidades.ParDeNumeros;

public class ParDeNumerosService {

    ParDeNumeros Numeros = new ParDeNumeros();

    public void mostrarValores() {
        /*
         * Método mostrarValores que muestra cuáles son los dos números
         * guardados.
         */
        double Numero1 = Numeros.getN1();
        System.out.println("Numero1 = " + Numero1);
        double Numero2 = Numeros.getN2();
        System.out.println("Numero2 = " + Numero2);
    }

    public double devolverMayor() {
        /*
         * Método devolverMayor para retornar cuál de los dos
         * atributos tiene el mayor valor
         */
        double mayor;
        if (Numeros.getN1() > Numeros.getN2()) {
            mayor = Numeros.getN1();
        } else {
            mayor = Numeros.getN2();
        }
        return mayor;
    }

    public void calcularPotencia() {
        /*
         * Método calcularPotencia para calcular
         * la potencia del mayor valor de la clase elevado al menor número.
         * Previamente se deben redondear ambos valores.
         */
        double resultado;
        if (Numeros.getN2() > Numeros.getN1()) {
            resultado = Math.pow(Numeros.getN2(), Numeros.getN1());
        } else {
            resultado = Math.pow(Numeros.getN1(), Numeros.getN2());
        }
        System.out.println("La potencia es : " + Math.round(resultado));
    }

    /*
    Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
    Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
     */
    public void calculaRaiz() {
        //Math.min() se utiliza para obtener el valor absoluto y calcular el menor de los dos valores.
        //Math.abs() para obtener el valor absoluto de ambos números
        //Math.sqrt() Calcular la raíz cuadrada
        double menorNumero = Math.min(Math.abs(Numeros.getN1()), Math.abs(Numeros.getN2()));
        double resultado = Math.sqrt(menorNumero);
        System.out.println("La Raiz es : " + resultado);
    }

}
