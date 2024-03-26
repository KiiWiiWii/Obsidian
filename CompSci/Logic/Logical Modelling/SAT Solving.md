Given p  in CNF, find valuation v that makes it T and return SAT(v) or if none; return UNSAT

There are 2n results to find

CNF :

(¬a \/ ¬b \/ ¬c) /\

 (¬b \/ ¬c \/ ¬d ) /\

(¬a \/ ¬b \/ c ) /\


1. Entire formula is a conjuction: $C_{1} \wedge C_{2}  \wedge … \wedge C_{n}$
2. Each Clause $C_{i} = L_{i,1} \vee   L_{i,2} \vee  … \vee L_{i,k}$ 
3. each literal $L_{i,j} = x_{i.j}$  or $L_{i,j}= ¬x_{i,j}$

Each clause is a constraint and all constraints must be satisfied.

To convert to CNF :

- "Multiplying out"
- Tseytin transformation

¬(A/\B) == ¬A \/ ¬B

¬(A\/B) == ¬A /\ ¬B