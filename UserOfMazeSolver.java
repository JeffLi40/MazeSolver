public class UserOfMazeSolver {
    public static void main( String[] args) {
        int[][] solveMe0 =
        {
          { 4, 4, 4, 4},
          { 4, 0, 1, 2},
          { 4, 4, 4, 4}
        };
        int[][] solveMe1 =
        {
          { 4, 4, 4, 4, 4, 4, 4 },
          { 4, 0, 4, 4, 4, 4, 4 },
          { 4, 1, 4, 1, 1, 1, 4 },
          { 4, 1, 4, 1, 4, 2, 4 },
          { 4, 1, 4, 1, 4, 4, 4 },
          { 4, 1, 1, 1, 1, 1, 4 },
          { 4, 4, 4, 4, 4, 4, 4 }
        };
        System.out.println(solveMe0);
        MazeSolver maze0 = new MazeSolver( solveMe0);
        maze0.inProgress.next( 1,0);
        System.out.println( maze0);
        maze0.printSolution();
        System.out.println(solveMe1);
        MazeSolver maze1 = new MazeSolver( solveMe1);
        maze1.printSolution();
    }
}
