
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
y_{2} = y_{1} + \frac{h}{2}[(t_{1}+y_{1}) + (t_{2}+y_{2})]
$$
$$
\left( 1 - \frac{h}{2} \right)y_{2} = y_{1} + \frac{h}{2} (t_{1}+y_{1}) + \frac{h}{2}t_{2}
$$
$$
y_{2} \approx 1.587654\dots
$$
$$
y_{3} = \dots \approx 2.051577413\dots
$$

Error: $y(t) = 2e^{ t } - t - 1$.
$$
\text{local: } 
$$
$$|e_{1}| = | y(0.2) - 1.2444\dot{4}| \approx 1.64 \times 10 ^{ -3}
$$
$$
|e_{2}| \approx 4.01 \times 10 ^{ - 3}
$$
$$
|e_{3}| \approx 7.377 \times 10 ^{ - 3}
$$
$$
\text{Global:}
$$
$$
7.37\times 10 ^{ -3}
$$
-Summary in written notes on myplace-

Basically the summary is saying that all methods "work" but the trapezoidal method is the goat since it works faster to get a smaller error.

#### Linear - Multi-Step Methods

We will use $K$ -Previously obtained approximations of $y$ to compute $y_{n+1}$. First we will cover an interpolation method to help with the numerical solutions of ODE's.
##### Newton Backwards Difference Interpolating Polynomials.

$$
\nabla ^{i} f_{n}: \text{ith backward diff}
$$
$$
\nabla ^{i}f_{n} = \begin{cases} \\
\nabla ^{0}f_{n} = f_{n} \\
\nabla f_{n} = f_{n} - f_{n-1} \\
\nabla ^{i+1}f_{n} = \nabla (\nabla ^{i}f_{n})
\end{cases}
$$

##### Example

Write down all backward diff for $n = 0,\dots,4$, $i = 1,\dots,n$


|  n  | $\nabla ^{0}f_{n}$ | $\nabla f_{n}$  |    $\nabla ^{2}f_{n}$     |        $\nabla ^{3}f_{n}$         |             $\nabla ^{4}f_{n}$             |
| :-: | :----------------: | :-------------: | :-----------------------: | :-------------------------------: | :----------------------------------------: |
|  0  |      $f_{0}$       |       ---       |            ---            |                ---                |                    ---                     |
|  1  |      $f_{1}$       |  $f_{1}-f_{0}$  |            ---            |                ---                |                    ---                     |
|  2  |      $f_{2}$       | $f_{2} - f_{1}$ |   $f_{2}-2f_{1}+f_{0}$    |                ---                |                    ---                     |
|  3  |      $f_{3}$       |  $f_{3}-f_{2}$  | $f_{3} - 2 f_{2} + f_{1}$ | $f_{3} - 3f_{2} + 3f_{1} - f_{0}$ |                    ---                     |
|  4  |      $f_{4}$       |  $f_{4}-f_{3}$  | $f_{4} - 2f_{3} + f_{2}$  | $f_{4} - 3f_{3} + 3f_{2} - f_{1}$ | $f_{4} - 4f_{3} + 6f_{2} - 4f_{1} + f_{0}$ |
$\nabla ^{2}f_{2} = \nabla (\nabla f_{2})=\nabla (f_{2}-f_{1}) = f_{2}-f_{1}-(f_{1}-f_{0}) = f_{2} - 2 f_{1}+f_{0}$.
$\nabla^{2}f_{3} = \nabla (\nabla f_{3}) = \nabla (f_{3}-f_{2}) = f_{3} - f_{2} -(f_{2}-f_{1}) = f_{3} - 2 f_{2} + f_{1}$.
$\nabla^{3}f_{3} = \nabla (\nabla^{2}f_{3}) = \nabla (f_{3} - 2 f_{2} + f_{1}) = f_{3} - f_{2} - 2 (f_{2} - f_{1}) + f_{1} - f_{0}$
In fact:

