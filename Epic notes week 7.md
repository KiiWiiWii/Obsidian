# Second order PDE's

![[Pasted image 20241104101509.png]]

Using the discriminant $B^{2} - 4AC$ we can find the type of equation the PDE is. when it is $> 0$, we get a hyperbolic equation. An example of this is the wave equation $\frac{\partial^2 u}{\partial t^2} - c^{2} \frac{\partial^2 u}{\partial x^2} ={0}$

When it is $= 0$ we get a parabolic equation. An example of this is $\frac{\partial u}{\partial t} - k\frac{\partial^2 u}{\partial x^2} = 0$.

Finally when it is $<0$ we get a elliptic equation. An example of this is Laplace's fuck ass equation. $\frac{\partial^2 u}{\partial x^2} + \frac{\partial^2 u}{\partial y^2}$.

	We will see how these work in example 6.1

In this lecture we're going over how to solve only the wave equation.

Note that the coefficients do not need to be constant in a PDE.

# Example 6.1

Determine the regions where the Tricomi equation $$
\frac{\partial^2 u}{\partial x^2} + x\frac{\partial^2 u}{\partial y^2} = 0
$$
is hyperbolic, parabolic or elliptic.

We have that $A = 1$, $B = 0$, $C=x$, so the discriminant is $$
B^{2} - 4AC = -4x
$$
Hence the equation is hyperbolic if $x < 0$, parabolic if $>0$ and elliptic at $x=0$.

---

# Derivation of the wave equation.

Think about an elastic string, with some tension $T$ between $0<x<a$. Now pick up the string in the middle and let it go and it'll vibrate (>w<).