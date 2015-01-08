package ics3uculminating;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)throws IOException {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));



        int[][] boardSpaces = new int[6][5];
        int spotChosen = 0;
        int player1score = 0;
        int player2score = 0;

        boardSpaces[0][0] = 0;
        boardSpaces[0][1] = 0;
        boardSpaces[0][2] = 0;
        boardSpaces[0][3] = 0;
        boardSpaces[0][4] = 0;
        boardSpaces[1][0] = 0;
        boardSpaces[1][1] = 0;
        boardSpaces[1][2] = 0;
        boardSpaces[1][3] = 0;
        boardSpaces[1][4] = 0;
        boardSpaces[2][0] = 0;
        boardSpaces[2][1] = 0;
        boardSpaces[2][2] = 0;
        boardSpaces[2][3] = 0;
        boardSpaces[2][4] = 0;
        boardSpaces[3][0] = 0;
        boardSpaces[3][1] = 0;
        boardSpaces[3][2] = 0;
        boardSpaces[3][3] = 0;
        boardSpaces[3][4] = 0;
        boardSpaces[4][0] = 0;
        boardSpaces[4][1] = 0;
        boardSpaces[4][2] = 0;
        boardSpaces[4][3] = 0;
        boardSpaces[4][4] = 0;
        boardSpaces[5][0] = 0;
        boardSpaces[5][1] = 0;
        boardSpaces[5][2] = 0;
        boardSpaces[5][3] = 0;
        boardSpaces[5][4] = 0;

        for(int i = 1; i <= 30; i++){
                if(i == 7 || i == 13 || i==19 || i== 25){
                    System.out.println("|");
                    System.out.print("|");
                    System.out.print(i);
                }else if(i == 30){
                    System.out.print("|");
                    System.out.print(i);
                    System.out.println("|");
                }else{
                    System.out.print("|");
                    System.out.print(i);


                    for (int a = 0 ; a < boardSpaces.length ; a++)
        {

            System.out.printf ("%-6s %-6s %-6s %-6s %-6s              ", boardSpaces [a] [0],boardSpaces [a] [1], boardSpaces [a] [2], boardSpaces [a] [3], boardSpaces [a] [4]);



            System.out.println (" ");



        }
                }
        }
        
    }

}
