
package Funcionario;

import java.time.LocalDate;


public class Motoboy extends Funcionario{
    
    private String carteiraDeHabilitacao;

    public Motoboy(String carteiraDeHabilitacao, String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salarioBase) {
        super(nome, dataNascimento, genero, setor, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

   

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }
    
    @Override
    public String toString() {
        
        return super.toString() +
                
                  "\n Carteira De Habilitação: " + carteiraDeHabilitacao + 
                  "\n Salário Final: " + Util.formatarBrl(getSalarioFinal());
    }

    @Override
    public double getSalarioFinal() {
       return super.salarioBase;
    }
    
    
    
    
    
    
    
}
