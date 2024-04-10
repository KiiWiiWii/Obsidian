#### Random equivaleces
```vb
(¬(p \/ ¬q))/\T
≡ (¬p \/ ¬(¬q))/\T
≡ (¬p \/ q)/\T
≡ (¬p \/ q)
``` 

```vb
¬(p->q) ≡ ¬(¬p \/ q)
		≡ (¬¬p /\ ¬q) De Morgan
		≡ p/\¬q

p->q ≡ ¬q -> ¬p
¬p\/q ≡ q \/ ¬p
```
#### Modus
```vb
Modus Ponens
if p then q
p. 
Therefore, q.

P_1 <"logic argument"> 'P_1 for premise1'
P_2 <"if assumption"> true 'P_2 for premise2'
<"therefore conclusion"> true

Literally: make premises true then look at conclusion

variables | premises | conclusion
	p | q | p->q | p | q
	1 | 1 |  1   | 1 | 1


Modus Tollens
if p then q
¬q
Therefore, ¬p
```

#### Generalization, Specialization, Contradiction
```vb
"Generalisation"
p.
Therefore, p\/q

"Specialisation":
p/\q
therefore, p

"Contradiction"
¬p -> c '¬¬p \/ c, i.e. p\/c, C never true, => p is true'
therefore, p

```

#### Validity
```vb
if "im skilled at poker", then "i will win"
"I won money playing poker"
"therefore, Im skilled at poker"

"if p then q" p -> q
q.
Therefore, p.

Using converse of statement, i.e. invalid
```
```vb
A "valid" argument follows logically from its premises, regardless of whether the premises are true or not
	p1 | All demons like peas 
	p2 | Laharl is a demon
	------------------
	C  | |- Laharl likes peas
	.
	p1 | d -> p
	p2 | d.
	-----------
	c  | |- p
A "sound" argument is valid AND the premises are true
	p1 | all squares are shapes 'True'
	p2 | all shapes can be drawn 'True'
	-----------------------------
	c  | |- all squares can be drawn
	.
	p1 | sq -> sh
	p2 | sh.
	----------------
	c  | |- sq
```
```vb
Suppose:
	p1 | a
	p2 | a->b
	----------
	c  | |- b

if argument is valid, (a/\(a->b))->b is Taut
i.e., a and (a->b) "entails" b
truth table
	(a  /\  (a -> b))  ->  b
	 1   1   1 1  1    1   1
	 1   0   1 0  0    1   0
	 0   0   0 1  1    1   1
	 0   0   0 1  0    1   0
				   | taut |   as required
	therefore valid

Show that following is valid:
	p1 | a->b
	p2 | ¬b -> a
	p3 | b
	---------------
	c  | |- B \/ ¬a

b -> (b \/ ¬a)
(¬b -> a) -> (b->(b\/¬a))
(a->b)->(¬b->a)->(b->(b\/¬a)) should be tautology

t.t
	variables and premises         | conclusion
	a | b | ¬a | ¬b | a->b | ¬b->a | b \/ ¬a
	1 | 1 | 0  |  0 |  1   |   1   |   1
	1 | 0 | 0  |  1 |  0   |   1   |   0
	0 | 1 | 1  |  0 |  1   |   1   |   1
	0 | 0 | 1  |  1 |  1   |   0   |   1
	.
	(a->b) | -> | (¬b->a) | -> | (b->(b\/¬a))
	  1    | 1  |    1    |  1 |     1
	  0    | 1  |    1    |  1 |     1
	  1    | 1  |    1    |  1 |     1
	  1    | 1  |    0    |  1 |     1
		   | T  | i.e. valid
```
```vb
Partial Truth Tables

show:
	1:
		p1 | p->(q->r)
		------------------------
		c  | |- (p->q)->(p->r)
	2:
		p1 | p\/q
		p2 | ¬q
		-----------------
		c  | ¬p

ans:
	1:
		w
	2:
		w

Check for Tautologies (show impossible to construct a row that is false)

Ex:
	(p /\ (p->q)) -> q
		.
		declare -> to be 0
		0 only when 1->0 i.e. q=0
		since 1->0 then the LHS must be 1 i.e. /\ =1
	(p /\ (p->q)) -> q
	   1          0  0
		.
		/\ = 1 when 1 /\ 1
		i.e. p = 1, (p->q) = 1
	(p /\ (p -> q)) -> q
	1  1      1     0  0
		p = 1 from last step, q=0 from first step
	(p /\ (p -> q)) -> q
	1  1   1  1 0   0  0
	
	however 1->0 doesnt give 1 i.e. contradiction
	impossible for row to be false
	therefore every row must be true
	i.e. tautology and thus valid

Ex:
	((p -> q) /\  ¬q)  ->  ¬ p
					   0
		->=0 when 1->0 i.e.
	((p -> q) /\  ¬q)  -> ¬ p
	          1         0 0  
		rhs = 0 when ¬p = 0 => p = 1
		lhs = 1 when 1/\1 i.e. -> 1 , ¬q = 1
	((p -> q) /\  ¬ q) -> ¬ p
	     1    1   1    0  0 1
		.
		¬q = 1 when q=0
		know p = 1 from step 2
		know q = 0 now
		i.e.
	((p -> q) /\ ¬ q) -> ¬ p
	 1   1 0  1  1 0  0  0 1
	 .
	 However p->q cant be 1 when 1->0 i.e. contradiction
	 impossible for row to be false
	 therefore every row is true
	 i.e. tauotology and thus valid
```
```vb
To check for contradictions, show that it is impossible to construct a row that is true

Ex:
	p /\ ¬p
		Assume /\ = 1
	  1
		for /\=1 => 1 /\ 1
	p /\ ¬p
	1 1  1
		for ¬p = 1, p = 0
	p /\ ¬p
	1 1  10
	.
	but p != 1 and 0 at the same time, i.e. contradiction
Ex:
	¬ (p -> (q -> p))
		Assume ¬ = 1
	1
		for ¬=1 then p->(q->p) = 0
	¬ (p -> (q -> p))
	1     0
		for ->=0 then 1->0
	¬ (p -> (q -> p))
	1  1  0    0
		for -> =0 then 1->0
	¬ (p -> (q -> p))
	1  1  0  1  0 0
	.
	but p cant be 1 and 0 at same time, i.e. contradiction
	
```

