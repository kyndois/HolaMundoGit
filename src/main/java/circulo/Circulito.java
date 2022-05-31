package circulo;

/**
 * Pruebas de refactorización en NetBeans con la clase Circulito
 * @author profesor
 */
public class Circulito {
    private int coordenadaX;
    private int coordenadaY;
    private double radio;
    private final double limiteRadio = 0.0;
    
    /**
     * @return the coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX the coordenadaX to set
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY the coordenadaY to set
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     *
     */
    public Circulito() {
    }

    /**
     *
     * @param valorX
     * @param valorY
     * @param valorRadio
     */
    public Circulito(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        radio = valorRadio;
    }

    /**
     *
     * @return
     */
    public double obtenerDiametro() {
        return getRadio() * 2;
    }

    /**
     *
     * @return
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    /**
     *
     * @return
     */
    public double obtenerAreaCirculo() {
        return Math.PI * getRadio() * getRadio();
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     *
     * @param transladarX
     * @param transladarY
     */
    public void trasladarCentro(int transladarX, int transladarY){
        setCoordenadaX(getCoordenadaX() + 5 + transladarX);
        setCoordenadaY(getCoordenadaY() + 5 + transladarY);
    }
}
