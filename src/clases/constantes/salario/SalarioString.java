package clases.constantes.salario;

public enum SalarioString {
    MENSAJE_PETICION1("Ingresa tú Nombre."),
    MENSAJE_PETICION2("Selecciona tipo de día."),
    MENSAJE_PETICION3("Selecciona el turno en el que laboraste."),
    MENSAJE_PETICION4("Ingresa las horas laboradas."),
    MENSAJE_RESULTADO1("Señor/a "),
    MENSAJE_RESULTADO2("Su total a cobrar por el día laborado es: $"),
    NOMBRE_VENTANA("Calcular Saalrio"),
    TIPO_DIA1("Día habil"),
    TIPO_DIA2("Día festivo"),
    TURNO1("Diurno"),
    TURNO2("Nocturno"),
    DOLAR("Dolar"),
    EURO("Euros"),
    YENES("Yenes"),
    MENSAJE_CONVERSOR("Conversor"),
    MENSAJE_PETICION1_CONVERSOR("Debes ingresar un valor a convertir."),
    MENSAJE_PETICION2_CONVERSOR("Debes ingresar la moneda de la que quieres convertir a pesos colombianos."),
    MENSAJE_RESULTADO_CONVERSOR("La conversión es: ");

    String mensaje;

    SalarioString(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
