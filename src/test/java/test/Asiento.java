package test;

public class Asiento {
    String color;
    int precio;
    int registro;

//    void cambiarColor(String color) {
//        switch (color) {   // un if interesante
//            case "verde", "amarillo", "negro", "blanco" -> this.color = color;
//            default -> System.out.println("Color no Valido");
//        }
//
//    }



    void cambiarColor(String color) {
        if (color.equals("rojo")) {
            this.color = color;
        } else if (color.equals("verde")) {
            this.color = color;
        }  else if (color.equals("amarillo")) {
            this.color = color;
        }  else if (color.equals("blanco")) {
            this.color = color;
        } else if (color.equals("negro")){
            this.color = color;
        }
    }


}
