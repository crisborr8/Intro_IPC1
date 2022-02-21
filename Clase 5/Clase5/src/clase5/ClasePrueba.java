/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase5;

/**
 *
 * @author crisb
 */
public class ClasePrueba {
    
    //suma - resta - multiplicacion - division
    public int Suma(int operador1, int operador2){
        return operador1 + operador2;
    }
    public int Resta(int operador1, int operador2){
        return operador1 - operador2;
    }
    public int Multiplicacion(int operador1, int operador2){
        return operador1 * operador2;
    }
    public int Division(int operador1, int operador2){
        return operador1 / operador2;
    }
    public int Exponente(int operador1, int operador2){
        return (int)Math.pow(operador1, operador2);
    }
}
