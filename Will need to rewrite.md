
summary of stuff in week 1 -3
maclaurin
taylor
finding sols near an op
finding sols neatr a regular single point


# Systems of Ordinary Differential Equations

let $$
\dot{x} =a_{11}(t)\times(t) + a_{12}(t)y(t) + g_{1}(t)
$$
$$
\dot{y} =a_{21}(t)\times(t) + a_{22}(t)y(t) + g_{2}(t)
$$

Where $\dot{x} = \frac{dx}{dt}$ and $\dot{y} = \frac{dy}{dt}$, $a,g$ functions are given continuous functions of $t$ on a given interval $\alpha < t < \beta$. We will eventually rewrite this as a matrix vector system which will allow us to solve these problems.

We can write this whole system $\dot{x} = Ax + g$ as:
$$
A \begin{bmatrix}
a_{11}(t) & a_{12}(t) \\
a_{21}(t) & a_{22}(t)
\end{bmatrix}, x = \begin{bmatrix}
x(t) \\
y(t)
\end{bmatrix}, g= \begin{bmatrix}
g_{1}(t) \\
g_{2}(t)
\end{bmatrix}
$$
This system is called homogeneous if $g - 0$ otherwise it is non-homogeneous.

A solution on a given interval $\alpha < t < \beta$ is a pair of functions $$
x^1(t) - \begin{bmatrix}
x_{1}(t) \\
y_{1}(t)
\end{bmatrix}
$$
Each having continous derivatives on $\alpha < t<\beta$ and simultaneously satisfying both equations of the system.

As well as the system of equations we may also be given init

# Example of where these arise

In infectious diseases modelling, we can think of a host population being broken up into compartments. We will be looking at the most simple form of this.
We look at a simple susceptible-infected-recovered model. Hosts belong to one of these three compartment groups.

[[SIR Model.canvas|SIR Model]]
