
![[Pasted image 20250203142208.png]]

## Example 2.1

Find $\mid \mid\underline{v}\mid\mid_{\infty}$ $\mid \mid\underline{v}\mid\mid_{1}$ and $\mid \mid\underline{v}\mid\mid_{2}$ for $$
(i) \underline{v} = (1, -1,2,3, -3,-2,3)
$$
The $\infty$ norm of $\underline{v}$ is the max term in the set.
$$
\lvert \underline{v} \rvert _{\infty} = 3
$$
The 1-norm of $\underline{v}$ is the sum of all the terms modulus-ed.
$$
\lvert \underline{v} \rvert_{1} = 14
$$
The 2-norm is the square sum and root of all the terms.
$$
\lvert \underline{v} \rvert _{2} = 6
$$
$$
(ii) \underline{v} = (1,-1,1,-1)
$$
$$
\lvert \underline{v} \rvert _{\infty} = 1
$$
$$
\lvert \underline{v} \rvert _{1} = 4
$$
$$
\lvert \underline{v} \rvert _{2} = 2
$$
$$
(iii)\underline{v} = (0,3,0,0)
$$
$$
\lvert \underline{v} \rvert _{\infty} = 3
$$
$$
\lvert \underline{v} \rvert _{1} = 3

$$
$$
\lvert \underline{v} \rvert _{2} = 3
$$
---

## Applying Norms for continuous functions

We do the same thing but instead of doing the sum of the terms we take the integral of the functions.

![[Pasted image 20250203142859.png]]

## Example 2.2

![[Pasted image 20250203143012.png]]

Suppose that $f$ is an integrable function on $[a,b]$, so $\lvert f \rvert_{1} = \int _{a}^{b} \lvert f \rvert \, dx$.

a) Clearly $\lvert f \rvert_{1}$ is $\geq 0$. It can only $= 0$ if $f = 0$ for all $x \in [a,b]$, so $$
\lvert f \rvert _{1} = 0 \iff f = 0
$$
b) $$
    \int _{a}^{b}\lvert \lambda f \rvert  \, dx = \int _{a}^{b}\lvert \lambda \rvert \lvert f \rvert   \, dx  = \lvert \lambda \rvert \lvert \lvert f \rvert  \rvert 
$$
c) Suppose $g$ is also integrable over $[a,b]$. Then $$
\int _{a}^{b}\lvert f(x)+g(x) \rvert  \, dx \leq \int _{a}^{b}|f(x)| + |g(x)| \, dx
$$
From the triangle inequality.


## Example 2.3

![[Pasted image 20250203143847.png]]

Here $[a,b] = [-1,1]$ and $f(x) = x$. $$
\lVert f \rVert _{\infty} = 1
$$
$$
\lVert f \rVert _{1} = \int _{-1}^{1} |x| \, dx = \int _{-1} ^{0}-x \, dx  + \int _{0}^{1} x \, dx  = \frac{1}{2} + \frac{1}{2} = 1
$$
$$
\lVert f \rVert _{2} = \sqrt{ \int _{-1}^{1} x^{2} \, dx  } = \sqrt{ \frac{x^{3}}{3} } = \sqrt{ \frac{2}{3} }
$$
(ii) Here $[a,b] = [-\frac{\pi}{2}, \frac{\pi}{2}$ and $f(x) = \sin x$
$$
\lVert f \rVert _{\infty} = 1
$$
$$
\lVert f \rVert _{1} = \int _{-\frac{\pi}{2}} ^{ \pi/2} |\sin x| \, dx = 2\int _{0}^{\pi/2} \sin x \, dx = 2 
$$
$$
\lVert f \rVert _{2} = \sqrt{ \int _{-\frac{\pi}{2}}^{\pi/2} \sin ^{2} x \, dx  } = \left[ \frac{1}{2}x-\frac{1}{4}\sin2x \right]_{-\frac{\pi}{2}}^{\pi/2} = \frac{\pi}{2}
$$

## Example 2.4

![[Pasted image 20250203145245.png]]


Suppose $m$ and $n$ are whole numbers with $m \neq n$. Then $$
\int _{-\pi} ^{\pi} \cos (mx)\cos (nx) \, dx 
$$
Will be zero.

$$
= \frac{1}{2} \int _{\pi}^{\pi} [\cos (m+n) + \cos (m-n)x]\, dx 
$$
$$
= \frac{1}{2} \left[ \frac{\sin (m+n)x}{m + n} + \frac{\sin (m-n)x}{m-n} \right]_{-\pi}^{\pi}
$$
$$
=0
$$
## Example 2.5

![[Pasted image 20250203145554.png]]

Let $T_{m}(x)$ and $T_{n}x$ be two distinct Chebyshev polynomials, $[a,b] = [-1,1]$ and $w(x) = \frac{1}{\sqrt{ 1-x^{2} }}$ Then

$$
\langle T_{m}, T_{n} \rangle = \int _{-1}^{1}w(x)T_{m}(x)T_{n}(x) \, dx
$$
$$
= \int _{-1}^{1} \frac{\cos (m\cos ^{-1}(x))\cos (n\cos ^{-1}x)}{\sqrt{ 1-x^{2} }} \, dx
$$
If $x = \cos u$ then $dx = -\sin u du$ and $w(u) = \sin u$, So,

$$
\langle T_{n},T_{m} \rangle = \int_{\pi}^{0} \cos (m u)\cos (n u) \, du 
    $$
$$
= 0
$$
---

## Example 2.6

Find the best fitting straight line (in the least squares sense) to the data set
$∆2 = {(−1, 0), (0, 2), (1, 3)}$ using the monomial basis ${1, x}$ for $P_{1}$.

We have $$
P = \begin{bmatrix}
\phi_{0}(x_{0}) & \phi_{1}(x_{0}) \\
\phi_{0}(x_{1})  & \phi_{1}(x_{1})\\
\phi_{0}(x_{2})  &  \phi_{1}(x_{2})
\end{bmatrix} = \begin{bmatrix}
1  & -1\\
1  & 0\\
1 & 1
\end{bmatrix}, \ \  \underline{y} =\begin{bmatrix}
0 \\
2 \\
3
\end{bmatrix}
$$
So $P^{T}p =$ $$
\begin{bmatrix}
3  & 0\\
0 & 2
\end{bmatrix} , \ \ P^{T}\underline{y}=\begin{bmatrix}
5 \\
3
\end{bmatrix}
$$

Solve $P^{T}P\underline{c} = P^{T}\underline{y}$
$$
\begin{bmatrix}
3 & 0 \\
0 & 2
\end{bmatrix} \begin{bmatrix}
c_{0} \\
c_{1}
\end{bmatrix} = \begin{bmatrix}
5 \\
3
\end{bmatrix} \implies \begin{bmatrix}
c_{0} \\
c_{1}
\end{bmatrix} = \begin{bmatrix}
\frac{5}{3}\\
\frac{3}{2}
\end{bmatrix}
$$
So $P_{1}(x) = \frac{5}{3} + \frac{3}{2}x$

Note: $p_{1}(-1) -y_{0}=\frac{1}{6},p_{1}(0)-y_{1} = -\frac{1}{3} \ \ p_{1}(1) - y_{2}=\frac{1}{6}$

---

## Example 2.7

![[Pasted image 20250203154032.png]]

Note that we're using the least squares approach

We can choose any three points from $\Delta_{3}$ for out basis: here we are gonna use the first three.

$$
x_{0} = 
$$