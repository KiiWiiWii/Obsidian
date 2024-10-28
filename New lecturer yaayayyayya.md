# Partial differentiation revision

Starting with homogeneous PDE's : Change them into an ODE and then assume we can solve it.

Notation or something: 

We know what a single variable function looks like: $f(x) = x^{2}$ or whatever. Differentiation looks like $f'(x)= 2x$ or just $f'$. Revision about the product and the quotient rule. Whatever. Also looking at the chain rule.

Now for functions of more than one variable like $f(x,y,z)$ so we need to say what kind of differentiation we're doing $\frac{\partial f}{\partial x}$ . Very important to use the curly $\partial$ rather then the normal d or you lose marks. $$
f(x,y) = x^{2} + \frac{1}{y}
$$
$\frac{\partial f}{\partial x} = 2x$ and $\frac{\partial f}{\partial y} = - \frac{1}{y^{2}}$. And so on for more variables. Pretty simple. Second order differentiation notation is also fine $\frac{\partial}{\partial x} \frac{\partial f}{\partial x} = \frac{\partial^{2}f}{\partial x^{2}}$.

If you have the chain rule with a multi var function, you get $f'(g(x,y))\times \frac{\partial g(x,y)}{\partial x}$ (if differentiating with respect to $x$). If the outside function also is multi var then you need to do the partial derivative on that function too. 

# PDE's

Fundamental to applied mathematics like heat conduction, fluid flow, wave propagation. modelling tumor growth or spread of disease. Prediction flood damage, pollution. Modelling option pricing, predicting the stock market.

-- these are all factorio references ahhhHHhh -

Learn to find analytic solutions to some classical PDE's. 

We cant solve all PDE's like this but they can be simulated using numerical methods. Will have her for MM306.

A typical problem will give the PDE and the initial and or boundary conditions. The first issue is if the problem is well posed. For it to be well posed it needs to: 
- Have an existing solution.
- Unique solution
- Stability.
Else it is ill posed. In this class they will all be well posed.

We consider the function $u(x,y,z , \dots, t)$ to be the function we need to solve, and $x,y,z,t$ are all independent variables. Now the General PDE is: $$
F(u,x,y,\dots,t,u_{x},u_{y}, \dots, u_{t}, u_{xx}, u_{yy}, \dots)

$$
and so on.

Gonna solve 4 different PDE's, all well known and classical. The [[Advection Equation]], the [[Wave Equation]], the [[Heat Equation]], and [[Laplace's Equation]].

All PDE's can be written using a differential operator denoted by $\mathcal{L}$, which is a mapping between sets of differentiable functions: $$
\mathcal{L}(u) = f
$$
For instance, Laplace's looks like $$
\mathcal{L} = \frac{\partial^{2}}{\partial x^{2}} + \frac{\partial^{2}}{\partial y^{2}}
$$
All PDE's in this class are linear. Non linear are too hard :(.

the linearity test is $$
\mathcal{L}(c_{1}u_{1} +c_{2}u_{2}) = c_{1}\mathcal{L}(u_{1}) +c_{2}\mathcal{L}(u_{2})
$$

# Example 4.1

Show that the heat equation is linear.

Suppose that $u_{1}$ and $u_{2}$ are solutions of the heat equation, i.e. $$
\mathcal{L}(u_{1}) = 0
$$
and $$
\mathcal{L}(u_{2}) = 0
$$
$$
\mathcal{L} =\frac{\partial}{\partial t} - k \frac{\partial^{2}}{\partial x^{2}}
$$
For any real constants $c_{1}$ and $c_{2}$ we have $$
\mathcal{L}(c_{1}u_{1}+c_{2}u_{2})= \frac{\partial}{\partial t}(c_{1}u_{1}+c_{2}u_{2}) - k\frac{\partial^{2}}{\partial x^{2}}(c_{1}u_{1} +c_{2}u_{2})
$$
$$
= c_{1} \frac{\partial u_{1}}{\partial t} + c_{2} \frac{\partial u_{2}}{\partial t} - \frac{kc_{1}(\partial^{2}u_{1})}{\partial x^{2}} - kc_{2} \frac{\partial^{2}u_{2}}{\partial x^{2}}$$
$$
\dots
$$
$$
c_{1}\mathcal{L}(u_{1}) + c_{2}\mathcal{L}(u_{2})
$$
Therefore the heat equation is linear.

# Example 4.2

Show that the equation $$
u^{2} \frac{\partial^{2}w}{\partial u^{2}} + \sin v \frac{\partial^{2}w}{\partial v^{2}} = 0
$$
For the function $w(u,v)$ is linear.

Suppose that $\mathcal{L}(w_{1}) = 0$ and $\mathcal{L}(w_{2}) = 0$. where $$
\mathcal{L} = u^{2} \frac{\partial}{\partial^{2}} + \sin v \frac{\partial^{2}}{\partial v^{2}}
$$
For any real constants $c_{1}$ and $c_{2}$, we have $$
\mathcal{L}(c_{1}w_{1} + c_{2}w_{2}) = u^{2} \frac{\partial^{2}}{\partial u^{2}} (c_{1}w_{1} +c_{2} w_{2}) + \sin v \frac{\partial^{2}}{\partial v^{2}} ( c_{1}w_{1} +c_{2}w_{2})
$$
$$
= c_{1}u^{2}\frac{\partial^{2}w_{1}}{\partial u^{2}} + c_{2}u^{2} \frac{\partial^{2}w_{2}}{\partial u^{2}} + c_{1}\sin \frac{v(\partial^{2}w_{1})}{\partial v^{2}} + c_{2} \sin v \frac{\partial^{2}w_{2}}{\partial v^{2}}
$$
$$
=c_{1}\mathcal{L}(w_{1}) + c_{2}\mathcal{L}(w_{2})
$$
So the equation is linear.