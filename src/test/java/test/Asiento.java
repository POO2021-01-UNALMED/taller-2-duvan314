package test;

public class Asiento {
    String color;
    int precio;
    int registro;

    void cambiarColor(String color) {
        switch (color) {   // un if interesante
            case "verde", "amarillo", "negro", "blanco" -> this.color = color;
            default -> System.out.println("Color no Valido");
        }

    }


}
