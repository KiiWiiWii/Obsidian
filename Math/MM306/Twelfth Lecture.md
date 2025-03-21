##### Convergence

![[Pasted image 20250321142142.png]]

\*holds for all $t_{n} \in [a,b]$*.

###### Consistency:

This is telling us if our numerical approximations are close enough to the exact solution.

Definition:

The multi-step method $$
\sum_{i = 0}^{k}\alpha_{j}y_{n+j}=h\sum_{j=0}^{k}\beta_{j}f(t_{n+j},y_{n+j})
$$
Is consistent if $T_{n+k}(h)\to 0$ when $h \to 0$

Now, we will look for a characterization of this definition in terms of $C_{0},C_{1},C_{2},\dots$ (error constants.)

Consider a fixed $t = t^{*}$ and we will assume that the k-step method converges to $y(t)$ as $h\to 0$ $$
y_{n+j} \to y(t^{*}) \ \ \ \ \ \forall j = 0,\dots k
$$
But this can be rewritten as: $$
y(t^{*}) = y_{n+j} + \theta_{t,j}(h)
$$
Where $\theta_{t,j} \to 0$ as $h \to 0$.

Multiplying by $\alpha_{j}$ and summing over $j$ $$
\sum_{j=0}^{k}\alpha_{k}y(t^{*}) = \sum_{j=0}^{k}\alpha_{j}y_{n+j} + \sum_{j=0}^{k}\alpha_{j}\theta_{t,j}(h)
$$ $$
y({t^{*}})\sum_{j=0}^{k}\alpha_{j} = h \times \sum_{j =0}^{k}\beta_{i}f_{n+j} + \sum_{j=0}^{k}\alpha_{j}\theta_{t,j}(h)
$$
If we take $h \to 0$, the RHS will tend to $0$, and $y(t^{*})\neq 0$, $$
C_{0} = \sum_{j=0}^{k} \alpha_{j} = 0
$$
We assume $$
\frac{y_{n+j}-y_{n}}{j\times h} \to y'(t^{*}) \ \ \ \ \ \forall j = 1,\dots,k
$$
$$
y_{n+j}-y_{n}=hjy'(t^{*})+jh\phi_{j}(h)
$$
Where $\phi_{j}(h) \to 0$ when $h \to 0$.

$$
\sum_{}^{}\alpha_{j}y_{n+j}-\sum\alpha_{j}y_{n} = hy'(t^{*})\sum j\alpha_{j} + h\sum j\alpha_{j}\phi (h)
$$
$$
h\sum\beta_{j}f_{n+j} - h y'(t^{*})\sum j \alpha_{j} = h \sum j \alpha_{i}\phi (h)
$$
$$
\sum\beta_{j}f_{n+j} -  y'(t^{*})\sum j \alpha_{j} =  \sum j \alpha_{i}\phi (h)
$$
Since $y_{n+j} \to y(t^{*})$ then $f_{n+j} \to y'(t^{*})$. $\implies f(t_{n+j},y_{n+j}) \to f(t^{*},y(t^{*}))$.

If we take $h \to 0$:
$$
C_{1}=\sum j\alpha_{j}-\sum \beta_{j} =0
$$
Our initial problem:
$$
y' = f(t,y)
$$
**Theorem:** A linear method is consistent if and only if $$
C_{0} =\sum_{j=0}^{k} \alpha_{j} = 0
$$
and
$$
C_{1} = \sum_{j=1}^{k} j \alpha_{j} - \sum_{j=0}^{k}\beta_{j} =0
$$
**Corollary** A linear multi step method that is at least of first order is consistent.

**Remark** A necessary condition for a multi-step method to be convergent is consistency.

#### Example

$$
y_{n+2}+y_{n+1}-2y_{n} = h(2f_{n+1}+f_{n})
$$

**Step 0:** is this method written in standard form?


| $\alpha_{0}=-2$ | $\beta_{0}=1$   |
| --------------- | --------------- |
| $\alpha_{1}=1$  | $\beta_{1} = 2$ |
| $\alpha_{2}=1$  | $\beta_{2}=0$   |

**Step 2:** Compute the error constants

$$
C_{0}= \sum_{j=0}^{2}\alpha_{j} = 0

$$
$$
C_{1} = \sum_{j=0}^{2}j\times \alpha_{j} - \sum_{j=0}^{2}\beta_{j}
$$
$$
= 0
$$
Thus this method is consistent.

$$
\boxed{QED}
$$
#### Example 
## Example 7.8: Investigate the convergence of the two-step explicit method

$$
y_{n+2} - y_{n+1} = h \left( f_{n+1} - \frac{2}{3} h f_n \right).
$$
(7.35)

For this method we have that $\alpha_2 = 1$, $\alpha_1 = -1$, $\alpha_0 = 0$, $\beta_2 = 0$, $\beta_1 = 1$, $\beta_0 = -\frac{2}{3}$ and so