$$
\nabla ^{i}f_{n} = \sum^{i}_{k=0}(-1)^{k} \begin{pmatrix}
i \\
k
\end{pmatrix} f_{n} - k
$$
We consider $$
P(t) = a_{0} + a 1 ( t - t_{n}) + a_{2} ( t - t_{n}) ( t - t_{n-1}) + a_{3}(t - t_{n})(t - t_{n-1}) ( t -t_{n-2}) + \dots + a_{n}(t-t_{n}) (t - t_{n-1})(t - t_{n-2})\dots (t - t_{1})
$$
If we want to interpolate the following data set
$$
\{ (t_{k},f_{k})\{_{k=n}^{1}\ \ \ \ \ n, n-1, n -2,\dots,1
$$
It must hold $$
P_{n}(t_{k}) = f_{k} \ \ \ \ k = n, n - 1, \dots, 1
$$
$$
f_{n} = p(t_{n}) = a_{0}  \ \ \ \ \  \text{->} \ \ \ \  a_{0} = f_{n}
$$
$$
f_{n-1} = p(t_{n-1}) = f_{n} + ( t_{n-1} - t_{n})\times a_{1} \implies a_{1} = \frac{f_{n} - f_{n-1}}{h} = \frac{\nabla f_{n}}{h}
$$

$$
f_{n-2} = p(t_{n-2}) = f_{n} + \frac{\nabla f_{n}}{h}(t_{n-2} - t_{n}) + a_{2}(t_{n-2}-t_{n}) (t_{n-2}-t_{n-1})
$$
$$
= a_{2} = \frac{f_{n}-2(f_{n}-f_{n-1}) - f_{n-2}}{-2h^{2}}
$$
$$
= \frac{-(f_{n} -2f_{n-1} + f_{n-2})}{-2h^{2}}
$$
$$
= \frac{\nabla^{2}f_{n}}{2!h^{2}}
$$
In general:
$$
a_{n} = \frac{\nabla ^{n}f_{n}}{n!h^{n}}
$$
The interpolating polynomial then looks like: 
$$
p(t) = f_{n} + \frac{ \nabla f_{n}}{h}(t -t_{n}) + \left( \frac{\nabla^{2}f_{n}}{2h^{2}} \right)(t-t_{n})(t - t_{n -1}) + \dots + \frac{\nabla ^{n}f_{n}}{n!h^{n}}(t - t_{n})(t-t_{n-1})\dots (t - t_{1})
$$

![[Pasted image 20250314151956.png]]

#### Adams - Bashforth Methods (Explicit)
$$
\int _{t_{n}} ^{ t_{n+1}} \frac{dy}{dt} \, dt = \int _{t_{n}}^{t_{n+1}} f(t,y) \, dt
$$
$$
y(t_{n+1}) - y(t_{n}) = \int _{t_{n}} ^{ t_{n+1}} f(t,y) \, dt
$$
$$
f(t,y) \approx p_{k-1}(t) \text{ which interpolates}
$$
$$
\{ (t_{i}, f_{i}) \}_{i = k, k-1,\dots,1}
$$
$$
y(t_{n+1}) - y(t_{n}) = \int _{t_{n}}^{t_{n+1}} p_{k-1}(t) \, dt
$$
Using the subs $t = t_{n} + rh$, $dt = hdr$.
$$
y(t_{n+1}) - y ( t_{n}) = \int _{0} ^{1} p_{k -1} (r ) \times h \times dr\, = h\sum_{i = 0} ^{ k -1} \gamma_{i} \nabla ^{i}f_{n}
$$
Where $\gamma_{i} = \frac{1}{i!} \int _{0} ^{ 1} \prod_{j=0}^{i}(r + j) \, dr$

#### Example

![[Pasted image 20250314152928.png]]


$$
y_{n+1} = y_{n} + h \times \sum_{i = 0} ^{ k-1} gamme_{i}\nabla ^{i}f_{n}
$$
- $k = 1$.
$$
y_{n+1} = y_{n} + h \times \gamma_{0} \nabla ^{0}f_{n} = y_{n} + hf_{n} \ \ \ \ \ \text{<- Explicit Euler Method}
$$
- $k = 2$
$$
y_{n + 1 } = y_{n} + h[\gamma \nabla ^{0}f_{n} + \gamma_{1} \nabla ^{1}f_{n}]
$$
$$
\gamma_{1} = \int _{0}^{1} r \, dr = \frac{1}{2} 
$$
$$
= y_{n+1} = y_{n} + h \left[ f_{n} + \frac{1}{2} (f_{n} - f_{n-1}) \right]
$$
$$
= y_{n} + \frac{h}{2}[3f_{n} - f_{n-1}]
$$
- $k = 3$
$$
y_{n+1} = y_{n} + h \left[ \frac{3}{2}f_{n} - \frac{f_{n-1}}{2} + \gamma _{2} \nabla ^{2}f_{n} \right]
$$
$$
\gamma_{2} = \int _{0} ^{1} r (r+1) \, dr = \frac{5}{12}
$$
$$
y_{n+1} = y_{n} + h \left[ \frac{3}{2} f_{n} - \frac{f_{n-1}}{2}+\frac{5}{12}[f_{n} - 2 f_{n-1} + f_{n-2}] \right]
$$
$$
= y_{n} + \frac{h}{12}[23 f_{n} - 16f_{n-1} + 5f_{n-2}]
$$

#### Adams - Moolton Method (Implicit)

$$
y_{n+1} = y_{n} + h \sum_{t=0}^{k} \gamma_{i} \nabla ^{i}f_{n+1}
$$
Where
$$
\gamma_{i} = \frac{1}{i!}\int _{-1}^{0} \prod_{j=0}^{k} (r +j) \, dr 
$$
##### Example:

Write AM $k = 0$ for $k = 0,1,2,3$

- $k =0$
$$
y_{n+1} = y_{n} + h \gamma_{0} + h \gamma_{0} \nabla ^{0}f_{n+1}
$$
$$
\gamma_{0} = \int _{-1} ^{ 0} dr \, = 1
$$
$$
y_{n+1} = y_{n} + (hf_{n+1}) \ \ \ \text{<-- implicit Euler}
$$
- $k =1$
$$
y_{n+1} = y_{n} + h [f_{n+1} + \gamma_{1} \nabla ^{1}f_{n+1}]
$$
$$
\gamma_{1} = \int _{-1}^{0}r \, dr = -\frac{1}{2}
$$
$$
y_{n+1} = y_{n} + h \left[ f_{n+1} - \frac{1}{2} f_{n+1} -f_{n} \right]
$$
$$
\dots \text{i didnt get to write in time}
$$
- $k = 2$
$$
y_{n+1} = y_{n} + h [(f_{n+1})]
$$