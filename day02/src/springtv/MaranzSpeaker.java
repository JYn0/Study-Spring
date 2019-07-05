package springtv;

import org.springframework.stereotype.Component;

// @Component("ms")
public class MaranzSpeaker implements Speaker {

	@Override
	public void up() {
		System.out.println("Maranz Speaker Volume Up");
	}

	@Override
	public void down() {
		System.out.println("MaranzSpeaker Volume Down");
	}

}
