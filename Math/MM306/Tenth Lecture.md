
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
$y_{n+1} = y_{n} + \frac{h}{2}[f_{n}+ f_{n+1}]$, $n\geq 0,\dots,N-1$

Numerically we have to solve the nonlinear equation $$t_{nad}
y_{n+1} + f \frac{h}{2}f()
$$