In the context of vectors, $\underline{u}$ and $\underline{v}$ $\in \mathbb{R}^d$ and Linearly Dependent if the exists some non 0 constants $c_{1},c_{2}$ such that $$
c_{1}\underline{u}+c_{2}\underline{v}=0
$$
For functions, it is similar, we say that for functions which are differentiable are also linearly dependent if there exists some non 0 constants $c_{1},c_{2}$ such that $$
c_{1}f(x) + c_{2}g(x) = 0 , \ \ \forall x\in[a,b]$$
By the definition that they are differentiable, we also must have that $$
c_{1}f'(x)+ c_{2}g'(x) = 0
$$
To find these constants $c_{1},c_{2}$, we therefore need to satisfy the simultaneous equations: $$
\begin{bmatrix}
f(x) & g(x)  \\
f'(x)  & g'(x)
\end{bmatrix} \begin{bmatrix}
c_{1} \\
c_{2}
\end{bmatrix} = \begin{bmatrix}
0  \\
0
\end{bmatrix}
$$
The existence of a non 0 $c_{1},c_{2}$ requires:
$$
\begin{vmatrix}
f(x) & g(x) \\
f'(x)  & g'(x)
\end{vmatrix}
= 0, \ \ \forall x \in [a,b]
$$
We call this the Wronskin $W(f,g,x)$, defined as: $$
\begin{vmatrix}
f(x) & g(x) \\
f'(x)  & g'(x)
\end{vmatrix}
$$
If $W(f,g,x) \neq 0$ for any $x_{0}\in[a,b]$ then $f(x)$ and $g(x)$ are linearly independent.