$$
C_0 = 1 - 1 = 0, \quad C_1 = (2 - 1) - \left( 1 - \frac{2}{3} \right) = \frac{2}{3}.
$$

From our analysis above, we expect that when the method is applied to an initial value problem $y' = f(t, y)$, then it may converge to some function $\tilde{y}$, but that $\tilde{y}$ will not satisfy the ODE, i.e., $\tilde{y}' \neq f(t, \tilde{y})$. Figure 7.5 shows the results obtained by applying (7.35) to the problem 

$$
y' = -(0.25 + \sin(\pi t))y^2, \quad y(0) = 1,
$$

with the exact solution $y(t)$ plotted as a solid line. We can clearly see that the method is converging to the wrong solution as $h \to 0$. In fact, according to (7.33) the method should be converging to the solution of the problem

$$
\tilde{y}'(t) = f(t, \tilde{y}(t)) \left( \frac{\sum_{j=0}^{k} \beta_j}{\sum_{j=0}^{k} j \alpha_j} \right),
$$

which in the case of (7.35) is

$$
\tilde{y}'(t) = \frac{1}{3} f(t, \tilde{y}(t)).
$$
![[Pasted image 20250321151333.png]]

Figure 7.5: Inconsistent approximations of $y' = -(1/4 + \sin(\pi t))y^2$.

The solution of this problem is

$$
\tilde{y}(t) = \frac{3\pi}{1 + 3\pi + \frac{\pi t}{4} - \cos(\pi t)}.
$$

This function is also plotted in Figure 7.5 (with a dashed line) and we can indeed see that the numerical solutions are converging to it.

#### Zero Stability


**Intuition:** We will say that a method is zero stable if the solutions do not grow unrealistically as $t$ grows.

![[Pasted image 20250321151832.png]]

**Remark:** The consistency conditions of a method can be stated in terms of these polynomials $\rho, \sigma$.
$$
C_{0}= \sum_{j=0}^{k}\alpha_{j} =0 \iff \rho(1) = 0

$$
$$
C_{1}=\sum_{j=0}^{k}j\alpha_{j}-\sum_{j=0}^{k}\beta_{j} = 0 \iff \rho'(1) - \sigma (1) = 0
$$
![[Pasted image 20250321152831.png]]

#### Example

Study the zero stability of:
$$
y_{n+1} - \frac{3}{2}y_{n}+\frac{1}{2}y_{n-1} = \frac{h}{2}(f_{n}+f_{n-1})
$$
**Step 0:** Is this written in standard form? Not in standard form. $$
n \to n+1
$$
$$
y_{n+2} - \frac{3}{2} y_{n+1} + \frac{1}{2}y_{n} = h\left( \frac{1}{2}f_{n+1}+\frac{1}{2}f_{n} \right)
$$
**Step 1:**



| $\alpha_{0}=\frac{1}{2}$  | $\beta_{0}=\frac{1}{2}$ |
| ------------------------- | ----------------------- |
| $\alpha_{1}=-\frac{3}{2}$ | $\beta_{1}=\frac{1}{2}$ |
| $\alpha_{2}=1$            | $\beta_{2}=0$           |

**Step 2:** Assemble the first characteristic polynomial.

$$
\rho (\xi) = \frac{1}{2}-\frac{3}{2}\xi + \xi^{2}
$$

**Step 3:** Study the roots of the polynomial:

$$
\xi = \frac{\frac{3}{2} \pm \sqrt{ \frac{3}{4}-2 }}{2}
$$
$$
\xi_{1} = 1 \ \ \ \ \ \ \ \xi_{2} = \frac{1}{2}
$$

Both roots have modulus < 1 and $|\xi_{1}|=1$ is simple then the method is zero stable.

#### Example

$$
y_{n+1} - \frac{3}{2} + \frac{1}{2} y_{n-2} = h \left(  \frac{3}{4} f_{n-1} + \frac{1}{4} f_{n-2} \right)
$$
**Step 0**
$$
y_{n+3} - \frac{3}{2} + \frac{1}{2} y_{n} = h \left(  \frac{3}{4} f_{n+1} + \frac{1}{4} f_{n} \right)
$$
**Step 1**

| $\alpha_{0}=\frac{1}{2}$  |
| ------------------------- |
| $\alpha_{1} = 0$          |
| $\alpha_{2}=-\frac{3}{2}$ |
| $\alpha_{3}= 1$           |

**Step 2**

$$
\rho (\xi) = \frac{1}{2}-\frac{3}{2}\xi^{2} + \xi^{3}
$$
**Step 3**

The roots are $\xi_{0} = 1$, $\xi_{1} = 1$ and $\xi_{2}= -\frac{1}{2}$. So we have a repeated root. The modulus is lower than 1, but the root of 1 is not simple hence it is not zero stable.

**Remark:** Zero stability is necessary for convergence.