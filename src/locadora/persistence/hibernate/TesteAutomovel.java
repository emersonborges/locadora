package locadora.persistence.hibernate;

import org.hibernate.*;
import java.util.Date;
import java.util.List;
public class TesteAutomovel {

    public static void main(String[] args) {
        
    	Session sessao = MyHibernateSingleton.getInstance().openSession(); //Abrindo uma sess�o
        Transaction transaction = sessao.beginTransaction(); //Iniciando uma transa��o
        
        
        
        transaction.commit(); //Finalizando a transa��o                
        sessao.close(); //Fechando a sess�o
    }
}