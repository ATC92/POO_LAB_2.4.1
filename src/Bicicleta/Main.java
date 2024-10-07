// Clase Rueda
class Rueda {
    private String tipo;
    private int tamano;
    private String material;

    public Rueda(String tipo, int tamano, String material) {
        this.tipo = tipo;
        this.tamano = tamano;
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}

// Clase Cuadro
class Cuadro {
    private String material;
    private String color;
    private String tamanio;

    public Cuadro(String material, String color, String tamanio) {
        this.material = material;
        this.color = color;
        this.tamanio = tamanio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
}

// Clase Bicicleta
class Bicicleta {
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;
    private Cuadro cuadro;

    public Bicicleta(Rueda ruedaDelantera, Rueda ruedaTrasera, Cuadro cuadro) {
        this.ruedaDelantera = ruedaDelantera;
        this.ruedaTrasera = ruedaTrasera;
        this.cuadro = cuadro;
    }

    public Rueda getRuedaDelantera() {
        return ruedaDelantera;
    }

    public void setRuedaDelantera(Rueda ruedaDelantera) {
        this.ruedaDelantera = ruedaDelantera;
    }

    public Rueda getRuedaTrasera() {
        return ruedaTrasera;
    }

    public void setRuedaTrasera(Rueda ruedaTrasera) {
        this.ruedaTrasera = ruedaTrasera;
    }

    public Cuadro getCuadro() {
        return cuadro;
    }

    public void setCuadro(Cuadro cuadro) {
        this.cuadro = cuadro;
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        // Creando componentes de la bicicleta
        Rueda ruedaDelantera = new Rueda("Montaña", 26, "Goma");
        Rueda ruedaTrasera = new Rueda("Montaña", 26, "Goma");
        Cuadro cuadro = new Cuadro("Aluminio", "Rojo", "Mediano");

        // Creando la bicicleta
        Bicicleta bicicleta = new Bicicleta(ruedaDelantera, ruedaTrasera, cuadro);

        // Accediendo a atributos de las partes
        System.out.println("Bicicleta:");
        System.out.println("Rueda delantera: " + bicicleta.getRuedaDelantera().getTipo() + ", Tamaño: " + bicicleta.getRuedaDelantera().getTamano() + ", Material: " + bicicleta.getRuedaDelantera().getMaterial());
        System.out.println("Rueda trasera: " + bicicleta.getRuedaTrasera().getTipo() + ", Tamaño: " + bicicleta.getRuedaTrasera().getTamano() + ", Material: " + bicicleta.getRuedaTrasera().getMaterial());
        System.out.println("Cuadro: Material: " + bicicleta.getCuadro().getMaterial() + ", Color: " + bicicleta.getCuadro().getColor() + ", Tamaño: " + bicicleta.getCuadro().getTamanio());
    }
}
