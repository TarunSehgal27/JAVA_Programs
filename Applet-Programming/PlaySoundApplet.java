import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class PlaySoundApplet extends Applet implements ActionListener {
   Button play,stop;
   AudioClip audioClip;
   
   public void init() {
      play = new Button(" Play in Loop ");
      add(play);
      play.addActionListener(this);
      stop = new Button(" Stop ");
      add(stop);
      stop.addActionListener(this);
      audioClip = getAudioClip(getCodeBase(), "Chronicle Of Chandigarh PG - Satinder Sartaaj (DJJOhAL.Com)");
   }
   public void actionPerformed(ActionEvent ae) {
      Button source = (Button)ae.getSource();
      if (source.getLabel() == " Play in Loop ") {
         audioClip.play();
      } else if(source.getLabel() == "  Stop  "){
         audioClip.stop();
      }
   }
}
