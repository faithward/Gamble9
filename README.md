README
This will be a gambling game where I attempt to write an AI that can beat the user. 
There will be four players, one human, 3 algorithm. Each player will receive four cards numbered 0, 1, 2, or 3. 
Each player will have to put a card down and try not to exceed 9. Each player must bet on whether they will lose or not. 
The losing player's chips are distributed among the other players. Whichever player's card exceeds 9 will be the loser. 
0s are valuable, 3s are bad.

To deal cards: 
-initialize an array of size 52, this is our deck. there should be 13 of each number card 
-each round, each of the players is assigned a 4 card array that draws from the deck with randomized cards 
-the player can see their four cards, but not the computer's cards 
-each AI player should be represented with the number of cards in their hand without showing the cards

Algorithm 
-place highest card first round 
-if pile = 9 and they have a 0, play it always 
-subtract pile number from 9 to find how much room is left, choose card least likely to push total over 
-if playing a card can bring a total to exactly 9, do that to screw over the next player

Game 
-choose which player starts randomly 
-display 0 in the middle 
-announce what each player plays and show their cards in hand decrease 
-increase pile number accordingly with each turn 
-go clockwise