
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
Using newtons method.

---

no - i