package MisProgramas;

public class CilindroConColor extends Cilindro {
   private String Color;
   public CilindroConColor(double radio, double altura, Coordenadas3D coordenadasCentroBase) {
       super(radio, altura, coordenadasCentroBase);
       // TODO Auto-generated constructor stub
   }
   /**
    * @return the color
    */
   public String getColor() {
       return Color;
   }
   /**
    * @param color the color to set
    */
   public void setColor(String color) {
       Color = color;
   }

}