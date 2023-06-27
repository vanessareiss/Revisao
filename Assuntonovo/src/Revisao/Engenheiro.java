
package Revisao;

import java.time.LocalDate;


public class Engenheiro extends Funcionario{
    
  private String crea;

    public Engenheiro(String crea, String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return super.toString()+
                
                "\n CREA: " + crea;
    }

    @Override
    public double getSalarioFinal() {
       return salario;
    }

   


  
    
}
