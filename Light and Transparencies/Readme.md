Input Format

The input begins with a single positive integer on a line by itself indicating the number of the cases following, each of them as described below. This line is followed by a blank line, and there is also a blank line between two consecutive inputs.

The input is a text file containing several lines, as follows.

The first line of the input contains the number N L (integer format) of line segments. It is followed by NL lines of text defining, each one, a line segment.

Accordingly to the above explanations, a line segment is defined by the coordinates of its two end points P1 and P2 and the transparency coeﬃcient r, in the sequence x1 y1 x2 y2 r, separated by single spaces (all the five values are in the real format). No order is considered for the two points P1 and P2.

Output Format

For each test case, the output must follow the description below. The outputs of two consecutive cases will be separated by a blank line.

The first line of the output contains the number N P (integer format) of projected segments. It is followed by N P lines of text, defining, each one, a projected segment. These lines must be sorted in ascending order of X values.

A projected segment must be de ned by its coordinates X1 and X2, followed by the evaluated percentage of light. All the tree values must be in real format, rounded to 3 decimal digits and separated by single spaces. Infinite values must be represented by -inf or +inf.