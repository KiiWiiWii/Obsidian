Useful Not Related (floor & ceiling functions)
	$\lfloor x \rfloor$ is largest integer $< x$ 
		rounding down
		$\lfloor 2.3 \rfloor = \lfloor 2.999 \rfloor = 2$ ; $\lfloor -1.5 \rfloor = 2$
	$\lceil x \rceil$ is smallest integer $> x$ 
		rounding up
		$\lceil 2.4 \rceil = 3$ ; $\lceil -2.4 \rceil = -2$

Complexity Classes
	$\mathcal{O}$(n)  asymptotic upper bound
		Only consider dominant term (think of $\lim_{ n \to \infty }$)
			$\exists c,n_{0}$   s.t. $0 \leq f(n) \leq cg(n)$ $\forall n\geq n_{0}$ 
			.
				**$n_{0}$ is the min value for $cg(n) \geq f(n)$**
				.
				.
	$\mathcal{\Omega}$(n) asymptotic lower bound
		 **The $n_{0}$ is the value for the $cg(n)$ to perform better than $f(n)$ $[f(n) \geq cg(n)]$**
			 $\exists c,n_{0}$ s.t. $0<=cg(n)<=f(n)$ $\forall n\geq n_{0}$ 
			 .
			 .
	$\mathcal{\Theta}$(n) **tight** asymptotic bound
		a bound above and below
			**$n_{0}$ is min value for f(n) to be between
			${c_{2}}g(n) \geq f(n) \geq {c_{1}}g(n)$**
				$\exists c_{1},c_{2},n_{0}$ s.t. $0\leq c_{1}g(n) \leq f(n) \leq c_{2}g(n)$ $\forall n\geq n_{0}$ 
				.
		Important:				${f(n) = \mathcal{\Theta(g(n))}} \iff {f(n)=\mathcal{O(g(n))} \wedge f(n)=\mathcal{\Omega}(g(n))}$ 

Process
	To prove function is $\mathcal{O}(g(n)$ or $\mathcal{\Omega}(g(n))$ 
		derive values for const.s $c, n_{0}$ to satisfy definition of set
	.
	To prove function is in $\mathcal{\Theta}(g(n))$ 
		i)
			Derive val.s for $c_{1}, c_{2}, n_{0}$ to satisfy def. of $\Theta(g(n))$, showing inequalities valid
		ii)
			show $f(n)$ in $\mathcal{O}(g(n))$ and $\Omega(g(n))$
			$\therefore$ is in $\Theta$(g(n))
	Prove not in $\Theta$(g(n))
		Prove not in either $\Omega$(g(n)) or $\mathcal{O}$(g(n))
		$\therefore$ cant be in $\Theta$(g(n)) by def.

Complexity from pseudo-code
	for loop
		= $\mathcal{O}$(n)
	i.e. nested
		= $\mathcal{O}(n) * \mathcal{O}(n)$
		$\implies \mathcal{O}(n^{2})$ 
		or $\mathcal{O}(n^{nu mber \ \ of \ \ nested \ \ loops })$ 
	successive loops
		$\mathcal{O}(n) + \mathcal{O}(n)$ 
		$\implies \mathcal{O}(2n) \equiv \mathcal{O}(n)$   

What the fuck
	Quicksort Analysis (showed up in a past paper)
	.
	WORST CASE
	$$\text{Base Cases}\begin{cases} \\

C(0) = 0 \\ \\
C(1) = 0 \\
 \\

\end{cases}$$
	if $n\geq 1$, $C(n) = C(n-1) + C(0) + (n-1)$
	$=C(n-1) + 0 + n - 1$
			recurrence relation
	$$
C(n) = C(n-1) + 0 + n - 1
$$
$$ \begin{align}
C(n-1) = C(n-2) + 0 + (n-1) - 1 \\
= C(n-2) + n - 2
\end{align}
	
	$$
$$C(n) = C(n-2) + (n-2) + (n-1)$$
$$\begin{align}
 C(n-2) = C(n-3) + (n-2) - 1   \\
 = C(n-3) + n - 3 
