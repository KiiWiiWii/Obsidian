# Class info
VIDEO LECTURES ARE BACK NOOOOOOOOOOOOOOOO.
Also lecture notes are in a git because the cs dep needs to be fucking different and cool kys.

Come during any time during the labs if you feel like it :3c

12 hours per week, 5 hours of it is lectures and labs and the rest is gonna be at home programming and tutorial questions ig.

GHCup to install this shit, also bye bye intellij using vscode now.

No windows like this room OPEN ONE

Dont use an anti virus and run as admin trust me, also put it your most vulnerable file paths :3c

The class test is 24 hours long :sob:

Large coursework where its just "extra marks"

bro comes in with 10 mins left- sigma

# Haskell stuff

- Define data types to represent problems & and their solutions.
- Define functions to create new data
- He likes `final` variables
- Errors are data rather than closing the program? So like `public static int function()` can return an int or an error as a variable 
- 


- idk what this serves


# Coding problem!!

PLAYING CARDS WHOOO

```haskell
data Suit = Diamonds | Hearts | Clubs | Spades

exampleSuit :: Suit
exampleSuit = Diamonds

 data Colour = Red | Black
	 deriving (Show)

 colourOfSuit :: Suit -> Colour
 colourOfSuit Diamond = Red
 colourOfsuit Hearts = Red
 colourOfSuit _ = Black

data Value 
	= Ace
	| N2
	| N3
	| N4
	| N5
	| N6
	| N7
	| N8
	| N9
	| N10
	| Jack
	| Queen
	| King

numericValue :: Value -> int
numericValue = \case
	Ace -> 1
	N2 -> 2
	N2 -> 3
	N2 -> 4
	N2 -> 5
	N2 -> 6
	N2 -> 7
	N2 -> 8
	N2 -> 9
	N2 -> 10
```

We forgot to account for the case many millennia in the future when they invent a new suit, sorry. The solution is to type out every colour of suit but i aint doing all that