## Example 1.12

Using Horners method to find the quadratic interpolant of $$
\Delta_{4}=(0,1) (1,1) (2,4) (3,8) (5,20)
$$
Evaluated at $x = -1$.

The divided difference table is going to look like:

| $i$ | $x_{i}$ | $y[x_{i}]$ | $y[.,.]$ |  $y[.,.,.]$   |  $y[.,.,.,.]$  | $y[.,.,.,.,.]$ |
| :-: | :-----: | :--------: | :------: | :-----------: | :------------: | :------------: |
|  0  |    0    |     1      |    0     | $\frac{3}{2}$ | $-\frac{1}{3}$ | $\frac{3}{40}$ |
|  1  |    1    |     1      |    3     | $\frac{1}{2}$ | $\frac{1}{24}$ |      NaN       |
|  2  |    2    |     4      |    4     | $\frac{2}{3}$ |      NaN       |      NaN       |
|  3  |    3    |     8      |    6     |      NaN      |      NaN       |      NaN       |
|  4  |    5    |     20     |   NaN    |      NaN      |      NaN       |      NaN       |

Using the top numbers of every column:

$$
p_{4}(x) = 1 + 0x + \frac{3}{2} x(x-1) - \frac{1}{3}x(x-1)(x-2) + \frac{3}{40}x(x-1)(x-2)(x-3)
$$

Evaluating this when $x = -1$ ($p_{4}(-1)$). We are gonna use the horny method here (hot).

![[Pasted image 20250131141840.png]]

We have $d_{4}= c_{4} = \frac{3}{40}$. In the loop:

$$i = 3 : \ \ d_{4}(x-x_{3}) + c_{3}$$
$$
=\frac{3}{40} (-1 -3)-\frac{1}{3} = -\frac{19}{30}
$$
$$
i = 2 : \ \ d_{2} = d_{3}(x-x_{3}) + c_{2}  = \dots = \frac{34}{10}
$$
$$
i = 1: \dots =-\frac{34}{5}
$$
$$
i = 0 : \dots = \frac{39}{5}
$$

So $p_{4}(-1) = d_{0} =\frac{39}{5}$
