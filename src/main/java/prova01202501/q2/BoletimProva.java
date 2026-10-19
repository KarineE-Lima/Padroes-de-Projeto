package prova01202501.q2;


public class BoletimProva{
    private String  cboNumero;
    private ListaPassagens passagens;

    public BoletimProva(String cboNumero, ListaPassagens passagens){
        this.cboNumero = cboNumero;
        this.passagens = passagens;
    }


    public String getCboNumero() {
        return cboNumero;
    }

    public ListaPassagens getPassagens() {
        return passagens;
    }
}
