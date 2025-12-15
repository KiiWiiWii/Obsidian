
### 1-1

Which of the following subsets of $\mathbb{R}^3$ form linear spaces (i.e. linear subspaces of $\mathbb{R}^3$)?  
(Here $x = (x_1, x_2, x_3)$.)

(a) $\{\, x : x_1 = x_2 \text{ and } x_3 = 0 \,\}$

> Here this is a linear space as it is closed in terms of addition and multiplication

(b) $\{\, x : x_1 = x_2 + 1 \,\}$

> Here this is not a linear space as the zero element isn't in it

(c) $\{\, x : x_1, x_2, x_3 \text{ are all positive} \,\}$

> This is not a linear space because there is no zero element.

### 1-2

Determine whether or not the following sets are linear spaces.

(a) The set of real $n\times n$ matrices

> Consider matrix $$M=\begin{pmatrix}a,b \\
  c,d\end{pmatrix}$$
  Since $a=b=c=d=0$ is a valid matrix this satisfies the zero element. To show that it is closed under addition consider another matrix $$
N = \begin{pmatrix}
w & x \\
y & z
\end{pmatrix}
$$Then, $$
M + N=\begin{pmatrix}
a+w & b+x \\
c+y & d+z
\end{pmatrix}
$$Which results in a real matrix as these additions $\in \mathbb{R}$. Consider some real number $\alpha$,then
$$
\alpha M=\begin{pmatrix}
\alpha a & \alpha b  \\
\alpha c & \alpha d
\end{pmatrix}
$$  Since $\mathbb{R}\times \mathbb{R} = \mathbb{R}$, this is also a real matrix   in our space. Hence, the set of real $n\times n$    matrices is a linear space.

(b) The set of symmetric real $n\times n$ matrices.

> Consider matrix $M$ with $M_{ij}=M_{ji}$. Clearly, the zero element exists when $M_{ij}=0$ $\forall i,j$. Similarly consider another matrix $N$ with $N_{ij}=N_{ji}$. Then,$$
M + N = \begin{pmatrix}
m_{0,0} +n_{0,0} & m_{0,1} + n_{0,1}  &  \dots \\
m_{1,0} + n_{1,0} & m_{1,1}+n_{1,1}  &  \dots \\
\dots & \dots & m_{n,n} + n_{n,n}
\end{pmatrix}
$$(the rest of this is literally the same as the other example)

(c) The set of real $2\times 2$ matrices which have positive determinants.

> Consider matrix $M$ $$
M = \begin{pmatrix}
a  & b  \\
c & d
\end{pmatrix}
$$Then, $\det M=ad - bc$. Constricted to positive determinants we get $ad - bc > 0$ $\implies ad>bc$. This means that there is no zero element in the set as if $a$ or $d=0$, then $b$ and $c \neq 0$.

(d) $\{f \in C[-1,1] : f(0) = 0\}$

> Consider the function $f(x) = 0$, this satisfies $f(0)=0$, and $\forall x, f(x)=0$, hence it contains the zero element.
> Consider another function $g(x)$. Then consider $f(0) + g(0)=0$ which is also in the set, so it is closed under addition. Then consider some real number $\alpha$. Then, $\alpha f(0)=0$ which is also in the set.

(e) $\{f \in C[-1,1]: f(0) = 1\}$

> Clearly this is not a linear space as no function can be the zero element, i.e. $\forall x f(x)=0$ since we know $f(0)=1$

### 1-3

Find $|| v ||_{l_{1}}, || v ||_{l_{2}}$ and $|| v ||_{l_{\infty}}$ for

(a) $v = (3,-4,0,2)^{T}$

> The $l_{1}$ norm is the sum of the modulus of the elements. Here we have $3 + 4 +0 + 2 = 9$. The $l_{2}$ norm is the sum of the squares of the modulus of elements and the sum taken the square root of. here it is $3^{2}+4^{2}+0^{2}+2^{2} =29$, Then taking the root we get $\sqrt{ 29 }$. The $l_{\infty}$ is the biggest element of the modulus of elements. Here we have 4.

(b) $v = ( 2, - 1, -3, - 4)^{T}$

> $l_{1}=10$, $l_{2}= \sqrt{  4 + 1 + 9 + 16} = \sqrt{  30}$, $l_{\infty}=4$

