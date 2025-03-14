
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
P_{n}(t_{k}) = f_{k}
$$