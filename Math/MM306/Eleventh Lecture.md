#### Order of convergence

We suppose $\exists \text{constants c and p}$ such that the error of the method satisfies
$$
||e_{r}||_{\infty} = \max\limits_{1 \leq n \leq N} |e_{n}| \approx Ch^{p}
$$
If we assume that we compare the errors of two discretisations one with $N$ points and one with  $\frac{N}{2}$ points then we will have:

$$
\frac{\max\limits_{1\leq n\leq \frac{N}{2}}|e_{n}|}{\max\limits_{1\leq n\leq N}|e_{n}|} \approx \frac{C(2h^{p})}{C(h)^{p}} = 2^{p}
$$
Taking log to both sides we obtain
$$
\tilde{P}_{n} = \frac{1}{\ln (2)}\ln (\frac{\max\limits_{1\leq n\leq \frac{N}{2}}|e_{n}|}{\max\limits_{1\leq n\leq N}|e_{n}|})
$$
#### Standard for of linear multi-step methods

$$
\sum_{j = 0}^{k} \alpha_{j}y_{n+1} = h \sum_{j = 0} ^{ k} \beta_{j}f_{n+j}
$$

Without loss of generality we assume $\alpha_{k} = 1$.

- k-step method $\text{sum}$
- explicit method $\text{if } \beta_{k} = 0$
- implicit method $\text{if } \beta_{k} \neq 0$

##### Example

rewrite AB2 and AM3 methods in standard form.

###### AB2:

$$
y_{n+1} = y_{n} + \frac{h}{2}(3f_{n} - f_{n-1})
$$
$\tilde{n} = n+1$
$$
y_{n+1+1} = y_{n+1} + \frac{h}{2}(3f_{n}-f_{n+1-1})
$$
$$
y_{n+2} = y_{n+1} + h\left( \frac{3}{2}f_{n+1}-\frac{f_{n}}{2} \right)
$$

$$
y_{n+2} - y_{n+1} = h\left( \frac{3}{2}f_{n+1}-\frac{f_{n}}{2} \right)
$$
$\alpha_{0} = 0$     $\beta_{0} = -\frac{1}{2}$
$\alpha_{1} = -1$   $\beta_{1} = \frac{3}{2}$
$\alpha_{2} = 1$    $\beta_{2} = 0$
         ^ explicit method
         2 - step Method
###### AM3:

$$
y_{n+1} = y_{n} + h \left(  \frac{3}{8}f_{n+1}+ \frac{19}{24}f_{n}-\frac{5}{24}f_{n-1}+\frac{1}{24}f_{n-2} \right)
$$
Setting $n = n+2$
$$
y_{n+3} = y_{n+2}+h \left(  \frac{3}{8}f_{n+3}+ \frac{19}{24}f_{n+2}-\frac{5}{24}f_{n+1}+\frac{1}{24}f_{n} \right)
$$
$$
y_{n+3} - y_{n+2} = h \left(  \frac{3}{8}f_{n+3}+ \frac{19}{24}f_{n+2}-\frac{5}{24}f_{n+1}+\frac{1}{24}f_{n} \right)
$$

|  $\alpha_{0}=0$   | $\beta_{0} = \frac{1}{24}$  |
| :---------------: | :-------------------------: |
| $\alpha_{1} = 0$  | $\beta_{1}= -\frac{5}{24}$  |
| $\alpha_{2} = -1$ | $\beta_{2} = \frac{19}{24}$ |
| $\alpha_{3} = 1$  |  $\beta_{3} = \frac{3}{8}$  |
$\beta_{3}$ tells us that it is implicit as it is not equal to $0$.

#### Analysis of Multi-step Methods

Assume Localizing conditions:
- $\text{approximate at }t_{n+k} \text{ given } t_{n+k-1} \text{ using multistep methods }$
- All back values are exact $$
y_{n+j} = y(t_{n+j}) \phantom{Secret uwu} j = 0,\dots,k-1
$$
Local truncation error

![[Pasted image 20250317145215.png]]


