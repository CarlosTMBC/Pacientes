
package pckMain;

import Controlador.NodoController;
import Modelo.Lista;
import Vistas.frmIngresoPacientes;
import Vistas.frmListaPacientes;
import Vistas.frmPrincipal;

/**
 *
 * @author umg
 */
public class main {
    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmIngresoPacientes VistaIngreso = new frmIngresoPacientes(VistaPrincipal,true);
        frmListaPacientes VistaLista = new frmListaPacientes(VistaPrincipal,true);
        Lista NuevaLista = new Lista();
        
        NodoController Nuevocontrolador = new NodoController(VistaPrincipal,VistaIngreso,VistaLista,NuevaLista);
    }
    
    
}
