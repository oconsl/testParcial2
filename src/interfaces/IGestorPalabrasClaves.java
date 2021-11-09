/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import palabrasclaves.modelos.PalabraClave;

/**
 *
 * @author Ocón Santiago Luis
 */
public interface IGestorPalabrasClaves {
    public static final String MSJ_OK = "Palabra Clave creada con éxito.";
    public static final String MSJ_REP = "Ya existe esta palabra clave.";
    public static final String MSJ_ERROR = "Error.";    
    
    public String nuevaPalabraClave(String nombre);
    public ArrayList<PalabraClave> verPalabrasClaves();
    public PalabraClave verPalabraClave(String nombre);
}
