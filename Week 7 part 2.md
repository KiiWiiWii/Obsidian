
# Separation of Variables

- Continuation from the heat equation in the last lecture.

Solutions to a lot of PDE's can be found with this method.
There can NOT be mixed derivatives ($\frac{\partial u}{\partial x\partial t}$)

It works for the heat equations, wave and Laplace's.

---

Suppose $f_{1}(x)$ and $f_{2}(t)$ and they are equal for all $f_{1}(x) =f_{2}(t)$. The there must be a constant $\lambda$ for which $$
f_{1}(x) = f_{2}(t) = \lambda
$$
![[Pasted image 20241107141102.png]]
cba typing all that.

---
![[Pasted image 20241107141151.png]]
![[Pasted image 20241107141304.png]]
Clearly $u=0$ is a solution, but it doesn't satisfy the IC, so we are only interested in non zero solutions.

## Step 1: Separate the Variables
![[Pasted image 20241107141459.png]]

Basically, suppose that $u(x,t)$ can be written as $X(x)T(t)$, then derive it. Now sub it into the heat equation: $$
XT'=t \implies \frac{T'}{kT} = \frac{X''}{X}
$$
Here the LHS depends only on $t$ and the RHS depends only on $x$: we could write $f_{1}(t)=f_{2}(x)$, so they are both equal to a constant, $-\lambda$. So: $$
T' + \lambda kT = 0 \ \ \ \ \ X'' + \lambda X = 0
$$
(The reason for it being $-\lambda$ is so that the ODE for $X$ is a harmonic equation.)

The full solution is then reconstructed by:
$$
u(x,t) = X(x)T(t)
$$
For this, the BC's $u(0,t)=0, \ \ u(a,t) = 0$ become $$
X(0)T(t)=0 \ \ \ \ \ \ X(a)T(t)=0
$$
But because we are not interested in 0 solutions, we choose $X(0)$ and $X(a)$ to be 0.

the ODE's can therefore be written as $$
X'' + \lambda X = 0 \ \ \ \ \  T' + \lambda kT = 0
$$
## Step 2: Solve ODE 1 for X

![[Pasted image 20241107142510.png]]
Suppose $\lambda = 0$, the ODE for $X$ becomes $$
X''=0
$$
$$
\implies X = Ax + b
$$
And using the BC's we find that $A,B = 0$. So there are no non zero solutions so we do not give a fuck about this >:( FUCK LAMBDA EQ 0

Suppose $\lambda <0$, we can write $\lambda = -p^{2}$. Then the ODE will be $$
X'' - p^{2}X = 0
$$
![[Pasted image 20241107142815.png]]
(i was too slow at typing this :< )

Solving this now we find that $X(0)= -A$ and $X(a) = 0$. Again, no non zero solution we don't care about this either.

Now if $\lambda > 0$, $\lambda = p^{2}$.
![[Pasted image 20241107143026.png]]
youre too slow youre too slow youre too slow youre too slow youre too slow youre too slow youre too slow youre too slow youre too slow

![[Pasted image 20241107143050.png]]
![[Pasted image 20241107143342.png]]
Step 2 is done, we have found our solutions to $X$.

## Step 3: Solve ODE 2 For T

Remember that we already checked that for there to be solutions we care about is when $\lambda >0$.

![[Pasted image 20241107143703.png]]

## Step 4: reconstruct u and apply the initial conditions.

Recall that $$
u(x,t) = X(x)T(t)
$$
so, we can combine them to $$
u(x,t) = C_{n}\sin \left( \frac{n\pi x}{a} \right) e^{-k((n\pi)/a)^{2}t}
$$
Note that we may have a different solution for each n, and by the [[principle of superposition]], we may also add these together for another solution.

This is the general solution to the heat equation with homogeneous boundary conditions.

We still need to apply the initial condition.

![[Pasted image 20241107144114.png]]

## TL;DR

![[Pasted image 20241107144327.png]]


# Example 6.4

