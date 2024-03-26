(a \/ b) /\ (¬a \/  ¬b)

|   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|
|a|b|a\/b|¬a|¬b|¬a\/¬b|(a\/b)/\(¬a\/¬b)|
|1|0|1|0|1|1|1|
|0|1|1|1|0|1|1|

```

atom a

atom b

define my_constraints {

(a | b) &         // (a\/b)   /\

(~a | ~b)        // (¬a\/¬b )

}

allsat (my_constraints)

{ "a" : a, "b" : b}           //creates 2 fields "a" storing atom a; "b" storing atom b

```

Logical constraints:

1.  a or b must be true
2. at most, a or b must be true ("at least one is false")