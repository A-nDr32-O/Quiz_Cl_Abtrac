import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        carro car1 = new carro();

        car1.setMarca("Ford");
        car1.setModelo("Ford");
        car1.setCombustible("Gasolina");

        camion cam1 = new camion();

        cam1.setMarca("Foton");
        cam1.setModelo("Foton");
        cam1.setCombustible("Diesel");

        moto mot1 = new moto();

        mot1.setMarca("Yamaha");
        mot1.setModelo("XTZ 150");
        mot1.setCombustible("Etanol");

        carroElectrico carrel1 = new carroElectrico();


        Scanner teclado = new Scanner(System.in);

        int op;


        do {


            System.out.println("=========================");
            System.out.println("1. Carro");
            System.out.println("2. Moto");
            System.out.println("3. Camion");
            System.out.print("Elige un vehiculo: ");
            op = teclado.nextInt();

            switch (op) {
                case 1:
                    System.out.println("=========================");
                    System.out.println("1. Encender");
                    System.out.println("2. Apagar");
                    System.out.println("3. mostar informacion");
                    System.out.print("Elige una opcion: ");
                    op = teclado.nextInt();

                    switch (op) {
                        case 1:
                            car1.encender();
                            break;
                        case 2:
                            car1.apagar();
                            break;
                        case 3:
                            car1.mostrarInfo();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("=========================");
                    System.out.println("1. Encender");
                    System.out.println("2. Apagar");
                    System.out.println("3. mostar informacion");
                    System.out.print("Elige una opcion: ");
                    op = teclado.nextInt();

                    switch (op) {
                        case 1:
                            cam1.encender();
                            break;
                        case 2:
                            cam1.apagar();
                            break;
                        case 3:
                            cam1.mostrarInfo();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("=========================");
                    System.out.println("1. Encender");
                    System.out.println("2. Apagar");
                    System.out.println("3. mostar informacion");
                    System.out.print("Elige una opcion: ");
                    op = teclado.nextInt();

                    switch (op) {
                        case 1:
                            mot1.encender();
                            break;
                        case 2:
                            mot1.apagar();
                            break;
                        case 3:
                            mot1.mostrarInfo();
                            break;
                    }
                    break;
            }

        }while (op!=4);
    }
}