Solve the heat equation $$
\frac{\partial u}{\partial t} = K \frac{\partial^2 u}{\partial x^2}, \  \ \ \ 0<x<a, \ \ \ t > 0
$$
$$
u(x,0) = 2\sin \left( \frac{2\pi x}{a} \right) - 3\sin \frac{(5\pi)x}{a}\ \ \ \ 0<x<a
$$

Since we did steps 1-3 in the lecture already, we know what the solutions will look like, so we will skip straight to step 4.


$$
u(x,t) = \sum_{\neq 1}^{\infty}C_{n} \sin \left( \frac{n\pi x}{a} \right)e^{-k(n\pi/a)^{2}t}
$$

Applying the IC to this.
When $t=0$, $$
\sum_{n=0}^{\infty}C_{n} \sin \left( \frac{n\pi x}{a} \right) = 2\sin  \left( \frac{2\pi x}{a} \right) - 3 \sin \left(  \frac{5\pi x}{a} \right)$$
$$
\implies C_{1}\sin \frac{\pi x}{a} + C_{2}\sin \frac{2\pi x}{a} + C_{3}\sin \frac{3\pi x}a + \dots = 2\sin \frac{2\pi x}{a} - 2 \sin \frac{5\pi x}{a}
$$

Matching the coefficients gives $$
C_{2} = 2, \ \ C_{5} = - 3, \ \ \ c_{n} = 0
$$
So the final solution is $$
u(x,t) = 2\sin \frac{2\pi x}{a}e^{-k(2\pi/a)^{2}t}-3\sin \frac{t\pi x}{a}e^{-k(5\pi/a)^{2}t}
$$
# Example 6.5

(see the set up in the notes i was too busy playing chess)

Step 1: Look for a solution $u(x,t) = X(x)T(t)$ $$
\frac{\partial u}{\partial t} = XT', \ \ \ \frac{\partial^2 u}{\partial x^2} = TX''
$$
$$
XT' = 4X''T \implies \frac{T'}{4t} = \frac{X''}{X} = -\lambda
$$
So $X'' + \lambda X = 0$, $T' + 4\lambda T = 0$.

BC's: $\frac{\partial u}{\partial x}(0,t) = 0 \implies X'(0)T(t)=0 \implies X'(0) = 0$
      $\frac{\partial u}{\partial x}(2,t) \implies X'(2) = 0$

Our 2 ODE's are $$
(1) \ \ X'' + \lambda X = 0, \ \ \ X'(0) = 0, \ \ \ X'(2) = 0
$$
$$
(2) \ \ \ \ T' + 4 \lambda T = 0
$$
Step 2: Solve ODE (1) for X

Case $\lambda < 0$:

$\lambda = -p^{2}$. $$
X'' - p^{2}X = 0
$$
The Aux equation:
$$
m^{2}-p^{2} = 0 \iff m = \pm p
$$
$$
X = Ae^{px} + Be^{-px}
$$
We have $X' = pAe^{px} - pBe^{-px}$.

$$
X'(0) = 0 \implies 0 = pA - pB \iff B = A
$$
$$
X'(2) = 0 \implies pA(e^{2p}-e^{-2p}) = 0
$$
So $A,B = 0$, so we are not interested in these solutions.

Case $\lambda = 0$:

Here $X'' = 0 \implies x' = A \implies X = Ax + B$.

$$
X'(0) = 0 \implies A = 0, \ \ \ \ X'(2)= 0 \implies A = 0
$$
So the solution is $X = B$. Hence $\lambda = 0$ is an eigenvalue. In terms of eigenvalues/functions we have $$
\lambda_{0} = 0, \ X_{0} = 1
$$
$X_{0} = 1$ is arbitrary and could be $B$ but for the sake of convention it is gonna be $1$.

Case $\lambda >0$:

$\lambda = p^{2}$

Aux $$
m^{2} + p^{2} = 0 \implies m = \pm ip
$$
So $$
X = A\cos (px) + B\sin (px)
$$
As $$
X' = -A\sin(px) +Bp\cos (px)
$$
We have $$
X'(0) = 0\implies Bp = 0 \implies B = 0
$$
$$
X'(2) = 0 \implies -A\sin (2p) = 0 \implies \sin (2p) = 0
$$
