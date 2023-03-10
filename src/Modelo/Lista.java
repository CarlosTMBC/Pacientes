
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
            primero.siguiente = nuevoNodo;
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
            JOptionPane.showMessageDialog(null, auxiliar.getNombre()+auxiliar.getApellidos());
            i++;
            cadena = cadena + i +". "+ auxiliar.getNombre()+" "+auxiliar.getApellidos()+" \n" ;
            auxiliar = auxiliar.siguiente;
        }
        return cadena;
    }
    
}
