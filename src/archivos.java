
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class archivos {
    
    public String leerText(String direccion){
        
        String texto = "";
        
        try {
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                temp = temp + bfRead;        
            }
            
            texto = temp;
        } catch (Exception e) {
            System.out.println("no se encontro archivo");
        }
        return texto;
    }
        public String[] read(String numero){
        String[] resultado = new String[10];
        try {
            RandomAccessFile archivo = new RandomAccessFile("numeros.txt", "r");
            String lineaActual = "";
            while((lineaActual = archivo.readLine()) != null ){
                StringTokenizer tokens = new StringTokenizer(lineaActual, ",");
                if (tokens.nextToken().equals(numero)){
                    resultado[0] = tokens.nextToken();
                    resultado[1] = tokens.nextToken();
                    resultado[2] = tokens.nextToken();
                    resultado[3] = tokens.nextToken();
                    resultado[4] = tokens.nextToken();
                    resultado[5] = tokens.nextToken();
                    resultado[6] = tokens.nextToken();
                    resultado[7] = tokens.nextToken();
                    resultado[8] = tokens.nextToken();
                    resultado[9] = tokens.nextToken();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(archivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    
}
