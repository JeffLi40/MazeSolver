public class Maze {

  /**
    0: Start
    1: Unwalked
    2: End
    3: Walked on
    4: Wall
  */
    public int[][] maze;
    int locationX;
    int locationY;
    int startX;
    int startY;

    public Maze( int[][] givenMaze) {
        maze = givenMaze;
        for( int i = 0; i < maze.length; i++) {
            for( int j = 0; j < maze[0].length; j++) {
                if( maze[i][j] == 0) {
                    locationX = i;
                    locationY = j;
                    startX = i;
                    startY = j;
                    return;
                }
            }
        }
    }

    public Maze( Maze toBeCopied) {
        maze = toBeCopied.maze.clone();
        startX = toBeCopied.startX;
        startY = toBeCopied.startY;
    }

    public void next( int directionX, int directionY) {
        maze[locationX][locationY] = 3;
        locationX += directionX;
        locationY += directionY;
    }

    public void goBack( int directionX, int directionY) {
        locationX -= directionX;
        locationY -= directionY;
        maze[locationX][locationY] = 1;
    }

    public boolean atDeadEnd() {
        return maze[locationX][locationY]  > 2;
    }

    public boolean accept() {
        return maze[locationX][locationY] == 2;
    }

    public String toString() {
        String pic = "";
        for( int i = 0; i < maze.length; i++){
            for( int j = 0; j < maze[0].length; j++){
                pic += maze[i][j];
            }
            pic += System.lineSeparator();
        }
        return pic;
    }

    public void putBackStart() {
        maze[startX][startY] = 0;
    }
}
