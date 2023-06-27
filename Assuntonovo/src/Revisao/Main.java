
package Revisao;

import java.time.LocalDate;
import java.time.Month;


public class Main {
    
    public static void main(String[] args) {
        
    
    
    Engenheiro engenheiro = new Engenheiro("6958", "695.659.-98", "695.6.95-9", "9854", Setor.ENGENHARIA, 0, Genero.MASCULINO, EstadoCivil.CASADO, LocalDate.of(1994, Month.MARCH, 10), "João", "9857-6958", "João@gmail.com", new Endereco("Avenida", "56", "Em frente ao parque", "85685-000", "Salvador", UnidadeFederativa.BAHIA));
    Motoboy motoboy = new Motoboy("3652", "956.365.984-89", "659.695-26", "6598", Setor.OPERACOES, 1520, Genero.MASCULINO, EstadoCivil.CASADO, LocalDate.of(1995, Month.MARCH, 15), "Gabriel", "6958-1325", "gabriel@gamil.com", new Endereco("rua", "69", "Ao lado da igreja", "6985-300", "Salvador", UnidadeFederativa.RIO_DE_JANEIRO));
    Medico medico = new Medico("6446", "695.4587", "695.584-98", "9874", Setor.SAUDE, 20000, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(2000, Month.MARCH, 25), "Vanessa", "9568-9875", "vanessa@gmail.com", new Endereco("Rua", "56", "Ao lado da escola", "9854-000", "São Paulo", UnidadeFederativa.RIO_DE_JANEIRO));
    Cliente cliente = new Cliente(2500, Genero.MASCULINO, EstadoCivil.SOLTEIRO, LocalDate.of(2002, Month.MARCH, 10), "Daniel", "6958-2358", "Daniel@gmail.com", new Endereco("Rua","98", "Ao lado de uma barraca metálica", "9857-000", "Santo André", UnidadeFederativa.SAO_PAULO));
    Fornecedor fornecedor = new Fornecedor(Setor.SAUDE, new Produto("Luzes", "Decoração", 1000), "695.3659.689", "9856");
    PrestacaoServico prestacaoServico = new PrestacaoServico(LocalDate.of(2003, Month.MARCH, 05), LocalDate.of(2020, Month.MARCH, 20), "695.6597.000", "6594");
    Diretor diretor = new Diretor("659.485.98", "985.758-000", "98574", Setor.JURIDICO, 10000, Genero.FEMININO, EstadoCivil.DIVORCIADO, LocalDate.of(1998, Month.MARCH, 27), "  Jéssica", "9854-7534", "jessica@gmail.com", new Endereco("Ao lado do apartamento","98", "casa", "98574-000", "Salvador", UnidadeFederativa.BAHIA));
    
    
    diretor.admitir(motoboy);
            
    }         


}

