
# Chapter 4

## Background and notation

- Order, linearity and homogeneity
- Superposition.
---

# Chapter 5

## Linear first order PDE's

Advection Equation:
$$
\frac{\partial u}{\partial t} + c \frac{\partial u}{\partial x} = 0
$$

## Method of characteristics

$$
\frac{\partial u}{\partial t} + c (x,t) \frac{\partial u}{\partial x} + p(x,t)u = q(x,t)
$$
Note that the coefficient of $\frac{\partial u}{\partial t}$ is always needed to be 1.

- moving observer on curve $x(t)$. $$
\frac{du}{dt} ( x(t),t) = \frac{\partial u}{\partial t}+ \frac{dx}{dt} \frac{\partial u}{\partial x}
$$
If we let $\frac{dx}{dt}$ be $c(x,t)$, then we can make the PDE an ODE.

- if $\frac{dx}{dt} = c(x,t)$ then the PDE is 
-  $\frac{du}{dt} + p(x,t)u = q(x,t)$. 

#### Method

- 1. Solve the first equation to find the characteristic curves.
- 2. Find arbitrary constant by assuming curve passes through $(x_{0},0)$. (i.e. $x(0) = x_{0}$)
- 3. Solve the second ODE along this curve. (i.e. with $x =$ solution of 1).
- 4. Substitute for $x_{0}$ to get final solution.

## 2023 Question 4

Solve $$
\frac{\partial u}{\partial t} + x \frac{\partial u}{\partial x} + u = 2x
$$
With initial condition:
$$
u(x,0) = x + e^{ x_{0}}
$$
---
Note that the coefficient in front of $\frac{\partial u}{\partial t}$ is 1 so it is in normal form.
Rewrite as 2 ODE's $$
\frac{dx}{dt} = x, \ \ \\ \ \frac{du}{dt} + u = 2x
$$
Solve ODE 1 for characteristics: 
$$
\frac{dx}{dt} - x = 0 \implies m-1=0 \implies m = 1 \implies x = Ae^{t}
$$
If this passes through $(x_{0},0)$ then 
$$
A = x_{0}
$$
So $$
x = x_{0} e ^{ t}
$$
Now we solve ODE 2 along the characteristic curve.

$$
\frac{du}{dt} + u = 2x_{0}e^{ t }
$$
Auxiliary equation:

$$
m+1 = 0
$$
So the general solution is 
$$
u_{g} = Be^{-t}
$$
For a particular function, try $u_{p} = Ce^{t}$.
This gives $$
Ce^{t}+ Ce^{t} = 2x_{0}e^{t}
$$
$$
\implies C = x_{0} \ \ \ \ \ \ \ \ u_{p} = x_{0}e^{t}
$$

So we have $$
u = u_{g} + u_{p}
$$
$$
\implies Be^{-t} + x_{0}e^{t}
$$

Using the initial condition $u(x,0) = x + e^{x_{0}}$.

$$
B+x_{0} = x_{0} + e^{x_{0}} \implies B = e^{x_{0}}
$$
So our solution is 
$$
u(x,t) = e^{x_{0}}e^{-t} + x_{0}e^{ t }
$$
Finally, as $x_{0} = xe^{-t}$ we have 
$$
u(x,t) = e^{xe^{-t}} e ^{-t} + (xe^{-t}) e ^{ t}
$$
$$
e^{xe^{-t}-t} + x
$$
$\square$

---

# Chapter 6

## Linear second order PDE's

$$
A(x,y)u_{xx} + B(x,y)_{xy} + C(x,y)y_{yy} + \dots = 0

$$

Classification - Hyperbolic ($b^{2}-4ac >0$)
				 Parabolic ($b^{2} = 4ac$)
				 Elliptic ($b^{2}-4ac <0$)

## 2023 Question 6(b)(i)

State whether the following PDE's

$$
\frac{\partial^2 u}{\partial t^2} - 4 \frac{\partial^2 u}{\partial x^2} = 0
$$
Is classified as hyperbolic, parabolic or elliptic.

---

$A = -4,B= 0, C= 1$. So, $b^{2}-4ac > 0$, hence it is Hyperbolic.

## Wave equation

$$
\frac{\partial^2 u}{\partial t^2} = C^{2} \frac{\partial^2 u}{\partial x^2} + IC + BC

