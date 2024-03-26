$$
[lim_{ 0 \to \infty } f(x) ]
$$

If **b** is a power of 2 $=> \log_{2}b$ = the multiple of 2 needed to get b

Obvious fact but :
$$ 5n < n\log_{2}n < n^{2}< n^{3}< 2^{n}< n! < n^n$$

<span style="color:#00b0f0">Polynomial</span> time : bounded above asymptotically by $n^k$ for some k

<span style="color:#00b0f0">Exponential</span> : not bounded as above 

Problems with <span style="color:#00b0f0">polynomial</span> time are said to be <span style="color:#ffc000">tractable</span>
<span style="color:#ffc000">Tractable</span> problems admit algorithms that are practical for "reasonably sized inputs"

<span style="color:#ffc000">Principle of invariance</span> : two different implementations of the <span style="color:#00b0f0">same algorithm</span> will not differ in efficiency by more than some <span style="color:#00b0f0">multiplicative constant, </span> <span style="color:#ffc000">c</span>, 

$$
n = A \implies 100 * A = 100n
$$
$$ n^{2} = B \implies {n^{2}= 100B \implies n = \sqrt{ 100B } \implies n = 10B'}
$$
$$n^{2} = B \implies n^{2} = 1000B \implies n = \sqrt{ 1000B } \implies n \approx 31.6B'$$

$$
2^{n} = C \implies \log_{2}2^{n}= \log_{2}C \implies n = \log_{2}C \\
$$$$
\begin{align}
Consider : 2^{n} = 100C \\ \\
\implies n = \log_{2}100C  \\
\implies n = \log_{2}100 + \log_{2}C \\
\implies n \approx 6.64 + \log_{2}C \\
\implies n \approx 6.64 + C'\\
\end{align}


\begin{aligned}
Consider : 2^{n} = 1000C \\ \\
|\implies \log_{2}2^{n}= \log_{2}1000C \\
|\implies n = \log_{2}1000 + \log_{2}C \\
|\implies n \approx 9.97 + C'
\end{aligned}
$$

**<span style="font-style:italic; font-style:italic; color:#e700eb">Asymptotic Complexity </span>**
	Asymptotic efficiency is concerned with behaviour as the size of input increases without bound $\lim_{ n \to \infty }$ 

$\mathcal{O}()$ is <span style="color:#ffc000">big O</span> - 'in the order of'

Gives idea of <span style="color:#00b0f0">upper bound</span> on speed of growth

if $f(n) \in \mathcal{O}(g(n)) \implies f(n)$ grows no faster than $g(n)$

$\mathcal{O}(g(n))$ is a set of funct.s and so strictly $f(n) \in \mathcal{O}(g(n))$ (f(n) is an element of the set) but we do say $f(n)$ is $\mathcal{O}(g(n))$ or $f(n) = \mathcal{O(g(n))}$ 
to indicate that $g(n)$ is an <span style="color:#ffc000">asymptotic upper bound</span> for $f(n)$
	
E.g : $\frac{1}{2}n^{2}- \frac{1}{2}n = \mathcal{O}(n^2)$,   so $n^2$ is an asymptotic upper bound for $\frac{1}{2}n^{2}-\frac{1}{2}n$ 

Consider the highest, <span style="color:#ffc000">dominant</span>, term

| $4n^3 + 3n^2 + 1000n + 20000$ | $\mathcal{O}(n^3)$ |
| ----------------------------- | ------------------ |
| $3n^4 - 500$                  | $\mathcal{O}(n^4)$ |
| $\frac{1}{4}n -45$            | $\mathcal{O}(n)$   |
| 20                            | $\mathcal{O}(1)$   |
Definition:
$$\mathcal{O}(g(n)) = \{f(n) : \exists c \ \ \  a n d  \ \ \ n_{0} \ \ s.t. \ \ 0 \leq f(n) \le cg(n) \ \  \forall n\geq n_{0}\} $$



<span style="color:#e700eb">Proving a function is NOT in an asymptotic complexity class</span>
**Proof by contradiction** is most useful
	Recall
			> Assume is true
			> This leads to contradiction
			> i.e. original assumption is wrong


E.g.:
	Is $n^3$ in $\mathcal{O}(n^2)$ ?
		No.


Assume $n^3$ is in $\mathcal{O}(n^2)$
	$\implies \exists$ a pair of $c\geq 0$ and $n_{0}$ s.t. $0 \leq n^{3}\leq cn^2$     $\forall n\geq n_{0}$
$\implies n^{3}\leq cn^2$   $\forall n \geq n_{0}$
$\implies n \leq c$        $\forall n \geq n_{0}$      

Consider  $n_{1} = max(c + 1, n_{0})$
then  $n_{1} \geq n_{0}$ but $n_{1} \not{\leq} c$    so @ cannot be true
i.e. **contradiction** $\implies n^{3}$ is not in $\mathcal{O}(n^2)$


$\Omega(g(n))$ <span style="color:#ffc000">Asymptotic lower bound </span>

Def:

$\Omega(g(n)) = \{f(n) : \exists c \ a n d \ n_{0} \geq 0  \ s .t \ 0\leq cg(n) \leq f(n)  \forall n\geq n_{0}\}$

--

$\Theta(g(n))$ <span style="color:#00b0f0">"exact order of"</span>
	<span style="color:#ffc000">Bounds a function from above and below</span>

Def:
$\Theta(g(n)) = \{f(n) : \exists c_{1} , c_{2} \ a n d \ n_{0} >= 0 \ s.t. \ 0 \leq c_{1}g(n)\leq f(n) \leq c_{2}g(n) \  \ \forall n\geq n_{0}\}$
A funct. belongs to $\Theta(g(n))$ if $\exists$ positive const.s. $c_{1}$ and $c_{2}$ s.t. it can be "sandwiched" between $c_{1}g(n)$ and $c_{2}g(n)$ for sufficiently large n.

$f(n) = \Theta(g(n)) \iff f(n) = \mathcal{O}(g(n)) \ a n d \ f(n) = \Omega(g(n))$


To prove a funct. is in either $\mathcal{O}(g(n))$ or $\Omega(g(n))$, derive values for:
	constants c
	and $n_{0}$
which satisfy the definition of membership of the set

To show a function $f(n)$ = $\Theta(g(n))$ either:
	i) derive values for $c_{1}$, $c_{2}$, and $n_{0}$ as in def. of $\Theta(g(n))$, showing that inequalities are valid
		$0 \leq c_{1}g(n) \leq f(n) \leq c_{2}g(n)$   $\forall n\geq n_{0}$
	ii) show $f(n) = \mathcal{O}(g(n))$ and $f(n) = \Omega(g(n))$
	then conclude that it must also be in $\Theta(g(n))$

