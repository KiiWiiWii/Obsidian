
## Linear functions

$\mathcal{L}(x)$ is linear $\iff$ $\mathcal{L}(x_{1}+x_{2}) = \mathcal{L}(x_{1}) + \mathcal{L}(x_{2})$ and $\mathcal{L}(\lambda x_{1}) = \lambda \mathcal{L}(x_{1})$.

## Newtons method

We want to solve $$
f(x) = 0
$$
1. Let us consider the linear approximation at $(x_{0}, f(x_{0}))$ $$
y(x) = f(x_{0}) + f'(x_{0})(x-x_{0})
$$
2. Choose $x_{1}$ such that $y(x_{1}) = 0$. $$
0 = y(x_{1}) = f(x_{0}) + f'(x_{0}) (x_{1}-x_{0})
$$
$$
x_{1}=x_{0}-\left( \frac{f(x_{0})}{f'(x_{0})} \right)
$$

## Geometric Derivation

![[Pasted image 20250224144017.png]]

^ i cant fucking see that at all 

![[Pasted image 20250224144055.png]]


## Example 6.1

Find the root of $$
f(x) = x^{3} + 2x^{2} - x -2
$$
Using newtons method, using $x_{0} = 1.5$.

---

#### Step 0

Compute the derivative: $$
3x^{2} + 4x - 1
$$
#### Step 1/2

Optional: $$
x_{n+1} = x_{n} - \frac{x_{n}^{3}+2x_{n}^{2} - x_{n} - 2}{3x_{n}^{2} + 4x_{n} - 1}
$$
$$
= \frac{2x_{n}^{3}+2x_{n}^{2}+2}{3x_{n}^{2} + 4x_{n} - 1}
$$
#### Step 1

$$
x_{1}=1.5 - \frac{(1.5)^{3} + 2 (1.5)^{2} - 1.5 - 2}{3(1.5)^{2}+4(1.5)-1}
$$
$$
= \frac{53}{47}
$$

$$
x_{2} = 1.1276 -\frac{(1.1276)^{3} + 2 (1.1276)^{2} - 1.1276 - 2}{3(1.1276)^{2}+4(1.1276)-1}
$$
$$
\approx 1.0117
$$
$$
x_{3} \approx 1.0001
$$
---

![[Pasted image 20250224150715.png]]

## Proof that Newtons method is convergent

Since $f'(x)$ is continuous in $N(x)$ and $f'(\alpha) \neq 0$, $f'(x) \neq 0$ $\forall x \in [\alpha - \epsilon, \alpha + \epsilon]$, $\epsilon > 0$.

i) assume $x_{0} \in I := [\alpha - \epsilon, \alpha +\epsilon ]$

-- im not writing this just look at the notes week  6 handwritten.

i feel sick :(

i hope we dont acc need to know this off by heart ion get ANY of it


## Stopping criteria

Ideally we would like to stop when $$
|\alpha - x_{n}| \ll 1
$$
Mean value theorem tells us that $$
f(x_{n}) = f(x_{n}) - f(\alpha) = f'(\xi _{n})(x_{n}-\alpha)
$$

$\xi_{n}$ lies between $x_{n}, \alpha$. $$
x_{n}- \alpha = - \frac{f(x_{n})}{f'(\xi_{n})}
$$
If $|x_{n} - \alpha| \ll 1$ then $\xi_{n} \approx x_{n}$. $$
x_{n} - \alpha = - \frac{f(x_{n})}{f'(x_{n})} = x_{n+1} - x_{n}$$

The error estimate holds $$
|\alpha - x_{n}| \approx |x_{n+1} - x_{n}|
$$
## Example 6.2

Find $^{7}\sqrt{ 1000 }$ to 3 decimal places using newtons method with $x_{0} = 3$.

if we consider $$
f(x) = x^{7} - 1000
$$
we are looking for roots of $f$.

1. $f'(x) = 7x^{6}$, $x_{n+1} = x_{n} - \frac{f(x_{n})}{f'(x_{n})}$
2. $x_{1} = 3 - \frac{3^{7} - 1000}{7 \times 3^{6}} \approx 2.7674$
3. $x_{2} = 2.7674 - \frac{2.7674^{7} - 1000}{7 \times 2.7674^{6}} \approx 2.6900874$
4. $x_{3}\approx_{2}.6827564$, error is of the order $10^{-5}$
5. $x_{4} \approx 2.682695$, error is of the order $10^{-9}$

