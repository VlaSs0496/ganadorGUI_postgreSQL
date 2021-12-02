
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JOptionPane;

public class controlador implements ActionListener {

    vista gui;
    GanadorCrud crud;
    Ganador ganador;
    private archivos arch = new archivos();
    Random dado = new Random();
    int d = dado.nextInt(9);
    
    
    
    public controlador(vista gui, Ganador ganador) {
        this.gui = gui;
        this.ganador = ganador;
        this.gui.btnJugar.addActionListener(this);
        crud = new GanadorCrud();
        

    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        boolean j1 = false;
        boolean j2 = false;
        if (ae.getSource() == gui.btnJugar) {
            String [] valores = arch.read("");
            gui.txt1A.setText(valores[d]);
            gui.txt2A.setText(valores[d]);
            gui.txt3A.setText(valores[d]);
            gui.txt1B.setText(valores[d]);
            gui.txt2b.setText(valores[d]);
            gui.txt3B.setText(valores[d]);
            
            int total1 = Integer.parseInt(gui.txt1A.getText() + gui.txt2A.getText() + gui.txt3A);
            int total2 = Integer.parseInt(gui.txt1B.getText() + gui.txt2b.getText() + gui.txt3B);
            
            if (total1 > total2){
                JOptionPane.showConfirmDialog(gui, "Ganador jugar 1");
                j1 = true;
                if (j1 == true){
                    ganador = new Ganador("1");
                    crud.insertarGanador(ganador);
                }
            }
            else{
                JOptionPane.showConfirmDialog(gui, "Ganador jugar 2");
                j2 = true;
                    if (j2 == true){
                    ganador = new Ganador("2");
                    crud.insertarGanador(ganador);
                }
            }
            
        }
        
            
        

    }

}
