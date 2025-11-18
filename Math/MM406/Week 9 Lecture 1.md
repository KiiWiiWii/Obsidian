
# Chapter 3: 2D

The PDE we will be looking at is as follows:
![[Pasted image 20251118100850.png]]

The most used boundary condition is $u(\underline{x}) =0$ where $\underline{x} \in \Gamma$.

$$
D = \begin{pmatrix}
d_{11} & d_{12} \\
d_{21} & d_{22}
\end{pmatrix}
$$
Which in most cases is symmetric, and 

### Example:

$$
D = Id = \begin{pmatrix}
 1  &  0 \\
0 & 1 
\end{pmatrix}
$$
then 
$$
D \nabla u = \begin{pmatrix}
1 & 0 \\
0 & 1
\end{pmatrix}\nabla u = \nabla u
$$

So then

$$
dv = ( D \nabla u) = dv ( I\nabla u) = div(\nabla u)
$$
$$
= \partial x(\partial xu) + \partial y(\partial yu) = \Delta u
$$
### Example 13

$$
D = \begin{pmatrix}
1 - M^{2} & 0 \\
0 & 1
\end{pmatrix}
$$
$$
D\nabla u = ( 1 - M^{2})\partial xu+\partial yu
$$
$$
\implies div(D\nabla u) = (1 - M^{2}) \partial x x u + \partial y y u
$$
Note that $(1-M^{2})>0$.

### Boundary Value Problem

$$
- dv(D\nabla u) = f \text{ in } \Omega
$$
$$
u =0 \text{ on } \Gamma
$$
We will first define conditions on $\Omega$:

We will assume that $\Omega$ is open, bounded, and with a polynomial Boundary.

