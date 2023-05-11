import practica.Libros;
import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
        Libros libro2 = new Libros(2021, "juan", "rosero");
        Libros lirb1 = new Libros(2109, "juaks", "aonweo");
        List<Libros> libro1 = new ArrayList<Libros>();
        libro1.add(libro2);
        libro1.add(lirb1);
        for(int i=0; i<libro1.size();i++){
            System.out.println(libro1.get(i).toString());
        }
    }
    
}