### 1-4

Show that $|| . ||_{l_{2}}$ defines a norm on $\mathbb{R}^{n}$

> To show this, we need to prove the norm is greater than zero, only zero if $v$ is zero itself, $|| \alpha v || = |\alpha||| v ||$ and $|| u + v || \leq || u || + || v ||$.

### 2-1

Let $V = \mathbb{R}^{2}$ and $v = (3, -1)^{T}$. Determine all best approximations of $v$ from $A=\{(x,y)^{T}: y =0\}$ in both the $l_{2}$ and $l_{\infty}$ norms.

> In order to find a best approximation across a norm, we have some point $\underline{a} \in A$ in the form $(x,0)$ since $y=0$. Consider $v - a=(3-x,-1)$. Then the best approximation is the minimum in the $l_{2}$ norm is $|| v-a ||_{l_{2}}$ with this being $\sqrt{ (3-x)^{2} + 1 }$. Since the square has the same minimum as the $l_{2}$ norm, we get $f(x) = (3-x)^{2} +1$. Then, $f'(x) = -2(3-x)$, $f''(x)=2$. Hence, we have a local minimum at $x=3$, so our best approximation is $a=(3,0)^{T}$ which is unique.
> To find the $l_{\infty}$ norm, we want to find the minimum of $\max\limits_{}(|3-x|,1)$. Here the smallest we can get is $1$, occurring when $|3-x|\leq 1$, so $x \in [2,4]$. This means there are an infinite amount of best approximations $\in [2,4]$ with $|| v - a^{\star} ||_{l_{\infty}}=1$.

### 2-2

Find the best approximation of $u(x)$ on the interval $[-1,1]$ by a constant function in each of the $L_{2}$ and $L_{\infty}$ norms where $u(x)$ is defined by $$
u(x)=\begin{cases}
0, \text{ for } \varepsilon \leq |x| \leq 1 \\
1-\frac{|x|}{\varepsilon} \text{, for } |x| < \varepsilon
\end{cases}
$$Here, $0 < \varepsilon<1$ is a constant.

> Here, to find the $L_{2}$ norm, we want to find $E(x) = \int _{-1}^{1}(u(x)-c)^{2} \, dx$, where $c$ is the constant we want to approximate. Since this function is 0 everywhere except for some area around 0 where it is a triangle, which has an area of $\frac{1}{2}(1)(2\varepsilon)=\varepsilon$. Now, to find the minimum of the error we want $E'(x)=0$. $E'(x)=\varepsilon - \int _{-1}^{1}c \, dx$ Hence we get $\varepsilon - [c(-1) - c(1)]$, so we get $\varepsilon -2c=0 \implies \varepsilon = 2c$ or $c = \frac{\varepsilon}{2}$.
> To find the $L_{\infty}$ norm, we want to minimise $\max\limits_{}|u(x) - c|$. Since the maximum of our function is always 1 $\forall \varepsilon$, we have that $|c| <1$. To find the specific minimum we find $c = \frac{\max\limits_{}(u) + min(u)}{2}=\frac{1}{2}$

### 2-5

Find the best $L_{2}$ norm approximation to $u(x)=x^{4}$ on $[-1,1]$ out of $P_{3}$.

> Here our basis is $\{1,x,x^{2},x^{3}\}$. Since $x^{4}$ is an even function, we only need to consider $\{1,x^{2}\}$. Then, $b= \{b_{1},b_{2}\}$ with:
> $b_{1}= \langle u(x),\phi_{1} \rangle = \int _{-1}^{1}x^{4} \, dx=\frac{2}{5}$
> $b_{2}= \langle u(x), \phi_{2} \rangle = \dots = \frac{2}{7}$
> Then, we find matrix $M$:
> $M_{00}=\langle 1,1 \rangle = 2$
> $M_{01}= \langle 1,x^{2} \rangle = \frac{2}{3}$
> $M_{10}= \langle x^{2},1 \rangle = \frac{2}{3}$
> $M_{11}=\langle x^{2},x^{2} \rangle = \frac{2}{5}$
> Hence we solve the system:
> $$
\begin{pmatrix}
2 & \frac{2}{3} \\
\frac{2}{3} & \frac{2}{5} 
\end{pmatrix}\begin{pmatrix}
\alpha_{1} \\
\alpha_{2}  
\end{pmatrix}
= \begin{pmatrix}
\frac{2}{5} \\
\frac{2}{7}
\end{pmatrix}
$$ 
> Hence we obtain $\alpha_{2}=\frac{6}{7}$ and $\alpha_{1}=-\frac{3}{35}$.Then, our best approximation $a^{\star}=\frac{6}{7} x^{2}- \frac{3}{35}$.

