
package Revisao;

import java.time.LocalDate;


public class Diretor extends Funcionario implements Contratacao{
    
    private final double PREMIO = 0.2;

    public Diretor(String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
    }

   

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return super.toString()+
                  "\n Prêmio: " + (PREMIO * 100) + "%" +
                  "\n Salário Final: " + Util.formatarBrl(getSalarioFinal());
    }

   

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo o funcionário: " + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo o funcionário: " + funcionario.toString());
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal += super.salario * this.PREMIO;
        salarioFinal += super.salario;
        return salarioFinal;
    }
    
}
