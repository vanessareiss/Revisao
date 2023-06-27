/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Revisao;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Aluno
 */
public abstract class Fisica extends Pessoa{
    
    protected Genero genero;
    protected EstadoCivil estadoCivil;
    private LocalDate dataNascimento;

    public Fisica(Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
    }
    
     public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
   
     }
     
    public Genero getGenero() {
        return genero;
    }
    
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return super.toString()+
                
                "\n Gênero: " + genero.getTexto() + "\n Sigla: " + genero.getCaractere() + "\n Estado Civil: " + estadoCivil.getTexto() + "\n Data de nascimento: " +  Util.formatarData(dataNascimento) + "\n Idade: " + this.getIdade();
    }
    
    
    
    
    
    
    
    
    
    
}
