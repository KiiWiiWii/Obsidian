#### Numerical solution of ODE's

We consider the Initial value problem: $$
\begin{cases}


\frac{dy}{dx} = f(t,y) \ \ \ \ \ \ a \leq t \leq b \\
y(a) = \eta
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
Then there exists a unique sol $y$ which is cont and diff at the problem for any initial value $\eta$

Remark: $f$ which satisfies the second equation (2) is called a Lipschitz cont function on $D$ and $L$ is the Lipschitz constant.

The Lipschitz constant can be estimated $$
L = \sup_{(t,y)\in D} |\frac{\partial f}{\partial y}|
$$

#### Integral Curves

$$
y' = y(1 - y) 
$$

![[Pasted image 20250310142205.png]]

![[Pasted image 20250310142529.png]]

#### Discretisation

$$
[a,b]
$$
![[Pasted image 20250310142749.png]]
![[Pasted image 20250310143139.png]]

#### Numerical Methods

$$
y_{0} = y(t_{0}) = y(a) = \eta
$$
$$
y_{1} = y(t_{1}) = H(t_{0},y_{0}, t_{1},y_{1}, f)
$$
A method is called explicit if $y_{1} = H(t_{0},y_{0})$, it is called implicit if $y_{1} = H(t_{0},y_{0},t_{1},y_{1},f)$. In the implicit case, you want to solve the nonlinear equation $$
y_{1} - H(t_{0},y_{0},t_{1},y_{1},f) = 0
$$ 
![[Pasted image 20250310143841.png]]

#### Forward/Explicit Euler Method

We want to solve $y' = f(t,y)$.in $[t_{n}, t_{n+1}]$
$$
\int _{t_{n}}^{t_{n+1}} \frac{dy}{dt} \, dt = \int _{t_{n}}^{t_{n+1}} f(t,y) \, dt
$$
$$
y(t_{n+1}) - y(t_{n}) = \int _{t_{n}} ^{ t_{n+1}} f(t,y) \, dt
$$
Approximate the R.H.S. $$
f(t_{n},y_{n})

$$
$$
\approx f(t_{n},y_{n}) \int _{t_{n}} ^{ t_{n+1}}  \, dt
$$
$$
f(t_{n},y_{n}) (t_{n+1}-t_{n})
$$
$$
y(t_{n+1}) \approx y(t_{n}) + f(t_{n},y_{n}) \times h_{n}
$$
$$
y_{n+1} = y_{n} + f()
$$
