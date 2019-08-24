package clases.salarios;

import static clases.constantes.MatematicasInt.CERO;
public class SalarioDto {
    /*2.1: Creamos los atributos que son necesarios para el programa*/
    private String nombre;
    private String dia;
    private String turno;
    private int horas;


    /*2.3: Creamos un constructor sin parametros y otro con parametros */
    public SalarioDto() {
        this.nombre = null;
        this.dia = null;
        this.turno = null;
        this.horas = CERO.getValor();
    }

    public SalarioDto(String nombre, String dia, String turno, int horas) {
        this.nombre = nombre;
        this.dia = dia;
        this.turno = turno;
        this.horas = horas;
    }

    /*2.4: Creamos los metodos Getter y Setter de cada atributo*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String  dia) {
        this.dia = dia;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    /*2.5: Nos vamos y creamos otro formulario, en este caso salarios y hacemos el diseño*/
}