### 3-1

Find the interpolating polynomial $p  \in P_{3}$ for the data $(0,1),(1,3),(3,2),(4,4)$ and evaluate $p(2)$.

> To do this we use Lagrange polynomial basis functions for our $P_{n}$. To do this, each Lagrange polynomial is defined as $l_{j}(x)= \prod_{i=j_{i\neq j}}^{n} \frac{x - x_{i}}{(x _{j}-x_{i})}$. Then our interpolating polynomial will be $p(x)=\sum_{j=0}^{n}y_{j}l_{j}(x)$.
> $l_{1}(x)=\frac{(x-1)(x-3)(x-4)}{(-1)(-3)(-4)}$
> $l_{2}(x)=\frac{(x)(x-3)(x-4)}{(1)(1-3)(1-4)}$
> $l_{3}(x)=\frac{(x)(x-1)(x-4)}{(3)(3-1)(3-4)}$
> $l_{4}(x)=\frac{(x)(x-1)(x-3)}{(4)(4-1)(4-3)}$
> So we get:
> $$
\frac{(x-1)(x-3)(x-4)}{-12} + \frac{(x)(x-3)(x-4)}{6}(3)+\frac{(x)(x-1)(x-4)}{-6}(2)+\frac{(x)(x-1)(x-3)}{12}(4)
$$
  Then, for $p(2)$ we get $$
\frac{1}{6}+\frac{4}{6}(3) + \frac{4}{6}(2) - \frac{1}{6}(4) = \frac{17}{6}
$$
-- There's an arithmetic error but idgaf --

### 3-3

Let $f(x)=x^{2}$ and calculate $S(x)$, the linear spline which interpolates $f$ at the knots $x_{0}=0$, $x_{1}=2$ and $x_{2}=4$ and evaluate $S(1)$ and $S(3)$. Bind the maximum error $|f(x)-S(x)|$ for $x \in [0,4]$.

> Here we will have 2 splines, between each pair of knots. The linear spline is:
> $$
S(x)=\frac{x_{k}-x}{x_{k}-x_{k-1}}y_{k-1} + \frac{(x - x_{k-1})}{x_{k}-x_{k-1}}y_{k}
$$
  Then, for $x \in [0,2]$, we get
  $S(x)=\frac{2-x}{2}0 + \frac{x}{2}4 = 2x$
  For $x \in [2,4]$ we get
  $S(x)= \frac{4-x}{2}4+\frac{x-2}{2}16=8-2x+8x-16=6x-8$
  Then, $S(1)=2$ and $S(3)=10$

> To bind the error, we have $$
||f-S||_{L_{\infty}} \leq \frac{1}{8}h^{2}|| f'' ||_{L_{\infty}}
$$Hence we get $|f-S| \leq \frac{1}{8}2^{2}2=1$.

### 3-5

Let $X = [-1,-\frac{1}{2},0, \frac{1}{2},1]$. Check if the following functions belong to the space $S_{X}$ and find the truncated power expansions for those which do.

(a) $f_{1}(x)= -1 + x^{2} +3x^{4}$

> This doesn't belong to the space since it does not belong in $P_{3}$.

(b) $f_{2}(x)= \sqrt{ x^{2}+x + \frac{1}{4} }$

> This does not belong since its not continuous up until the second derivative.

(c) $f_{3}(x)=5x^{3}-3x^{2}+1$

> This does belong since its continuous and of degree at most 3. Since this function is a single polynomial with no changes or breaks, then the function itself is the TPE.

## 3-8

Compute the natural cubic spline $S$ that solves the interpolation problem 
$S(0)=0$, $S(1)=-2$ and $S(2)=1$.

