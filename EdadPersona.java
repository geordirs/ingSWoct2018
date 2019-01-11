package edadpersona;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.FileNotFoundException;
import java.io.PrintStream;
/**
 *
 * @author jrsarango
 */
public class EdadPersona {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
            //Modificar este campo para calcular la edad : aaaa/mm/dd
		System.out.println(calcular(new GregorianCalendar(1990,10,15)));
    }
   
    public static int calcular(Calendar fechaNac) throws FileNotFoundException {
PrintStream edad = new PrintStream("Archivo Resultante.txt");
        Calendar fechaActual = Calendar.getInstance();

        int years = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);

        int months = fechaActual.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);

        int days = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);
        
        if(months < 0 

           || (months==0 && days < 0)) { 

            years--;
        }
        System.out.println("----------------------CALCULO DE LA EDAD--------------------");
 edad.println("Usted tiene : "+years+" años");
        return years;

    }
}
    
    

