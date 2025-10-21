
## Example 3.5

![[Pasted image 20251021093325.png]]

The knots are $0,1,2,3$. The data at the knots are $1,2,0,1$.

-- Sketch in the handwritten notes --

As each knot is equally spaced we get that $h_{1},h_{2},h_{3} = 1$.

First we need to find $z_{1},z_{2}$.

At $k=1$:

$$h_{1}z_{0}+2(h_{1}+h_{2})z_{1}+h_{2}z_{2}$$
$$
=6\left( \frac{y_{2}-y_{1}}{h_{2}}-\frac{y_{1}-y_{0}}{h_{1}} \right)
$$
$$
= 4z_{1}+z_{2}=6\left( \frac{0-2}{1}-\frac{2-1}{1} \right) = - 18
$$
At $k=2$:

$$
h_{2}z_{1}+2(h_{2}+h_{3})z_{2}+h_{3}z_{3}

=6\left( \frac{y_{3}-y_{2}}{h_{3}}-\frac{y_{2}-y_{1}}{h_{2}} \right)
$$
$$
=z_{1}+4z_{2} = 6\left( \frac{1-0}{1}-\frac{0-2}{1} \right)=18
$$
Subtracting the 2nd equation from the 1st

$$
16z_{1}+4z_{2}=-4\times 18
$$
$$
z_{1}+4z_{2}=18
$$
$$
15z_{1}=-5\times 18 \times 3 \times 6 

$$
$$
z_{1}=-6
$$
$$
z_{2}=6
$$
Throwing all ts into the formula 3.10:

$k=1$:

$$
s_{1}(x)= \left( \frac{y_{0}}{h_{1}}-\frac{z_{0}h_{1}}{6} \right)(x_{1}-x) + \left( \frac{y_{1}}{h_{1}}-\frac{z_{1}h_{1}}{6} \right)(x-x_{0}) + \frac{z_{0}}{6h_{1}}(x_{1}-x)^{3} + \frac{1}{6h_{1}}(x-x_{0})^{3}
$$
$$
= \frac{1}{1} \times (1-x) + \frac{2}{1}- \frac{-6 \times 1}{6}(x-0) - \frac{6}{6\times 1}(x-0)^{3}
$$
$$
\implies s_{1}(x) = 1 - x + 3x - x^{3}
$$
$s_{2}$ and $s_{3}$ are left as exercise.

Final step is to find $s(x)$:

$$
s(x)= 1 + 3x - x^{3} \text{  for } x \in [0,1)
$$
then $s_{2},s_{3}$ in the other intervals.

## 2D Interpolation

Given values $u_{k}$ at the points $(x_{k},y_{k})$, find a function that might interpolate the data at these points.

Think about this grid of points, and split it up by thinking about these red triangles which have corners with 3 neighboring $(x_{k},y_{k})$.

![[Pasted image 20251021100436.png]]

We'll find the linear interpolant of the data on each triangle separately.

-- Note that $I_{k}$ is meant to be $\Phi_{k}$. --

Want to find affine function $I_{k}(\xi,\eta)$ for $k=1,2,3$ with $I_{k} =1$ at $Kth$ corner and zero at other 2 corners.

Set $(\xi_{1},\eta_{1})=0,0$ $(\xi_{2},\eta_{2})=(1,0)$ and $(\xi_{3},\eta_{3})=(0,1)$. Then $I_{k}(\xi_{j},\eta_{j}) = 1 \text{ if } j= k \text{ 0 otherwise}$.
$$
\Phi_{1}(\xi,\eta)=1-\xi -\eta
$$
$$
\Phi_{2}(\xi,\eta) = \xi
$$
$$
\Phi_{3}(\xi,\eta)= \eta
$$

Linear interpolant on $\mathcal{T}$ of data values $u_{k}$ at $(\xi_{k} \eta_{k})$ is $U_{L}(\xi,\eta)$ which is 
1) an affine function of $\xi$ and $\eta$
2) $u_{L}(\xi_{k},\eta_{k})=u_{k}$ for $k=1,2,3$.

Formula:
$$
u_{L}(\xi,\eta)= \sum_{k=1}^{3}u_{k}\Phi _{k}(\xi,\eta)
$$
To verify this: 

At point $(\xi _{j},\eta _{j})$
$$
RHS = \sum_{k=1}^{3}u_{k}\Phi _{k}(\xi _{j},m_{j}) = u_{j}\Phi _{j}(\xi _{j}, \eta _{j}) = u_{j}
$$
## Example 3.6
![[Pasted image 20251021101923.png]]

$u$ is an affine function on $\mathcal{T}$, find linear interpolant for corner values of $u$, show $u_{L}=\hat{u}$.

$u$ is affine. SO $u(\xi,\eta)= a\xi +\beta +c$ for some real coefficients.
$\implies$ corner values: $u_{1}=u(0,0)=c$, $u_{2}=u(1,0)= a +c$ and $u_{3}=u(1,1) = b + c$.

$$
\implies u_{L}(\xi,\eta)= \sum_{k=1}^{3}u_{k}\Phi _{k}(\xi,\eta) = c\times (1 - \xi - \eta) + ( a + c)\xi + (b +c)\eta
$$
$$
=c + a \xi + b \eta = u(\xi,\eta)
$$

![[Pasted image 20251021102528.png]]

We want an affine map $\underline{F}: \mathcal{T} \to T$ that maps corner $(\xi _{k},\eta _{k}) \to \underline{\Gamma}_{k}(x_{k},y_{k})$, we need to show:

$$
\underline{F}(\xi,\eta) = \sum_{k=1}^{3}\Phi _{k}(\xi,\eta)\underline{\Gamma}_{k}
$$
as
$$
\underline{F}(\xi _{j},\eta _{j}) = \sum_{k = 1}^{3} \Phi _{k}(\xi _{j},\eta _{j}) \times \underline{\Gamma}_{k} = \Phi _{j}(\xi _{j},\eta _{j}) \underline{\Gamma}_{j} = \underline{\Gamma}_{j}
$$
`this notation is giving me a fucking aneyurism`

Mapping:

$$
\underline{F}: \mathcal{T} \to T
$$
i.e $\underline{F}:(\xi,\eta) \to (x,y)$.
$$
(x,y) = \underline{F}(\xi,\eta)
$$
and solve to find $\xi,\eta$ in terms of $x$ and $y$.

Inverse map:

$$
\underline{F}^{-1}(x,y) \to (\xi,\eta)
$$
## Example 3.7
![[Pasted image 20251021103431.png]]

-- Sketch in the notes --

$$
\underline{F}(\xi,\eta)= \sum_{k=1}^{3}\Phi _{k}(\xi,\eta)\underline{\Gamma}_{k}= (1 - \xi - \eta)(0,0) + \xi (h,0) + \eta (0,h)
$$
$$
=(\xi h,\eta h)
$$
So $\underline{F}(\xi,\eta)= (x,y)$ with $(x,y) = (\xi h,\eta h)$
i.e. $x= \xi h$, $y=\eta h$.solve thse equations to find $\xi$ and $\eta$ in terms of $x$ and $y$.

To find $\underline{F}^{-1}$ 