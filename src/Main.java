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

private static void actuarConProductosInformaticos(ProductosInformaticos algunProducto, Scanner input) {

            String menu = STR."""
        Producto \{algunProducto.nombreProducto}
               Información:
                1 Precio unitario de coste
                2 Precio unitario de venta
                3 Unidades vendidas
                4 Vendedor que ha hecho la venta
                Cualquier otra tecla para finalizar
                """;


/*
            short eleccion;

            do {
                System.out.println(menu);
                eleccion = input.nextShort();

                switch (eleccion) {
                    case 1:
                        System.out.println(cuentaDeAlguien);
                        break;
                    case 2:
                        // retirada de dinero
                        System.out.println("\n¿Qué cantidad desea retirar?");
                        double fondosRetirada = input.nextDouble();
                        cuentaDeAlguien.retirarFondos(fondosRetirada);
                        break;
                    case 3:
                        // ingresar de dinero
                        System.out.println("\n¿Qué cantidad desea ingresar?");
                        double fondosIngreso = input.nextDouble();
                        cuentaDeAlguien.ingresarFondos(fondosIngreso);
                        break;
                    case 4:
                        System.out.println("indique el nombre del nuevo titular de la cuenta.");
                        String nuevoTitular = input.next();
                        cuentaDeAlguien.nombreTitular = nuevoTitular;
                        break;
                    default:
                        System.out.println("Muchas gracias y hasta pronto");

                }

            } while (eleccion == 1 || eleccion == 2 || eleccion ==3 || eleccion ==4);


____
Vamos a crear una aplicación para gestionar
una tienda de productos informáticos, como
por ejemplo:
    * Ordenadores
    * Pantallas*
    * Ratones
    * etc.

Esos son los tipos de producto. Y además nos
interesan otras características:
    * Precio unitario de coste
    * Precio unitario de venta
    * Unidades vendidas
    * Vendedor que ha hecho la venta

Con todo eso necesitamos:
    * Crear ventas de productos
    * Crear compras de productos
    * Obtener los beneficios o pérdidas actuales
    * Saber qué vendedor ha vendido más
    * Saber con qué producto ganamos más dinero
*/

    }





}

