	
package MisProgramas;

public class Coordenadas3D {
   private double coordX;
   private double coordY;
   private double coordZ;
   /**
    * @param coordX
    * @param coordY
    * @param coordZ
    */
   public Coordenadas3D(double coordX, double coordY, double coordZ) {
       this.coordX = coordX;
       this.coordY = coordY;
       this.coordZ = coordZ;
   }
   /**
    * @return the coordX
    */
   public double getCoordX() {
       return coordX;
   }
   /**
    * @param coordX the coordX to set
    */
   public void setCoordX(double coordX) {
       this.coordX = coordX;
   }
   /**
    * @return the coordY
    */
   public double getCoordY() {
       return coordY;
   }
   /**
    * @param coordY the coordY to set
    */
   public void setCoordY(double coordY) {
       this.coordY = coordY;
   }
   /**
    * @return the coordZ
    */
   public double getCoordZ() {
       return coordZ;
   }
   /**
    * @param coordZ the coordZ to set
    */
   public void setCoordZ(double coordZ) {
       this.coordZ = coordZ;
   }
   
}