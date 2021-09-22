package exercicios.diversos.oop;

public class ContatoAgendaCelular {

    private String nomeContato;
    private String telFixo;
    private String telCelular;
    private char temWhatsApp;

    public ContatoAgendaCelular() {
    }

    public ContatoAgendaCelular(String nomeContato, String telFixo, String telCelular, char temWhatsApp) {
        this.nomeContato = nomeContato;
        this.telFixo = telFixo;
        this.telCelular = telCelular;
        this.temWhatsApp = temWhatsApp;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getTelFixo() {
        return telFixo;
    }

    public void setTelFixo(String telFixo) {
        this.telFixo = telFixo;
    }

    public String getTelCelular() {
        return telCelular;
    }

    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }

    public char getTemWhatsApp() {
        return temWhatsApp;
    }

    public void setTemWhatsApp(char temWhatsApp) {
        this.temWhatsApp = temWhatsApp;
    }

    @Override
    public String toString() {
        return "ContatoAgendaCelular{" +
                "nomeContato='" + nomeContato + '\'' +
                ", telFixo='" + telFixo + '\'' +
                ", telCelular='" + telCelular + '\'' +
                ", temWhatsApp=" + temWhatsApp +
                '}';
    }
}
