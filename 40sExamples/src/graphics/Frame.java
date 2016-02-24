/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphics;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Project:
 * Author: Davin
 * Date: 22-Feb-2016
 * Teacher: Mr. Wachs 
 */
public class Frame extends JFrame{

    public Frame() {
        this.setSize(1080, 720);
        this.setLayout(null);
    }
    public void addArrowKeys(final JPanel player){
        KeyListener kl = new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //System.out.println(e.getKeyChar()+" = "+e.getKeyCode());
                if (e.getKeyCode() == 37) {//left
                    if(player.getX() > 0)player.setLocation(player.getX()-50, player.getY());
                }
                if (e.getKeyCode() == 38) {//up                                        
                    if(player.getY() > 0)player.setLocation(player.getX(), player.getY()-50);
                }
                if (e.getKeyCode() == 39) {//right
                    if(player.getX() < getWidth()-50) player.setLocation(player.getX()+50, player.getY()); 
                }
                if (e.getKeyCode() == 40) {//down
                    if(player.getY() < getHeight()-50) player.setLocation(player.getX(), player.getY()+50);     
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        };
        this.addKeyListener(kl);
    }
}
