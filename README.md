# Dots-and-Boxes-Game
Dots and Boxes Game in java (Zoho L3 Test 2021 - March 30)<br />
<br />
In Zoho (2021) L3 Round - They have asked to write a program to play a Dots and Boxes Game.<br />
So, I wrote a program using java.<br />
<br />
// Rules<br />
Player has the only chance to move adjecent points (Move forward, backward, upward, downward) <br />
Player should move to the diagnal points<br />
Player will get one more chance if wins<br />
If no dots is remining to draw a square the game will end<br />
<br />
Here are the sample input and outputs.<br />
<br />
Enter R and C<br />
3 3<br />
<br />
1   2   3<br />
<br />
4   5   6<br />
<br />
7   8   9<br />

Enter input for P1 : <br />
1 2<br />
<br />
1 - 2   3<br />
<br />
4   5   6<br />
<br />
7   8   9<br />
<br />
Enter input for P2 : <br />
2 5<br />
<br />
1 - 2   3<br />
    |       <br />
4   5   6<br />
            <br />
7   8   9<br />

Enter input for P1 : <br />
4 5<br />
<br />
1 - 2   3<br />
    |       <br />
4 - 5   6<br />
            <br />
7   8   9<br />
<br />
Enter input for P2 : <br />
1 4<br />
<br />
1 - 2   3<br />
| p2|       <br />
4 - 5   6<br />
            <br />
7   8   9<br />
            <br />
....etc<br />

Enter input for P2 :<br />
1 5<br />
<br />
1 - 2 - 3<br />
| p2| p2|   <br />
4 - 5 - 6<br />
| p1| p2|   <br />
7 - 8 - 9<br />
<br />
Player 2 Score : 3<br />
Player 1 Score : 1<br />
<br />
// If both player are getting equal score show Game tied<br />
<br />
Enter input for P2 :<br />
1 5<br />
<br />
1 - 2 - 3<br />
| p2| p2|   <br />
4 - 5 - 6<br />
| p1| p1|   <br />
7 - 8 - 9<br />
<br />
Game tied<br />
