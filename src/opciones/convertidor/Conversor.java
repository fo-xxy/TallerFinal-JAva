package opciones.convertidor;

import clases.conversor.ConversorDao;
import menu.Menu;

import javax.swing.*;
import java.awt.*;

import java.text.DecimalFormat;

import static clases.constantes.MatematicasInt.CERO;
import static clases.constantes.MatematicasInt.QUINIENTOS;
import static clases.constantes.MatematicasInt.SEISIENTOS;
import static clases.constantes.salario.SalarioString.*;
/*3.0: Primero empece creando la ventana, y se hace la instancia del Jframe*/
public class Conversor extends Frame {

    transient ConversorDao conversorDao = new ConversorDao();

    DecimalFormat formato = new DecimalFormat("###,###.##");

    private JPanel conversorMoneda;
    private JButton btncalcular;
    private JTextField txtvalor;
    private JComboBox cbmonedas;
    private JLabel lblresultado;
    private JButton btnsalir;

    /*3.1: Se crea el constructor de la clase*/
    public Conversor(){

        /*3.2: Se agregan las propiedades, en este caso se agrega el nombre del Jpanel en este caso es calcular_saalrio */
        add(conversorMoneda);
        /*3.3: titulo a la ventana*/
        setTitle(MENSAJE_CONVERSOR.getMensaje());
        /*3.4: El tamaño ancho y alto*/
        setSize(SEISIENTOS.getValor(),QUINIENTOS.getValor());

        /*3.5: Nos vamos al menu, pero al diseño y creamos un listener para el boton conver*/

        /*3.17: Ahora se crea el listener del boton*/
        btncalcular.addActionListener(e -> {
            validar();

            /*4.23: Ahora mostramos el resultado*/
            lblresultado.setText(MENSAJE_RESULTADO_CONVERSOR.getMensaje() + formato.format(conversorDao.conversionMoneda()));
        });

        btnsalir.addActionListener(e -> {
            menu.Menu menu = new Menu();
            menu.setVisible(true);
            esconderVentana();
        });
    }

    /*3.18: Despues vamos a instanciar la clase en la parte de arriba */
    /*4.19:  Creamos un metodo para validar que los campos no esten vacios y asignamos los datos */
    public void validar(){
        /*4.20: Validamos si esta vacio que hará*/
        if(txtvalor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, MENSAJE_PETICION1_CONVERSOR.getMensaje() );
        }
        else if(cbmonedas.getSelectedIndex() == CERO.getValor()){
            JOptionPane.showMessageDialog(null, MENSAJE_PETICION2_CONVERSOR.getMensaje());
        }
        else{
            /*4.21: Si no esta vacio entonces asignamos los datos*/
            conversorDao.setValor(Double.parseDouble(txtvalor.getText()));
            conversorDao.setMoneda(cbmonedas.getSelectedItem().toString());
            lblresultado.setVisible(true);
            /*4.22: Ahora llamamos este metodo desde el boton*/
        }
    }
    private void esconderVentana(){
        this.dispose();
    }
}
