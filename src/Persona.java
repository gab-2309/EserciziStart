public class Persona {

    public String nome;
    public String cognome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String presentati(){
        return "Nome: " + this.nome + "\n Cognome: " + this.cognome;
    }
}
