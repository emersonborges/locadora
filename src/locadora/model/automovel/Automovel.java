package locadora.model.automovel;

import java.util.ArrayList;
import java.util.List;
import locadora.model.observer.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a90633
 */
public abstract class Automovel extends Subject{

    List<Automovel> adicionais = new ArrayList<Automovel>();

    private int ano;
    private int capacidade;
    private String chassi;
    private int codCategoria;
    private int consumo;
    private String cor;//não tem pq usar o tipo color
    private int modelo;
    private Enum<Combustivel> combustivel;
    private String placa;
    private double preco;
    private Enum<Status> status;

    public Boolean estaDisponivel(){
        if (this.status.equals(Status.disponivel))
            return true;
        return false;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco=preco;
    }

    public enum Status{
        disponivel,alugado,manutencao,reservado;
    }

    public enum Combustivel{
        alcool,gasolina,diesel,gasNatural,eletrica;
    }

    public void addAdicionais(Automovel a){
        adicionais.add(a);
    }

    public String getStatus(){
        return this.status.toString();
    }
    public void setStatus(Enum<Status> status) {
        this.status = status;
        this.notifica();
    }

}
