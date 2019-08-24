package menu;

import opciones.calcular_salario.Salarios;
import opciones.convertidor.Conversor;
import opciones.operaciones_matematicas.OperacionesMatematicas;

import javax.swing.*;
import java.awt.*;

/*3: se hera las cosas del jframe y nos vamos para el main*/
public class Menu extends Frame {
    private JPanel menuPrincipal;
    private JButton operacionesMatematicasButton;
    private JButton calcularSalarioButton;
    private JButton btnconversor;

    /*6: se crea un constructor */
    public Menu(){
        /*8: se agregan las propiedades, que lo agregue en la ejecucion*/
        add(menuPrincipal);
        /*9: titulo a la ventana*/
        setTitle("Menú Principal");
        /*10: El tamaño ancho y alto*/
        setSize(500,600);
        /*11: sigue el diseño, la parte grafica se crea un listener del boton*/

        operacionesMatematicasButton.addActionListener(e -> {
                /*12: Se instancia la clase de las operaciones*/
                OperacionesMatematicas operacionesMatematicas = new OperacionesMatematicas();
                /*13: para que se vea el munu*/
                operacionesMatematicas.setVisible(true);
                esconderVentana();
        });

        /*2.0: Primero cree un boton, y le cree el listener, despues nos vamos al package clases y creamos la clase de salariodto*/
        calcularSalarioButton.addActionListener(e -> {
            /*2.6: Se hace la instancia de la nueva clase de la ventana, no hay que olvidar que hay que heredar lo de Jframe*/
            Salarios salarios = new Salarios();
            /*2.7: Para que se vea la nueva ventana*/
            salarios.setVisible(true);
            /*2.8: Para que se esconda la otra ventana, nos vamos a la clase de salarios de la ventana*/
            esconderVentana();
        });
        /*3.6: al crea el listener vamos a instanciar la clase*/
        btnconversor.addActionListener(e -> {
            Conversor conversor = new Conversor();
            /*3.7: para que se vea la nueva vetana*/
            conversor.setVisible(true);
            /*3.8: para que esconda la otra ventana*/
            esconderVentana();

            /*3.9: En clases crearemos un package y dos clases una padre y una hija con los atributos*/

        });


    }
    /*14: se crea un metodo que se encargue se cerrar la ventana despues se crea la clase matematicas y hereda*/
    private void esconderVentana(){
        this.dispose();
    }


}
