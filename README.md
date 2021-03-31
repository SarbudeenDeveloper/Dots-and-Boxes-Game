# Dots-and-Boxes-Game
Dots and Boxes Game in java (Zoho L3 Test 2021 - March 30)

In Zoho (2021) L3 Round - They have asked to write a program to play a Dots and Boxes Game.
So, I wrote a program using java.

// Rules
Player has the only chance to move adjecent points (Move forward, backward, upward, downward) 
Player should move to the diagnal points
Player will get one more chance if wins
If no dots is remining to draw a square the game will end

Here are the sample input and outputs.

Enter R and C
3 3

1   2   3

4   5   6

7   8   9

Enter input for P1 : 
1 2

1 - 2   3

4   5   6

7   8   9

Enter input for P2 : 
2 5

1 - 2   3
    |
4   5   6

7   8   9

Enter input for P1 : 
4 5

1 - 2   3
    |
4 - 5   6

7   8   9

Enter input for P2 : 
1 4

1 - 2   3
| p2|
4 - 5   6

7   8   9

....etc

Enter input for P2 : 
1 5

1 - 2 - 3
| p2| p2|
4 - 5 - 6
| p1| p2|
7 - 8 - 9

Player 2 Score : 3
Player 1 Score : 1

// If both player are getting equal score show Game tied

Enter input for P2 : 
1 5

1 - 2 - 3
| p2| p2|
4 - 5 - 6
| p1| p1|
7 - 8 - 9

Game tied
