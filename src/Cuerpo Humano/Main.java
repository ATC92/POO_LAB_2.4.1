// Clase Corazon
class Corazon {
    private String tipo;
    private int frecuencia;
    private String estado;

    public Corazon(String tipo, int frecuencia, String estado) {
        this.tipo = tipo;
        this.frecuencia = frecuencia;
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

// Clase Pulmon
class Pulmon {
    private int capacidad;
    private String lado; // Derecho o Izquierdo
    private String estado;

    public Pulmon(int capacidad, String lado, String estado) {
        this.capacidad = capacidad;
        this.lado = lado;
        this.estado = estado;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getLado() {
        return lado;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

// Clase CuerpoHumano
class CuerpoHumano {
    private Corazon corazon;
    private Pulmon pulmonDerecho;
    private Pulmon pulmonIzquierdo;

    public CuerpoHumano(Corazon corazon, Pulmon pulmonDerecho, Pulmon pulmonIzquierdo) {
        this.corazon = corazon;
        this.pulmonDerecho = pulmonDerecho;
        this.pulmonIzquierdo = pulmonIzquierdo;
    }

    public Corazon getCorazon() {
        return corazon;
    }

    public void setCorazon(Corazon corazon) {
        this.corazon = corazon;
    }

    public Pulmon getPulmonDerecho() {
        return pulmonDerecho;
    }

    public void setPulmonDerecho(Pulmon pulmonDerecho) {
        this.pulmonDerecho = pulmonDerecho;
    }

    public Pulmon getPulmonIzquierdo() {
        return pulmonIzquierdo;
    }

    public void setPulmonIzquierdo(Pulmon pulmonIzquierdo) {
        this.pulmonIzquierdo = pulmonIzquierdo;
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        // Creando componentes del cuerpo humano
        Corazon corazon = new Corazon("Izquierdo", 70, "Saludable");
        Pulmon pulmonDerecho = new Pulmon(5000, "Derecho", "Saludable");
        Pulmon pulmonIzquierdo = new Pulmon(5000, "Izquierdo", "Saludable");

        // Creando el cuerpo humano
        CuerpoHumano cuerpoHumano = new CuerpoHumano(corazon, pulmonDerecho, pulmonIzquierdo);

        // Accediendo a atributos de las partes
        System.out.println("Cuerpo Humano:");
        System.out.println("Corazón: Tipo: " + cuerpoHumano.getCorazon().getTipo() + 
                           ", Frecuencia: " + cuerpoHumano.getCorazon().getFrecuencia() + 
                           ", Estado: " + cuerpoHumano.getCorazon().getEstado());
        System.out.println("Pulmón Derecho: Capacidad: " + cuerpoHumano.getPulmonDerecho().getCapacidad() + 
                           ", Lado: " + cuerpoHumano.getPulmonDerecho().getLado() + 
                           ", Estado: " + cuerpoHumano.getPulmonDerecho().getEstado());
        System.out.println("Pulmón Izquierdo: Capacidad: " + cuerpoHumano.getPulmonIzquierdo().getCapacidad() + 
                           ", Lado: " + cuerpoHumano.getPulmonIzquierdo().getLado() + 
                           ", Estado: " + cuerpoHumano.getPulmonIzquierdo().getEstado());
    }
}
