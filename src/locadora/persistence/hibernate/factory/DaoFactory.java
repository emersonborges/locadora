package locadora.persistence.hibernate.factory;

import locadora.persistence.hibernate.AdicionalDaoImpl;
import locadora.persistence.hibernate.AssentoInfantilDaoImpl;
import locadora.persistence.hibernate.AutomovelDaoImpl;
import locadora.persistence.hibernate.CaminhaoDaoImpl;
import locadora.persistence.hibernate.CarroDaoImpl;
import locadora.persistence.hibernate.CategoriaDaoImpl;
import locadora.persistence.hibernate.ClienteDaoImpl;
import locadora.persistence.hibernate.DescontoDaoImpl;
import locadora.persistence.hibernate.DevolucaoDaoImpl;
import locadora.persistence.hibernate.FuncionarioDaoImpl;
import locadora.persistence.hibernate.LocacaoDaoImpl;
import locadora.persistence.hibernate.MotoDaoImpl;
import locadora.persistence.hibernate.ReservaDaoImpl;
import locadora.persistence.hibernate.SeguroDaoImpl;
import locadora.persistence.hibernate.TanqueCheioDaoImpl;

public class DaoFactory {
	
	private static DaoFactory daoFactory;
	
	public DaoFactory(){
		super();
	}
	
	public Object createDao(String dao){
		Object daoObject = null;
		if(dao.equals("ClienteDao")){
			daoObject = new ClienteDaoImpl();
		}else if(dao.equals("AdicionalDao")){
			daoObject = new AdicionalDaoImpl();
		}else if(dao.equals("ReservaDao")){
			daoObject = new ReservaDaoImpl();
		}else if(dao.equals("LocacaoDao")){
			daoObject = new LocacaoDaoImpl();
		}else if(dao.equals("FuncionarioDao")){
			daoObject = new FuncionarioDaoImpl();
		}else if(dao.equals("AutomovelDao")){
			daoObject = new AutomovelDaoImpl();
		}else if(dao.equals("DevolucaoDao")){
			daoObject = new DevolucaoDaoImpl();
		}else if(dao.equals("CategoriaDao")){
			daoObject = new CategoriaDaoImpl();
		}else if(dao.equals("DescontoDao")){
			daoObject = new DescontoDaoImpl();
		}else if(dao.equals("MotoDao")){
			daoObject = new MotoDaoImpl();
		}else if(dao.equals("CaminhaoDao")){
			daoObject = new CaminhaoDaoImpl();
		}else if(dao.equals("CarroDao")){
			daoObject = new CarroDaoImpl();
		}else if(dao.equals("SeguroDao")){
			daoObject = new SeguroDaoImpl();
		}else if(dao.equals("AssentoDao")){
			daoObject = new AssentoInfantilDaoImpl();
		}else if(dao.equals("TanqueCheioDao")){
			daoObject = new TanqueCheioDaoImpl();
		}
		return daoObject;
	}
	// fabrica criada com lazy instatiation!
	public static DaoFactory getInstance(){
		if(daoFactory==null){
			daoFactory = new DaoFactory();
		}
		return daoFactory;
	}
	
}
