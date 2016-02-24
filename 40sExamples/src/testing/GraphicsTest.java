/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing;

import graphics.Frame;
import java.awt.Color;
import javax.swing.JPanel;


/**
 * Project:
 * Author: Davin
 * Date: 22-Feb-2016
 * Teacher: Mr. Wachs 
 */
public class GraphicsTest {

    public GraphicsTest() {
        graphics.Frame frame = new graphics.Frame();
        frame.setVisible(true);
        frame.addPlayer();
    }
}
