
## Rk - Methods

$$
\int _{t_{n}}^{t_{n+1}} \frac{d}{dt}y \, dt = \int _{t_{n}}^{t_{n+1}} f(t,y) \, dt
$$
$$
=y(t_{n+1})-y(t_{n})=\int _{t_{n}}^{t_{n+1}} f(t,y) \, dt
$$
**Midpoint Rule**

$$
\int _{t_{n}}^{t_{n+1}}f(t,y)  \, dt \approx (t_{n+1}-t_{n})f\left( t_{n} + \frac{h}{2}, y\left( \frac{t_{n},h}{2} \right) \right) 
$$
$$
y(t_{n+1})-y(t_{n}) \approx hf\left( t_{n}+ \frac{h}{2}, y\left( t_{n}+\frac{h}{2} \right) \right)
$$
We're going to use explicit / forward Euler's methods to approximate $y\left( t_{n}+ \frac{h}{2} \right)$

$$
y\left( t_{n}+\frac{h}{2} \right) \approx y_{n}\left( t_{n}+ \frac{h}{2} f(t_{n},y(t_{n})) \right)
$$
Now we have derived the modified Euler's method.

$$
y_{n+1} = y_{n} + hf\left( t_{n}+\frac{h}{2},y_{n}+\frac{h}{2}f(t_{n}y_{n}) \right)
$$
We can use the following notation:

$$
K_{1}=f(t_{n},y_{n}) = f_{n}
$$
$$
K_{2}=f\left( t_{n}+\frac{h}{2},y_{n}+ \right)
$$
