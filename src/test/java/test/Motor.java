package test;

public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;

    void cambiarRegistro(int registro) {
        this.registro = registro;
    }

    void asignarTipo(String tipomotor) {
        switch (tipomotor) {   // un if interesante
            case "electrico", "gasolina" -> this.tipo = tipomotor;
            default -> System.out.println("Tipo de motor no valido");

        }
    }
}

