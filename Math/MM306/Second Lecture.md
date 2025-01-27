
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
The Lagrange 