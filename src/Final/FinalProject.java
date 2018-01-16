package Final;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

/**
 *
 * @author tejab6669
 */
public class FinalProject extends JComponent {

    // Height and Width of our game
    static final int WIDTH = 495;
    static final int HEIGHT = 495;
    //Title of the window
    String title = "My Game";
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;
    // YOUR GAME VARIABLES WOULD GO HERE
    int[] xpoints = {50, 100, 150, 100};
    int[] ypoints = {50, 90, 50, 170};
    // create player
    Rectangle player = new Rectangle(240, 240, 15, 15);
    //setting up/down/left/right keys to be false by default
    boolean right = false;
    boolean left = false;
    boolean up = false;
    boolean down = false;
    //displacement in the x and y directions
    int playerDX = 0;
    int playerDY = 0;
    // array to create blocks later
    Rectangle[] mazeBlocks = new Rectangle[40];
    // GAME VARIABLES END HERE   
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)

    public FinalProject() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();

        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        g.setColor(Color.BLACK);
        for (int i = 0; i < mazeBlocks.length; i++) {
            g.fillRect(mazeBlocks[i].x, mazeBlocks[i].y, mazeBlocks[i].width, mazeBlocks[i].height);


            g.fillRect(player.x, player.y, player.width, player.height);


            // GAME DRAWING ENDS HERE
        }
    }
    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!

    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
        mazeBlocks[0] = new Rectangle(0, 0, 85, 10);
        mazeBlocks[1] = new Rectangle(0, 10, 10, HEIGHT);
        mazeBlocks[2] = new Rectangle(10, HEIGHT - 10, WIDTH - 10, 10);
        mazeBlocks[3] = new Rectangle(WIDTH - 10, 10, 10, HEIGHT - 10);
        mazeBlocks[4] = new Rectangle(35, 35, 50, 50);
        mazeBlocks[5] = new Rectangle(110, 35, 50, 50);
        mazeBlocks[6] = new Rectangle(185, 35, 50, 50);
        mazeBlocks[7] = new Rectangle(260, 35, 50, 50);
        mazeBlocks[8] = new Rectangle(335, 35, 50, 50);
        mazeBlocks[9] = new Rectangle(410, 35, 50, 50);
        mazeBlocks[10] = new Rectangle(35, 110, 50, 50);
        mazeBlocks[11] = new Rectangle(35, 185, 50, 50);
        mazeBlocks[12] = new Rectangle(35, 260, 50, 50);
        mazeBlocks[13] = new Rectangle(35, 335, 50, 50);
        mazeBlocks[14] = new Rectangle(35, 410, 50, 50);
        mazeBlocks[15] = new Rectangle(110, 185, 50, 50);
        mazeBlocks[16] = new Rectangle(185, 260, 50, 50);
        mazeBlocks[17] = new Rectangle(260, 335, 50, 50);
        mazeBlocks[18] = new Rectangle(335, 410, 50, 50);
        mazeBlocks[19] = new Rectangle(410, 110, 50, 50);
        mazeBlocks[20] = new Rectangle(410, 185, 50, 50);
        mazeBlocks[21] = new Rectangle(410, 260, 50, 50);
        mazeBlocks[22] = new Rectangle(410, 335, 50, 50);
        mazeBlocks[23] = new Rectangle(410, 410, 50, 50);
        mazeBlocks[24] = new Rectangle(335, 110, 50, 50);
        mazeBlocks[25] = new Rectangle(335, 185, 50, 50);
        mazeBlocks[26] = new Rectangle(335, 260, 50, 50);
        mazeBlocks[27] = new Rectangle(335, 335, 50, 50);
        mazeBlocks[28] = new Rectangle(260, 110, 50, 50);
        mazeBlocks[29] = new Rectangle(260, 185, 50, 50);
        mazeBlocks[30] = new Rectangle(260, 260, 50, 50);
        mazeBlocks[31] = new Rectangle(260, 410, 50, 50);
        mazeBlocks[32] = new Rectangle(185, 110, 50, 50);
        mazeBlocks[33] = new Rectangle(185, 185, 50, 50);
        mazeBlocks[34] = new Rectangle(185, 335, 50, 50);
        mazeBlocks[35] = new Rectangle(185, 410, 50, 50);
        mazeBlocks[36] = new Rectangle(110, 110, 50, 50);
        mazeBlocks[37] = new Rectangle(110, 260, 50, 50);
        mazeBlocks[38] = new Rectangle(110, 335, 50, 50);
        mazeBlocks[39] = new Rectangle(110, 410, 50, 50);
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void run() {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;

        preSetup();

        // the main game loop section

        // game will end if you set done = false;
        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();

            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 

            // up/down/left/right movement
            if (right && !left) {
                playerDX = 4;
            } else if (left && !right) {
                playerDX = -4;
            } else {
                playerDX = 0;
            }

            if (up && !down) {
                playerDY = -4;
            } else if (down && !up) {
                playerDY = 4;
            } else {
                playerDY = 0;
            }

            if(player.y > HEIGHT){
                player.y = 0;
            }
            if(player.y < 0){
                player.y = HEIGHT;
            }
            if(player.x > WIDTH){
                player.x = 0;
            }
            if(player.x < 0){
                player.x = WIDTH;
            }


            // update the player
            player.x = player.x + playerDX;
            player.y = player.y + playerDY;


            for (int i = 0; i < mazeBlocks.length; i++) {
                // did the player hit a block?
                if (player.intersects(mazeBlocks[i])) {
                    int cHeight = Math.min(mazeBlocks[i].y + mazeBlocks[i].height, player.y + player.height) - Math.max(mazeBlocks[i].y, player.y);
                    int cWidth = Math.min(mazeBlocks[i].x + mazeBlocks[i].width, player.x + player.width) - Math.max(mazeBlocks[i].x, player.x);

                    // determine the smaller one to fix
                    if (cWidth < cHeight) {
                        // fix the width
                        // player on left side
                        if (player.x < mazeBlocks[i].x) {
                            player.x = player.x - cWidth;
                        } else {
                            player.x = player.x + cWidth;
                        }
                        // stop the player moving sideways
                        playerDX = 0;
                    } else {


                        // moving down?
                        if (playerDY > 0) {
                            // stop the down motion
                            player.y = player.y - cHeight;
                        }
                    }
                    // moving up?
                    if (playerDY < 0) {
                        player.y = player.y + cHeight;

                    }

                    playerDY = 0;
                }
            }



            // GAME LOGIC ENDS HERE 
            // update the drawing (calls paintComponent)
            repaint();

            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            try {
                if (deltaTime > desiredTime) {
                    //took too much time, don't wait
                    Thread.sleep(1);
                } else {
                    // sleep to make up the extra time
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception e) {
            };

        }
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {
        // if a mouse button has been pressed down

        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {
        // if a key has been pressed down

        @Override
        public void keyPressed(KeyEvent e) {
            // determine the key
            int key = e.getKeyCode();
            // figure out which key
            if (key == KeyEvent.VK_RIGHT) {
                right = true;
            } else if (key == KeyEvent.VK_LEFT) {
                left = true;
            } else if (key == KeyEvent.VK_UP) {
                up = true;
            } else if (key == KeyEvent.VK_DOWN) {
                down = true;
            }
        }
        // if a key has been released

        @Override
        public void keyReleased(KeyEvent e) {

            // determine the key
            int key = e.getKeyCode();
            // figure out which key
            if (key == KeyEvent.VK_RIGHT) {
                right = false;
            } else if (key == KeyEvent.VK_LEFT) {
                left = false;
            } else if (key == KeyEvent.VK_UP) {
                up = false;
            } else if (key == KeyEvent.VK_DOWN) {
                down = false;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        FinalProject game = new FinalProject();

        // starts the game loop
        game.run();
    }
}
