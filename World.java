/**
 * @author : Will Teeple
 *
 */

public class World
{
  private final int worldXDim = 7;
  private final int worldYDim = 7;
  private final int startLocX = 0;
  private final int startLocY = 3;

  private final char tree = 'T';
  private final char mountain = 'M';
  private final char path = 'P';
  private final char player = '@';
  private final char river = 'R';

  public int curPosX = startLocX;
  public int curPosY = startLocY;

  private final char[][] worldArrBase =
  {{'F', 'F', 'M', 'M', 'M', 'M', 'M'},
   {'F', 'F', 'M', 'M', 'P', 'P', 'T'},
   {'F', 'F', 'F', 'F', 'P', 'F', 'F'},
   {'P', 'P', 'P', 'P', 'P', 'F', 'F'},
   {'F', 'F', 'F', 'F', 'P', 'F', 'F'},
   {'F', 'F', 'F', 'F', 'P', 'P', 'T'},
   {'F', 'F', 'F', 'F', 'F', 'F', 'F'}};
  public char[][] curWorldArr = new char[worldYDim][worldXDim];

  public World()
  {
    curWorldArr = worldArrBase;
    curWorldArr[startLocY][startLocX] = player;
  }

  void displayWorld()
  {
    for (int i = 0; i < worldYDim; i++)
    {
      System.out.println("\n");
      for (int j = 0; j < worldXDim; j++)
      {
        System.out.print(curWorldArr[i][j] + " ");
      }
    }
  }
}