$$

Where $IC$ is the initial conditions and $BC$ are the boundary conditions.

## D'Alembert's Method

$$
\frac{\partial^2 u}{\partial t^2} - c^{2}\frac{\partial^2 u}{\partial x^2} = \left( \frac{\partial }{\partial t}  + c \frac{\partial }{\partial x}\right)\left( \frac{\partial }{\partial t} - c \frac{\partial }{\partial x}\right)
$$
OR
$$
= \left( \frac{\partial }{\partial t}  - c \frac{\partial }{\partial x}\right)\left( \frac{\partial }{\partial t} + c \frac{\partial }{\partial x}\right)
$$

- Give 2 advection equations
- General solution is $u(x,t) = F(x-ct) + G(x+ct)$
- Use IC's to find the arbitrary functions $F$ and $G$

## 2023 Question 6(b)(ii)

Solve $\frac{\partial^2 u}{\partial t^2} - 4 \frac{\partial^2 u}{\partial x^2} = 0$ Subject to the ICs $u(x,0) = \frac{1}{x+2}$ and $\frac{\partial u}{\partial t}(x,0) = e^{ x }$. Use D'Lamberts

---


General solution $$
u(x,t) = F(x-2t) + G(x+2t)
$$
Apply the IC's:
$$
F(x) + G(x) = \frac{1}{x+2}
$$
$$
-2F'(x) + 2G'(x) = e^{x}
$$
From equation 1, we get 
$$
F'(x) + G' ( x) = - \frac{1}{(x+2)^{2}}
$$
From 2 
$$
\implies F'(x) - G'(x) = -\frac{1}{2}e^{x}
$$
Add these together:
$$
2F' = -\frac{1}{(x+2)^{2}} - \frac{1}{2} e^{ x }
$$
$$
\implies F'(x) = \frac{1}{2}[-\frac{1}{(x+2)^{2}} - \frac{1}{2} e^{ x }]
$$

$$
\implies F(x) = \frac{1}{2}\left[ \frac{1}{x+2} -\frac{1}{2}e^{ x }\right] + A
$$
From equation 1, $$
G(x) =\frac{1}{2}\left[ \frac{1}{x+2} +\frac{e^{ x }}{2} \right] -A
$$

Hence $$
u(x,t) = \frac{1}{2}\left[ \frac{1}{x-2t+2} - \frac{e^{x-2t}}{2} \right] + \frac{1}{2} \left( \frac{1}{x+2t+2} + \frac{e^{x+2t}}{2} \right)
$$
---

## Heat Equation

$$
\frac{\partial u}{\partial t} = k\frac{\partial^2 u}{\partial x^2} + BC + IC
$$
## Separation of variables.

- Inhomogeneous BC's:
- 1. Find the steady state solution (set $\frac{\partial }{\partial t} = 0$), $\bar{u}(x)$ which satisfies the BC's
- 2. Put $u(x,t) = v(x,t) + \bar{u}(x)$ into the PDE to get a homogeneous problem for $v$.
- 3. Solve for $v$ using separation of variables
- 4. Set $u(x,t) = v(x,t) + \bar{u}(x)$.

## Example

$$
\frac{\partial u}{\partial t} = \frac{\partial^2 u}{\partial x^2}, \ \ \ \ \ \ 0<x <1, \ \ \ \ t>0
$$
$$
u(0,t) = 1 \ \ \ \    \ u(1,t) = 2, \  \ \ \ \ \ t>0
$$
$$
u(x,0) = 1 + x + 2\sin (2\pi x) - 3\sin (5\pi x)
$$
(a) For $\bar{u}$ solve
$$
\frac{\partial^2 u}{\partial x^2} = 0 \ \ \ \ \ \ u(0) = 1, \ \ \ \ \ \ \ u (1) = 2
$$
So $$
u= Ax + B
$$
$u(0) = 1 \implies B = 1$, $u(1) = 2 \implies A a+ 1 =2 \implies A = 1$.

Hence $\bar{u}(x)= 1 + x$.

(b) Put $u(x,t) = v(x,t) + \bar{u}(x)$ into the PDE
$$
\implies v + 1 + x
$$

