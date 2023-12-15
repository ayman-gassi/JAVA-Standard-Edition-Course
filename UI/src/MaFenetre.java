import javax.swing.* ;
import java.awt.event.* ;
class MaFenetre extends JFrame {
    public MaFenetre () {
        setTitle ("Gestion de clics") ; setBounds (10, 20, 300, 200) ;
        this.addMouseListener (new  EcouteurSouris() ) ;
    } }


