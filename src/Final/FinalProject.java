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
import java.awt.Font;
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
    static final int HEIGHT = 545;
    //Title of the window
    String title = "My Game";
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;
    // YOUR GAME VARIABLES WOULD GO HERE
    // create a boolean for when the player wins
    boolean playerWin = false;

    // create a counter to hold player score
    int counter = 0;

    // create boolean for the menu
    boolean menu = true;

    // create boolean for game over
    boolean gameOver = false;

    // create variable to hold random x coordinate
    int xAxis;
    // create variable to hold random y coordinate
    int yAxis;

    // create array to hold all possible horizontal spawn locations
    int XDots[] = {20, 95, 170, 245, 320, 395, 470};

    // create array to hold all possible vertical spawn locations
    int YDots[] = {20, 95, 170, 245, 320, 395, 470};
    // create a boolean to see if dot is spawned
    boolean spawnedDot = false;
    // create player
    Rectangle player = new Rectangle(240, 240, 15, 15);
    //setting up/down/left/right/space/y/n keys to be false by default
    boolean right = false;
    boolean left = false;
    boolean up = false;
    boolean down = false;
    boolean space = false;
    boolean keyY = false;
    boolean keyN = false;
    //displacement in the x and y directions
    int playerDX = 0;
    int playerDY = 0;

    // array to create blocks later
    Rectangle[] mazeBlocks = new Rectangle[40];

    // create x value for big moving menu square & bottom square
    int bigMenu = 0;
    int bigMenuB = WIDTH;

    // create x value for small moving menu square & bottom square
    int smallMenu = 50;
    int smallMenuB = WIDTH - 50;

    //create font for menu
    Font biggerFont = new Font("calibri", Font.BOLD, 25);

    // create a variable to keep track of number of frames to pass
    int frames = 0;

    // create a variable to be used as a timer
    int timer = 0;

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
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        if (menu) {
            // create backround for menu
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, WIDTH, HEIGHT);

            // create title wording and instruction for menu
            g.setColor(Color.WHITE);
            g.setFont(biggerFont);
            g.drawString("Grab the Dot", WIDTH - 315, HEIGHT / 2);
            g.drawString("Press 'Space' to Play", WIDTH / 4 + 20, HEIGHT / 2 + 50);

            // having a large square chase a smaller square toward the right of the screen
            g.fillRect(bigMenu, 100, 30, 30);
            g.setColor(Color.RED);
            g.fillRect(smallMenu, 120, 10, 10);

            // have a large square chase a smaller square toward the left of the screen
            g.setColor(Color.WHITE);
            g.fillRect(bigMenuB, 375, 30, 30);
            g.setColor(Color.BLUE);
            g.fillRect(smallMenuB, 395, 10, 10);

        } else {

            // for when game is not in menu
            // make random dot red
            g.setColor(Color.RED);
            // set random numbers to impact spawn location of dot
            if (spawnedDot) {
                g.fillRect(xAxis, yAxis, 8, 8);
            }
            // create all square obstacles around map and make them black
            g.setColor(Color.BLACK);
            for (int i = 0; i < mazeBlocks.length; i++) {
                if (mazeBlocks[i] != null) {
                    g.fillRect(mazeBlocks[i].x, mazeBlocks[i].y, mazeBlocks[i].width, mazeBlocks[i].height);
                }

            }
            // set font and colour to white for creating the timer and score
            g.setColor(Color.WHITE);
            g.setFont(biggerFont);
            g.drawString("Goal: 50 seconds", 150, HEIGHT - 20);
            g.drawString("Score: " + counter, 25, HEIGHT - 20);
            g.drawString(timer + " seconds", 380, HEIGHT - 20);

// create the player
            g.setColor(Color.BLACK);
            g.fillRect(player.x, player.y, player.width, player.height);
        }
        // what to do if game is over
        if (gameOver) {
            // create rectangle to border smaller rectangle
            g.setColor(Color.WHITE);
            g.fillRect(WIDTH / 2 - 153, HEIGHT / 2 - 148, 306, 206);
            // create rectangle as a text box
            g.setColor(Color.BLACK);
            g.fillRect(WIDTH / 2 - 150, HEIGHT / 2 - 145, 300, 200);

            // set font and color to white for game over messages
            g.setColor(Color.WHITE);
            g.setFont(biggerFont);
            // game over messages
            g.drawString("YOU LOSE!", 190, 165);
            // ask user if they want to play again
            g.drawString("Play Again?", 190, 205);
            // see users response for if they want to play again or not
            g.drawString("Type 'y' for yes.", 170, 245);
            g.drawString("Type 'n' for no.", 170, 285);
        }
        if (playerWin) {
            // create rectangle to border smaller rectangle
            g.setColor(Color.WHITE);
            g.fillRect(WIDTH / 2 - 153, HEIGHT / 2 - 148, 306, 206);
            // create rectangle as a text box
            g.setColor(Color.BLACK);
            g.fillRect(WIDTH / 2 - 150, HEIGHT / 2 - 145, 300, 200);

            // set font and color to white for game over messages
            g.setColor(Color.WHITE);
            g.setFont(biggerFont);
            // game over messages
            g.drawString("YOU WIN!", 190, 165);
            // ask user if they want to play again
            g.drawString("Play Again?", 190, 205);
            // see users response for if they want to play again or not
            g.drawString("Type 'y' for yes.", 170, 245);
            g.drawString("Type 'n' for no.", 170, 285);
        }

        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
        // manual creation of all square obstacles on map
        mazeBlocks[0] = new Rectangle(0, -10, WIDTH, 20);
        mazeBlocks[1] = new Rectangle(-50, 10, 60, HEIGHT);
        mazeBlocks[2] = new Rectangle(10, 495 - 10, WIDTH - 10, 100);
        mazeBlocks[3] = new Rectangle(WIDTH - 10, 10, 50, HEIGHT - 10);
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
            if (playerWin && keyN) {
                done = true;
            }

            if (playerWin && keyY) {
                counter = 0;
                frames = 0;
                timer = 0;
                player.x = 240;
                player.y = 240;
                spawnedDot = false;
                gameOver = false;
                keyY = false;
            }
            // reset all game stats if user wants to play again after losing
            if (gameOver && keyY) {
                counter = 0;
                frames = 0;
                timer = 0;
                player.x = 240;
                player.y = 240;
                spawnedDot = false;
                gameOver = false;
                keyY = false;
            }
            // reset to display menu if user doesn't want to play again after losing
            if (gameOver && keyN) {
                done = true;
            }
            if (timer == 50 && counter >= 100) {
                playerWin = true;
            }
            // if user hasn't achieved the required score within time limit, game over = true
            if (timer == 50 && counter < 1000) {
                gameOver = true;
            }
            // movement for squares when menu is present
            if (menu) {
                bigMenu = bigMenu + 2;
                smallMenu = smallMenu + 2;
                bigMenuB = bigMenuB - 2;
                smallMenuB = smallMenuB - 2;
                // allows the squares on the menu to teleport to other side of screen when they go off the edge
                if (bigMenu > WIDTH) {
                    bigMenu = 0;
                }
                if (smallMenu > WIDTH) {
                    smallMenu = 0;
                }
                if (smallMenuB < 0) {
                    smallMenuB = WIDTH;
                }
                if (bigMenuB < 0) {
                    bigMenuB = WIDTH;
                }
            }
            // continues to game if user presses space and menu is true
            if (space) {
                menu = false;

            }
            //allows frames to count up
            if (!menu) {
                frames = frames + 1;

                // so that you can evenly count seconds if fps is 60
                int remainder = frames % 60;
                if (remainder == 0 && !gameOver && !playerWin) {
                    // increase timer value for every 60 frames that goes by
                    timer = timer + 1;
                }
            }
            // do the following code only if game over is not true
            if (!gameOver && !playerWin) {
                // up/down/left/right movement
                // if user is pressing right and not left, go right
                if (right && !left) {
                    playerDX = 4;
                    // if user is pressing left and not right, go left
                } else if (left && !right) {
                    playerDX = -4;
                } else {
                    // if user is not pressing anything, do not move horizontally
                    playerDX = 0;

                }
                // if user is pressing up and not down, go up
                if (up && !down) {
                    playerDY = -4;
                    // if user is pressing down and not up, go down
                } else if (down && !up) {
                    playerDY = 4;
                    // if user is pressing nothing, do not move vertically
                } else {
                    playerDY = 0;

                }
                // if bug occurs where user goes off screen, teleport them back to allowed territory
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
                // if there is no dot present, continue
                if (!spawnedDot) {
                    // generate a random x coordinate
                    int rXNumber = (int) (Math.random() * 7);
                    // generate a random y coordinate
                    int rYNumber = (int) (Math.random() * 7);

                    if (rXNumber == 1) {
                        xAxis = XDots[0];
                    } else if (rXNumber == 2) {
                        xAxis = XDots[1];
                    } else if (rXNumber == 3) {
                        xAxis = XDots[2];
                    } else if (rXNumber == 4) {
                        xAxis = XDots[3];
                    } else if (rXNumber == 5) {
                        xAxis = XDots[4];
                    } else if (rXNumber == 6) {
                        xAxis = XDots[5];
                    } else {
                        xAxis = XDots[6];
                    }

                    if (rYNumber == 1) {
                        yAxis = YDots[0];
                    } else if (rYNumber == 2) {
                        yAxis = YDots[1];
                    } else if (rYNumber == 3) {
                        yAxis = YDots[2];
                    } else if (rYNumber == 4) {
                        yAxis = YDots[3];
                    } else if (rYNumber == 5) {
                        yAxis = YDots[4];
                    } else if (rYNumber == 6) {
                        yAxis = YDots[5];
                    } else {
                        yAxis = YDots[6];
                    }
                    // say that a dot is present
                    spawnedDot = true;
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
                            // stop the player moving
                            playerDX = 0;
                            playerDY = 0;
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
                        // stop player moving
                        playerDY = 0;
                        playerDX = 0;
                    }
                    // for if player reaches location of said dot
                    if (player.intersects(xAxis, yAxis, 8, 8)) {
                        // said dot to dissapear and spawn in a different random location
                        spawnedDot = false;
                        // increase player's score by one
                        counter = counter + 1;
                    }
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
            } else if (key == KeyEvent.VK_SPACE) {
                space = true;
            } else if (key == KeyEvent.VK_Y) {
                keyY = true;
            } else if (key == KeyEvent.VK_N) {
                keyN = true;
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
