package com.company;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.Key;

public class ListenToMetallica {

    public static void main(String[] args) throws InterruptedException {


        OpenTheWindow openTheWindow = new OpenTheWindow();

        openTheWindow.start();
        openTheWindow.join();

        RedirectToYoutube redirectToYoutube = new RedirectToYoutube();

        redirectToYoutube.start();
        redirectToYoutube.join();

        RedirectToTheSong redirectToTheSong = new RedirectToTheSong();



        redirectToTheSong.start();
        redirectToTheSong.join();


    }
}

    class OpenTheWindow extends Thread{
        @Override
        public void run(){
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI("www.google.com"));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }

    class RedirectToYoutube extends Thread{

        final String textToWrite = "Youtube";

        @Override
        public void run() {
            try {
                Thread.sleep(2000);
                Robot robot = new Robot();
                for(char ch : textToWrite.toCharArray()) {
                    int keyCode = KeyEvent.getExtendedKeyCodeForChar(ch);

                    robot.keyPress(keyCode);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                robot.keyPress(KeyEvent.VK_ENTER);

                robot.mouseMove(214,313); //location to youtube link

                Thread.sleep(1500);

                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);


            } catch (AWTException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class RedirectToTheSong extends Thread{

        final String songName = "Metallica Nothing else matters Live";

        @Override
        public void run(){
            try {
                Robot robot = new Robot();

                robot.mouseMove(438,133);

                Thread.sleep(1500);

                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                for(char ch : songName.toCharArray()){
                    int key = KeyEvent.getExtendedKeyCodeForChar(ch);

                    robot.keyPress(key);
                    try{
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                Thread.sleep(500);
                robot.keyPress(KeyEvent.VK_ENTER);

                Thread.sleep(1500);

                robot.mouseMove(469,310);
                Thread.sleep(500);

                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                Thread.sleep(500);

                //pressing the like button

                robot.mouseMove(650,796);
                Thread.sleep(500);

                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);


            } catch (AWTException | InterruptedException e) {
                e.printStackTrace();
            }

        }



    }

