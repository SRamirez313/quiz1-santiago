
package quiz1;

import javax.swing.JOptionPane;

public class Quiz1 {
 
    
    public static void main(String[] args) {
        
        String cursosS = JOptionPane.showInputDialog("ingrese el curso a matricular: ");
        double porcentaje = 0.02; 
        int cursos = Integer.parseInt(cursosS);
        double totalD = 0;
        
        for (int i = 1; i <= cursos; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del curso " + i + ":");
            String totalS = JOptionPane.showInputDialog("ingrese el monto pagado por el curos " + i + ":");
            double total = Double.parseDouble(totalS);
            totalD += total *  porcentaje;
            
        }
        JOptionPane.showConfirmDialog(null, "La profesor Walter White deberá pagar a hacienda el monto de: " + totalD);
        }

    
}

