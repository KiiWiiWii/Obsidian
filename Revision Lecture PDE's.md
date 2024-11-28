
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

# 2023 Question 4

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
