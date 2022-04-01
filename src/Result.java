import java.util.ArrayList;
import java.util.List;

public class Result {


    public static List<Long> calcularDias(List<Long> prestamo){

        List<Long> diascalculados=new ArrayList<>();

        int pagodiario=1;
        int totalpago=0;
        long dias=0;
        int i;
        for( dias=0;totalpago< prestamo.get(0); dias++){

            totalpago=pagodiario+totalpago;
            pagodiario=pagodiario*2;

        }
        diascalculados.add(dias);
        return diascalculados;
    }

}
