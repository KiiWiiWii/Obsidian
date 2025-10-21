
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
s_{1}(x)= \left( \frac{y_{0}}{h_{1}}-\frac{z_{0}h_{1}}{6} \right)(x_{1}-x) + \frac{\left( \frac{y_{1}}{h_{1}}-z_{1}h_{1} \right)}{6}
$$