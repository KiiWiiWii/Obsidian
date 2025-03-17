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
#### Local truncation error

![[Pasted image 20250317145215.png]]

$$
T_{n+k} = \left( 1-h\beta_{k} \frac{\partial f}{\partial y}|_{(t_{n+k}, \eta_{n+k})} \right)(y(t_{n+k})-\tilde{y}_{n+k})
$$
$$
\tilde{y}_{n+k} \text{ is the numerical solution.}
$$
$$
\eta_{n+k} \text{ lies between } \tilde{y}_{n+k}, y(t_{n+k})
$$
If we have an explicit method, the the Local truncation error is exactly
$$
(y(t_{n+k})-\tilde{y}_{n+k}) \phantom{uwuwuwu} (\beta_{k} =0)
$$
For implicit methods:
$$
\approx (y(t_{n+k}) - \tilde{y}_{n+k}) \phantom{uwuwuwu} (\beta_{k} \neq 0)
$$
Provided that $\frac{\partial f}{\partial t}$ is small

**Example 7.6** *Evaluate the local truncation error for the AB1 method.*

For the AB1 method $y_{n+1} = y_n + h f_n$, the LTE is  

$$
T_{n+1} = y(t_{n+1}) - y(t_n) - h f(t_n, y(t_n)).
$$

Using a Taylor series expansion at $t_n$, we have  

$$
y(t_{n+1}) = y(t_n) + h y'(t_n) + \frac{h^2}{2} y''(t_n) + O(h^3).
$$

Hence,  

$$
T_{n+1} = \left( y(t_n) + h y'(t_n) + \frac{h^2}{2} y''(t_n) \right) - y(t_n) - h f(t_n, y(t_n)) + O(h^3).
$$

Since $y'(t_n) = f(t_n, y(t_n))$, we have  

$$
T_{n+1} = \frac{h^2}{2} y''(t_n) + O(h^3).
$$
Remark: In general computing LTE for K-step methods is not easy, and this, we will derive a general formula depending only on the coefficient defining method $\alpha_{j}, \beta_{j}$.$$
T_{n+k} = C_{0}y(t_{n}) + C_{1}y'(t_{n})+C_{2}y''(t_{n})+\dots
$$
$$
C_{0} = \sum_{j =0}^{k}\alpha_{j}
$$
$$
C_{1}= \sum_{j=1}^{v}j\alpha_{j} -\sum_{j=0}^{k}\beta _{j}
$$ 
$$
\dots
$$
$$
C_{q}=\frac{1}{q!}\sum_{j=1}^{k}j^{\underline{q}}\alpha_{j}-\frac{1}{(\underline{q}-1)!}\sum_{j=1}^{k}j^{\underline{q}-1}\beta_{j}
$$
The coefficients $C_{1},C_{1},C_{2}\dots$are called the order conditions of the method

#### Definition:

![[Pasted image 20250317152249.png]]

#### Example

Verify AB1 is of first order 
$$
y_{n+1} = y_{n}+h_{n}
$$
This is already in standard form.

$$
y_{n+1}-y_{n} = hf_{n}
$$

| $\alpha_{0} = -1$ | $\beta_{0}=1$ |
| ----------------- | ------------- |
| $\alpha_{1}=1$    | $\beta_{1}=0$ |
|                   |               |
|                   |               |
Now we compute the order conditions $C_{0},C_{1},C_{2},\dots$ to express LTE as $(10)$.

$$
C_{0}=\sum_{j=0}^{1}\alpha_{j}= 0
$$
$$
C_{1} = \sum_{j=1}^{1}j\times \alpha_{j}-\sum_{j=0}^{1}\beta_{j}
$$
$$
= 1 \times 1 - (1+0) = 0
$$
$$
C_{2}=\frac{1}{2}\sum_{j=1}^{1}j^{2}\alpha_{j}-\sum_{j=1}^{1}j\times \beta_{j}
$$
$$
= \frac{1}{2}(1+1)-1\times 0 = \frac{1}{2}
$$
$$
T_{n+1}=C_{0}y(t_{n})+C_{1}hy'(t_{n})+C_{2}h^{2}y''(t_{n})+O(h^{3}) = \frac{h^{2}}{2}y''(t_{n})+O(h^{3})
$$

#### Example

**Example 7.7** *Derive the family of implicit two-step methods of the form*  

$$
y_{n+2} + \alpha_1 y_{n+1} + \alpha_0 y_n = h(\beta_2 f_{n+2} + \beta_1 f_{n+1} + \beta_0 f_n).
$$

Let us assume that $\alpha_0 = a$, a free parameter. We then have four undetermined coefficients:  
$\alpha_1, \beta_0, \beta_1$, and $\beta_2$. This suggests that we might be able to choose the coefficients such that  
the four conditions $C_0 = C_1 = C_2 = C_3 = 0$ are satisfied. From (7.25) we have  

$$
C_0 = 1 + \alpha_1 + a = 0, \quad (7.27)
$$

$$
C_1 = \alpha_1 + 2a - (\beta_0 + \beta_1 + \beta_2) = 0, \quad (7.28)
$$

$$
C_2 = \frac{1}{2} (1 + 4a) - (\beta_1 + 2\beta_2) = 0, \quad (7.29)
$$

$$
C_3 = \frac{1}{6} (1 + 8a) - \frac{1}{2} ( \beta_1 + 4\beta_2 ) = 0. \quad (7.30)
$$

From (7.27), we have $ \alpha_1 = -(1 + a) $. Substituting this into (7.29) and (7.30) we get  

$$
\frac{1}{2} (3 - a) - (\beta_1 + 2\beta_2) = 0, \quad \frac{1}{6} (7 - a) - \frac{1}{2} (\beta_1 + 4\beta_2) = 0.
$$

Hence,  

$$
\frac{1}{2} \beta_1 + 2\beta_2 = \frac{1}{2} (3 - a), \quad \frac{1}{2} \beta_1 + 4\beta_2 = \frac{1}{6} (7 - a).
$$

From (7.28) we then have  

$$
\beta_0 = -(1 + a) + 2 - \frac{2}{3} (1 - a) - \frac{1}{12} (a + 5) = -\frac{1}{12} (1 + 5a).
$$

Hence, the class of methods takes the form  

$$
y_{n+2} - (1 + a)y_{n+1} + ay_n = \frac{h}{12} ( (a + 5) f_{n+2} + 8(1 - a) f_{n+1} - (1 + 5a) f_n). \quad (7.31)
$$

---

If we go on further, then we obtain  

$$
C_4 = \frac{1}{24} ( \alpha_1 + 16) - \frac{1}{6} (\beta_1 + 8\beta_2) = -\frac{1}{24} (1 + a),
$$

$$
C_5 = \frac{1}{120} ( \alpha_1 + 32) - \frac{1}{24} (\beta_1 + 16\beta_2) = -\frac{1}{360} (17 + 13a).
$$

Hence, if $ a \neq -1 $, then the method is third-order. If $ a = -1 $, the method is fourth-order and takes the form  

$$
y_{n+2} - y_n = \frac{h}{3} ( f_{n+2} + 4 f_{n+1} + f_n ).
$$

This method is called **Simpson’s method** and is a member of the **Milne-Simpson** family of methods that can be derived in a similar manner to the **Adams methods**.
