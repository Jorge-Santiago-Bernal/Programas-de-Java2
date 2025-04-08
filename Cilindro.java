package MisProgramas;

public class Cilindro {
   private double radio;
   private double altura;
   private Coordenadas3D coordenadasCentroBase;
   /**
    * @param radio
    * @param altura
    * @param coordenadasCentroBase
    */
   public Cilindro(double radio, double altura, Coordenadas3D coordenadasCentroBase) {
       this.radio = radio;
       this.altura = altura;
       this.coordenadasCentroBase = coordenadasCentroBase;
   }
   
   /**
    * @param radio
    * @param altura
    */
   public Cilindro(double radio, double altura) {
       this.radio = radio;
       this.altura = altura;
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
    * @return the altura
    */
   public double getAltura() {
       return altura;
   }
   /**
    * @param altura the altura to set
    */
   public void setAltura(double altura) {
       this.altura = altura;
   }
   /**
    * @return the coordenadasCentroBase
    */
   public Coordenadas3D getCoordenadasCentroBase() {
       return coordenadasCentroBase;
   }
   /**
    * @param coordenadasCentroBase the coordenadasCentroBase to set
    */
   public void setCoordenadasCentroBase(Coordenadas3D coordenadasCentroBase) {
       this.coordenadasCentroBase = coordenadasCentroBase;
   }
   public double devuelveVolumen() {
       double areaBase=Math.PI*radio*radio;
       double volumen=areaBase*altura;
       return(volumen);
       
   }
   public double devuelveSuperficie() {
       double areaLateral=2*Math.PI*radio*altura;
       double areaBase=Math.PI*radio*radio;
       double superficie=areaLateral+areaBase*2;
       return(superficie);
       
   }
   public double devuelveSuperficie(boolean tipo) {
       double areaLateral=2*Math.PI*radio*altura;
       return(areaLateral);
       
   }
   

}