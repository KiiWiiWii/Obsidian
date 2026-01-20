
The overview of the class is that we will introduce different automata models and then discuss what they can and cant do.

Just like math, its trivial to prove what is solvable by solving it but you need some more advanced techniques to say what is not computable. If it is solvable, we will ask how complex is the problem.

## First model of computation: finite automata

A finite automata is a computer that has a state that can be changed by a user. The memory is limited to the state.

An example using a train gate would be that its natural states are open, closed, open and passable, open and impassable, (O, C, OP, OI), the actions are to insert, cross and wait (i,c,w)

![[Pasted image 20260120112826.png]]

The arrow that has no notation is the starting arrow which denotes the initial state, The double circle is the accepting state.

#### Sequence:

Just a collection of objects, usually written as a list. Finite sequences are called tuples. $k-$tuples are tuples of k length, and finally words or strings are just the sum of some alphabet $\sum$. The empty word is $\epsilon$ and every word in some alphabet is $\sum^{\star}$.

#### Problem -> language

Throughout the class we want to take some problem $X$ and encode it as something in the form $L_{X}$. Solving the problem boils down to checking the membership in the language $L_{X}$.

#### Deterministic automata

![[Pasted image 20260120113524.png]]

![[Pasted image 20260120113818.png]]

The question is what language is accepted by this automata? The answer is that it accepts any word with an even amount of b's. Formally:
![[Pasted image 20260120114311.png]]

This can be read like recursion as if it were haskell or some other related language.
$\hat{\delta}(q, \epsilon): = q$ is the base case, the next is the recursive case.

Any language is regular if there exists a definite finite automata (DFA) that accepts it.

## Example 1

Write a language such that: $$
L = \{ w \in \{ a,b \} | \text{number of a's is odd} \}
$$
Here we have $\sum=\{ a,b \}$.
![[Pasted image 20260120115150.png]]

## Example 2

$L = \{ w \in \{ a,b \}^{\star}| \text{w contains abb} \}$

![[Pasted image 20260120115801.png]]

## Example 3

![[Pasted image 20260120115857.png]]

Left as exercise.

# Closure properties

