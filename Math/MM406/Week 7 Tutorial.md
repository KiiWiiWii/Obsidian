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
a_{01}= a (\phi_{1}\phi_{0}) = \int _{0}^{1}\phi_{1}^{1}\phi_{0}^{1}+ \phi_{1}\phi_{0} \, dx 
$$
$$
=\int _{0}^{x_{1}}\phi_{1}^{1}\phi_{0}^{1} \, dx + \int _{0}^{x_{1}} \phi_{1}\phi_{0} \, dx  
$$
$$
=\int _{0}^{x_{1}}\left( \frac{1}{h} \right)\times \frac{-1}{h} \, dx  + \int _{0}^{x_{1}}\phi_{1}\phi_{0} \, dx 
$$
$$
= -\frac{1}{h^{2}} \int_{0}^{h}1 \, dx  + \int _{0}^{x_{1}}\phi_{1}\phi_{0} \, dx
$$
Now then, to integrate $\phi_{0}\phi_{1}$, we know its a quadratic, so by Simpsons rule we can do this:

$$
\int _{0}^{x_{1}} \phi_{0}\phi_{1} \, dx = \frac{x_{1}-0}{6}(\cancel{ \phi_{0}(0)\phi_{1}(1) }) + 4\phi_{0}\left( \frac{x_{1}}{2} \right)\phi_{1}\left( \frac{x}{2} \right) + \cancel{ \phi_{0}(x_{1})\phi_{1}(x_{1} })
$$

The remainder of these terms are $-\frac{1}{2}$ and $\frac{1}{2}$

$$
=\frac{h}{6} \left( 0 + 4 \times \frac{1}{4} + 0  \right) = \frac{h}{6}
$$
And then we get 
$$
\boxed{a_{01} = - \frac{1}{h} + \frac{h}{6}}
$$


Now let $1 \in [1,..,a]$ then

$$
a_{i,i-1} = a ( \phi_{i+1}, \phi_{1}) = \int _{0}^{1}\phi _{i-1}' \phi _{i}' + \phi _{i-1} \phi _{i} \, dx 
$$
$$
= \int _{x_{i-_{1}}}^{x_{i}} \phi _{i-} \, dx 
$$

---

