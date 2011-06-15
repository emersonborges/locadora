/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora.model.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emerson
 */
public abstract class Subject {
    private List<Observer> observers =  new ArrayList<Observer>();

    public void registra(Observer o){
        observers.add(o);
    }

    public void remove(Observer o){
        observers.remove(o);
    }

    public void notifica(){
        for(Observer o : observers){
            o.update(this);
        }
    }

	public List<Observer> getObservers() {
		return observers;
	}
    
    
}
