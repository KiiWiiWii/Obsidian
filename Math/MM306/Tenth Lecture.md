
#### Trapezoidal Method - One step Method

Integrating $y' = f(t,y)$ on $[t_{n}, t_{n+1}]$.

$$
y(t_{n+1}) - y(t_{n}) = \int _{t_{n}}^{t_{n+1}}f(t,y) \, dt
$$
We can approximate this integral using the trapezoidal method. Using the trapezoidal integration rule:
$$
y(t_{n+1}) - y(t_{n}) \approx \frac{(t_{n+1}-t_{n})}{2}[f(t_{n},y(t_{n}))+ f(t_{n+1},y(t_{n+1}))]
$$

This is an implicit method

The trapezoidal method is then given by:
$$
y_{0}=y(a) = \eta
$$
$$y_{n+1} = y_{n} + \frac{h}{2}[f_{n}+ f_{n+1}]$$, $n\geq 0,\dots,N-1$

Numerically we have to solve the nonlinear equation $$
y_{n+1} - \frac{h}{2}f(t_{n+1},y_{n+1}) = y_{n} \frac{h}{2}f_{n} = 0
$$
#### Example

Solve $y' = t + y$, $y(0) = 1$, $t\in[0,0.6]$, $h = 0.2$.

$t_{0}=0$, $t_{1}= 0.2$, $t_{2}=0.4$, $t_{3}=0.6$

$y_{0}=1$
$$
y_{1}= y_{0} + \frac{h}{2}[(t_{0}+y_{0}) + (t_{1}+y_{1})]
$$
$$
\left( 1 - \frac{h}{2} \right)y_{1} = y_{0} + \frac{h}{2} (t_{0}+y_{0}) + \frac{h}{2}t_{1}
$$
Subbing in our values we get:

$$
y_{1}= 1.244\dot{4}
$$
$$
y_{2} = y_{1}
$$