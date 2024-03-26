Snake, Mouse, Parrot; we need to take at least one home

Consists of 3 Yes/No decisions:

1. Take or don’t take snake
2. Take or don’t take mouse
3. Take or don’t take parrot

i.e. atom snake ; atom mouse ; atom parrot

Wizards demand: snake | mouse | parrot

Constraints :

1. if take snake and mouse, snake will eat mouse

-> we don’t have snake or have the mouse : ¬s \/ ¬m

1. mouse will only be happy around parrot

m -> p ≡ ¬m \/ p