public class MazeSolver {

    public Maze solution;
    public Maze inProgress;
    private boolean notFound;

    public MazeSolver( int[][] givenMaze) {
        inProgress = new Maze( givenMaze);
        notFound = true;
        recordSolution();
    }

    public void recordSolution() {
        if( inProgress.atDeadEnd()) return;
        else if( inProgress.accept()) {
            solution = new Maze( inProgress);
            solution.putBackStart();
            notFound = false;
            System.out.println( inProgress.toString());
            return;
        }
        else {
            for( int n = -1; n < 2 && notFound; n += 2) {
                recursiveAbstraction( n, 0);
                if( notFound) recursiveAbstraction( 0, n);
            }
        }
    }

    public void recursiveAbstraction( int dirX, int dirY) {
      inProgress.next( dirX, dirY);
      recordSolution();
      inProgress.goBack( dirX, dirY);
    }

    public void printSolution() {
        if( solution == null) System.out.println( "No solution");
        else System.out.println( solution);
    }

    public String toString(){
        return inProgress.toString();
    }
}
