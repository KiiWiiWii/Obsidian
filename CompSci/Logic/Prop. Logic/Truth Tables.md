|     |     |      |     |            |
| --- | --- | ---- | --- | ---------- |
| A   | B   | A\/B | ¬A  | (A\/B)/\¬A |
| F   | F   | F    | T   | F          |
| F   | T   | T    | T   | T          |
| T   | F   | T    | F   | F          |
| T   | T   | T    | F   | F          |

Satisfiability

P is satisfiable if there exists at least one valuation v s.t. [P]v = T

(theres at least 1 row of the T.T that ends with T)

(the semantics of P has at least 1 valuation)

Validity

P is valid if for all valuations v, we have [P]v =T

(all rows end with T)

(semantics of P consist of all possible valuations)

A valid formula is also called a tautology

E.x. : sunny and rainy

(S \/ R) /\ ¬S

1. Satisfiable?

Yes. v = { S : F, R : T}

1. Valid?

No. v= {S : T, R : F } is a counterexample

((S \/ R) /\ ¬S) -> R

1. Satisfiable?

Yes. v= {S:T, R:F}

1. Valid?

Yes.

NB : valuation v makes formula P true, then it makes ¬P false

[P]v = T <=> [¬P]v = F

A formula P is valid when ¬P is not satisfiable

Proof:

P valid

<=> for all v, [P]v = T             by definition

<=> for all v, [¬P]v = F          by above observation

<=> for all v, not ([¬P]v = T)    T is not F

<=> does not exist v s.t. [¬P]v = T         "for all not" ≡ "not exists"

<=> ¬P not satisfiable         by definition