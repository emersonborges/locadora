/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora.model.observer;

/**
 *
 * @author Emerson
 */

//Observador
public abstract class Observer {
    
	private Subject subject;

    public abstract void update(Subject s);
}
