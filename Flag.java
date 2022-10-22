import java.awt.*;
import java.applet.*;
import java.lang.*;
import java.awt.event.*;


public class Flag extends Applet implements ActionListener
{
    Button play,stop;
    AudioClip ac;
    public void init()
    {
        play=new Button(" PLAY ");
        add(play);
        play.addActionListener(this);

        stop=new Button(" STOP ");
        add(stop);
        stop.addActionListener(this);

        ac = getAudioClip(getCodeBase(),"India.mid");

    }

    public void actionPerformed(ActionEvent ae)
    {
        Object o=ae.getSource();
        if (o == play)
        {
            ac.play();
        }
        else if(o == stop)
        {
            ac.stop();
        }
        repaint();
    }

    public void paint(Graphics g)
    {
        setBackground(Color.PINK);
        g.setColor(Color.GREEN);
        g.fillRect(100,100,500,100);
        g.setColor(Color.WHITE);
        g.fillRect(100,200,500,200);
        g.setColor(Color.ORANGE);
        g.fillRect(100,300,500,100);
        g.setColor(Color.BLUE);
        g.fillOval(290,200,100,100);
    }
}