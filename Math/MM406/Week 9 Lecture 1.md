
# Chapter 3: 2D

The PDE we will be looking at is as follows:
![[Pasted image 20251118100850.png]]

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
D\nabla u = ( 1 - M^{2})
$$
