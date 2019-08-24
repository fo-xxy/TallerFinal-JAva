package clases.operaciones;

public class MatematicasDao extends MatematicasDto {
    /*16: se hereda la clase dto*/
    /*17: se crea un metodo en este caso suma*/
    public double calcularSuma(){
        return (this.getNumero1() + this.getNumero2());
    }

    /*18: se crea otro metodo en este caso la resta*/
    public double calcularResta(){
        return (this.getNumero1() - this.getNumero2());
    }

    /*19: se crea otro metodo, en este caso la multiplicacion*/
    public double calcularMultiplicacion(){
        return (this.getNumero1() * this.getNumero2());
    }

    /*20: Se crea otro metodo, en este caso la division*/
    public double calcularDivision(){
        return (this.getNumero1() / this.getNumero2());
    }

    /*21: nos vamos a la clase operacionesMatematicas e instanciamos esta clase en esa clase */

}
