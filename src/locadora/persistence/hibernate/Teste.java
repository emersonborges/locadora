package locadora.persistence.hibernate;

import org.hibernate.*;
import java.util.Date;
import java.util.List;
public class Teste {

    public static void main(String[] args) {
        Session sessao = HibernateUtility.getSession(); //Abrindo uma sessão
        Transaction transaction = sessao.beginTransaction(); //Iniciando uma transação

        
        transaction.commit(); //Finalizando a transação                
        sessao.close(); //Fechando a sessão
    }
}