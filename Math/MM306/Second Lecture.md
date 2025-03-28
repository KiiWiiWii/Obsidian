
## Example 1.5#

Find the polynomial interpolant of $(0,0) \ \ (1,1)\ \ (2,2) \ \ (3,3)$.

---

The Vandermonde system is $$
\begin{bmatrix}
1  & 0 & 0 & 0\\
1  & 1 & 1 & 1\\
1  & 2 & 4 & 8\\
1 & 3 & 9 & 27
\end{bmatrix}
\begin{bmatrix}
a_{0} \\
a_{1} \\
a_{2} \\
a_{3}
\end{bmatrix}
=
\begin{bmatrix}
0  \\
1 \\
2 \\
3 
\end{bmatrix}
$$
$$
= \begin{bmatrix}
a_{0}  \\
a_{1} \\
a_{2} \\
a_{3} 
\end{bmatrix} =
\begin{bmatrix}
0 \\
1 \\
0 \\
0
\end{bmatrix}


$$
So $p_{3}(x) = 0 + 1x + 0x^{2} + 0x^{3} = x$. This is the unique polynomial of degree $3$ or less that passes through all the data.

---

## Example 1.6

Use $p_{2}$ from Ex 1.4 to estimate $e^{1.5}$. (Which is $4.4817$ to 4 DP).

---

We have $p_{2}(x) = 1+0.2420x + 1.4762x^{2}$. So $p_{2}(1.5) = 1 + 0.2420 \times 1.5 + 1.4762 \times 1.5^{2} = 4.6845$. 

---

## Example 1.7

Use Lagrange polynomials to find the polynomial interpolant of the data $(0,0) \ \ (1,1)\ \ (2,2) \ \ (3,3)$.

---
The Lagrange polynomials are $$
\lambda_{0}(x) = \frac{(x -1)(x-2)(x-3)}{(0 -1)(0 -2)(0 -3)} = -\frac{1}{6}(x^{3}-6x^{2}+11x-6)
$$
$$
\lambda_{1}(x) = \frac{(x-0)(x-2)(x-3)}{(1-0)(1-2)(1-3)} = \frac{1}{2}(x^{3} - 4x^{2} + 3x)
$$
$$
\lambda_{2}(x) = \frac{(x-0)(x-1)(x-3)}{(2-0)(2-1)(2-3)} = -\frac{1}{2}(x^{3} - 4x^{2} + 3x) = \frac{1}{6 ( x^{3} - 3x^{2}+2x)}
$$
$$
\lambda_{3}(x) = \frac{(x-0)(x-1)(x-2)}{(3-0)(3-1)(3-2)}
$$
So $$
p_{3}(x) = 0\lambda_{0}(x) + \lambda_{1}(x) + 2\lambda_{2}(x) + 3\lambda_{3}(x) = \dots = x
$$
---

## Example 1.8


![[Pasted image 20250127151212.png]]

$$
y[x_{0},x_{1}] = \frac{y[x_{1}] - y[x_{0}]}{x_{1}-x_{0}}
$$
$$
= \frac{1-1}{1 - 0} = 0

$$
$$
y[x_{1},x_{2}] = \frac{y[x_{2}]-y[x_{1}]}{(x_{2}-x_{1})} = 3
$$
$$
y[x_{2},x_{3}] = \frac{y[x_{3}] - y[x_{2}]}{x_{3} - x_{2}} = 4

$$

Now to calculate the $2nd$ order differences:
$$
y[x_{0},x_{1},x_{2}] = \frac{y[x_{1},x_{2}] - y[x_{0},x_{1}]}{x_{2}-x_{0}} =\frac{3}{2}
$$
$$
y[x_{1},x_{2},x_{3}] = \frac{y[x_{2}]-y[x_{3}] - y[x_{1},x_{2}]}{x_{3} - x_{1}} = \frac{1}{2}
$$
And now for the 3rd.
$$
y[x_{0},x_{1},x_{2},x_{3}] = \frac{y[x_{1},x_{2},x_{3}] - y[x_{0},x_{1},x_{2}]}{x_{3}-x_{0}} =-\frac{1}{3}
$$
It is more useful to do this using a table:


