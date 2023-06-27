
package Funcionario;

import java.time.LocalDate;
import java.time.Month;


public class Main {
    public static void main(String[] args) {
        
        Motoboy motoboy = new Motoboy("65978", "Silvonei", LocalDate.of(2003, Month.MARCH, 15), Genero.MASCULINO, Setor.OPERACOES, 1500);
        
        Diretor diretor = new Diretor("Gabriel", LocalDate.of(2000, Month.MARCH, 6), Genero.MASCULINO, Setor.FINANCEIRO, 20000);
        
        
        diretor.admitir(motoboy);
        
        
        
        
    }
}
