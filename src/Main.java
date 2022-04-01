import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Long> datos= new ArrayList<>();

        datos.add(10L);

        List<Long> re=Result.calcularDias(datos);

        System.out.println(re);

    }
}
