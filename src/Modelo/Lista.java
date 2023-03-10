
package Modelo;

import javax.swing.JOptionPane;

public class Lista {
    Nodo primero;
    Nodo auxiliar;
    String cadena = "";
    
    public void Encolar(String apellido, String nombre)
    {
        Nodo nuevoNodo = new Nodo(apellido, nombre);
        if(primero == null)
        {
            primero = nuevoNodo;
        }
        else
        {
               
            primero.nombreCompleto = nuevoNodo;
            nuevoNodo = primero;
        }
        
        JOptionPane.showMessageDialog(null, "Nombre Ingresado");
    }
    
    public String Listar()
    {
        auxiliar = primero;
        cadena = "";
        int i = 0;
        while(auxiliar!=null)
        {
            i++;
            cadena = cadena + i +". "+ auxiliar.getNombre()+auxiliar.getApellidos()+" " ;
            auxiliar = auxiliar.nombreCompleto;
        }
        return cadena;
    }
    
}
