
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
---

## Example

![[Pasted image 20250328150522.png]]
Using $K_{1} - K_{4}$, we can obtain the butcher array for this method. The bottom row is obtained from the coefficients of $K_{1}-K_{4}$ in the original question, the left row is taken from the $t_{n} + ah$, where $a$ is the row.

![[Pasted image 20250328150732.png]]


## Example 

![[Pasted image 20250328151103.png]]

![[Pasted image 20250328151214.png]]

## Example

![[Pasted image 20250328151607.png]]

## Example

![[Pasted image 20250328151847.png]]

$$
y_{n+1} = y_n + \frac{h}{6} (k_1 + 2k_2 + 2k_3 + k_4),
$$

where

$$
k_1 = f(t_n, y_n), \quad
k_2 = f\left(t_n + \frac{h}{2}, y_n + \frac{h}{2}k_1\right),
$$

$$
k_3 = f\left(t_n + \frac{h}{2}, y_n + \frac{h}{2}k_2\right), \quad \text{and} \quad
k_4 = f(t_n + h, y_n + hk_3).
$$
![[Pasted image 20250328152527.png]]

$$
R(\hbar) = 1 + \hbar r\underline{b}^{T}(I - \hbar A)^{-1}e
$$
**Step 1: Build the matrix $I - \hbar A$

$$
\begin{bmatrix}
1 & 0 & 0  \\
-\hbar C_{2} & 1 & 0 \\
-\hbar (C_{3}-a_{32}) & -\hbar a_{32} & 1
\end{bmatrix}
$$
**Step 2 compute $d = (I- \hbar A)^{-1}\underline{e}$

Solve the linear system $$
(I-\hbar A)d = \underline{e}
$$
$$
(1) d_{1} = 1
$$
$$
(2) \ \ \ \ \ - \hbar c_{2}d_{1}+d_{2}= 1 \iff d_{2} = 1 - \hbar c_{2}
$$
$$
(3) \ \ \ \ \ - \hbar (c_{3}-a_{32})d_{1} 1 - \hbar a_{32}d_{2} + d_{3} = 1 \iff d_{3} = 1 + \hbar (c_{3}-a_{32}) + \hbar a_{32}(1 + \hbar c_{2})
$$
$$
= 1 + \hbar (c_{3})+ \hbar^{2}a_{32}c_{2}
$$
