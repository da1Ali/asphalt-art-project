import org.code.neighborhood.*;

public class CreeperPainter extends MuralPainter {

// the method to paint the creeper
// combines the paintTop and paintBottom method into one
public void paintCreeper (String aColor, String bColor, String cColor, String dColor, String eColor, String fColor) {
    paintTop(aColor, bColor, cColor, dColor, eColor, fColor);
    paintBottom(aColor, bColor, cColor, dColor, eColor, fColor);
    resetPosition();
}

  // the method that paints the top half of the creeper with six different colors
public void paintTop(String aColor, String bColor, String cColor, String dColor, String eColor, String fColor) {
  paintLine(dColor, 1);
  paintLine(eColor, 1);
  paintLine(eColor, 1);
  paintLine(fColor, 1);
  paintLine(fColor, 1);
  paintLine(dColor, 1);
  paintLine(eColor, 1);
  paintLine(fColor, 1);
  turnRight();
  move();
  turnRight();
  paintLine(bColor, 1);
  paintLine(aColor, 1);
  paintLine(aColor, 1);
  paintLine(bColor, 1);
  paintLine(cColor, 1);
  paintLine(aColor, 1);
  paintLine(aColor, 1);
  paintLine(eColor, 1);
  turnLeft();
  move();
  turnLeft();
  paintLine(fColor, 1);
  paintLine(aColor, 1);
  paintLine(aColor, 1);
  paintLine(eColor, 1);
  paintLine(fColor, 1);
  paintLine(aColor, 1);
  paintLine(aColor, 1);
  paintLine(eColor, 1);
  turnRight();
  move();
  turnRight();
  paintLine(cColor, 1);
  paintLine(eColor, 1);
  paintLine(bColor, 1);
  paintLine(aColor, 1);
  paintLine(aColor, 1);
  paintLine(fColor, 1);
  paintLine(bColor, 1);
  paintLine(dColor, 1);
  turnLeft();
  move();
  turnLeft();
    }

  // the method that paints the bottom half of the creeper with six different colors
public void paintBottom(String aColor, String bColor, String cColor, String dColor, String eColor, String fColor) {
  paintLine(fColor, 1);
  paintLine(fColor, 1);
  paintLine(aColor, 1);
  paintLine(aColor, 1);
  paintLine(aColor, 1);
  paintLine(aColor, 1);
  paintLine(dColor, 1);
  paintLine(dColor, 1);
  turnRight();
  move();
  turnRight();
  paintLine(bColor, 1);
  paintLine(cColor, 1);
  paintLine(aColor, 1);
  paintLine(aColor, 1);
  paintLine(aColor, 1);
  paintLine(aColor, 1);
  paintLine(bColor, 1);
  paintLine(eColor, 1);
  turnLeft();
  move();
  turnLeft();
  paintLine(cColor, 1);
  paintLine(eColor, 1);
  paintLine(aColor, 1);
  paintLine(eColor, 1);
  paintLine(fColor, 1);
  paintLine(aColor, 1);
  paintLine(bColor, 1);
  paintLine(fColor, 1);
  turnRight();
  move();
  turnRight();
  paintLine(cColor, 1);
  paintLine(dColor, 1);
  paintLine(fColor, 1);
  paintLine(bColor, 1);
  paintLine(dColor, 1);
  paintLine(cColor, 1);
  paintLine(bColor, 1);
  paintLine(dColor, 1);
  }

}