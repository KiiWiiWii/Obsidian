
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
