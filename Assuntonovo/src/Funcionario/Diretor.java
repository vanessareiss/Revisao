
package Funcionario;

import java.time.LocalDate;


public class Diretor extends Funcionario implements Contratacao{
    
    private final double PREMIO = 0.2;

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo o funcionário: " + funcionario.toString()); 
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo o funcionário: " + funcionario.toString());
    }

    public Diretor(String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salarioBase) {
        super(nome, dataNascimento, genero, setor, salarioBase);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return super.toString() +
                 "\n Prêmio: " + (PREMIO * 100) + "%" +
                 "\n Salário Final: " + Util.formatarBrl(getSalarioFinal());
    }

    @Override
    public double getSalarioFinal(){
       
        double salarioFinal = 0;
        salarioFinal += super.salarioBase * this.PREMIO;
        salarioFinal += super.salarioBase;
        return salarioFinal;
    }

    
    
    
    
}
