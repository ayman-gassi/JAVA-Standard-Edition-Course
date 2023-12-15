import javax.swing.* ;import java.awt.* ;import java.awt.event.* ;
class Fen2Boutons extends JFrame implements ActionListener {
    private JButton monBouton1, monBouton2;
    public Fen2Boutons() {
        setTitle("Avec deux boutons");
        setSize(300, 200);
        monBouton1 = new JButton("Bouton A");
        monBouton2 = new JButton("Bouton B");
        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout());
        contenu.add(monBouton1);
        contenu.add(monBouton2);
        //methode 1
        monBouton1.addActionListener(this);
        //methode 2
        monBouton1.addActionListener((e) -> System.out.println("Methode 2"));
        // methode 3
        monBouton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Methode 3");
            }
        });
        monBouton2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == monBouton1) System.out.println ("methode 1") ;
        if (ev.getSource() == monBouton2) System.out.println ("action sur bouton numero 2") ;
    }
}
