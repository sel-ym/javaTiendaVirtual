import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tienda virtual");

        Scanner imput = new Scanner(System.in);

        String Producto1 = "Ordenador";
        String Producto2 = "Pantalla";
        String Producto3 = "Raton";

        productosInformaticos productoOrdenadores = new productosInformaticos(
               "Ordenador",
               500,
               0
                );

        productosInformaticos productoPantallas = new productosInformaticos(
                "Pantalla",
                100,
                0
        );

        productosInformaticos productoRatones = new productosInformaticos(
                "Raton",
                10,
                0
        );

        System.out.println("Qué producto quieres comprar: "
                               "Ordenador, Pantalla, Raton");
        String nombreProducto = input.next();

        switch (nombreProducto){
            case "Ordenador":
                actuarConProductosInformaticos(productoOrdenadores, input);
                break;
            case "Pantalla":
                actuarConProductosInformaticos(productoPantallas, input);
                break;
            case "Raton":
                actuarConProductosInformaticos(productoRatones, input);
                break;
            default:
                System.out.println("Error. Producto inexistente");
        }

    }





}

