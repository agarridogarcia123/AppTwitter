
package twitt2;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import twitt2.Metodos;
import twitter4j.DirectMessage;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author agarridogarcia
 */
public class Twitt1 {

    /**
     * @param args menú de twitter
     */
    public static void main(String[] args) {
        Metodos.acceso();
        int opcion;

        do { 
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Novo estado \n 2.TimeLine \n 3.Buscar un twitt \n 4.Mensaxe Privada "));
            switch (opcion) {

                case 1:Metodos.twitear("Hola");
                    break;
                case 2:Metodos.timeLine();
                    break;
                case 3:Metodos.buscarTt("hola");
                    break;
                case 4:Metodos.enviarMP(JOptionPane.showInputDialog("Introduce destinatario"),JOptionPane.showInputDialog("Introduce a mensaxe"));
                    break;
                
            }

        } while (opcion != 0);
    }
}