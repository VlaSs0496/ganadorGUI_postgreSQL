import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GanadorCrud {

    Connection conexion;
    
    public void conectar(){
        try {
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","asd123");
        } catch (SQLException ex) {
            Logger.getLogger(GanadorCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void insertarGanador(Ganador ganador){
        try {
            conectar();
            Statement stmt = conexion.createStatement();
            String sql = "INSERT INTO public.Ganador(\n" +
	"numero)\n"+
"	VALUES (('"+ganador.getJugadorN()+");";
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(GanadorCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