> Since this is a natural spline, it's second derivative is zero at the ends as outside our interval it is a straight line. To find the missing $z_{1}$ (as $z_{0}$ and $z_{2}$ are 0) We get $$
2(h_{1}+h_{2})z_{1}=6\left( \frac{y_{2}-y_{1}}{h_{2}} - \frac{y_{1}-y_{0}}{h_{1}} \right)
$$Since both $h_{1},h_{2}$ are 1, we get $$
4z_{1}=6(3 +2) =30
$$So $z_{1}= \frac{15}{2}$. So then on the interval $[0,1]$ we have $$
S_{1}(x)= (0-0)(x_{k}-x) + \left( -2 -\frac{\left( \frac{15}{2} \right)}{6} \right)(x-x_{k-1}) + \frac{\left( \frac{15}{2} \right)}{6}(x-1)^{3}
$$
$$
S_{2}(x)= \left( -2 - \frac{\frac{15}{2}}{6} \right)(1-x)+(2)(x-1) +\frac{\frac{15}{2}}{6}(2-x)^{3}
$$The splines are wrong but z is ok 

## 3-9 

Find the natural cubic spline $S(x)$ which interpolates the function $f(x)=x^{4}$ at the knots $[-1,0,1]$.

> Here we have $S(-1)=1$, $S(0)=0$ and $S(1)=1$. Since $x^{4}$ is symmetric we will have the spline on $[-1,0]$ be the same as the one on $[0,1]$. Since we are finding a natural spline we know the end $z$ are going to be 0, i.e. $z_{0},z_{2}=0$. Then, we just need $z_{1}$ to find the spline. $$
2(1 + 1)z_{1} = 6 (1-0 - (0 - 1)) = 12
$$
$$
4z_{1}=12 \ \ \ \ z_{1} =3
$$
 Then, we get $S_{1}(x)= S_{2}(-x)$, with $$
S_{1}(x)= (1 - 0)(-x) + \left( -\frac{1}{2} \right)(x-1) + \frac{1}{2}(x-1)^{3}
$$ $$
=\frac{1}{2}(x-1)^{3} - \frac{3}{2}x + 1
$$
The arithmetic is wrong again but wtv

## 3-10

Find the maps $F$ and $F^{-1}$ and the basis functions $\phi _{k}$ for the triangle $T_{1}$ with nodes $r_{1}=(0,1)^{T}$, $r_{2}=(h,1)^{T}$ and $r_{3}=(0,1+h)^{T}$.

> To map onto $F$ we do $$
F(\xi,\eta) = (1 - \xi - \eta)r_{1} + \xi r_{2} + \eta r_{3}
  $$
  $$
= F(\xi,\eta) = \begin{pmatrix}
h\xi \\
1 + h\eta
\end{pmatrix}
  $$
  Then the inverse map is found my changing  the top part of the vector $x=h\xi$ in terms of $\xi$, and the bottom $y=1+h\eta$ in terms of $\eta$. So we get, $$
F^{-1}(\xi,\eta)=\begin{pmatrix}
\frac{x}{h} \\
\frac{y-1}{h}
\end{pmatrix}
    $$Then to find the basis functions $\phi _{k}$ we first need to find node 1, since we already have $\xi$ and $\eta$ (nodes 2 and 3). $r_{1}=1-\xi -\eta = \frac{h-x-y+1}{h}$

## 3-11

Find the maps $F$ and $F^{-1}$ and the basis functions $\phi _{k}$ for the triangle $T_{1}$ with nodes $r_{1}=(0,1)^{T}$, $r_{2}=(-h,1)^{T}$ and $r_{3}=(0,1+h)^{T}$.

> Here we have a similar thing with $F$ being $$
F = (1 - \xi - \eta)(0,1) + \xi (-h,1) + \eta (0,1+h)
$$
$$
= F = \begin{pmatrix}
-h\xi\\
1 + h\eta
\end{pmatrix}
$$  And $$
  F^{-1}=\begin{pmatrix}
-\frac{x}{h} \\
\frac{y-1}{h}
\end{pmatrix}
$$  With $r_{1}=1-\xi -\eta = 1 + \frac{x}{h} -\frac{y-1}{h} =\frac{x-y+1+h}{h}$.


## 4-2

Use $m$-point Gaussian quadrature for $m=1,2,3$ to approximate the integral of $f(x)=\sin (x)$ over the interval $\left[ \frac{0,\pi}{2} \right]$ and use the value of the exact integral to work out the error of each approximation.