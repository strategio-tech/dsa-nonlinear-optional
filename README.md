# DSA Assignment: Non-Linear Structures (OPTIONAL)

Accepting the GitHub Assignment will create a repo with a series of challenges at `/src/main/java/tech.strategio` and its corresponding unit tests at `/src/test/java/tech.strategio`.

Each exercise contains a class with a method. Complete the methods in an IDE such that the unit tests pass. You should run your unit tests often, either through your Java IDE or through the command line (`gradle test`).

To submit the exercises, push a commit to GitHub. Automated tests will run, and you’ll see a green checkbox if ALL unit tests pass.

## Assignment

### E02 - Find Center of Star Graph

*Optional, Difficulty rating: Easy*

There is an undirected star graph consisting of `n` nodes labeled from `1` to `n`. A star graph is a graph where there is one **center** node and **exactly** `n - 1` edges that connect the center node with every other node.

You are given a 2D integer array `edges` where each <code>edges[i] = [u<sub>i</sub>, v<sub>i</sub>]</code> indicates that there is an edge between the nodes <code>u<sub>i</sub></code> and <code>v<sub>i</sub></code>. Return the center of the given star graph.

Example 1:

![image](https://user-images.githubusercontent.com/100620410/202061481-f5461108-94c5-4da4-92a8-d3368940b996.png)

```
Input: edges = [[1,2],[2,3],[4,2]]
Output: 2
Explanation: As shown in the figure above, node 2 is connected to every other node, so 2 is the center.
```

Example 2:

```
Input: edges = [[1,2],[5,1],[1,3],[1,4]]
Output: 1
```

Constraints:

- `3 <= n <= 105`
- `edges.length == n - 1`
- `edges[i].length == 2`
- <code>1 <= u<sub>i</sub>, v<sub>i</sub> <= n</code>
- <code>u<sub>i</sub> != v<sub>i</sub></code>
- The given `edges` represent a valid star graph.

## Hints

- Many of these problems have corresponding LeetCode challenges or similar. Google is your friend, but try the problem first.

:rocket: Good Luck!
