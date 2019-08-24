package clases.constantes;

public enum MatematicasInt {
    /*Se hace todoo esto y se cambian los mensajes por estas constantes*/
    CERO(0),
    QUINIENTOS(500),
    SEISIENTOS(600);

    private int valor;

    MatematicasInt(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }


}
