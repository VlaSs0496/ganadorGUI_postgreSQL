
public class mvcparcial {

    public static void main(String[] args) {
        
        Ganador ganador = new Ganador();
        vista gui = new vista();
        controlador ct = new controlador(gui, ganador);
        gui.setVisible(true);
        archivos a = new archivos();
        System.out.println(a.leerText("C:\\Users\\super\\OneDrive\\Documentos\\NetBeansProjects\\parcial3\\txt\\numeros.txt"));
        
    }
}
