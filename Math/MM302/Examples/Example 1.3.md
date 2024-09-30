In this example, we find the Maclaurin series solution to the IVP $$
y''= -\sin(y), \ y(0) = \frac{\pi}{4}, \ y'(0) = - \frac{\pi}{4}
$$
up until the $4^{th}$ term. Remember that in the second derivative, $y$ is the same as $y(x)$. From the IVP we get $$
y''=-\sin(y)

$$
so, $$
y''(0) = -\sin(y(0))
$$
$$
y''(0) = -\frac{1}{\sqrt{ 2 }}
$$
Following this to find $y'''(0)$, using the chain rule as $y$ depends on $x$. We'll find that:

| $y(0)$      | $\frac{\pi}{4}$                                  |
| ----------- | ------------------------------------------------ |
| $y'(0)$     | $- \frac{\pi}{4}$                                |
| $y''(0)$    | $- \frac{1}{\sqrt{ 2 }}$                         |
| $y'''(0)$   | -$\frac{1}{4\sqrt{ 2 }}$                         |
| $y^{iv}(0)$ | $\frac{1}{16} ( \frac{\pi^{2}}{\sqrt{ 2 }} + 8)$ |

Plugging these value into our Maclaurin series, we find:$$
\frac{\pi}{4} - \frac{\pi}{4}x - \frac{1}{2\sqrt{ 2 }}x^{2} + \frac{\pi}{s_{4}\sqrt{ 2 }}x^{3}+\frac{1}{368}\left( \frac{\pi^{2}}{\sqrt{ 2 }} + 8 \right) x^4 + \dots
$$
Note that the $+\dots$ is important as the actual Maclaurin series is infinite, and we only demonstrated it up 'til the $4^{th}$ term.
