
package Revisao;


public enum Setor {
    
    TECNOLOGIA ("Tecnologia"),
    MATERIAL_CONSTRUCAO ("Material de Construção"),
    MATERIA_PRIMA ("Matéria Prima"),
    ALIMENTICIO ("Alimentício"), 
    ENGENHARIA ("Engenharia"),
    SAUDE ("Saúde"),
    JURIDICO ("Jurídico"),
    RECURSOS_HUMANOS ("Recursos HUmanos"),
    MARKETING ("Marketing"),
    OPERACOES ("Operações");
    
    private final String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
    
}
