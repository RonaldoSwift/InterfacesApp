package entidades;

public class SmartTV 
        extends Dispositivo
        implements Navegador, Reproductor{

        private int tipoEntrada;
        
        private final int HDMI = 0;
        private final int VGA = 1;
        private final int DVI = 2; 
        private final int DisplayPort = 3;
        private final int RCA = 4;
        private final int Signal = 5;
        private final int SVideo = 6;
        private final int Coaxial = 7;
        
        @Override
     public String getNombre() {
         String nombreEntrada = "";
         switch(tipoEntrada){
             case HDMI: nombreEntrada = "HDMI";break;
             case VGA: nombreEntrada = "VGA";break;
             case DVI: nombreEntrada = "DVI";break;
             case DisplayPort: nombreEntrada = "DisplayPort";break;
             case RCA: nombreEntrada = "RCA";break;
             case Signal: nombreEntrada = "Signal";break;
             case SVideo: nombreEntrada = "SVideo";break;
             case Coaxial: nombreEntrada = "Coaxial";break;
                 
         }
         return "Modelo: " + nombreEntrada;
     }
        
        
    public int getTipoEntrada() {
        return tipoEntrada;
    }

    /**
     * @param tipoEntrada the tipoEntrada to set
     */
    public void setTipoEntrada(int tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
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
