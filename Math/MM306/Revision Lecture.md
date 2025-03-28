
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
K_{2}=f\left( t_{n}+\frac{h}{2},y_{n}+\frac{h}{2}K_{1} \right)
$$
So we get:
$$
y_{n+1} = y_{n} + hK_{2}
$$
**Remark:** This method is no longer linear in $f$.

- Trapezoidal rule
$$
y(t_{n+1}) - y(t_{n}) \approx \frac{h}{2} ( f(t_{n},y(t_{n})) + f(t_{n+1}),y(t_{n+1}))
$$
$$
y(t_{n+1}) \approx y(t_{n}) + hf(t_{n},y(t_{n}))
$$
Improved Euler's Method
$$
y_{n+1} = y_{n} + \frac{h}{2} (f(t_{n},y_{n}) + f(t_{n} + h,y_{n} + hf(t_{n},y_{n})))
$$
Using our $K$ notation, 
$$
y_{n+1} = y_{n} + \frac{h}{2} ( K_{1}+K_{2})
$$
$$
K_{1} = f_{n}
$$
$$
K_{2} = f(t_{n} + h, y_{n} + hK_{1})
$$
![[Pasted image 20250328142942.png]]

## Analyis of RK - Methods

**Theorem**: The RK - Method is convergent if and only if it is consistent and zero stable.

**Theorem:** Rk Method is consistent if:
$$
\sum_{i = 1}^{s} b_{i} = 1
$$
![[Pasted image 20250328144000.png]]

## Absolute Stability



![[Pasted image 20250328144130.png]]
![[Pasted image 20250328144655.png]]

$$
R(\bar{h}) = 1 + \bar{h}\underline{b}^{T}(I- \bar{h}A)^{-1}\underline{e}
$$
    
