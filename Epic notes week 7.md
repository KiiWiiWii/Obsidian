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

Think about an elastic string, with some tension $T$ between $0<x<a$. Now pick up the string in the middle and let it go and it'll vibrate (>w<) (also ignoring external things like air resistance.
Assume it is perfectly elastic, moves perfectly vertically, ignore gravity, the deflection and slope at every point remain small yada yada...

Putting this into notation:

$u(x,t)$ is the vertical displacement (what we wanna find)
$T(x,t)$ is the tension
$\rho$ is the mass per unit length

We apply Newtons second law $F=ma$.
![[Pasted image 20241104102630.png]]
Note that in this image $\Delta x\cos (\alpha) = \Delta x$

![[Pasted image 20241104102924.png]]
![[Pasted image 20241104103001.png]]
Note that this definition of $c^{2}$ is just for convenience.
![[Pasted image 20241104103220.png]]
This initial condition $u(x,0)$ is just sayin "i know where each point of the string is at the start" and $g(x)$ is the vibration.
![[Pasted image 20241104103525.png]]
All of these are pretty self explanatory i think :3

None of this is actually gonna be in the exam but it does show when this is used, its background material and if you do not understand it Alison says to not gaf about it.


![[Pasted image 20241104103702.png]]
This is an example of what a question might look like. 

# D'Alembert's Solution to the wave equation

![[Pasted image 20241104104001.png]]
![[Pasted image 20241104104129.png]]
Multiplying out the brackets to get an advection equation. We can immediately write the solution.
![[Pasted image 20241104104301.png]]
Same thing here.

![[Pasted image 20241104104322.png]]
![[Pasted image 20241104104401.png]]
Again, this is all leading to the formula that we need, so you don't really need to know all this but it is helpful.

![[Pasted image 20241104104709.png]]
This is the bad boy >;3

![[Pasted image 20241104104820.png]]
We can determine $F,G$ from the initial conditions. $$
u(x,t) = F(x-ct) + G(x+ct) = F(\alpha) + g(\beta)
$$
# Example 6.2

Solve the wave equation $$
\frac{\partial^2 u}{\partial t^2} - c^{2} \frac{\partial^2 u}{\partial x^2} = 0
$$
on $-\infty < x < \infty$, $t>0$ with IC's $$
u(x, 0) = A\sin (x),\ \ \ \ \ \ \frac{\partial u}{\partial t} (x,0)= 0
$$
The general solution is $$
u(x,t) = F(x-ct) + G(x +ct)
$$
From IC1, $u(x,0) = A\sin (x)$:
$$
F(x) + G(x) = A\sin (x)
$$
From IC2, $\frac{\partial u}{\partial t}(x,0)=0$:
$$
-cF'(x) + cG'(x) = 0 \leftrightarrow  F'(x) - G'(x)=0
$$
We Now need to solve these two equations for the unknown functions $F$ and $G$.

So we can compare, take the equation from IC1 and differentiate it.
$$
F'(x) + G'(x) = A\cos (x)
$$
Remember that:
$$
F'(x) - G'(x) = 0
$$
So now we can just do simultaneous equations.

$$
F'(x) = \frac{A}{2}\cos x
$$
so $$
F(x) = \frac{A}{2}\sin x + B
$$
For some constant $B$.

As $F(x) + G(x) = A\sin (x)$, we have $$
G(x) = (\frac{A}{2} \sin (x) + B) + A\sin x
$$
$$
\implies G(x) = \frac{A}{2}\sin x -B
$$
So now that we have $F$ and $G$ we are almost done as we know what our general solution should look like from the start. 
$$
u(x,t) = F(x-ct) + g(x+ct)
$$
$= \frac{A}{2}\sin (x-ct)+B+\frac{A}{2}\sin (x+ct) - B$
$A\sin (x)\cos (ct)$.

$\square$

---

# Example 6.3

Solve the wave equation $$
\frac{\partial^2 u}{\partial t^2} -c^{2}\frac{\partial^2 u}{\partial x^2}=0
$$
on $-\infty < x < \infty$ $t \geq 0$ with IC's $$
u(x,0) = x, \ \ \ \frac{\partial u}{\partial t} (x,0) = x^{2}
$$
General solution is $$
u(x,t) = F(x-ct) + G(x +ct)
$$
From IC1: 
$$
F(x) + G(x) = x
$$
From IC2:
$$
-cF'(x) + cG'(x) = x^{2}
$$
Solve for $F$ and $G$:
$$
F'(x) + G' (x) = 1
$$
$$
F'(x) -G'(x) = - \frac{x^{2}}{c}
$$

Again, simultaneous equations:
$$
F'(x) = \frac{1}{2}\left( 1-\frac{x^{2}}{c} \right)
$$
$$\implies F(x) = \frac{1}{2}\left( x-\frac{x^{3}}{3c} \right) +A$$
Where A is an arbitrary constant.

As $F(x) + G(x) = x$ then we have
$$
G(x)= x-F(x) = \frac{1}{2}\left( x+\frac{x^{3}}{3c}  \right)-A
$$

so $u(x,t)= F(x-ct)+ G(x+ct)$.

$$
= \frac{1}{2}\left[ x-ct-\frac{(x-ct)^{3}}{3c} + x + ct + \frac{x+ct^{3}}{3c}\right]
$$
