package Ejercicios_tema_8;

public class main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.getEdad(25);
        persona.getNombre("George");
        persona.getTelefono(1166552244);

        System.out.println(persona.setEdad());
        System.out.println(persona.setNombre());
        System.out.println(persona.setTelefono());
    }

    static class Persona {
        private int edad;
        private String nombre;
        private int telefono;

        public void getEdad(int edad) {
            this.edad=edad;
        }
        public int setEdad() {
            return this.edad;
        }

        public void getNombre(String nombre) {
            this.nombre=nombre;
        }
        public  String setNombre() {
            return this.nombre;
        }

        public void getTelefono(int telefono) {
            this.telefono=telefono;
        }
        public int setTelefono() {
            return this.telefono;
        }
    }
}
