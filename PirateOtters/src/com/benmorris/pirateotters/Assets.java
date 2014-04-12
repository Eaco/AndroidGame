package com.benmorris.pirateotters;

import com.benmorris.framework.Image;
import com.benmorris.framework.Music;
import com.benmorris.framework.Sound;

public class Assets {

	public static Image menu, splash, background, character, character2,
			character3, heliboy, heliboy2, heliboy3, heliboy4, heliboy5;
	public static Image tiledirt, tilegrassTop, tilegrassBot, tilegrassLeft,
			tilegrassRight, characterJump, characterDown, fish, runner1,
			runner2, runner3, jonte;
	public static Image button;
	public static Sound click;
	public static Music theme;

	public static void load(PirateOttersGame POGame) {
		// TODO Auto-generated method stub
		theme = POGame.getAudio().createMusic("loopatroopa.mp3");
		theme.setLooping(true);
		theme.setVolume(0.85f);
		theme.play();
	}

}