\end{align}$$
	$$\begin{align}
C(n) &= C(n-3) + (n-3) + (n-2) + (n-1)  \\
&= C(n-(n-1)) + (n-(n-1)) + \dots +(n-2)+(n-1) \\
&= C(1) + 1 + 2 + \dots + (n-2) + (n-1) \\
&= 0 + \sum_{i=1}^{n-1}i \\
&= \frac{1}{2}n^2 - \frac{1}{2}n

\end{align}
$$
	Solution :
		$C(n) \approx \frac{1}{2}n^2 - \frac{1}{2}n$ 

This is the best case Analysis for Quicksort
$$\text{Base Cases}\begin{cases}  \\

C(0) = 0 \\
 \\

C(1) = 0 \\
 \\

\end{cases}$$
Consider when $n=2^k$
$$\begin{align} \\
C(n) \approx 2C\left( \frac{n}{2} \right) + (n-1)  \\
C\left( \frac{n}{2} \right) = 2C\left( \frac{n}{4} \right) + \left( \frac{n}{2} - 1\right) \\
\end{align}$$
$$\begin{align}
C(n) &= 2*\left( 2*C\left( \frac{n}{4} \right) +\left( \frac{n}{2} - 1\right)+ (n-1)\right)  \\
&= 2*2*C\left( \frac{n}{4} \right) + 2\left( \frac{n}{2}  - 1\right) + (n-1) \\
&= 2*2*C\left( \frac{n}{4} \right)+(n-2) + (n-1) \\
\end{align}$$
$$
C\left( \frac{n}{4} \right) = 2*C\left( \frac{n}{8} \right) + \left( \frac{n}{4} -1\right) \\
$$
$$\begin{align} \\
C(n) &= 2*2*\left( 2*C\left( \frac{n}{8} \right) + \left( \frac{n}{4} -1\right) + (n-2) + (n-1)\right) \\
&=2^3*C\left( \frac{n}{2^3}\right) + (n-4) + (n-2) + (n-1)  \\ \\
&\text{Now consider the k'th elem}\\
&= 2^k *C\left( \frac{n}{2^k} \right)+(n-2^{k-1})+\dots+(n-2^1)+(n-2^0) \\
&=n* C\left( \frac{n}{n} \right) + k*n - (2^{k-1}+2^{k-2}+\dots+2^1+2^0) \\
&=n*[C(1)=0] + k*n -(2^k-1) \\
&=0 + (\log_{2}n)*n - 2^k + 1 \\
&=n*\log_{2}n - n + 1
\end{align}$$i.e. Best case time complexity $\mathcal{O}(n\log n)$


Recurrence Relation for mergesort
	$T(n) \approx 2T\left( \frac{n}{2}\right) + (n-1)$ if $n>1$
	with base cases
	$$\begin{cases} T(0) = 0 \\
T(1)=0

\end{cases}
	$$
	if you consider $n=2^k$ then do the mad solving from above then you get $T(n) = n\log_{2}n -n + 1$  

Recurrence Relation with const.n k
	$T(n) = k + T(\frac{n}{2})$
		Suppose
			$T(256) = k + T(128)$
			$T(256) = k + k +T(64)$
			     $\dots$
			$T(256) = k + k + k + k + k + k + k + T(2)$
			$T(256) = k + (\text{..6 k's..}) + k + T(1)$
			so $T(256) = 8k + T(1) = k\log_{2}(256) + const.$
		i.e. $T(n) = n\log_{2}(n) + constant$
		can show that $T(n)$ is $\mathcal{O}(\log_{2}n)$

Calculating $m^n$ non-negative $n$
	Is a whole ass thing 

Master Thereom (for recurrences $T(n) = aT( \frac{n}{b}) + f(n)$)
	let $a\geq 1$ and $b> 1$ be const.s
	Note: $\frac{n}{b}$ can replace $\left\lfloor  \frac{n}{b}  \right\rfloor$ or $\left\lceil  \frac{n}{b}  \right\rceil$ 
	.
		i) e is random const. not euler
			if $f(n)$ is $\mathcal{O}(n^{\log_{b}{a-e}})$ for some $e>0$ then $T(n)$ is $\Theta(n^{log_{b}{a}})$  
		ii) 
			if $f(n)$ is $\Theta(n^{\log_{b}{a}})$ then $T(n)$ is $\Theta(n^{\log_{b}{a}}\log_{2}n)$ 
		iii)
			if
				$f(n)$ is $\Omega(n^{\log_{b}{a}+e})$ for some $e>0$ and $a*f\left( \frac{n}{b} \right) \leq c*f(n)$ for some const. $c<1$ and all suff. large $n$.
			then $T(n)$ is $\Theta(f(n))$
		Compare funct. $f(n)$ with funct. $n^{\log_{b}{a}}$
		This theorem cant actually solve all recurrence relations
	.
	Solutions
		$T(n) = k + T\left( \frac{n}{2} \right)$
			Log, $\mathcal{O}(\log n)$
		$T(n) = k + T(n-1)$
		$T(n) = k + 2T\left( \frac{n}{2} \right)$
		$T(n) = \mathcal{O}(n) + T\left( \frac{n}{2} \right)$
			Linear, $\mathcal{O}(n)$
		$T(n) = \mathcal{O}(n) + 2T\left( \frac{n}{2} \right)$
			$\mathcal{O}(n\log n)$
		$T(n) = \mathcal{O}(n) + T(n-1)$
			Quadratic, $\mathcal{O}(n^2)$

