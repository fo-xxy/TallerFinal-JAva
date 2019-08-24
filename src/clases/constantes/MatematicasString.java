package clases.constantes;

public enum MatematicasString {

    TITULO_OPCION_MATEMATICA("Opcion de Operaciones Matematicas");

    private String texto;

    MatematicasString(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