#### CNF, DNF
```vb
DNF
x_ for not x
given:
x , y , z | F
0   0   0 | 0
0   0   1 | 0
0   1   0 | 1
0   1   1 | 1
1   0   0 | 0 
1   0   1 | 1
1   1   0 | 0
1   1   1 | 1
find formula where F=1, and F=0
F=1:
	focus on rows when F=1
	x , y , z | F
	0   1   0 | 1
	0   1   1 | 1
	1   0   1 | 1
	1   1   1 | 1
	.
	a | x_yz_ +
	b | x_yz +
	c | xy_z +
	d | xyz
	"F is true when a or b or c or d is true"
	i.e. 
	(¬x/\y/\¬z) \/
	(¬x/\y/\z) \/
	(x/\¬y/\z) \/
	(x/\y/\z)


CNF 
"Find the DNF for F=0 then flip all \/ /\ and negate literals"
F=0
	focus on rows where F=0
	.
	x , y , z | F
	0   0   0 | 0
	0   0   1 | 0
	1   0   0 | 0
	1   1   0 | 0
	.
	a | x_y_z_ +
	b | x_y_z +
	c | xy_z_ +
	d | x_y_z
	"F is false when a or b or c or d is false"
	.
	i.e.
	(¬x /\ ¬y /\ ¬z)\/
	(¬x /\ ¬y /\ z) \/
	(x /\ ¬y /\ ¬z) \/
	(¬x /\ ¬y /\ z)

"flip all \/ and /\ and negate all literals"
	(x \/ y \/ z) /\
	(x \/ y \/ ¬z) /\
	(¬x \/ y \/ z) /\
	(x \/ y \/ ¬z)

```
#### Satisfiability
```vb
Recall:
	Tautology: always true
	Contradiction: always false
	Contingency: sometimes true sometimes false

I.e. compound-proposition is "satisfiable" when theres AT LEAST 1 TRUE RESULT in the truth table
	exists at least one valuation s.t. v(P) = T

=> "Unsatisfiability" means theres no single TRUE result i.e. contradiction

Valid: when its a tautology
	for all v(P) = T
Invalid: when not a tautology (contingent or contradiction)
```
#### Predicates
```vb
P(x): x is a factor of 12 with domain Z+
P(6): positive int. and 6 factor of 12 i.e. True
P(5): pos. int. not factor of 12 i.e. False
P(1/3): neither true or false, 1/3 not pos int.


Truth Set 'all values of domain where P(x) true'
{x elof D | P(x)}
all vals of x in dom. s.t. P(x) is true
TS = {1,2,3,4,6,12}

False Set 'all values of domain where P(x) false'
{x elof D | ¬P(x)}
FS = Z+ \ {1,2,3,4,6,12}
```
```vb
forall x elof D, P(x)
forall x in domain, P(x) is true

"every dog is a mammal"
	domain = Dogs
	P(x) : x is mammal
	forall x elof Dog : P(x)

exists x elof D, P(x) "at least one thing in domain where property is true"
there exists x in domain, s.t. P(x) is true

"some person is the oldest in the world"
	domain = people in world (P_w)
	P(x) : x is oldest
	exists x elof P_w : P(x)
```
```vb
Differences between logic statements and predicates

Statement
	P:"Roofus is a mammal" 
Predicate
	P(x):"x is a mammal"
	Has an input

Putting quantifier returns it into a statement
	Statement
		Q : forall x elof D, P(x): "every dog is a mammal"
```
```vb
Negating Quantifiers

forall x elof Z+, x > 3
1,2,3 are counterexamples
i.e. exists x elof Z+, x !> 3

¬(forall x elof D, P(x) ≡ exists x elof D, ¬P(x)

Negative "Someone in our class is taller than 7 feet"
¬(exists p in Class, s.t. T_7(p))
forall p in Class s.t. ¬T_7(p

¬(exists x elof D, P(x)) ≡ forall x elof D, ¬P(x)
```
```vb
Negating MULTIPLE Quantifiers

"Every integer has a larger integer"
{forall i_1, exists i_2 } elof Z, s.t. i_1 < i_2
forall x elof Z, exists y elof Z, s.t. y>x

True : choose y = x + 1 (elof Z)


Negate: "there doesnt exist an integer larger than another" ≡ "some number in Z is the largest"
exists x elof Z, ¬P(x)
=> exists x elof Z, forall y elof Z, s.t. y<=x
```
```vb
universal-conditionals: P(x) -> Q(x)
means forall x elof D, P(x) -> Q(x)

"is x is the POTUS, then x is a US Citizen"
	P(x) = x is the POTUS
	Q(x) = x is a US citizen
	D = people
"every POTUS is a US citizen"
```
```vb
Necessary and Sufficient Conditions

"if x is a square, then x is a rectangle"
	if A(x), then B(x)
A(x) is a sufficient condition for B(x)
```
#### Entailment
We have $n$ assumptions, $P_{1},..., P_{n}$ and conclusion $Q$

