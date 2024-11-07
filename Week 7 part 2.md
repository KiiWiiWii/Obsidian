
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
X(0)T(t)=0 \ \ \ \ \ \ X()
$$