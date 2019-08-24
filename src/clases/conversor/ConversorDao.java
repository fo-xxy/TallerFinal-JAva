package clases.conversor;

import static clases.constantes.MatematicasInt.CERO;
import static  clases.constantes.salario.SalarioDouble.*;
import static  clases.constantes.salario.SalarioString.*;

/*3.14: Se hace la herencia de la clase padre a la hija*/
public class ConversorDao  extends ConversorDto{
    double aux = CERO.getValor();
        /*3.15: se crea un metodo*/
    public double conversionMoneda(){
        if(this.getMoneda() == DOLAR.getMensaje()){
            return dolarPeso();
        }
        else if(this.getMoneda() == EURO.getMensaje()){
            return  euroPeso();
        }
        else if(this.getMoneda() == YENES.getMensaje()){
            return yenesPeso();
        }
        return conversionMoneda();

        /*3.16: ahora nos vamos al diseño del conversor y despues no svamos a hacer la asignacion en la clase Conversor*/
    }

    public double dolarPeso(){
        aux = this.valor * TRESMIL.getValor();
        return aux;
    }

    public double euroPeso(){
        aux = this.valor * TRESMIL_QUINIENTOS.getValor();
        return aux;
    }

    public double yenesPeso(){
        aux = this.valor * MIL_QUINIENTOS.getValor();
        return aux;
    }
}
