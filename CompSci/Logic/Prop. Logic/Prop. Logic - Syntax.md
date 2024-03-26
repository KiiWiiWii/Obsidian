Uses statements to make assertions

-Atomic Statements

 'It is raining' = R

'I am in Glasgow' = G

'Version 2.1 of libfoo is installed' = L2.1

'The number in cell (3,3) is 7' = C73,3

All can be T/F (0/1)

-Compound (combined)

'R->G' = if It is raining, then I am in Glasgow

'¬R->¬G' = it is not raining, then I am not in Glasgow

'¬L2.1\/ ¬L2.0' either version 2.1 or version 2.0 is not installed

'C73,3 /\ C83,4' cell3,3 contains 7, and cell3,4 contains 8

-Formulae

/\ And

\/ or

 ¬ not

-> implies

As Grammar:

P,Q ::== A | P /\ Q | P \/ Q | ¬P | P -> Q

Where A is an atomic proposition.

 -> Theyre actually trees <-

-Ambiguity

Put brackets to make it less ambiguous

General Rules

1 ) P1 /\ P2 /\ P3 /\ P4 := P1 /\ (P2 /\ (P3 /\ P4))

2 ) (P1 \/ P2) /\ P3  is good  | P1 \/ P2 /\ P3  is bad

3 ) ¬P /\ Q ≠ ¬(P /\ Q)

4 ) ¬(P/\Q) good | (¬(P/\Q)) bad