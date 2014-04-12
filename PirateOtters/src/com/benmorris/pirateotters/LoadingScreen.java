package com.benmorris.pirateotters;

import com.benmorris.framework.Game;
import com.benmorris.framework.Graphics;
import com.benmorris.framework.Graphics.ImageFormat;
import com.benmorris.framework.Screen;

public class LoadingScreen extends Screen {
    public LoadingScreen(Game game) {
        
        super(game);
    }

    @Override
    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        Assets.menu = g.newImage("menu.png", ImageFormat.RGB565);
        Assets.background = g.newImage("BG.png", ImageFormat.RGB565);
        Assets.character = g.newImage("otta1.png", ImageFormat.ARGB4444);
        Assets.character2 = g.newImage("otta2.png", ImageFormat.ARGB4444);
        Assets.character3  = g.newImage("otta3.png", ImageFormat.ARGB4444);
        Assets.characterJump = g.newImage("otta1.png", ImageFormat.ARGB4444);
        Assets.characterDown = g.newImage("otta1.png", ImageFormat.ARGB4444);
        
        Assets.runner1 = g.newImage("runner1.png", ImageFormat.ARGB4444);
        Assets.runner2 = g.newImage("runner2.png", ImageFormat.ARGB4444);
        Assets.runner3 = g.newImage("runner3.png", ImageFormat.ARGB4444);
        
        Assets.jonte = g.newImage("jonte.png", ImageFormat.ARGB4444);
        

        Assets.fish =g.newImage("fish.png", ImageFormat.ARGB4444);
        
        Assets.heliboy = g.newImage("heliboy.png", ImageFormat.ARGB4444);
        Assets.heliboy2 = g.newImage("heliboy2.png", ImageFormat.ARGB4444);
        Assets.heliboy3  = g.newImage("heliboy3.png", ImageFormat.ARGB4444);
        Assets.heliboy4  = g.newImage("heliboy4.png", ImageFormat.ARGB4444);
        Assets.heliboy5  = g.newImage("heliboy5.png", ImageFormat.ARGB4444);


        
        Assets.tiledirt = g.newImage("dirt.png", ImageFormat.RGB565);
        Assets.tilegrassTop = g.newImage("dirtTop.png", ImageFormat.RGB565);
        Assets.tilegrassBot = g.newImage("dirtBot.png", ImageFormat.RGB565);
        Assets.tilegrassLeft = g.newImage("tilegrassleft.png", ImageFormat.RGB565);
        Assets.tilegrassRight = g.newImage("tilegrassright.png", ImageFormat.RGB565);
        
        Assets.button = g.newImage("button.jpg", ImageFormat.RGB565);

        //This is how you would load a sound if you had one.
        //Assets.click = game.getAudio().createSound("explode.ogg");

        
        game.setScreen(new MainMenuScreen(game));

    }

    @Override
    public void paint(float deltaTime) {
        Graphics g = game.getGraphics();
        g.drawImage(Assets.splash, 0, 0);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }

    @Override
    public void backButton() {

    }
}
