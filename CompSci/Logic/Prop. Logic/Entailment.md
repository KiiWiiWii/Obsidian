Relation between Assumptions:

P1 ,.., Pn     and conclusion: Q,

We want:

If we assume P1 , … , Pn are all true, then we can conclude Q

Ex :

If P1 = It is Sunny , then we can conclude: Q= It is sunny

2 Cases :

1. v(S) = T
2. v(S) = F but we assume it is Sunny so case2 doesn’t matter

If No P, then we can't conclude: Q= It is sunny

Because we have 2 cases

1. v(S) = T
2. v(S) = F

If P1 = R, then we can not conclude Q = ¬S

4 Cases :

1. v(S),v(R) = T
2. |   |   |
    |---|---|
    |2 ) v(S),v(R) = F|Can ignore because P1 : v( R) =T|
    |3 ) v(S) = T, v( R) = F|Can ignore because P1 : v( R) =T|
    
3. v(S) = F, v( R) = T

If P1 : R, P2 : R -> ¬S, then we can conclude ¬S

4 Cases :

1. v(S),v( R) = T          | P2 : if v( R) = T -> v(S) = F
2. v(S) = T, v( R) = F          | P1 : v( R) = T so ignore
3. v(S) = F, v( R) = T
4. v(S),v( R) = F          | P1 : v( R) = T so ignore

If no P, then we can conclude Q: S \/ ¬S

2 Cases :

1. v(S) = T
2. v(S) = F

If P1 : v(S) = T , P2 : v(S) = F then we can conclude Q: Mspaghetti

4 Cases:

|   |   |
|---|---|
|v(S),v(Mspaghetti) = T|P2 so remove|
|v(S) = F, v(Mspaghetti) = T|P1 so remove|
|v(S) = T, v(Mspaghetti) = F|P2 so remove|
|v(S),v(Mspaghetti) = F|P1 so remove|

Generalised:

P1, …, Pn |= Q

P1, …, Pn entails Q

If:

For all "situations" (i.e., valuations)

That make all the assumptions Pi true,

The conclusion Q is true

So, ∀v, if, ∀i, ⟦Pi⟧v = T, then ⟦Q⟧v = T

In terms of Semantics,

every valuation in all ⟦Pi⟧ is also in ⟦Q⟧

(in set theory symbols: (⟦Pi⟧∩…∩⟦Pn⟧)⊆⟦Q⟧)

If no assumptions then

|= P

exactly when

∀ v. ⟦P⟧v = T

exactly when

P is valid

Deduction Thm :

P1, …, Pn, A |= Q      exactly when      P1, …, Pn |= A -> Q