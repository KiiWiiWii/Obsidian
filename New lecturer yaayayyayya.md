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