Lower Bound for Sorting
	*Comparison* based sort must make $\Omega(n\log n)$ comparisons in the worst case
	.
	Comparisons can be made in decision trees
![[Pasted image 20240408131801.png]]
	Length of longest path (Root -> Leaf) is worst case
	=> Lower bound on height is lower bound on *any* comparison based sort
	.
	Thereom
		Any decision tree that sorts $n$ elements has height $\Omega(n\log n)$ 

Trees
	General:
		Graph with each vertex may have 0,1, or several children
		Each node has 1 parent
		No cycles
	Binary:
		Nodes have at most 2 children
		Child is either left or right
		Data can be in nodes
		Every BT is Considered as:
			i) The empty tree, null
			ii) a leaf storing datum (information)
			iii) a node storing a left subtree, datum, and a right subtree
	Algorithms can be defined by specifying:
		i) what they do to an empty tree
		ii) what they do to a leaf
		iii) what they do to a node (internal node)
	Recursion almost always used
	.
	Binary Search Tree:
		A binary tree (which isnt a leaf or empty) is BST iff
			i) The left sub-tree is a BST
			ii) Right sub-tree is a BST
			iii) Left sub-tree data < the node
			iv) Right sub-tree data > the node
	Minimum Spanning Tree
		Spanning tree consists of all nodes of a graph with no cycles ($[(number of vertices) -1]$ number of edges)
		.
		Min Spanning tree is a spanning tree with the least weight

Min. Spanning Tree Algos
	Prim's Algo (undirected, weighted)
		1) Have 2 sets:
			Inset (explored nodes/nodes you can use)
			Outset (unexplored nodes)
		2) Pick a random node, move to inset
		3) add edge with least weight from that node (as long as cycle doesnt form)
		4) Move the node on other side of edge to inset
		Repeat (2-4) until $|V|-1$ edges
		.
		Notes
			Asymptotic Complexity
				$\mathcal{O}(|V|^2)$ without *binary heap*
					Ideal for dense graphs
				$\mathcal{O}(|E|*\log|V\mid)$ using *binary heap* to find next node to add to inSet
					ideal for sparse graphs
			$|E|$ is number of edges
			$|V|$ is number of vertices
	Kruskal's Algo (undirected, weighted)
		1) Order all edges by weight
		2) Keep adding edge by order of lowest weight (unless it forms a cycle then skip that edge) until $|V|-1$ edges
		.
		Notes
			is $\mathcal{O}(|E|\log|V|)$
				if $n$ is number of nodes, and $m$ is number of edges then $\mathcal{O}(m\log n)$
			if edges sorted first then $\mathcal{O}(|E|\log|E|)$ 