Going to say: $P_{1},...,P_{n} \models Q$ 

If:
	$\forall$ valuations
	that make **all** assumptions $P_i$ true
	then conclusion $Q$ true

or: $\forall v$ if, $\forall i$ $[\![ P_{i}]\!]v = T$ , then $[\![Q]\!]v = T$        

#### Package Install
1) Each package/version pair is an atomic prop.

$$progA_1,progA_2,progA_3,libC_1,libC_2,...$$
2) Valuate v represents a set of installed packages:
		$v(progA_{1)}= T$ means $progA_1$ is installed
		$v(progA_{1)}= F$ means $progA_1$ is not installed 

e.g. : $v = \{progA_{1}: F, progB_{1}: F, ....: F\}$ Nothing is installed
$v = \{progA_{1} : T,progB_{1}: T, ... : F\}$ prog$A_1$ and prog$B_1$ are installed and nothing else

**Requirement:** only 1 version of each package may be installed

i.e. for each package $p$ and versions $i,j$ where $i < j$, we assume:
$$ ¬p_{i}\vee¬p_j$$ 

| prog$A_1$ | prog$A_2$ | ¬prog$A_1$ | ¬prog$A_2$ | ¬prog$A_1$$\vee$¬prog$A_2$ |
| --------- | --------- | ---------- | ---------- | -------------------------- |
| 0         | 0         | 1          | 1          | 1                          |
| 1         | 0         | 0          | 1          | 1                          |
| 0         | 1         | 1          | 0          | 1                          |
| 1         | 1         | 0          | 0          | 0                          |
True when only 1 package installed

