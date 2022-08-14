package Ejercicios_tema_9;

/* Crea una clase Persona con las siguientes variables:

La edad

El nombre

El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador. */

public class main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 14;
        cliente.nombre = "jorge";
        cliente.telefono = 1122334455;
        cliente.credito =100000;
        System.out.println("El cliente: "+cliente.nombre+" de edad: "+cliente.edad+" y numero: "+cliente.telefono+" tiene un credito de: "+cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 20;
        trabajador.nombre = "martin";
        trabajador.telefono = 1222334455;
        trabajador.salario=50000;
        System.out.println("El trabajador: "+trabajador.nombre+" de edad: "+trabajador.edad+" y numero: "+trabajador.telefono+" tiene un salario de: "+trabajador.salario);
    }

}


class Persona  {
    String nombre;
    int edad;
    int telefono;

}

class Cliente extends Persona {
    int credito;
}
class Trabajador extends Persona {
    int salario;
}