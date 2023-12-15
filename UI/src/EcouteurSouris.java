import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class EcouteurSouris implements MouseListener {
    public void mouseClicked(MouseEvent ev) {
        int x = ev.getX();
        int y = ev.getY();
        System.out.println("clic au point de coordonnees " + x + ", " + y);
    }

    public void mousePressed(MouseEvent ev) {
    }

    public void mouseReleased(MouseEvent ev) {
    }

    public void mouseEntered(MouseEvent ev) {
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}