Topological Ordering of Nodes
	ordering of vertices in a directed, acyclic graph
		if path from $v_{i}$ to $v_{j}$ then $v_{j}$ is after $v_{i}$ 
	Simple Algo for this
		1) Select a node with 0 indegree
		2) Visit node (its directional so follow edge)
		3) Remove node and the edge
		4) Repeat
		Note:
			Removing a node and edge is destructive so more likely just adding this shit to another array or smth
		If graph is in adjacency list rep. then $\mathcal{O}(|V|^2)$ 
		.
	More efficient algo for many nodes
		1) Get an array of counts (initially set to node indegree)
		2) Place all non-visited notes of count 0 in a queue
		3) Pick next node to visit, remove from queue
		4) Decrement count of each of that node's successors (those that fall to 0 are added to queue)
		.
		This algo is $\mathcal{O}(|V| + |E|)$

Djisktra's Algo (directed, shorted path)
	To find the shortest path from source to all other nodes
	.
	1) Pick a start node, with array of distances (all set to infinity/null except start node = 0)
	2) All adjacent nodes are +1 distance
	3) Pick one of the adjacent nodes and explore adjacent nodes, incrementing the distance by +1
	4) Repeat for all nodes
	.
	This step by step makes no sense but its like fucking impossible to tell from pseudocode. The algo is actually really straight forward
	For weighted graph:
		https://www.youtube.com/watch?v=_lHSawdgXpI
		$\mathcal{O}(|V|^2+|E|)$
	Unweighted graph:
		https://www.youtube.com/watch?v=UvxV6y0k6Vk
		$\mathcal{O}(|V|+|E|)$

Priority Queues
	First element taken off queue is element with highest priority
	List implement:
		get(), remove() from list / remove first elem
			$\mathcal{O}(1)$
		adding element to p.q. involves linear search to find correct priority position
			$\mathcal{O}(n)$
		e.g.
			earliest in alphabet has priority
				A C D G K
			remove an item
				C D G K
			add J
				C D G J K (linear search to find where J should go and then added)

Binary Heap
	A heap is a complete binary tree with the property:
		the element at every position is $\leq$ the element(s) at its child position(s) (if any)
		This is min-heap
	A complete binary tree
		is one s.t. the only level which need not be completely filled is the one furthest from the root, and s.t. at that level, elements must fill up places  L -> R
		(idrk either) 
		Basically in a binary tree, 
			if a node has a child with higher priority (earlier in alphabet, or wtv the condition) 
			or
			the bottom level isnt filled out Left -> Right 
			or
			The levels above the bottom level havent fully been filled in
			Then its not a binary heap
		.
		Heap Insertion 
			1) Add a child named 'hole'
			2) Examine parent of hole
				i) if less than new element then insert new element in the hole 
				ii) otherwise move parent into hole, turning the position of parent into a hole
			insertion is $\mathcal{O}(\log n)$
		Heap Deletion
			Removing highest priority item (the root) requires care in rearranging the rest to maintain the heap property.
			1) Delete item at root, leaving a hole
			2) Remove least priority item as *last* 
			3) Compare *last* with higher priority child of hole (Left child : E, Right child : D then compare with D)
			4) if child has higher priority then move it into hole, making that child's position a hole
			5) Compare *last* with the higher priority child of the new hole
			6) Keep going till you find the position *last* should be

Greedy Algorithm
	Works in phases
	Each phase, decision is made for the good without regarding future
	.
	i.e. means a local optimum chosen at each stage
	'take what you can get'
	.
	.
	hope leads to a global optimum
		for some algos it does
			and so the algo is **exact**
		others dont
			suitable for **approx. solution**