Now compile the constraints:
$$\text{INCOMPAT} = (¬\text{prog}A_1 \vee ¬\text{prog}A_2) \wedge(¬\text{prog}A_1\vee¬\text{prog}A_3)\wedge...$$
Before: all valuations (installations) v were able to be considered
Now: only valuations s.t. $[\![\text{INCOMPAT}]\!]v=T$ 
	this removes all nonsense valuations

**Requirement**: Packages have dependencies:
$$\begin{align} 
\text{prog}A_1 \ \ \ \text{  depends:  }  \ \ \ \text{lib}C_1,\text{lib}D_2 \\
\text{prog}A_2 \ \ \ \text{  depends:  } \ \ \ \text{lib}C_2, \text{lib}D_2
\end{align}$$
as formulas:
$$\begin{align} 
\text{prog}A_1 \rightarrow (\text{lib}C_1 \wedge \text{lib}D_2) \\
\text{prog}A_2 \rightarrow (\text{lib}C_2 \wedge \text{lib}D_2)
\end{align}$$

Constraint:

i.e. each package-version $p_i$ with dependency $q_j$ : $p_{i}\rightarrow q_j$ 
Compile as $\text{DEP}$:
$$\text{DEP} = (\text{prog}A_1 \rightarrow \text{lib}C_1) \wedge (\text{prog}A_1 \rightarrow \text{lib}D_1) \wedge ...$$ 

| prog$A_1$ | lib$C_1$ | prog$A_1$ -> lib$C_1$ |
| --------- | -------- | --------------------- |
| 0         | 0        | 1                     |
| 1         | 0        | 0                     |
| 0         | 1        | 1                     |
| 1         | 1        | 1                     |
program without library is false

i.e. now:
$$[\![\text{INCOMPAT}\wedge\text{DEP}]\!]v = T$$
exactly when the valuation $v$ is sensible selection of packages

i.e. Satisfiability
```vb
1) if formula INCOMPAT/\DEP
	is satisfiable, then there is at least 1 possible installation
2) if formula INCOMPAT/\DEP/\progA1
	is satisfiable then progA1 is installable (with dep.)
3) if INCOMPAT/\DEP/\(progA1 \/  progA2 \/ progA3)
	is satisfiable then some version of progA is installable
```

#### SAT Solving
Given formula P in CNF, find valuation $v$ that makes it T and return SAT(v) or return UNSAT if none


Partial Valuation $v^?$ is a
	sequence of assignments to atoms; with each one marked
		1) decision point, if we guessed the value.
		2) forced, if we were forced to have this value
e.g. : $$\begin{align}
v^?_{1} = [a :_{d} T , b :_{d} F, c :_{f} T] \\
v^?_{2} = [a :_{f} F, b :_{d} F]
\end{align} $$
**Order** matters

$$\text{decisionfree}(\text{v}^?)$$ if none of the assignments are marked $d$ (theyre all forced)



**Steps**
1. Start with *empty partial valuation* v$^?$ = $[ \ ]$ 
2. Guess by making an atom $a$ true or false
	 v$^?$, $a :_{d} T$  or v$^?$, $a :_{d} F$ 
3.  If v$^?$ makes all clauses true ($\forall i$ $[\![C_i]\!]$v$^?$ = T) then stop with SAT(v$^?$)

Example
$$
(¬a \vee ¬b \vee ¬c) \wedge (¬b \vee ¬c \vee ¬d) \wedge (¬a \vee ¬b \vee c) \wedge b
$$
v$^?$ = []
1. Guess $a$ is False
v$^?$ = $[a :_{d}F]$ 
2. Guess $b$ is True (since its by itself)
v$^?$ = $[a :_{d} F , b :_{d}T]$ 
3. Guess c is False
v$^?$ = $[a :_{d}F, b :_{d}T, c :_{d}F]$ 
4. Then d doesnt actually matter so pick False 
v$^?$ = $[a :_{d}F, b :_{d}T, c :_{d}F, d :_{d}F]$ 
a satisfying valuation


Add backtracking :
if a guess valuation didnt work, go back and change it to the opposite and write it as $:_f$ since youre forced to swap to make it work

If all decisions are forced then there's at least one clause C$_i$ s.t. $[\![C]\!]$v$^?$ = F, return UNSAT

