public class PP1204

{

//-----------------------------------------------------------------

// Creates a new maze, prints its original form, attempts to

// solve it, and prints out its final form.

//-----------------------------------------------------------------

public static void main(String[] args)

{

Maze3D labyrinth = new Maze3D();

System.out.println(labyrinth);

if (labyrinth.traverse(0, 0, 0))

System.out.println("The maze was successfully traversed!");

else

System.out.println("There is no possible path.");

System.out.println(labyrinth);

}

}