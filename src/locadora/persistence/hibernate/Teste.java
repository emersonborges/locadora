package locadora.persistence.hibernate;

import org.hibernate.*;
import java.util.Date;
import java.util.List;
public class Teste {

    public static void main(String[] args) {
        Session sessao = HibernateUtility.getSession(); //Abrindo uma sess�o
        Transaction transaction = sessao.beginTransaction(); //Iniciando uma transa��o

        
        transaction.commit(); //Finalizando a transa��o                
        sessao.close(); //Fechando a sess�o
    }
}