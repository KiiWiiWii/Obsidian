
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
So $p_{3}(x) = 0 + 1x + 0x^{2} + 0x^{3} = x$ 