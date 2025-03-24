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
y_{n+1} = y_{n} + f(t_{n},y_{n})\times h_{n}
$$
To simplify, we will call $f(t_{n},y_{n})$, $f_{n}$.

#### Incremental Ratios

Approximation for $y'(t)$: $$
\text{Forward Approximation: } \ \ y'(t) \approx \frac{y(t + h) - y(t)}{h}
$$
$$
t_{n} = a + nh
$$
$$
y'(t_{n}) \approx \frac{y(t_{n} + h ) - y(t_{n})}{h}
$$
$$
= \frac{y_{n+1} - y_{n}}{h}
$$
$$
y'_{t_{n}} = f(t_{n}, y_{n})
$$
$$
\frac{y_{n+1} - y_{n}}{h_{n}} = f(t_{n},y_{n})
$$
$$
y_{n+1} = y_{n} + f_{n} \times h_{n}
$$
#### Example

Solve $$
\begin{cases}
y' = t + y  \\
y(0) = 1 \\
t \in [0,0.6] \ \  \text{with } h = 0.02 \text{ and using the Explicit Eulers Method}
\end{cases}
$$
$$
y_{0} = y(t_{0}) = y(0) = 1
$$
$$
\boxed{t_{n} = a + n\times h} = n\times h = n \times o.o_{2}
$$
$$
y_{1} = y(t_{1}) = y(0.2)
$$
$$
=y_{0} + h \times f(t_{0},y_{0})
$$
$$
y_{0} + (0.2)(0 + 1)
$$
$$
1 + (0.2)(0+1)
$$
$$
\equiv y_{0} + h + t_{0} + y_{0}
$$
$$
= 1.2
$$
$$
y_{2} = y(t_{2})=y(0.4)
$$
$$
\text{explicit ->} \ =y_{1} + h f(t_{1},y_{1})
$$
$$
= 1.2 + (0.2)(0.2+ 1.2)
$$
$$
=1.48
$$
$$
y_{3} = y(t_{3}) = y(0.6) = y_{2} + hf(t_{2},y_{2}) = 1.856
$$
The solution given is $$
y(t) = 2e^{t} - t - 1
$$
$y(0) = 1$
$y(0.2) = y(t_{1}) \approx 1.2426$
$y(0.4) = y(t_{2}) \approx 1.5636$
$y(0.6) = y(t_{3}) \approx 2.0442$

Notice how the error gets larger the further away from 0 we get since the next term relies on the previous so the error accumulates.

#### Backward / Implicit Euler

$$
y'(t)
$$ $$
y'(t) \approx \frac{y(t)-y(t-h)}{h}
$$
Now we consider $$
y'(t_{n+1}) = f(t_{n+1},y_{n+1})
$$
$$
\frac{y (t_{n+1}) -y(t_{n})}{h} = f(t_{n+1},y_{n+1})
$$
$$y_{n+1} = y_{n} + h \times f(t_{n+1}, y_{n+1})$$
$$
\boxed{y_{n+1} = y_{n} + h \times f_{n+1} \ \ \ \ \ \forall n = 0,\dots,N-1}
$$

#### Example
$$\begin{cases}
y' = t + y  \\
y(0) = 1 \\
t \in [0,0.6] \ \  \text{with } h = 0.02 \text{ and using the Implicit Eulers Method}
\end{cases}$$

$$
y(0) = 1
$$
$$
y_{1} = y_{0} + 0.2(t_{1}+y_{1})
$$
$$
= 1 + 0.2(0.2+y_{1})
$$
$$
\iff (1-0.2)y_{1} = 1 + 0.2^{2}
$$
$$
y_{1} = \frac{1 + 0.2^{2}}{1 - 0.2} = 1.2
$$
$$
y_{2} = y_{1} + 0.2(0.4+y_{2})
$$
$$
\iff y_{2} = \frac{1.2 + 0.2(0.4)}{1-0.2} = 1.6
$$
$$
y_{3} = y_{2} + 0.2 (0.6+y_{3})
$$
$$
\iff y_{3} = \frac{ 1.6 + 0.2(0.6)}{1-0.2} = 2.15
$$
#### Approximation error

