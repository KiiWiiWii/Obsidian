Assignment of truth values is the valuation

It is v(A)

Meaning is compositional

Meaning of a formula is defined in terms of its parts

To work out meaning of ' P/\ Q ' :

- Work out meaning of P
- Work out meaning of Q
- Combine using meaning of /\

Leaves us with :

What is meaning of atom A?

What is meaning of connectives?

Ex :

v = {A : T, B : F, C : T} = {A : 1, B : 0, C : 1}

So, v(A) = T; v(B) = F; v(C) = T

--

v = {S : T, R : F} => It is sunny (v(S)=T). It is not raining (v(R) = F)

v = {S : F, R : T} => {It is not sunny ((v(S)=F) , It is raining ((v(R) = T)}

v = {S : T, R : T} => {its sunny , its raining} => {v(S)=T , v(R)=T}

Order doesn’t matter but only 1 v() per atom

Semantics is the meaning of formulas

|   |   |
|---|---|
|Formula|Is true when…|
|P /\ Q|Both P and Q|
|P \/ Q|At least one of P or Q is true|
|¬P|P is false|
|P -> Q|If P is true, then Q is true . Otherwise it is false. Max(¬p, q)|

Truth Assignment

[|P|]v

The truth value of P at the valuation v

|   |   |
|---|---|
|[\|A\|]v  =|v(A)|
|[\|P /\ Q\|]v =|[\|P\|]v /\ [\|Q\|]v|
|[\|P \/ Q\|]v =|[\|P\|]v \/ [\|Q\|]v|
|[\|¬P\|]v =|¬[\|P\|]v|
|[\| P -> Q \|] =|[\|P\|]v -> [\|Q\|]v|

Just gonna refer to [| P |] as [P] because [[ ]] doesn’t work

Ex:

(A \/ B) /\ ¬A with v = {A : F, B : T} :

[(A \/ B) /\ ¬A]v

= [A \/ B]v /\ [¬A]v

=([A]v \/ [B]v) /\ [¬A]v

=([A]v \/ [B]v) /\ ¬[A]v

=(v(A) \/ v(B)) /\ ¬v(A)

= (F \/ T) /\ (¬F)

= T /\ T

= T

The meaning is the collection of all valuations that make [P]v = T

The meaning of P is the set s.t. [P]v = T

Ex.

[(A \/ B) /\ ¬A] = {{A : F, B :T}}

Use truth tables to do this