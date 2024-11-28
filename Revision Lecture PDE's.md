
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

- if $\frac{dx}{dt} = c(x,t)$ then the pde is 
-  $\frac{du}{dt} + p(x,t)u = q(x,t)$. 

#### Method

- 1. Solve the first equation to find the characteristic curves.
- 2. Find arbitrary constant by assuming curve passes through $(x_{0},0)$. (i.e. $x$