![[Pasted image 20250310152804.png]]

Basically the local error is the error at a specific point then the global one is the biggest one across the entire method.

![[Pasted image 20250310153150.png]]

Proof for the theorem:

$$
| e_{n}| = |y_{n+1} - y_{0}ft_{n+1}|
$$
Note that $y_{n+1} = y_{n+h}\times f(y_{0},y_{0})$.

Taylors Expansion on the function $y(t_{n+1})$. $$
f(t_{n} + h) = f(t_{n}) + f't_{n}x)h + f't_{n}(x) \frac{h^{2}}{2!} + \dots
$$

But $y'(t_{n}) = f(t_{n}, y(t_{n}))$ thus

$$
y(t_{n+1}) = y(t_{n}) + h \times f(t_{n},y(t_{n})) + \frac{h^{2}}{2}y''(\xi_{n})
$$
Using the generic inter of Exp Eulers method $$
y_{n+1} = y_{n} + h \times f(t_{n}, y_{n})
$$
$$
|e_{n+1}| = y(t_{n}) - y_{n} + h \times (f(t_{n},y(t_{n})) - f(t_{n},y_{n})) + \frac{h^{2}}{2}y''(\xi_{n})
$$
$$
|e_{n+1}| \leq |e_{n}| + h |f(t_{n}, y(t_{n})) -f(t_{n},y_{n})| + \frac{h^{2}}{2}|y''(\xi_{n})|
$$ 
From the assumption
$$
|f(t_{n}, y(t_{n})) - f(t_{n},y_{n})| \leq L|y(t_{n} -y_{n})|
$$
Assume $\exists C > 0$ s.t. $$
C = \max\limits_{t \in[a,b]}|y''(t)|
$$
$$
|e_{n+1}| \leq (1 + hL) |e_{n}| + \frac{Ch^{2}}{2}
$$
$$
\leq (1 + hL)\left( (1 + hL)|e_{n+1}|+ \frac{Ch^{2}}{2} \right) + \frac{Ch^{2}}{2}
$$
$$
\leq (1 + hL) ^{2} | e_{n+1}| + ( 1 + hL) \times \frac{h^{2}C}{2} + \frac{Ch^{2}}{2} \dots
$$
$$
\leq (1 + hL)^{n+1}\cancel{ |e_{0}| } + \frac{h^{2}C}{2} ( 1 + ( 1 + hL) + (1 + hL) ^{2} + \dots + ( 1 + hL)^{n-1})
$$
$$
\leq \frac{h^{2}C}{2}(1 + ( 1 + hL) + ( 1 + hL) ^{2} + \dots + ( a + hL) ^{ n - 1})
$$
This is a geometric series $$
0 \leq|e_{n+1}| \leq \frac{Ch^{2}}{2}\left( \frac{1- (1 + hL)^{n+1}}{1 - ( 1 + hL)C}C \right)
$$
$$
= \frac{Ch}{2L} ((1 + hL)^{ n+1} - 1)
$$

Since $h$ and $L$ are positive, $$
1 + hL \leq e ^{ hL} = 1 + hL + \frac{hL^{2}}{2} + \frac{hL^{3}}{3!} + \dots
$$
Since $t_{n} = C + nh$
$$
(1 + hL) \leq e ^{ nhL} < e ^{ L ( t_{n} -1)}
$$
$$
|e_{n+1}| \leq \frac{Ch}{2l} ( e ^{ l(t_{n} - c)}-1)
$$
$$
= h\left( \frac{c}{2L}(e^{L(t_{n}-n)})-1 \right)
$$
taking h -> 0 we get by the sandwich theorem $$
|e_{n+1}| \to 0
$$
$$
\boxed{QED}
$$
