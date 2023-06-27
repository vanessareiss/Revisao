package Funcionario;

import java.time.LocalDate;
import java.time.Period;




public abstract class Funcionario implements SalarioFinal{
    
    private String nome;
    private LocalDate dataNascimento;
    private Genero genero;
    private Setor setor;
    double salarioBase;

   public Funcionario(String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salarioBase) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.setor = setor;
        this.salarioBase = salarioBase;
    }
    
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
   
   
    }
    @Override
    public String toString() {
        return  nome + "\n Data de Nascimento: " + Util.formatarData(dataNascimento) + "\n Idade: " + this.getIdade() + "\n Gênero: " + genero.getTexto() + "\n Setor: " + setor.getTexto() + "\n Salário Base: " + Util.formatarBrl(salarioBase);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

     
    
    
}