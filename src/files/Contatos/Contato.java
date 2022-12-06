package files.Contatos;

@SuppressWarnings("unused")
public record Contato(
        ContatosEnumeration tipoContato,
        String contato
) {
    @Override
    public String toString(){
        return String.format(this.tipoContato.title + " : " + this.contato);
    }
}
