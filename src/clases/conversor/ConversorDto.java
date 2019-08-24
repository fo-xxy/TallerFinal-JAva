package clases.conversor;

import static clases.constantes.MatematicasInt.CERO;
public class ConversorDto {
    /*3.10: Creamos los atributos*/
    double valor;
    String moneda;

    /*3.11: Craamos un cosntructor sin parametros y otro con parametros*/
    public ConversorDto() {
        this.valor = CERO.getValor();
        this.moneda = null;
    }

    public ConversorDto(double valor, String moneda) {
        this.valor = valor;
        this.moneda = moneda;
    }

    /*3.12: Se crean los metodos get y set*/
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    /*3.13: Creamos la clase hija para hacer la logica*/
}
