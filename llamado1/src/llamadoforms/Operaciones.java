/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llamadoforms;

/**
 *
 * @author Usuario
 */
public class Operaciones {
    
    public double result; //el constructor es diferente
    
    //suma de datos
    public void calsuma(double n1, double n2)
    {
        result=n1+n2; //como seria la  operacion
    }
    //resta de datos
    public void calresta(double n1, double n2)
    {
        result=n1-n2;
    }
    //multiplicacion de datos
    public void calmultiplicacion(double n1, double n2)
    {
        result=n1*n2;
    }
    //division de datos
    public void caldivision(double n1, double n2)
    {
        result=n1/n2;
    }
}