$$
\frac{\partial u}{\partial t} = \frac{\partial^2 u}{\partial x^2} \implies \frac{\partial v}{\partial t} =\frac{\partial^2 v}{\partial x^2}
$$
$$
BC: \\\ \ \ \ u(0,t) = 1 \implies v(0,t) + \bar{u}(0) = 1
$$
$$
\implies v(0,t) + 1 = 1
$$
$$
\implies v(0,t) = 0
$$
$$
u(1,t) = 2 \implies v(1,t) + 2 = 2 \implies v(1,t) = 0
$$

$$
IC: \ \ \ \ u(x,0) = 1+x+2\sin (2\pi x) - 2\sin (5\pi x)
$$
$$
\implies v(x,0) + 1 + x = 1 + x + 2 \sin (2\pi x) - 2\sin (5\pi x)
$$
$$
\implies v(x,0) = 2\sin (2\pi x) - 2 \sin (5\pi x)
$$
(c) Step 1:

Let $v(x,t) = X(x)T(t)$ so
$$
XT' = X''T \iff \frac{T'}{T} = \frac{X''}{X} = -\lambda
$$
Two ODE's are 
$$
X'' + \lambda X = 0, \ \ \ \ \ X(0)= 0, \ \ \ \ \ \ X(1) = 0
$$
$$
T'+\lambda T =0
$$
Step 2:

From the question, the eigenvalues and eigenfunctions of the $X$ ODE are

$$
\lambda_{n} = n^{2}\pi^{2}, \ \ \ X_{n}(x) = \sin (n\pi x)
$$
Step 3:

Solve ODE for $T$ with $\lambda = \lambda_{n}$.

$$
T' + \lambda_{n}T = 0
$$
$$
\implies T_{n} (t ) = C_{n} e^{ -n^{2}\pi^{2}t }
$$
Step 4:

We now have

$$
v(x,t) = \sum_{n = 1}^{\infty} C_{n}\sin (n\pi x)e^{-n^{2}\pi^{2}t}
$$
(d)

IC is $v(x,0) = 2\sin (2\pi x)-2\sin (5\pi x)$, So:

$$
\sum_{n = 1}^{\infty} C_{n}\sin (n\pi x) = 2\sin (2\pi x) - 3\sin (5\pi x)
$$
We need $C_{2} = 2$, $C_{5}=-3$, $C_{n} = 0$ otherwise

(e)

We have $$
u(x,t) = v(x,t) + \bar{u}(x)
$$
$$
= 2\sin (2\pi x)e^{-4\pi^{2}t}-2\sin (5\pi x)e^{-25\pi^{2}t} + 1 + x

$$
$\square$

---

## Laplace's Equation

$$
\frac{\partial^2 u}{\partial x^2} + \frac{\partial^2 u}{\partial y^2} = 0
$$
Need one of $x,y$ to have homogeneous conditions. Then solve that one first.

## Fourier Series

See formula sheet.

### 2023 Question 7(b)

Find the Fourier series for $$
f(x) = \begin{vmatrix}
x^{2}, & -1\leq x\leq 0, \\
0, & 0\leq x\leq 1
\end{vmatrix}

$$
---

Here $a = 1$. So
$$
a_{0} = \frac{1}{2} \int _{-1} ^{0}x^{2} \, dx = \frac{1}{6}
$$
$$
a_{n} = \int _{-1}^{0} x^{2}\cos (n\pi x) \, dx =\dots =\frac{2}{n^{2}\pi^{2}}(-1)^{n}
$$
$$
b_{n} = \int _{-1}^{0} x^{2}\sin (n\pi x) \, dx = \frac{(-1)^{n}}{n\pi}\left( 1-\frac{2}{n^{2}\pi^{2}} \right) + \frac{2}{n^{3}\pi^{3}}
$$
Fourier series is 
$$
f(x) \sim \frac{1}{6} +\frac{2}{\pi^{2}}\sum_{n = 1}^{\infty} \frac{(-1)^{n}}{n^{2}} \cos (n\pi x) + \sum_{n = 1}^{\infty}\left[ \frac{(-1)^{n}}{n\pi}\left( 1-\frac{2}{n^{2}\pi^{2}}+\frac{2}{n^{3}\pi^{3}} \right) \right] \sin (n\pi x)
$$
