import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class FileReader {

    public String readExpression(String nombre) {
        File archivo = new File(nombre);

        try (BufferedReader br = new BufferedReader(new java.io.FileReader(archivo))) {
            return br.readLine(); 
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}