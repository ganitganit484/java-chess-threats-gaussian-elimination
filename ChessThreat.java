package assignment1;

/**
 * The function receives two players and the type of the first player and checks, based on his type, whether he threatens the second player according to the rules of chess.
 */

public class ChessThreat {
    public static boolean CheckThreats(int type, int x1, int y1, int x2, int y2) {
        if (type>3 || type<1) { //If a number that is not between 1 and 3 is entered in the type argument, we will return false.
            return false;
        }
        if (x1 == x2 && y1 == y2) {
            return false;
        }
        else if (type == 1 && Math.abs(y2 - y1) == Math.abs(x2 - x1)) {//If the threatening piece is a bishop, we check whether the difference in absolute value between the x and y of the two players is equal. If so, we return true.
            return true;
        }
        else if (type == 2 && (x1 == x2 || y1 == y2)) {//If the threatening piece is a rook, we check whether the x's and y's of both players are equal. If so, we return true.
            return true;
        }
        else if (type == 3 && ((Math.abs(x2-x1) == 2 && (Math.abs(y2-y1) == 1)) || (Math.abs(y2-y1) == 2 && (Math.abs(x2-x1) == 1)))){//If the threatening player is a knight, we will check whether the absolute value of the difference between the xs or ys of the two players is equal to 2 and the difference between the remaining variable of the two players is 1. If so, we will return true.
            return true;
        }
        else { //If none of the previous conditions are met we will return false.
            return false;
        }
    }
}

