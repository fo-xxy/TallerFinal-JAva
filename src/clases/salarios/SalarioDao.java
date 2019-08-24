package clases.salarios;
import static clases.constantes.MatematicasInt.CERO;
import static clases.constantes.salario.SalarioDouble.*;
import static clases.constantes.salario.SalarioString.*;

public class SalarioDao extends SalarioDto {
    double jornal = CERO.getValor();
    double incDiaDiurno = CERO.getValor();
    /*2.14: Se crea un metodo que llevara las acciones*/
    public double calcularSalario(){
        if(this.getDia() == TIPO_DIA1.getMensaje() && this.getTurno() == TURNO1.getMensaje()){
            jornal = this.getHoras() * TREINTA_Y_CINCOMIL.getValor();
            return jornal;
        }
        else if(this.getDia() == TIPO_DIA1.getMensaje() && this.getTurno() == TURNO2.getMensaje()){
            jornal = this.getHoras() * CINCUENTAMIL.getValor();
            return  jornal;
        }
        else if(this.getDia() == TIPO_DIA2.getMensaje() && this.getTurno() == TURNO1.getMensaje()){
            incDiaDiurno = (TREINTA_Y_CINCOMIL.getValor() * DIEZ_PORCIENTO.getValor());
            jornal = this.getHoras() * TREINTA_Y_CINCOMIL.getValor() + incDiaDiurno;
            return jornal;
        }
        else if(this.getDia() == TIPO_DIA2.getMensaje() && this.getTurno() == TURNO2.getMensaje()){
            incDiaDiurno = (CINCUENTAMIL.getValor() * QUINCE_PORCIENTO.getValor());
            jornal = this.getHoras() * CINCUENTAMIL.getValor() + incDiaDiurno;
            return jornal;
        }

        return calcularSalario();
    }
    /*2.15: nos vamos a la clase Salarios, la de la ventana para hacer la asignacion*/
}
