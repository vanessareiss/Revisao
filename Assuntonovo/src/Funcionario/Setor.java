/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionario;

/**
 *
 * @author Aluno
 */
public enum Setor {
    
    RECURSOS_HUMANOS ("Recursos Humanos"),
    FINANCEIRO ("Financeiro"),
    OPERACOES("Operações");
    
    private final String texto;

    private Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
    
}
