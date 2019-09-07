/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author diegoa.torres
 */
public class csvException extends Exception {

    /**
     * Creates a new instance of <code>csvException</code> without detail
     * message.
     */
    public csvException() {
    }

    /**
     * Constructs an instance of <code>csvException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public csvException(String msg) {
        super(msg);
    }
}
