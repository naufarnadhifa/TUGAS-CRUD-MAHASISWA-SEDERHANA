/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package praktikum.crudmahasiswasederhana;

import crudmahasiswasederhana.View.MahasaiswaFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author NAUFA ARNADHIFA
 */
public class CRUDMahasiswaSederhana {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MahasaiswaFrame form = new MahasaiswaFrame();
                form.setLocationRelativeTo(null);
                form.setVisible(true);
            }
        }); 
    }
}
