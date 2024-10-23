public abstract class vehiculo {
    String marca;
    String modelo;
    String combustible;

    public abstract void encender();
    public abstract void apagar();
    public abstract void mostrarInfo();

    public vehiculo() {
    }

    public vehiculo(String marca, String modelo, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return "vehiculo{" + "marca='" + marca + '\'' + ", modelo='" + modelo + '\'' + ", combustible='" + combustible + '\'' + '}';
    }

    /*public void abastecerCombustible;*/
}

class carro extends vehiculo{

    @Override
    public void encender() {
        System.out.println("El carro esta encendido. ");
    }

    @Override
    public void apagar() {
        System.out.println("El carro se apago.");
    }

    @Override
    public void mostrarInfo() {
        System.out.println(toString());
    }
}

class camion extends vehiculo{

    @Override
    public void encender() {
        System.out.println("El camion se encendio.");
    }

    @Override
    public void apagar() {
        System.out.println("El camion se apago.");
    }

    @Override
    public void mostrarInfo() {
        System.out.println(toString());
    }
}

class moto extends vehiculo {

    @Override
    public void encender() {
        System.out.println("La moto esta encendida");
    }

    @Override
    public void apagar() {
        System.out.println("La moto esta apagada. ");
    }

    @Override
    public void mostrarInfo() {
        System.out.println(toString());
    }
}

interface vehiculoElectrico  {

    String marca = "Tesla";
    String modelo = "Tesla";
    String combustible = "Electrico";

    public void cargarBateria();
    public void nivelBateria();


}

class carroElectrico implements vehiculoElectrico {

    String marca = "Tesla";
    String modelo = "Tesla";
    String combustible = "Electrico";

    @Override
    public void cargarBateria() {
        System.out.println("La bateria esta al 100.");
    }

    @Override
    public void nivelBateria() {
        System.out.println("Actualmente esta al 60.");
    }
}


