import static java.lang.StringTemplate.STR;

public class productosInformaticos {

    String nombreProducto;
    double costeProducto;
    int unidadesVendidas;

    public productosInformaticos (String nombreProducto,double costeProducto, int unidadesVendidas ) {
        this.nombreProducto = nombreProducto;
        this.costeProducto = costeProducto;
        this.unidadesVendidas = unidadesVendidas;
    }

    public void venderUnidades(int cantidad){
        unidadesVendidas = unidadesVendidas + cantidad;
    }


    @Override
    public String toString(){
        return STR."\{this.nombreProducto} | \{this.costeProducto} | \{this.unidadesVendidas}";
    }





}
