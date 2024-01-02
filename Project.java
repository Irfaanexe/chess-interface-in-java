import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
//import java.io.File;
class Box extends JLabel{
        public Box(String imagePath) {
        ImageIcon icon = new ImageIcon(imagePath);
        setIcon(icon);
        setHorizontalAlignment(SwingConstants.CENTER);
        //setLayout(null);
        //setBounds((getWidth() - icon.getIconWidth()) / 2, getHeight() - icon.getIconHeight(), icon.getIconWidth(), icon.getIconHeight());
    }

}
class Frame extends JFrame implements MouseListener{
    public Frame(){
        setVisible(true);
        setTitle("Random frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420,420);
        setResizable(true);

        //ImageIcon logo = new ImageIcon("logo.jpg");
        //setIconImage(logo.getImage());
        //JLabel label = new JLabel();
        //label.setText("Hello, How are you doing ");
        //add(label);
        setLayout(new GridLayout(8,8));
        for (int i = 1; i<= 8; i++){
            for(int j = 1; j <= 8; j++){
                JPanel p = new JPanel(new BorderLayout());
                Box piece = new Box("default.png");;
                if ((i+j) %2 == 0){
                    p.setBackground(new Color(169, 169, 169));
                    //p.add(new JLabel("dark"));
                }else{
                    p.setBackground(new Color(240, 240, 240));
                }
                if (i < 2){
                    switch (j) {
                        case 1:
                            piece = new Box("rookd.png");
                            p.add(piece);
                            break;
                        case 2:
                            piece = new Box("knightd.png");
                            p.add(piece);
                            break;
                        case 3:
                            piece = new Box("bishopd.png");
                            p.add(piece);
                            break;
                        case 4:
                            piece = new Box("queend.png");
                            p.add(piece);
                            break;
                        case 5:
                            piece = new Box("kingd.png");
                            p.add(piece);
                            break;
                        case 6:
                            piece = new Box("bishopd.png");
                            p.add(piece);
                            break;
                        case 7:
                            piece = new Box("knightd.png");
                            p.add(piece);
                            break;
                        case 8:
                            piece = new Box("rookd.png");
                            p.add(piece);
                            break;
                        
                    
                        default:
                            break;
                    }
                }
                else if (i == 2){
                    piece = new Box("pawnd.png");
                    p.add(piece);
                }
                else if (i ==8){
                    switch (j) {
                        case 1:
                            piece = new Box("rookl.png");
                            p.add(piece);
                            break;
                        case 2:
                            piece = new Box("knightl.png");
                            p.add(piece);
                            break;
                        case 3:
                            piece = new Box("bishopl.png");
                            p.add(piece);
                            break;
                        case 4:
                            piece = new Box("queenl.png");
                            p.add(piece);
                            break;
                        case 5:
                            piece = new Box("kingl.png");
                            p.add(piece);
                            break;
                        case 6:
                            piece = new Box("bishopl.png");
                            p.add(piece);
                            break;
                        case 7:
                            piece = new Box("knightl.png");
                            p.add(piece);
                            break;
                        case 8:
                            piece = new Box("rookl.png");
                            p.add(piece);
                            break;
                        
                    
                        default:
                            break;
                    }
                }
                else if (i == 7){
                    piece = new Box("pawnl.png");
                    p.add(piece);
                }
                piece.addMouseListener(this);
                add(p);
            }
            
        }
        setVisible(true);
    }
    @Override
    public void mousePressed(MouseEvent e){
        
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        
        //throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        
        //throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
    }
    @Override
    public void mouseExited(MouseEvent e) {
        
        //throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
    }
}
public class Project{
    public static void main(String[] args) {
        new Frame();
    }
}