| $i$ | $x_{{i}}$ | $y[x_{i}]$ | $y[.,.]$ |  $y[.,.,.]$   |  $y[.,.,.,.]$  |
| :-: | :-------: | :--------: | :------: | :-----------: | :------------: |
|  0  |     0     |     1      |    0     | $\frac{3}{2}$ | $-\frac{1}{3}$ |
|  1  |     1     |     1      |    3     | $\frac{1}{2}$ |      NaN       |
|  2  |     2     |     4      |    4     |      NaN      |      NaN       |
|  3  |     3     |     8      |   NaN    |      NaN      |      NaN       |

---

## Example 1.9

Find the cubic interpolant of $\Delta_{3} = \{ (0,1) (1,1) ( 2,4) (3,8) \}$

---


We know that 

$$
p_{3} = c_{0} + c_{1}\pi_{1}(x) + c_{2}\pi_{2}(x) + c_{3} \pi_{3} ( x)
$$
Where $c_{i} = y[x_{0},\dots,x_{i}]$

In the last example we found the divided differences, so we will use these. $$
p_{3}(x) = 1 + 0\pi_{1}(x) + \frac{3}{2} \pi_{2}(x) - \frac{1}{3}\pi_{3}(x)
$$
$$
 = 1 + \frac{3}{2}(x -0)(x-1) - \frac{1}{3}(x-0)(x -1 )(x-2) = 1 + \frac{3}{2}x(x-1)- \frac{1}{3}x(x-1)(x-2)
$$

## Example 1.10

Using $p_{3}$ from example 1.9, evaluate $p_{3}(4)$.

$$p_{3}(x) = 1 + x (x-1)\left[ \frac{3}{2}-\frac{1}{3}(x-2) \right]$$
Evaluating this at $x = 4$,

$$
p_{3}(4) = 11
$$
---

## Example 1.11

Find the cubic interpolant to $e^{x}$ where $0\leq x\leq 3$ with equispaced points. Use it to evaluate $e^{1.5}$ and $e^{4}$.

---

The divided difference table looks like

| $i$ | $x_{i}$ | $y[.]$ | $y[.,.]$ | $y[.,.,.]$ | $y[.,.,.,.]$ |
| --- | ------- | ------ | -------- | ---------- | ------------ |
| 0   | 0       | 1      | 1.718    | 1.476      | 0.846        |
| 1   | 1       | 2.718  | 4.671    | 4.012      | NaN          |
| 2   | 2       | 7.389  | 12.696   | NaN        | NaN          |
| 3   | 3       | 20.086 | NaN      | NaN        | NaN          |

The first elements are the coefficients of $p_{3}$.

Using synthetic division.

|     | 0.846 |       1.476        |       1.718        |         1         |
| :-: | :---: | :----------------: | :----------------: | :---------------: |
| 1.5 |       | $0.5 \times 0.846$ | $0.5 \times 1.053$ | $1.5\times 2.245$ |
|  +  | 0.846 |       1.053        |       2.245        |       4.368       |

We have $e^{1.5} = 4.482\dots$ so this is OK.

|     | 0.846 |      1.476       |      1.718       |        1        |
| :-: | :---: | :--------------: | :--------------: | :-------------: |
|  4  |       | $2 \times 0.846$ | $3 \times 3.167$ | $4\times 11.22$ |
|  +  | 0.846 |      3.167       |      11.22       |      45.88      |

We have that $e^{4} = 54.60\dots$ So this is rubbish. This happens because $1.5$ is inside of our data set, $4$ however is an outsider and we have a 0 tolerance policy for immigrants.