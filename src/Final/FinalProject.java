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
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
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
    Rectangle player = new Rectangle(50, 50, 25, 25);
    //setting up/down/left/right keys to be false by default
    boolean right = false;
    boolean left = false;
    boolean up = false;
    boolean down = false;
    //displacement in the x and y directions
    int playerDX = 0;
    int playerDY = 0;
    // array to create blocks later
    Rectangle[] mazeBlocks = new Rectangle[4];
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
        mazeBlocks[0] = new Rectangle(0, 0, WIDTH, 25);
        mazeBlocks[1] = new Rectangle(0, 0, 25, HEIGHT);
        mazeBlocks[2] = new Rectangle(HEIGHT + 25, 0, WIDTH, 25);
        mazeBlocks[3] = new Rectangle(0, WIDTH - 25, 25, 0);

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
                playerDX = 3;
            } else if (left && !right) {
                playerDX = -3;
            } else {
                playerDX = 0;
            }

            if (up && !down) {
                playerDY = -3;
            } else if (down && !up) {
                playerDY = 3;
            } else {
                playerDY = 0;
            }


            if (player.y > HEIGHT) {
                player.y = 0;
            }
            if (player.y < 0) {
                player.y = HEIGHT;
            }
            if (player.x > WIDTH) {
                player.x = 0;
            }
            if (player.x < 0) {
                player.x = WIDTH;
            }

            // update the player
            player.x = player.x + playerDX;
            player.y = player.y + playerDY;

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
