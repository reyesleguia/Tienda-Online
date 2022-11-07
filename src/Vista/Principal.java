
package Vista;

import Modelo.Operaciones;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        
       
        
        Operaciones registroCuenta = new Operaciones();
        
        int opcion;
        
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(
            "Menu Principal\n"                    
                    + "2. Imprimir la lista de bancos registrados\n"
                    + "3. Registrar un titular de cuenta al banco\n"
                    + "4. Imprimir la lista de titulares de cuenta\n"
                    + "5. Registrar una cuenta al banco\n"
                    + "6. Imprimir la de cuentas del banco\n"
                    + "7. Salir"));
            switch(opcion){                
                
                case 5:
                    registroCuenta.IngresardatosCuenta();
                    break;
                case 6:
                    registroCuenta.ImprimirListaCuenta();
                    
                    registroCuenta.ImprimirListaCuenta();
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Adios");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ponte serio vale mia");
                    break;
            }
        }while(opcion != 7);
    }  
}
