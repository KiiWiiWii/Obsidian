#### Numerical solution of ODE's

We consider the Initial value problem: $$
\begin{cases}


\frac{dy}{dx} = f(t,y) \ \ \ \ \ \ a \leq t \leq b \\
y(a) = \mu
\end{cases}
$$
Most of these problem have no explicit solution. In particular when $f$ is non linear.

#### Theorem

Assuming $f(t,y)$ is continuous on $$
d = \{(t,y) : a \leq t\leq b, -\infty < y < \infty \}
$$
For all $(t,y), (t,y*) \in D, \exists t > 0$ s.t.
$$
|f(t,y) - f(t,y*)| \leq L|y-y*| \ \ \ \ \  \text{(2)}
$$
Then there exists a unique sol $y$ which is cont and diff at the problem for any initial value $\mu$

Remark: $f$ which satisfies the second equation (2) is called a Lipschitz cont function on $D$ and $L$ is the Lipschitz constant.

The Lipschitz constant can be estimated $$
L = \sup_{(t,y)\in D} |\frac{\partial f}{\partial y}|
$$

#### Integral Curves

$$
y' = y(1 - y) 
$$

![[Pasted image 20250310142205.png]]

