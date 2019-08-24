package clases.constantes.salario;

public enum SalarioDouble {
    TREINTA_Y_CINCOMIL(35000),
    CINCUENTAMIL(50000),
    DIEZ_PORCIENTO(0.10),
    QUINCE_PORCIENTO(0.15),
    MIL_QUINIENTOS(1500),
    TRESMIL(3000),
    TRESMIL_QUINIENTOS(3500);

    double valor;

    SalarioDouble(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
