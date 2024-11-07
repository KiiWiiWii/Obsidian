
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
The auxillery