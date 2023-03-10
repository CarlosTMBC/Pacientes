
package Controlador;
import Modelo.*;
import Vistas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NodoController implements ActionListener {

    frmPrincipal VistaPrincipal;
    frmIngresoPacientes VistaIngreso;
    frmListaPacientes VistaListas;
    Lista nuevaLista;
    
    

    public NodoController(frmPrincipal VistaPrincipal, frmIngresoPacientes VistaIngreso, frmListaPacientes VistaListas, Lista nuevaLista) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaIngreso = VistaIngreso;
        this.VistaListas = VistaListas;
        this.nuevaLista = nuevaLista;
        
        this.VistaPrincipal.btnIngresarPacientes.addActionListener(this);
        this.VistaPrincipal.btnListaPacientes.addActionListener(this);
        //LEVANTAR VISTA PRINCIPAL
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()== this.VistaPrincipal.btnIngresarPacientes)
        {
            this.VistaIngreso.btnAPaciente.addActionListener(this);
            
            //Levantar el formulario vista nodos
            this.VistaIngreso.setLocationRelativeTo(null);
            this.VistaIngreso.setVisible(true);
            
        }
        if(e.getSource()==this.VistaIngreso.btnAPaciente)
        {
            this.nuevaLista.Encolar(this.VistaIngreso.txtApellidos.getText(), this.VistaIngreso.txtNombre.getText());
            this.VistaListas.jTextArea1.setText(this.nuevaLista.Listar());
        }
        if(e.getSource()==this.VistaPrincipal.btnListaPacientes)
        {
            this.VistaListas.setVisible(true);
        }
    }
}
