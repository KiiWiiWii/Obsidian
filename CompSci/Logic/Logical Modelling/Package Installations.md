Given collection of packages : {progA ; progB ; libC ; libD }

Each package has several versions : { progA1 , progA2, … }

Can only install 1 at a time

Packages have dependencies: progA1 depends on: libC1,libD2,

User wants packages installed

Key idea:

Each package/version pair is an atomic prop.

progA1, progA2, progA3, libC1, libC2

A valuation v represents a set of installed packages:

v(progA1) = T (progA1 is installed)

v(progA1) =  F (progA1 is not installed)

E.x. :

v = {progA1 : F, progB1 : F, … : F}  nothing is installed

v = {progA1 : T, progB1 : T, … : F} progA1, progB1 is installed but nothing else

v = {progA1 : T, libC1 : T, … : F} progA1, libC1 in installed and nothing else

v = {progA1 : T, progA2 : T, … : F} progA1 and progA2 are installed but we shouldn’t have 2 of the same program so we need constraints

Requirement: only one version of each package should be installed

for each package, p, and versions, i j, where i < j, we assume :

¬pi \/ ¬pj                    either we don’t have (p ver. i) or we don’t have (p ver. j)

i.e. To never install 2 version of progA:

¬progA1 \/ ¬progA2, ¬progA1 \/ ¬progA3, ¬progA2 \/ ¬progA3

|   |   |   |   |   |
|---|---|---|---|---|
|progA1|progA2|¬progA1|¬progA2|¬progA1 \/ ¬progA2|
|F|F|T|T|T|
|T|F|F|T|T|
|F|T|T|F|T|
|T|T|F|F|F|

for case 4, we don’t want both installed so can ignore

INCOMPAT: (¬progA1 \/ ¬progA2) /\ (¬progA1 \/ ¬progA3) /\ (¬progA2 \/ ¬progA3)

Requirement: Packages have dependencies:

progA1 depends on : libC1, libD2

progA2 depends on : libC2, libD2

i.e. :

progA1 -> (libC1 /\ libD2)

progA2 -> (libC2 /\ libD2)

for each package pi with dependency qj: pi -> qj

DEP: (progA1 -> libC1) /\ (progA1 -> libD1) /\ …

|   |   |   |
|---|---|---|
|progA1|libC1|progA1 -> libC1|
|f|f|f|
|t|f|f|
|f|t|t|
|t|t|t|

Now we have, ⟦INCOMPAT /\ DEP⟧v = T

then v is a sensible selection of packages