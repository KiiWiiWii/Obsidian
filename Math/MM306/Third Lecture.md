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

## Example 1.13

Add an extra interpolation point at $x_{4} = -1$ to the estimate of $e^{x}$ in Ex.11 and use it to update the estimate of $e^{1.5}$. The table is:

| $i$ | $x_{i}$ | $y[.]$ | $y[.,.]$ | $y[.,.,.]$ | $y[.,.,.,.]$ |
| --- | ------- | ------ | -------- | ---------- | ------------ |
| 0   | 0       | 1      | 1.718    | 1.476      | 0.846        |
| 1   | 1       | 2.718  | 4.671    | 4.012      | NaN          |
| 2   | 2       | 7.389  | 12.696   | NaN        | NaN          |
| 3   | 3       | 20.086 | NaN      | NaN        | NaN          |
Adding a new point:

| $i$ | $x_{i}$ | $y[.]$ | $y[.,.]$ | $y[.,.,.]$ | $y[.,.,.,.]$ | $y[.,.,.,.,.]$ |
| --- | ------- | ------ | -------- | ---------- | ------------ | -------------- |
| 0   | 0       | 1      | 1.718    | 1.476      | 0.846        | 0.134          |
| 1   | 1       | 2.718  | 4.671    | 4.012      | 0.712        | NaN            |
| 2   | 2       | 7.389  | 12.696   | 2.589      | NaN          | NaN            |
| 3   | 3       | 20.086 | 4.929    | NaN        | NaN          | NaN            |
| 4   | $-1$    | 0.368  | NaN      | NaN        | NaN          | NaN            |
From ex 1.11 we can add the term $0.134\pi_{4}(x)$ to the interpolant. The new value of $e^{1.5}$ is $4.443$, the best so far.

# Error analysis

Rolle's theorem is:
![[Pasted image 20250131143747.png]]

Proof is in the notes but we'e skipping it for time and also idgaf


## Example 1.14

Suppose that $|f^{n}(x)| \leq M$ for all $x \in [a,b]$. Given that $f(a) = y_{0}$ and $f(b) = y_{1}$ estimate the error in the linear interpolant over $[a,b]$.

---

Here $n = 1$ so $$
e_{1}(x) = \frac{f''(\xi)}{2!}(x-a)(x-b)
$$
$$
\leq |\frac{f''(\xi)}{2}| |(x-a)(x-b)|

$$
$$
\leq \frac{M}{2} \times \frac{(b-a)^{2}}{4}= \frac{M(b-a)^{2}}{8}
$$
So $|(x-a)(x-b)|$ is maximized when $x=\frac{a+b}{2}$. Note that the error gets smaller if $b$ is closer to $a$.

Kinda a nothing burger tbh


## Example 1.15

Find the length of the interval $[a,b]$ such that a linear interpolant to $f(x) = \cos (x)$ is accurate to within $0.02$ of the correct value over $[a,b]$.

From Ex 1.14, $$
|e_{1}(x)| \leq \frac{M(b-a)^{2}}{8}
$$
Where $f''(x) \leq M$ for all $x \in [a,b]$
Here $|f''(x)| = |\cos (x)| \leq 1$ So we need to choose $b-a$ so that $$
\frac{(b-a)^{2}}{8} \leq 0.02 \iff b-a \leq 0.4
$$
---

## Example 1.16

Write down the error function for the cubic interpolant to $f(x) = e^{x}$ at the points $$
\Delta = \{ (0,1)(1,e)(2,e^{2})(3,e^{3}) \}
$$
And estimate its magnitude over $[0,3]$.

Note: assume that $|x(x-1)(x-2)(x-3)| \leq 1$ for $[0,3]$.

We have $$
e_{3}(x) = \frac{f^{iv}(\xi)}{4!}(x-0)(x-1)(x-2)(x-3)
$$
$$
= \frac{e^{\xi}}{24}x(x-1)(x-2)(x-3)
$$
Given that $e^{\xi} \leq e^{3}$ this error will be no bigger than $\frac{e^{3}}{24} = 0.837$.

![[Pasted image 20250131145544.png]]
# Evenly spaced error


![[Pasted image 20250131151551.png]]

Using this we can min-max the best possible error for our estimate.


# Example 1.19

Write $T_{2}(x)$ in polynomial form.

---

Using the identity $\cos (2A) = 2[\cos (A)]^{2} -1$ we have $$
T_{2}(x) = \cos (2\cos ^{-1}(x))
$$
$$
= 2 (\cos (\cos ^{-1}x))^{2}-1
$$
$$
=2x^{2}-1
$$
## Example 1.20


Find the zeros of $T_{n}(x)$ over $[-1,1]$.

---

Over $[-1,1]$, the image of $\cos ^{-1}x$ is $[0,\pi]$ so $T_{n}(x) = 0$ if $n\cos ^{-1}x = \frac{(2i+1)\pi}{2}$ for $i = 1,2,3,\dots,n -1$. That is the zeros of $T_{n}(x)$ are $x = z_{i}$ where $$
z_{i} =\cos \frac{2i+1}{2n}\pi, \ \ \ \ i = 0,\dots,n-1
$$
These are the Chebyshev interpolation points.

## Example 1.21

Find the maximum value of 

$$
max_{x\in[-1,1]}|T_{n}(x)|
$$
Since we are looking at a $\cos$ we can see that the maximum value will be $1$.

