## Example 1.12

Using Horners method to find the quadratic interpolant of $$
\Delta_{4}=(0,1) (1,1) (2,4) (3,8) (5,20)
$$
Evaluated at $x = -1$.

The divided difference table is going to look like:

| $i$ | $x_{i}$ | $y[x_{i}]$ | $y[.,.]$ | $y[.,.,.]$    |     |     |
| --- | ------- | ---------- | -------- | ------------- | --- | --- |
| 0   | 0       | 1          | 0        | $\frac{3}{2}$ |     |     |
| 1   | 1       | 1          | 3        |               |     |     |
| 2   | 2       | 4          | 4        |               |     |     |
| 3   | 3       | 8          | 6        |               |     |     |
| 4   | 5       | 20         | NaN      |               |     |     |
