![[Pasted image 20251103160330.png]]

-- I will be doing the example halfway through since i missed the last lecture, missing out on finding the weak form for the equation --

Key difference: Boundary conditions.

$$
V = \{v \in C^{0}[0,1]\} \text{and v' is bounded and}
$$

For FEM< with knots $x_{0}=0,x_{1}, \dots,x_{n+1}=1$.

Unlike the last example,
$$
dim(V_{n}) = n + 2
$$
So the matrix is n+2 x n+2.

We computed $$
a_{00} = \int _{0}^{1}\phi_{0}^{1}\phi_{0}^{1} + \phi_{0}\phi_{0} \, dx  = \frac{1}{h} + \frac{h}{3}
$$
And now we will do

$$
a_{01}= a (\phi_{1}\phi_{0}) = \int _{} \, dx 
$$