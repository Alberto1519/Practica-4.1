import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

class Musica{

	Clip clip;

	public void playMusic(){

		try{
			File msc = new File("./musica/sound-of-the-police.wav");

			AudioInputStream audioIS = AudioSystem.getAudioInputStream(msc);
			clip = AudioSystem.getClip();
			clip.open(audioIS);
			clip.start();
			clip.loop(Clip.LOOP_CONTINUOUSLY);

		}catch(Exception e){
			System.out.println("Error al reproducir la cancion.");
		}
	}

	public void StopPlaying(){
		clip.stop();
	}
}