Example
$$
(¬a \vee ¬b \vee ¬c) \wedge (¬b \vee ¬c \vee ¬d) \wedge (¬a \vee ¬b \vee c) \wedge b
$$
v$^?$ = []
1. Try true first and in alphabetical
$[a :_{d}T]$ 
$[a :_{d}T, b :_{d}T]$ 
$[a :_{d}T, b :_{d}T, c :_{d} T]$
2. But this makes the Clause1 fail, so gotta backtrack
$[a :_{d}T, b :_{d}T, c :_{f} F]$
3. But now Clause3 failed, so backtrack
$[a :_{d}T, b :_{f}F]$
4. But now Clause4 failed, so backtrack
$[a :_{f}F]$ 
$[a :_{f}F, b :_{d}T]$  
$[a :_{f}F, b :_{d}T, c :_{d}T]$  
$[a :_{f}F, b :_{d}T, c :_{d}T, d :_{d}T]$
5. Clause2 failed, backtrack
$[a :_{f}F, b :_{d}T, c :_{d}T, d :_{f}F]$
6. SAT
https://youtu.be/54uXgP0kEjg




#### Converting to CNF
Remember:
$$ \begin{align}
&(¬a \vee ¬b \vee ¬c)  \\
\wedge\ 
&(¬b \vee ¬c \vee ¬d) \\
\wedge \ 
&(¬a \vee ¬b \vee c) \\
\wedge \ 
&b
\end{align}
$$
(ors) connected by ANDs

CNF:
	Each clause (the ors) is a *constraint* and all constraints must be satisfied

To convert:
1. "Multiplying out"
2. Tseytin transform

