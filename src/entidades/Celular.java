package entidades;


public class Celular 
        extends Dispositivo
        implements Camara, Navegador, Reproductor{

     private String marca;
     private String modelo;
     
     @Override
     public String getNombre() {
         return marca + " | "+ modelo;
     }
     
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   
    
    @Override
    public void tomarFoto() {
    }

    @Override
    public void grabarVideo() {
    }

    @Override
    public void getApertura() {
    }

    @Override
    public void navegar() {
    }

    @Override
    public void abrirLink() {
    }

    @Override
    public void reprodrucir() {
    }

    @Override
    public void adelantar() {
    }

    @Override
    public void retroceder() {
    }
}
