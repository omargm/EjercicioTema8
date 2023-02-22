public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.setEdad(29);
        persona1.setNombre("Azucena Moreno");
        persona1.setTelefono("662 115 39 64");

        System.out.println(persona1.getNombre() + " " + persona1.getEdad() + " años, tel: " + persona1.getTelefono());

    }
}

class Persona {
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String telefono;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}