Equivalence:
$$P \equiv Q$$ when $\forall$v, $$ [\![P]\!]\text{v} = [\![Q]\!]\text{v}$$
equivalent to both (P $\models$ Q and Q $\models$ P being valid (p->q, q->p are tautologies)

Simplifying implication
$$ A \rightarrow B \equiv ¬A \vee B$$
```vb
valuation |  | P  |  Q
A  ,  B   |¬A|A->B|¬A\/B
----------+--+----+-------
0     0   |1 | 1  |  1
0     1   |1 | 1  |  1
1     0   |0 | 0  |  0
1     1   |0 | 1  |  1
```
Double Negation
$$ A \equiv ¬¬A$$
```vb
valuation |   | P |  Q
   A      |¬A | A | ¬¬A
----------+---+---+-----
   0      | 1 | 0 | 0
   1      | 0 | 1 | 1
```
De Morgan's Laws
Negation swaps $\vee$ and $\wedge$:
$$\begin{align}
&&¬(A \wedge B) \equiv ¬A \vee ¬B \\
\text{and} 
&&¬(A \vee B) \equiv ¬A \wedge ¬B 
\end{align}$$
Break brackets and flip sign
```vb
valuation |              | P      | Q
A   ,  B  | ¬A ¬B   A/\B | ¬(A/\B)|¬A\/¬B
----------+--------------+--------+--------
0      0  | 1   1    0   |    1   |   1
0      1  | 1   0    0   |    1   |   1
1      0  | 0   1    0   |    1   |   1
1      1  | 0   0    1   |    0   |   0
```

Example
$$\begin{align}
&(a \wedge ( a \to b)) \to c \\
\equiv \ & ¬(a \wedge(a\to b)) \vee c \ \ \text{converted}\to \\
\equiv \ & ¬(a \wedge (¬a \vee b)) \vee c \ \ \text{converted}\to \\
\equiv \ &¬a \vee ¬(¬a \vee b) \vee c \ \ \text{converted}\wedge to \vee  \\
\equiv \ &¬a \vee (¬¬a \wedge ¬b) \vee c \ \ \text{converted}\vee to \wedge \\
\equiv \ &¬a \vee (a \wedge ¬b) \vee c \ \ \text{converted double negation}
\end{align}
$$
now is in NNF but not CNF


"Push" $\vee$s into $\wedge$s
$$
A \vee (B \wedge C) \equiv (A \vee B) \wedge (A \vee C)
$$
break brackets basically
i.e.
$$
\begin{align}
¬a \vee (a \wedge ¬b) \vee c  \\
\equiv \text{multiply out} \\
¬a \vee ((a\vee c) \wedge (¬b \vee c)) \\
\equiv \text{multiply out}  \\
(¬a \vee a \vee c) \wedge (¬a \vee ¬b \vee c)
\end{align}
$$
Now its CNF
Can also simplify to $(¬a \vee ¬b \vee c)$ 

However can explode in terms


Tseytin Transformation
important to remember:
$$
p \leftrightarrow  (q \vee r) \equiv (p \to (q \vee r)) \wedge ((q \vee r) \to p)
$$
*'introducing new boolean variables to substitute parts into the main formula*
*Linear transformation of abrtr prop formula to CNF, perserving satisfiability*

Key Idea:
	Dont find formula that is logically equivalent
	Add extra variables as subformulae
	.
	for small formula then small cnf is logically equiv.

For every subformala $\psi$ we define:
- $n_{\psi}$ = $\psi$ if $\psi$ is a literal (if $\psi$ is a literal then the subformula is just itself)
- $n_{\psi}$ = the name of $\psi$ 

So the CNF consists of
- $n_{\phi}$ where $\phi$ is the formula *(the name of the whole formula)*
- cnf(q <-> ¬$n_{\psi}$) for every non-literal subformula of the shape ¬$\psi$ having name $q$  
- cnf(q <-> ($n_{\psi_{1}} <> n_{\psi_{2}}$)) for every sub formula of the shape $\psi_{1} <> \psi_{2}$ having name q

EX $\phi$:
$$
(¬s \wedge p) \leftrightarrow  ((q \to r) \vee ¬p)
$$
Subformulae:
$$
\begin{align}
&B : (¬S \wedge p) \leftrightarrow  \\
&C : ((q \to r) \vee ¬p) \\
&D : (q \to r)
\end{align}
$$
i.e.
name of whole formula $n_{\phi}$ 
$\wedge$
cnf($n_{\phi}$ <-> (B <-> C))
$\wedge$
cnf(B <-> (¬s $\wedge$ p))
$\wedge$
cnf(C <-> (D $\vee$ ¬p)) 
$\wedge$
cnf(D <-> (q->r))


$$O = (¬I_{1} \vee I_{2}) \wedge (¬I_{2} \vee I_{1})$$
$$
\begin{align}
&1. : O = x_{1} \wedge x_{2}\\
&2. : x_{1} = x_{3} \vee I_{2} \\
&3. : x_{3} = ¬I_{1} \\
&4. : x_{2} = x_{4} \vee I_{1} \\
&5. : x_{4} = ¬I_{2} \\
\end{align}
$$
In 1. :
$$ 
	\begin{align}
&O = x_{1} \wedge x_{2} \\
&\implies x_{1}=(¬I_{1} \vee I_{2}) \ \text{ and } \ x_{2}=(¬I_{2} \vee I_{1})
\end{align}$$

$x_{1}$ has subformula : $¬I_{1}$ 
$$
x_{1} = x_{3} \vee I_{2}
\implies x_{3} = ¬I_{1}
$$
$x_{2}$ has subformula: $¬I_2$
$$
x_{2} = x_{4} \vee I_{1} \implies x_{4} = ¬I_{2}
$$


Roberts Notes:

1. Convert formula into equations
2. Convert each equation into clauses
Not equivalent but equisatisfiable

1. Name Subformulas
Ex:
$$
¬(a \wedge (¬a \vee b)) \vee c
$$
becomes:
1. Top level formula: $x_1 = x_{2} \vee c$ 
2. Then break down top level formula: $x_{2} = ¬x_{3}$
3. Then break *that* down: $x_{3} = a \wedge x_{4}$
	1. a is an atom/literal so leave it in
4. Break down further: $x_{4} = x_{5} \vee b$
	1. b is an atom
5. Break down further: $x_{5} = ¬a$

Leaves a system of equations $$\vec{x}=\begin{bmatrix}
x_{1} = x_{2} \vee c \\
x_{2} = ¬x_{3}\\
x_{3} = a \wedge x_{4}\\
x_{4} = x_{5} \vee b\\
x_{5} = ¬a
\end{bmatrix}$$

2. Converting Equations to Clauses

given : $x = y \wedge z$ , we want clauses that are true $\forall$ valuations that satisfy equation
Derive by conversion to CNF:
$$\begin{align}


& \ \ \ \ \ \ x = y \wedge z \\
&\equiv (x \to (y \wedge z)) \wedge ((y\wedge z) \to x) \\
&\equiv (¬x \vee (y \wedge z)) \wedge (¬(y \wedge z) \vee x) \\
&\equiv (¬x \vee y) \wedge (¬x \vee z) \wedge (¬y \vee ¬z \vee x)
\end{align}
$$
In this notation $x = y \wedge z \ \ \text{ is } \ \ x \leftrightarrow x \wedge z$ 

i.e.:
1. If $x = y \wedge z$, add
$$(¬x \vee y) \wedge (¬x \vee z) \wedge(¬y \vee ¬z \vee x)$$
2. If $x = y \vee z$, add
$$(y \vee z \vee ¬x) \wedge (¬y \vee x) \wedge (¬z \vee x)$$
3. If $x = ¬y$, add
$$(¬y \vee ¬x) \wedge (y \vee x) $$
Can derive all these by doing $x \leftrightarrow y <> z$ 

3. Assert the to level variable
If $x$ is the name of whole formula, add a clause with just x:
$$\begin{align} \\
&equ^n 1 \\
\wedge \  &equ^n 2  \\
\wedge \ & \dots \\
\wedge \ &x
\end{align}$$

Ex: $$¬(A \wedge B) \vee (B \wedge A)$$
Subformula: 
$$
\begin{align}
x_{1} = x_{2} \vee x_{3} \\
x_{2} = ¬x_{4} \\
x_{3} = B \wedge A \\
x_{4} = A \wedge B
\end{align}
$$
$$\begin{align}
&x_{1} \leftrightarrow  (x_{2} \vee x_{3}) \equiv \\
&(x_{1}\to (x_{2} \vee x_{3})) \wedge((x_{2}\vee x_{3}) \to x_{1}) \equiv \\
&(¬x_{1} \vee(x_{2} \vee x_{3})) \wedge(¬(x_{2} \vee x_{3}) \vee x_{1}) \equiv  \\
&(¬x_{1} \vee x_{2} \vee x_{3}) \wedge ((¬x_{2} \wedge ¬x_{3}) \vee x_{1}) \equiv  \\ \\

&(¬x_{1} \vee x_{2} \vee x_{3}) \wedge (¬x_{2} \vee x_{1}) \wedge(¬x_{3} \vee x_{1}) : [1]

\end{align} 
$$
$$ 
\begin{align}
& x_{2} \leftrightarrow  ¬x_{4} \equiv \\
&(x_{2}\to ¬x_{4}) \wedge (¬x_{4} \to x_{2}) \equiv  \\
&(¬x_{2} \vee ¬x_{4}) \wedge (¬¬x_{4} \vee x_{2} ) \equiv  \\ \\

&(¬x_{2} \vee ¬x_{4}) \wedge (x_{4} \vee x_{2})  : [2]
\end{align}$$
$$\begin{align}
&x_{3} \leftrightarrow  B \wedge A \\
&(x_{3} \to (B\wedge A) \wedge((B\wedge A) \to x_{3}) \equiv  \\
&(¬x_{3} \vee (B\wedge A)) \wedge (¬(B \wedge A) \vee x_{3}) \equiv  \\
&((¬x_{3} \vee B) \wedge (¬x_{3} \vee A)) \wedge ((¬B \vee ¬A \vee x_{3})) \equiv  \\ \\

&(¬x_{3} \vee B) \wedge (¬x_{3} \vee A) \wedge (¬B \vee ¬A \vee x_{3}) : [3]
\end{align}
$$
$$\begin{align}
&x_{4} \leftrightarrow  A\wedge B \equiv  \\
&(x_{4} \to (A \wedge B)) \wedge ((A \wedge B) \to x_{4}) \equiv   \\
&(¬x_{4} \vee (A \wedge B)) \wedge (¬(A \wedge B) \vee x_{4}) \equiv  \\ \\

&(¬x_{4} \vee A) \wedge (¬x_{4} \vee B)  \wedge (¬A \vee ¬B \vee x_{4}) : [4]
\end{align}
$$
i.e. With all clauses:
CNF :
$$
[1] \wedge [2] \wedge [3] \wedge [4] \wedge x_{1}
$$
$$ \begin{align}
&\ \ \ \  (¬x_{1} \vee x_{2} \vee x_{3}) \wedge (¬x_{2} \vee x_{1}) \wedge(¬x_{3} \vee x_{1})  \\
&\wedge (¬x_{2} \vee ¬x_{4}) \wedge (x_{4} \vee x_{2}) \\
&\wedge (¬x_{3} \vee B) \wedge (¬x_{3} \vee A) \wedge (¬B \vee ¬A \vee x_{3}) \\
&\wedge (¬x_{4} \vee A) \wedge (¬x_{4} \vee B)  \wedge (¬A \vee ¬B \vee x_{4}) \\
&\wedge x_{1}
\end{align}
$$
A lot of working but its actually pretty straight forward
Just remember
$p \to q \equiv ¬p \vee q$ and $p \leftrightarrow q \equiv (p\to q) \wedge (q \to p)$ and deMorgan rules for most cases

#### Deductive Systems
Collection of rules for deriving conclusions from assumptions
$$
P_{1}, \dots, P_{n} \vdash Q
$$
when we can derive conc. Q from asumptions $P_1, .. P_n$

Soundness: "Everything that is provable is valid"
$$
P_{1} , \dots , P_{n} \vdash Q  \ \ \ \ \ \text{implies} \ \ \ \ \ P_{1}, \dots, P_{n} \vDash Q 
$$
Completeness: "Everything that is valid is provable"
$$
P_{1} , \dots , P_{n} \vDash Q  \ \ \ \ \ \text{implies} \ \ \ \ \ P_{1}, \dots, P_{n} \vdash Q 
$$
*valid: if the conclusion is true regardless of assumptions
soundness: valid + the assumptions are true
completeness: if the conclusion is true then we can prove why*

$$
\begin{prooftree}
\AxiomC{$\text{premise}_{1}$ $\ \ \ \ \dots \ \ \ \ $ $\text{premise}_{2}$}
\UnaryInfC{$\text{conclusion}$}
\end{prooftree}
$$
If no premises then its an axiom

Ex:
$$
\text{Rule 1  }
\begin{prooftree}
\AxiomC{}
\UnaryInfC{$\text{bears are furry}$}
\end{prooftree}
$$
$$\text{Rule 2 } 
\begin{prooftree}
\AxiomC{}
\UnaryInfC{$\text{bears make milk}$}
\end{prooftree} $$
$$
\text{Rule 3 }
\begin{prooftree}
\AxiomC{X are furry}
\AxiomC{X make milk}
\BinaryInfC{X are mammals}
\end{prooftree}
$$
Deduction:
$$
\begin{prooftree}
\AxiomC{}
\RightLabel{Rule 1}\UnaryInfC{bears are furry}
\AxiomC{}
\RightLabel{Rule 2}\UnaryInfC{bears make milk}
\RightLabel{Rule 3}\BinaryInfC{bears are mammals}
\end{prooftree}
$$
Ex (cont.):
$$
\begin{prooftree}
\RightLabel{Rule 4}\AxiomC{X are covered in fibres}
\UnaryInfC{X are furry}
\end{prooftree}
\text{ } \ \ \
\begin{prooftree}
\AxiomC{}
\RightLabel{Rule 5}
\UnaryInfC{coconuts are covered in fibres}
\end{prooftree}
\text{ } \ \ \ 
\begin{prooftree}
\AxiomC{}
\RightLabel{Rule 6}
\UnaryInfC{coconuts make milk}
\end{prooftree}
$$

Deduction:
$$
\begin{prooftree}
\AxiomC{}
\RightLabel{R5}\UnaryInfC{coconuts are covered in fibres}
\RightLabel{R4}\UnaryInfC{coconuts are furry}
\AxiomC{}
\RightLabel{R6}\UnaryInfC{coconuts make milk}
\RightLabel{R3}\BinaryInfC{coconuts are mammals}
\end{prooftree}
$$

Always work bottom up 
1. Write conclusion
2. Apply rule 3
3. Apply rule 4
4. Apply rule 5 (axiom)
5. Apply rule 6 (axiom)


#### Robert: Predicate Logic
Think of it in 2 layers
1. terms:
	1. x, socrates, dayAfter(), 2x+3y
2. formulas:
	1. $\exists$x, P(x)
"All humans are mortal"
$$\forall x. \text{human}(x) \to \text{mortal}(x) $$
"x is a P" : $P(x)$
"x, y are related by R" : $R(x,y)$
"everything is P" : $\forall x. boring(x)$
"there exists a P": $\exists x. human(x)$
"all P are Q": $\forall x. P(x) \to Q(x)$
"some P is Q": $\exists x. P(x) \wedge Q(x)$
"No P is Q": $¬(\exists x.P(x) \wedge Q(x)) \ \ or \ \ \forall x. P(x) \to ¬Q(x)$

Proof Rules:

to prove $\forall$ then pick $x = x_{0}$ for a general $x_{0}$ and $x_{0}$ is a standin for any 
