
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
Each having continuous derivatives on $\alpha < t<\beta$ and simultaneously satisfying both equations of the system.

As well as the system of equations we may also be given initial conditions $$
x(t_{0}) = b_{1}, y(t_{0}) = b_{2}
$$
Where $\alpha < t_{0} <\beta$ and $b_{1}$ and $b_{2}$ are given constants.

Any 2 solutions are [[Linear Independence]] between $\alpha < 0 < \beta$ if $c_{1}x^{1}(t) + c_{1}x^{2}(t) = 0$ implies that $c_{1}=c_{2}=0$.
If the solutions are LI then we can write the general solution as a combination of these solutions. We can also form the Wronskin of $W[x^{1}(t),x^{2}(t)]$. We need this to be non-zero.
# Example of where these arise

In infectious diseases modelling, we can think of a host population being broken up into compartments. We will be looking at the most simple form of this.
We look at a simple susceptible-infected-recovered model. Hosts belong to one of these three compartment groups.

[[SIR Model.canvas|SIR Model]]


# Example 10

Take the system of equations:
$$
\dot{x} = 5x(t) + 3y(t)
$$
$$
\dot{y} = -x(t) + y(t)
$$
with initial conditions $x(0) = 12, \ \ \ y(0) = -6$

By letting $$
A = \begin{bmatrix}
5  & 3 \\
-1  &  1
\end{bmatrix}, x = \begin{bmatrix}
x(t) \\
y(t)
\end{bmatrix}, x(0) = \begin{bmatrix}
12  \\
-6
\end{bmatrix} = b
$$
we may write the above IVP in the matrix form as follows : $$
\dot{x} = Ax, x(0) = b
$$
We can easily verify the solution by substitution: 
$$
x(t) = 3e^{2t} + 9e^{4t}
$$ $$
y(t) = -3e^{2t} - 3e^{4t}
$$
Differentiating we get $$
\dot{x} = 6e^{2t} + 36e^{4t}
$$ $$
\dot{y} = -6e^{2t} - 12e^{4t}
$$
$$
5x + 3y = 15e^{2t} + 45e^{4t} - 9e^{2t} = 9e^{4t} = 6e^{2t} + 36e^{4t} = \dot{x}(t)
$$
We can do a similar thing to prove that it is the solution for $\dot{y}$. (_check notes_)

Now let $$
x(0) = 3e^{2(0)} + 9e^{4(0)} = 12
$$
and $$
y(0) = -3e^{2(0)} - 3e^0 = -6
$$
so they satisfy the differential equations and the initial conditions. 

---

# Example 2.1

Given the system $\dot{x} = Ax$ where $$
A = \begin{bmatrix}
-4 & -10  \\
3 & 7
\end{bmatrix}

$$.
Let $$
x^{1}(t) = \begin{bmatrix}
-5e^{2t}  \\
 3e^{2t}
\end{bmatrix}, 
x^{2} = \begin{bmatrix}
2e^{t}  \\
-e^{t}
\end{bmatrix}, b = \begin{bmatrix}
-19 \\
11
\end{bmatrix}
$$Verify that $x^{1}(t)$ and $x^{2}(t)$ form a fundamental set of solutions and solve the IVP $x(0)=b$.

$$
x^{1}(t) = \begin{bmatrix}
-5e^{2t} \\
3e^{2t}
\end{bmatrix}
$$
$$
\dot{x} = \begin{bmatrix}
-10e^{2t} \\
6e^{2t}
\end{bmatrix}

$$
Is this a solution? We can prove it if $$
\dot{x}^{1} = \begin{bmatrix}
-4 & 10 \\
3 & 7
\end{bmatrix} \begin{bmatrix}
-5e^{2t} \\
3e^{2t}
\end{bmatrix}
$$$$
= \begin{bmatrix}
20e^{2t} -  30e^{2t} \\
-15e^{2t}  +  21e^{2t}
\end{bmatrix}
 = \begin{bmatrix}
-10e^{2t} \\
6e^{2t}
\end{bmatrix}
$$
We do this again for $x^{2}$. $$
x^{2} = \begin{bmatrix}
2e^{t} \\
-e^{t}
\end{bmatrix}
$$
$$
\dot{x}^{2} = \begin{bmatrix}
-4 & -10 \\
3 & 7
\end{bmatrix} \begin{bmatrix}
2e^{t} \\
-e^{t}
\end{bmatrix}
$$
$$
= \dots = \begin{bmatrix}
2e^{t} \\
-e^{t}
\end{bmatrix}
$$
So they are solutions. To check if they are fundamental solution we check if they are LI. To check $x^{1}$ and $x^{2}$ are LI we form the Wronskin $$
W(x^{1}, x^{2}) = \begin{vmatrix}
-5e^{2t}  & 2e^{t} \\
3e^{2t} & -e^{t}
\end{vmatrix}
$$
$$
= 5e^{3t} - 6e^{3t} = -e^{3t}
$$
As this can never be 0, the solutions are LI and therefore fundamental set of solutions.

The general solution is $$
\underline{x}(t) = c_{1}\underline{x}^{1}(t) + c_{2} \underline{x}^{2}(t)
$$
(skipping some shit) $$
c_{1}\begin{bmatrix}
-5 \\
3 
\end{bmatrix} + c_{2}\begin{bmatrix}
2 \\
-1
\end{bmatrix} = \begin{bmatrix}
-19 \\
11
\end{bmatrix}
$$
$$
\begin{bmatrix}
-5 & 2 \\
3 & -1
\end{bmatrix} \begin{bmatrix}
c_{1} \\
c_{2}
\end{bmatrix} = \begin{bmatrix}
-19 \\
11
\end{bmatrix}
$$

$$
r_{1}^{1} = r_{1} + 2r_{2} \begin{bmatrix}
1 & 0 \\
3 & -1
\end{bmatrix} \begin{bmatrix}
c_{1} \\
c_{2}
\end{bmatrix} = \begin{bmatrix}
3 \\
11
\end{bmatrix}

$$
Which implies $c_{1} = 3$, $3c_{1} - c_{2} = 11$, $\implies c_{2} = 3c_{1} -11 = -2$. so the solutions is $$
\underline{x}(t) = 3\begin{bmatrix}
-5e^{2t} \\
3e^{2t}
\end{bmatrix} - 2 \begin{bmatrix}
2e^{t} \\
-e^{t}
\end{bmatrix}
$$
---
# Solution with homogeneous constant

Assume that a solution exists in the form $$
\underline{x} = \underline{v}e^{\lambda t}
$$
We would like to find $v$ and $\lambda$. Subbing $\dot{x} = \lambda \underline{v}e^{\lambda t} = Ax = A\underline{v}e^{\lambda t}$

Dividing by $e^{\lambda t}$ we get $$
A\underline{v} = \lambda \underline{v}
$$
So for $\dot{x} = Ax$ we have to find the eigenvalues $\lambda$ and corresponding eigenvectors $\underline{v}$ of the matrix $A$

# Theorem 10

Consider the constant coefficient linear system $\dot{x} = Ax$. Assume that the constant matrix $A$ has a LI set of n eigenvectors $\underline{v_{n}}$, with corresponding eigenvalues $\lambda_{n}$ then $$
x^{1} = \underline{v_{1}}e^{\lambda_{1}t} + \dots + c_{n}\underline{v_{n}}e^{\lambda_{n}t}
$$
form a basis of the system and the general solution is $$
x = c_{1}\underline{v_{1}}e^{\lambda_{1}}t + \dots + c_{n}\underline{v_{n}}e^{\lambda_{n}t}
$$
(_proof in notes_)

---

