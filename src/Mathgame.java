import javax.imageio.plugins.tiff.ExifTIFFTagSet;
import javax.swing.*;

public class Mathgame {
    public static void main(String[] args){


    JFrame frame=new JFrame("Maths Game");
    JLabel sLable=new JLabel("Do you want to Play?");
    JButton PlayButton=new JButton("Play");
    JButton ExitButton=new JButton("Exit");

        sLable.setBounds(30,30,150,40);
        PlayButton.setBounds(20,100,100,40);
        ExitButton.setBounds(150,100,100,40);


        frame.add(sLable);
        frame.add(PlayButton);
        frame.add(ExitButton);

        frame.setLayout(null);
        frame.setSize(300,250);
        frame.setVisible(true);
}
}
