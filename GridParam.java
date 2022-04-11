public class GridParam 
{
    private String[][] gridAnswerPipes = {
            {"╚ ","═ ","╦ ","═ ","╗ "},
            {"♥ ","╦ ","╩ ","♣ ","║ "},
            {"╔ ","╝ ","╔ ","═ ","╝ "},
            {"║ ","♦ ","╠ ","╦ ","♠ "},
            {"╚ ","╝ ","☻ ","╚ ","╗ "}
        };
    
    //╚ ╔ ╝ ╗ 
    //═ ║ 
    //╦ ╩ ╠ ╣ 
    //♥ ♣ ♦ ☻ ♠ 
    private String[][] thesePipes = {
			{" "," "," "," "," "},
			{" "," "," "," "," "},
			{" "," "," "," "," "},
			{" "," "," "," "," "},
			{" "," "," "," "," "}
		};
        
    // private variables
    private int row;
    private int column;
    private String response;
    private int matches;
    //sets the match grid to its difficulty and set
    public GridParam(int x, int y, String[][] passedPipes)
    {
        x--;
        y--;
        this.row = x;
        this.column = y;
        for (int i = 0; i < passedPipes.length; i++) {
            for (int j = 0; j < passedPipes[i].length; j++) {
                this.thesePipes[i][j] = passedPipes[i][j];
            }
        }
    }
    //checks if currentPipes = to gridAnswerPipes
    public boolean pipeCheck()
    {
        for (int i = 0; i < thesePipes.length; i++) {
            for (int j = 0; j < thesePipes[i].length; j++) {
                if (thesePipes[i][j]==gridAnswerPipes[i][j])
                {
                    matches++;
                }
            }
        }
        if (matches == 25)
        {
            return true;
        }
        return false;
    }
    //finds the pipe
    public String gridPipe()
    {
        return thesePipes[row][column];
    }
}