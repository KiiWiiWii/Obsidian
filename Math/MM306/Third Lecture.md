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

Evaluating this when $x = -1$. We are gonna use the horny method here (hot).