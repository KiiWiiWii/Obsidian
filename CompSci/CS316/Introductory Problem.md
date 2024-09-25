# Introductory Problem

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
numericValue = \ x -> case x of
	Ace -> 1
	N2 -> 2
	N3 -> 3
	N4 -> 4
	N5 -> 5
	N6 -> 6
	N7 -> 7
	N8 -> 8
	N9 -> 9
	N10 -> 10
	Jack -> 11
	Queen -> 12
	King -> 13

lessThenOrEqualValue :: Value -> Value -> Bool
lessThanOrEqualValue v1 v2 =
	numericValue v1 <= numericValue v2

data Card = Mkcard Suit Value
	deriving(Show)
```

We forgot to account for the case many millennia in the future when they invent a new suit, sorry. The solution is to type out every colour of suit but i aint doing all that