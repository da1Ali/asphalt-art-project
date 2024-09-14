import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

  // creates the mural painter and paints the background white  
  MuralPainter muralPainter = new MuralPainter();
  muralPainter.paintBackground("white", 8);

  // creates the creeper painter and calls on the method to paint the creeper
  CreeperPainter creeperPainter = new CreeperPainter();
  creeperPainter.paintCreeper("black", "green", "darkgreen", "limegreen", "lightgreen", "lawngreen");
  // gives each argument their own color
  }
}