
import java.awt.Container;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author d.holmberg
 */
class World extends Container{
    public static boolean moveEnabled = true;
    public static int downOff = 0;
    public static int rightOff = 0;
    
    public static int x,y;//the width and height of the display, in tiles
    public static Tile[][] grid;//the storage for the tile grid
    public static int[][] tileType;//the types for the tile grid
    
    final int WIDTH = 50;//the grid width and height
    final int HEIGHT = 50;
    
    public World() {
        this.setBounds(0, 0, 1280, 720);
        this.setVisible(false);
        this.setLayout(null);
        
        x = (Main.visual.width/50)+1;//makes the displays width and height
        y = (Main.visual.height/50)+1;
        
        tileType  = new int[WIDTH][HEIGHT];//intializes all the grids
        grid  = new Tile[WIDTH][HEIGHT];
                
        File map = new File("src\\Map.txt");//reads the map and stores it in tileType, also sets all borderType to 0
        Scanner s;
        try {
            s = new Scanner(map);
            for (int j = 0; j < HEIGHT; j++){
                for (int i = 0; i < WIDTH; i++){
                    tileType[i][j] = s.nextInt();
                }
            }
            s.close(); 
        } catch (FileNotFoundException ex) {
            System.out.println("Error reading map");
        }
        
        
        for (int i = rightOff; i < WIDTH-1; i++){
            for (int j = downOff; j < HEIGHT-1; j++){
                grid[i][j] = new Tile(i, j);//creates all the tiles
                grid[i][j].setTile(tileType[i][j]);//sets the type of all tiles
                this.add(grid[i][j]);//adds the tiles to the tile container
                
            }
        }
        
        for (int i = 0; i < Person.allPeople.size(); i++) {
            this.add(Person.allPeople.get(i).jPanel,0);
        }
//        JPanel test = new JPanel();
//        test.setBounds(0, 0, 100, 100);
//        test.setBackground(Color.red);
//        this.add(test);
    }

    void keyInput(int key) {
        if(moveEnabled){//map movement
            
            if (key == 38){//up
                if (downOff != 0 && Tile.typeTraversible(tileType[13 + rightOff][7 + downOff-1])){
                    downOff--;
                    redrawMap();
                    redrawPeople(0);
                }
            }
            if (key == 37){//left
                if (rightOff != 0 && Tile.typeTraversible(tileType[13 + rightOff-1][7 + downOff])){
                    rightOff--;
                    redrawMap();
                    redrawPeople(1);
                }
            }
            if (key == 40){//down

                if (downOff != (HEIGHT-y) && Tile.typeTraversible(tileType[13 + rightOff][7 + downOff+1])){
                    downOff++;   
                    redrawMap();
                    redrawPeople(2); 
                }
            }
            if (key == 39){//right

                if (rightOff != (WIDTH-x) && Tile.typeTraversible(tileType[13 + rightOff+1][7 + downOff])){
                    rightOff++;
                    redrawMap();
                    redrawPeople(3);    
                }
            }
            
            if (key == 76){//l
                System.out.println((13+rightOff)+", "+(7+downOff));
            }
            
            if (key == 90){//z
                System.out.println("z");
                for (int i = 0; i < Person.allPeople.size(); i++) {
                    if (Main.player.jPanel.getLocation().equals(allPeople.get(i).jPanel.getLocation()) && !allPeople.get(i).equals(Main.player)) {
                        allPeople.get(i).interact();
                    }
                }

            }
        }
    }
       /**
     * redraws the map 
     */
    public void redrawMap(){
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                grid[i][j].setTile(tileType[i + rightOff][j + downOff]);

            }
        }
    }
    public void redrawPeople(int direction) {
        for (int i = 0; i < allPeople.size(); i++) {
            if (allPeople.get(i).equals(Main.player)) {
                allPeople.get(i).turn(direction);
            }
            else{
                Point point = allPeople.get(i).location;
                point = new Point((point.x-World.rightOff)*50, (point.y-World.downOff)*50);
                allPeople.get(i).move(point);                
            }
            
        }        
    }
}
