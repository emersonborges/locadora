package locadora.persistence.dao.hibernate.factory;

import locadora.persistence.dao.hibernate.AdicionalDaoImpl;
import locadora.persistence.dao.hibernate.AssentoInfantilDaoImpl;
import locadora.persistence.dao.hibernate.AutomovelDaoImpl;
import locadora.persistence.dao.hibernate.CaminhaoDaoImpl;
import locadora.persistence.dao.hibernate.CarroDaoImpl;
import locadora.persistence.dao.hibernate.CategoriaDaoImpl;
import locadora.persistence.dao.hibernate.ClienteDaoImpl;
import locadora.persistence.dao.hibernate.DescontoDaoImpl;
import locadora.persistence.dao.hibernate.DevolucaoDaoImpl;
import locadora.persistence.dao.hibernate.FuncionarioDaoImpl;
import locadora.persistence.dao.hibernate.LocacaoDaoImpl;
import locadora.persistence.dao.hibernate.MotoDaoImpl;
import locadora.persistence.dao.hibernate.ReservaDaoImpl;
import locadora.persistence.dao.hibernate.SeguroDaoImpl;
import locadora.persistence.dao.hibernate.TanqueCheioDaoImpl;

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
