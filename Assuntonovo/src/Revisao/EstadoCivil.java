/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Revisao;

/**
 *
 * @author Aluno
 */
public enum EstadoCivil {
    
    SOLTEIRO ("Solteiro"),
     CASADO ("Casado"),
     SEPARADO ("Separado"),
     DIVORCIADO ("Divorciado"),
     VIUVO ("Viúvo");
     
     private final String texto;

    private EstadoCivil(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
     
     
   
     
}