To show function $f(n) \neq \Theta(g(n))$
		need only show that it is not in $\mathcal{O}(g(n))$ or not in $\Omega(g(n))$ and then conclude that it therefore cannot be in $\Theta(g(n))$


From Pseudocode for <span style="color:#00b0f0">Asymptotic Upper Bound</span>
	Nested loops:
		$\mathcal{O}(n) * \mathcal{O}(n) = \mathcal{O}(n^2)$
	Consecutive loops:
		$\mathcal{O}(n) + \mathcal{O}(n) = \mathcal{O}(n)$


<span style="color:#e700eb">
Master Method for solving Recurrence Relations</span>
For solving recurrences of the form
	$T(n) = aT\left( \frac{n}{b} \right) + f(n)$
	where a,b are consts. and $f(n)$ is 'well-behaved'

Let $a\geq 1$ and $b>1$ be const.s

Then $T(n)$ has the following asymptotic bounds:
	i) If $f(n) = O(n^{\log_{b}(a)-e})$ for some $e>0 \implies T(n) = \Theta(n^{(log_{b}a)})$ 
	ii) If $f(n) = \Theta(n^{\log_{b}a}) \implies T(n) = \Theta(n^{\log_{b}a}\log_{2}n)$
	iii)If
		$f(n) = \Omega(n^{\log_{b}a+e})$ for some const. $e>0$ and $af\left( \frac{n}{b} \right)\leq cf(n)$  for some const. $c<1$ and all sufficiently large $n$
		Then $T(n) = \Theta(f(n))$

 $f(n)$ represents work to create the subproblems and combine their results
 Compare $f(n)$ with $n^{\log_{b}a}$ 
	 $\log_{b}a$ is critical exponent 