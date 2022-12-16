package models.Registros;

public enum RegistroEnumeration {
    ROOT("data/"),
    ALUNOS("data/alunos/"),
    PROFESSORES("data/professores/"),
    TURMAS("data/turmas/");
    
    public String directoryPath;
    RegistroEnumeration(String directoryPath){
        this.directoryPath = directoryPath;
    }
    
}
