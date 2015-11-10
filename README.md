# S-99: Ninety-Nine Scala Problems
See original html description <a href="https://github.com/tamaslang/ninetynine-coding-problems/blob/master/docs/99_coding_task.html">HERE</a>

## Working with lists

In Scala, lists are objects of type `List[A]`, where _A_ can be any type. Lists are effective for many recursive algorithms, because it's easy to add elements to the head of a list, and to get the tail of the list, which is everything but the first element.

The solutions to the problems in this section will be in objects named after the problems (P01, P02, etc.). You can compile the source files with `scalac` and thereafter use `import` to bring the functions into scope. Some of the problems can be solved easily by using imported solutions to previous problems.

In many cases, there's more than one reasonable approach. The files linked here may include multiple solutions, with all but one commented out. They'll also indicate whether there's a builtin method in Scala that accomplishes the task.

<dl>

<dt id="p01">(*) Find the last element of a list.</dt>
<dd>Example:
<pre>scala> last(List(1, 1, 2, 3, 5, 8))
res0: Int = 8</pre>

<b>Scala solution:</b> <a href="https://github.com/tamaslang/ninetynine-coding-problems/blob/master/scala-ninetynine/src/main/scala-2.11/org/talangsoft/codingtests/p01LastElementInList.scala">p01LastElementInList.scala</a>
</dd>

<dt id="p02">(*) Find the last but one element of a list.</dt>

<dd>Example:

<pre>scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5</pre>

<b>Scala solution:</b> <a href="https://github.com/tamaslang/ninetynine-coding-problems/blob/master/scala-ninetynine/src/main/scala-2.11/org/talangsoft/codingtests/p02Penultimate.scala">p02Penultimate.scala</a>
</dd>

<dt id="p03">**[P03](p03.scala) (*) Find the _K_th element of a list.**</dt>

<dd>By convention, the first element in the list is element 0.

Example:

<pre>scala> nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2</pre>

</dd>

<dt id="p04">**[P04](p04.scala) (*) Find the number of elements of a list.**</dt>

<dd>Example:

<pre>scala> length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6</pre>

</dd>

<dt id="p05">**[P05](p05.scala) (*) Reverse a list.**</dt>

<dd>Example:

<pre>scala> reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)</pre>

</dd>

<dt id="p06">**[P06](p06.scala) (*) Find out whether a list is a palindrome.**</dt>

<dd>Example:

<pre>scala> isPalindrome(List(1, 2, 3, 2, 1))
res0: Boolean = true</pre>

</dd>

<dt id="p07">**[P07](p07.scala) (**) Flatten a nested list structure.**</dt>

<dd>Example:

<pre>scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
res0: List[Any] = List(1, 1, 2, 3, 5, 8)</pre>

</dd>

<dt id="p08">**[P08](p08.scala) (**) Eliminate consecutive duplicates of list elements.**</dt>

<dd>If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.

Example:

<pre>scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)</pre>

</dd>

<dt id="p09">**[P09](p09.scala) (**) Pack consecutive duplicates of list elements into sublists.**</dt>

<dd>If a list contains repeated elements they should be placed in separate sublists.

Example:

<pre>scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))</pre>

</dd>

<dt id="p10">**[P10](p10.scala) (*) Run-length encoding of a list.**</dt>

<dd>Use the result of problem [P09](#p09) to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples `(N, E)` where _N_ is the number of duplicates of the element _E_.

Example:

<pre>scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))</pre>

</dd>

<dt id="p11">**[P11](p11.scala) (*) Modified run-length encoding.**</dt>

<dd>Modify the result of problem [P10](#p10) in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as `(N, E)` terms.

Example:

<pre>scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))</pre>

</dd>

<dt id="p12">**[P12](p12.scala) (**) Decode a run-length encoded list.**</dt>

<dd>Given a run-length code list generated as specified in problem [P10](#p10), construct its uncompressed version.

Example:

<pre>scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)</pre>

</dd>

<dt id="p13">**[P13](p13.scala) (**) Run-length encoding of a list (direct solution).**</dt>

<dd>Implement the so-called run-length encoding data compression method directly. I.e. don't use other methods you've written (like [P09](#p09)'s `pack`); do all the work directly.

Example:

<pre>scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))</pre>

</dd>

<dt id="p14">**[P14](p14.scala) (*) Duplicate the elements of a list.**</dt>

<dd>Example:

<pre>scala> duplicate(List('a, 'b, 'c, 'c, 'd))
res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)</pre>

</dd>

<dt id="p15">**[P15](p15.scala) (**) Duplicate the elements of a list a given number of times.**</dt>

<dd>Example:

<pre>scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)</pre>

</dd>

<dt id="p16">**[P16](p16.scala) (**) Drop every _N_th element from a list.**</dt>

<dd>Example:

<pre>scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)</pre>

</dd>

<dt id="p17">**[P17](p17.scala) (*) Split a list into two parts.**</dt>

<dd>The length of the first part is given. Use a Tuple for your result.

Example:

<pre>scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))</pre>

</dd>

<dt id="p18">**[P18](p18.scala) (**) Extract a slice from a list.**</dt>

<dd>Given two indices, _I_ and _K_, the slice is the list containing the elements from and including the _I_th element up to but not including the _K_th element of the original list. Start counting the elements with 0.

Example:

<pre>scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g)</pre>

</dd>

<dt id="p19">**[P19](p19.scala) (**) Rotate a list _N_ places to the left.**</dt>

<dd>Examples:

<pre>scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)

scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)</pre>

</dd>

<dt id="p20">**[P20](p20.scala) (*) Remove the _K_th element from a list.**</dt>

<dd>Return the list and the removed element in a Tuple. Elements are numbered from 0.

Example:

<pre>scala> removeAt(1, List('a, 'b, 'c, 'd))
res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)</pre>

</dd>

<dt id="p21">**[P21](p21.scala) (*) Insert an element at a given position into a list.**</dt>

<dd>Example:

<pre>scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)</pre>

</dd>

<dt id="p22">**[P22](p22.scala) (*) Create a list containing all integers within a given range.**</dt>

<dd>Example:

<pre>scala> range(4, 9)
res0: List[Int] = List(4, 5, 6, 7, 8, 9)</pre>

</dd>

<dt id="p23">**[P23](p23.scala) (**) Extract a given number of randomly selected elements from a list.**</dt>

<dd>Example:

<pre>scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
res0: List[Symbol] = List('e, 'd, 'a)</pre>

Hint: Use the solution to problem [P20](#p20)

</dd>

<dt id="p24">**[P24](p24.scala) (*) Lotto: Draw _N_ different random numbers from the set 1.._M_.**</dt>

<dd>Example:

<pre>scala> lotto(6, 49)
res0: List[Int] = List(23, 1, 17, 33, 21, 37)</pre>

</dd>

<dt id="p25">**[P25](p25.scala) (*) Generate a random permutation of the elements of a list.**</dt>

<dd>Hint: Use the solution of problem [P23](#p23).

Example:

<pre>scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)</pre>

</dd>

<dt id="p26">**[P26](p26.scala) (**) Generate the combinations of _K_ distinct objects chosen from the _N_ elements of a list.**</dt>

<dd>In how many ways can a committee of 3 be chosen from a group of 12 people? We all know that there are `C(12,3) = 220` possibilities (`C(N,K)` denotes the well-known binomial coefficient). For pure mathematicians, this result may be great. But we want to really generate all the possibilities.

Example:

<pre>scala> combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
res0: List[List[Symbol]] = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), ...</pre>

</dd>

<dt id="p27">**[P27](p27.scala) (**) Group the elements of a set into disjoint subsets.**</dt>

<dd>a) In how many ways can a group of 9 people work in 3 disjoint subgroups of 2, 3 and 4 persons? Write a function that generates all the possibilities.

Example:

<pre>scala> group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David, Evi), List(Flip, Gary, Hugo, Ida)), ...</pre>

b) Generalize the above predicate in a way that we can specify a list of group sizes and the predicate will return a list of groups.

Example:

<pre>scala> group(List(2, 2, 5), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David), List(Evi, Flip, Gary, Hugo, Ida)), ...</pre>

Note that we do not want permutations of the group members; i.e. ((Aldo, Beat), ...) is the same solution as ((Beat, Aldo), ...). However, we make a difference between ((Aldo, Beat), (Carla, David), ...) and ((Carla, David), (Aldo, Beat), ...).

You may find more about this combinatorial problem in a good book on discrete mathematics under the term "multinomial coefficients".

</dd>

<dt id="p28">**[P28](p28.scala) (**) Sorting a list of lists according to length of sublists.**</dt>

<dd>a) We suppose that a list contains elements that are lists themselves. The objective is to sort the elements of the list according to their length. E.g. short lists first, longer lists later, or vice versa.

Example:

<pre>scala> lsort(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
res0: List[List[Symbol]] = List(List('o), List('d, 'e), List('d, 'e), List('m, 'n), List('a, 'b, 'c), List('f, 'g, 'h), List('i, 'j, 'k, 'l))</pre>

b) Again, we suppose that a list contains elements that are lists themselves. But this time the objective is to sort the elements according to their _length frequency_; i.e. in the default, sorting is done ascendingly, lists with rare lengths are placed, others with a more frequent length come later.

Example:

<pre>scala> lsortFreq(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
res1: List[List[Symbol]] = List(List('i, 'j, 'k, 'l), List('o), List('a, 'b, 'c), List('f, 'g, 'h), List('d, 'e), List('d, 'e), List('m, 'n))</pre>

Note that in the above example, the first two lists in the result have length 4 and 1 and both lengths appear just once. The third and fourth lists have length 3 and there are two list of this length. Finally, the last three lists have length 2. This is the most frequent length.

</dd>

</dl>

## Arithmetic

For the next section, we're going to take a different tack with the solutions. We'll declare a new class, `S99Int`, and an implicit conversion from regular `Int`s. The [arithmetic1](arithmetic1.scala) file contains the starting definitions for this section. Each individual solution will show the relevant additions to the `S99Int` class. The full class will be given at the end of the section.

<dl>

<dt id="p31">**[P31](p31.scala) (**) Determine whether a given integer number is prime.**</dt>

<dd>

<pre>scala> 7.isPrime
res0: Boolean = true</pre>

</dd>

<dt id="p32">**[P32](p32.scala) (**) Determine the greatest common divisor of two positive integer numbers.**</dt>

<dd>Use Euclid's algorithm.

<pre>scala> gcd(36, 63)
res0: Int = 9</pre>

</dd>

<dt id="p33">**[P33](p33.scala) (*) Determine whether two positive integer numbers are coprime.**</dt>

<dd>Two numbers are coprime if their greatest common divisor equals 1.

<pre>scala> 35.isCoprimeTo(64)
res0: Boolean = true</pre>

</dd>

<dt id="p34">**[P34](p34.scala) (**) Calculate Euler's totient function `phi(m)`.**</dt>

<dd>Euler's so-called totient function `phi(m)` is defined as the number of positive integers _r_ (1 <= _r_ <= _m_) that are coprime to _m_.

<pre>scala> 10.totient
res0: Int = 4</pre>

</dd>

<dt id="p35">**[P35](p35.scala) (**) Determine the prime factors of a given positive integer.**</dt>

<dd>Construct a flat list containing the prime factors in ascending order.

<pre>scala> 315.primeFactors
res0: List[Int] = List(3, 3, 5, 7)</pre>

</dd>

<dt id="p36">**[P36](p36.scala) (**) Determine the prime factors of a given positive integer (2).**</dt>

<dd>Construct a list containing the prime factors and their multiplicity.

<pre>scala> 315.primeFactorMultiplicity
res0: List[(Int, Int)] = List((3,2), (5,1), (7,1))</pre>

Alternately, use a Map for the result.

<pre>scala> 315.primeFactorMultiplicity
res0: Map[Int,Int] = Map(3 -> 2, 5 -> 1, 7 -> 1)</pre>

</dd>

<dt id="p37">**[P37](p37.scala) (**) Calculate Euler's totient function phi(m) (improved).**</dt>

<dd>See problem [P34](#p34) for the definition of Euler's totient function. If the list of the prime factors of a number _m_ is known in the form of problem [P36](#p36) then the function `phi(m>)` can be efficiently calculated as follows: Let [[_p_<sub>1</sub>, _m_<sub>1</sub>], [_p_<sub>2</sub>, _m_<sub>2</sub>], [_p_<sub>3</sub>, _m_<sub>3</sub>], ...] be the list of prime factors (and their multiplicities) of a given number _m_. Then `phi(m)` can be calculated with the following formula:

phi(_m_) = (_p_<sub>1</sub>-1)*_p_<sub>1</sub><sup>(_m_<sub>1</sub>-1)</sup> * (_p_<sub>2</sub>-1)*_p_<sub>2</sub><sup>(_m_<sub>2</sub>-1)</sup> * (_p_<sub>3</sub>-1)*_p_<sub>3</sub><sup>(_m_<sub>3</sub>-1)</sup> * ...

Note that _a_<sup>_b_</sup> stands for the _b_th power of _a_.

</dd>

<dt id="p38">**[P38](p38.scala) (*) Compare the two methods of calculating Euler's totient function.**</dt>

<dd>Use the solutions of problems [P34](#p34) and [P37](#p37) to compare the algorithms. Try to calculate phi(10090) as an example.</dd>

<dt id="p39">**[P39](p39.scala) (*) A list of prime numbers.**</dt>

<dd>Given a range of integers by its lower and upper limit, construct a list of all prime numbers in that range.

<pre>scala> listPrimesinRange(7 to 31)
res0: List[Int] = List(7, 11, 13, 17, 19, 23, 29, 31)</pre>

</dd>

<dt id="p40">**[P40](p40.scala) (**) Goldbach's conjecture.**</dt>

<dd>Goldbach's conjecture says that every positive even number greater than 2 is the sum of two prime numbers. E.g. 28 = 5 + 23. It is one of the most famous facts in number theory that has not been proved to be correct in the general case. It has been numerically confirmed up to very large numbers (much larger than Scala's Int can represent). Write a function to find the two prime numbers that sum up to a given even integer.

<pre>scala> 28.goldbach
res0: (Int, Int) = (5,23)</pre>

</dd>

<dt id="p41">**[P41](p41.scala) (**) A list of Goldbach compositions.**</dt>

<dd>Given a range of integers by its lower and upper limit, print a list of all even numbers and their Goldbach composition.

<pre>scala> printGoldbachList(9 to 20)
10 = 3 + 7
12 = 5 + 7
14 = 3 + 11
16 = 3 + 13
18 = 5 + 13
20 = 3 + 17</pre>

In most cases, if an even number is written as the sum of two prime numbers, one of them is very small. Very rarely, the primes are both bigger than, say, 50\. Try to find out how many such cases there are in the range 2..3000.

Example (minimum value of 50 for the primes):

<pre>scala> printGoldbachListLimited(1 to 2000, 50)
992 = 73 + 919
1382 = 61 + 1321
1856 = 67 + 1789
1928 = 61 + 1867</pre>

</dd>

The file containing the full class for this section is [arithmetic.scala](arithmetic.scala).

## Logic and Codes

As in the previous section, we will start with a skeleton file, [logic1.scala](logic1.scala), and add code to it for each problem. The difference here is that the file starts out almost empty.

<dt id="p46">**[P46](p46.scala) (**) Truth tables for logical expressions.**</dt>

<dd>Define functions `and`, `or`, `nand`, `nor`, `xor`, `impl`, and `equ` (for logical equivalence) which return true or false according to the result of their respective operations; e.g. `and(A, B)` is true if and only if both _A_ and _B_ are true.

<pre>scala> and(true, true)
res0: Boolean = true

scala> xor(true. true)
res1: Boolean = false</pre>

A logical expression in two variables can then be written as an function of two variables, e.g: `(a: Boolean, b: Boolean) => and(or(a, b), nand(a, b))`

Now, write a function called `table2` which prints the truth table of a given logical expression in two variables.

<pre>scala> table2((a: Boolean, b: Boolean) => and(a, or(a, b)))
A     B     result
true  true  true
true  false true
false true  false
false false false</pre>

</dd>

<dt id="p47">**[P47](p47.scala) (*) Truth tables for logical expressions (2).**</dt>

<dd>Continue problem [P46](#p46) by redefining `and`, `or`, etc as operators. (i.e. make them methods of a new class with an implicit conversion from Boolean.) `not` will have to be left as a object method.

<pre>scala> table2((a: Boolean, b: Boolean) => a and (a or not(b)))
A     B     result
true  true  true
true  false true
false true  false
false false false</pre>

</dd>

<dt id="p48">**P48 (**) Truth tables for logical expressions (3).**</dt>

<dd>Omitted for now.  

</dd>

<dt id="p49">**[P49](p49.scala) (**) Gray code.**</dt>

<dd>An _n_-bit Gray code is a sequence of _n_-bit strings constructed according to certain rules. For example,  
n = 1: C(1) = ("0", "1").  
n = 2: C(2) = ("00", "01", "11", "10").  
n = 3: C(3) = ("000", "001", "011", "010", "110", "111", "101", "100").

Find out the construction rules and write a function to generate Gray codes.

<pre>scala> gray(3)
res0 List[String] = List(000, 001, 011, 010, 110, 111, 101, 100)</pre>

See if you can use memoization to make the function more efficient.

</dd>

<dt id="p50">**[P50](p50.scala) (***) Huffman code.**</dt>

<dd>First of all, consult a good book on discrete mathematics or algorithms for a detailed description of Huffman codes!

We suppose a set of symbols with their frequencies, given as a list of `(S, F)` Tuples. E.g. `(("a", 45), ("b", 13), ("c", 12), ("d", 16), ("e", 9), ("f", 5))`. Our objective is to construct a list of `(S, C)` Tuples, where _C_ is the Huffman code word for the symbol _S_.

<pre>scala> huffman(List(("a", 45), ("b", 13), ("c", 12), ("d", 16), ("e", 9), ("f", 5)))
res0: List[String, String] = List((a,0), (b,101), (c,100), (d,111), (e,1101), (f,1100))</pre>

</dd>

</dl>

## Binary Trees

![](p67.gif)A binary tree is either empty or it is composed of a root element and two successors, which are binary trees themselves.

We shall use the following classes to represent binary trees. (Also available in [tree1.scala](tree1.scala).) An End is equivalent to an empty tree. A Branch has a value, and two descendant trees. The `toString` functions are relatively arbitrary, but they yield a more compact output than Scala's default. Putting a plus in front of the `T` makes the class _covariant_; it will be able to hold subtypes of whatever type it's created for. (This is important so that `End` can be a singleton object; as a singleton, it must have a specific type, so we give it type `Nothing`, which is a subtype of every other type.)

<pre>sealed abstract class Tree[+T]
case class Node[+T](value: T, left: Tree[T], right: Tree[T]) extends Tree[T] {
  override def toString = "T(" + value.toString + " " + left.toString + " " + right.toString + ")"
}
case object End extends Tree[Nothing] {
  override def toString = "."
}
object Node {
  def apply[T](value: T): Node[T] = Node(value, End, End)
}</pre>

The example tree on the right is given by

<pre>Node('a',
     Node('b', Node('d'), Node('e')),
     Node('c', End, Node('f', Node('g'), End)))</pre>

A tree with only a root node would be `Node('a')` and an empty tree would be `End`.

Throughout this section, we will be adding methods to the classes above, mostly to `Tree`.

<dl>

<dt id="p54">**P54 Omitted; our tree representation will only allow well-formed trees.**</dt>

<dd>Score one for static typing.  

</dd>

<dt id="p55">**[P55](p55.scala) (**) Construct completely balanced binary trees.**</dt>

<dd>In a completely balanced binary tree, the following property holds for every node: The number of nodes in its left subtree and the number of nodes in its right subtree are almost equal, which means their difference is not greater than one.

Define an object named `Tree`. Write a function `Tree.cBalanced` to construct completely balanced binary trees for a given number of nodes. The function should generate all solutions. The function should take as parameters the number of nodes and a single value to put in all of them.

<pre>scala> Tree.cBalanced(4, "x")
res0: List(Node[String]) = List(T(x T(x . .) T(x . T(x . .))), T(x T(x . .) T(x T(x . .) .)), ...</pre>

</dd>

<dt id="p56">**[P56](p56.scala) (**) Symmetric binary trees.**</dt>

<dd>Let us call a binary tree symmetric if you can draw a vertical line through the root node and then the right subtree is the mirror image of the left subtree. Add an `isSymmetric` method to the Tree class to check whether a given binary tree is symmetric. Hint: Write an `isMirrorOf` method first to check whether one tree is the mirror image of another. We are only interested in the structure, not in the contents of the nodes.

<pre>scala> Node('a', Node('b'), Node('c')).isSymmetric
res0: Boolean = true</pre>

</dd>

<dt id="p57">**[P57](p57.scala) (**) Binary search trees (dictionaries).**</dt>

<dd>Write a function to add an element to a binary search tree.

<pre>scala> End.addValue(2)
res0: Node[Int] = T(2 . .)

scala> res0.addValue(3)
res1: Node[Int] = T(2 . T(3 . .))

scala> res1.addValue(0)
res2: Node[Int] = T(2 T(0 . .) T(3 . .))</pre>

Hint: The abstract definition of `addValue` in `Tree` should be `def addValue[U >: T <% Ordered[U]](x: U): Tree[U]`. The `>: T` is because `addValue`'s parameters need to be _contravariant_ in `T`. (Conceptually, we're adding nodes above existing nodes. In order for the subnodes to be of type `T` or any subtype, the upper nodes must be of type `T` or any supertype.) The `<% Ordered[U]` allows us to use the `<` operator on the values in the tree.

Use that function to construct a binary tree from a list of integers.

<pre>scala> Tree.fromList(List(3, 2, 5, 7, 1))
res3: Node[Int] = T(3 T(2 T(1 . .) .) T(5 . T(7 . .)))</pre>

Finally, use that function to test your solution to [P56](#p56).

<pre>scala> Tree.fromList(List(5, 3, 18, 1, 4, 12, 21)).isSymmetric
res4: Boolean = true

scala> Tree.fromList(List(3, 2, 5, 7, 4)).isSymmetric
res5: Boolean = false</pre>

</dd>

<dt id="p58">**[P58](p58.scala) (**) Generate-and-test paradigm.**</dt>

<dd>Apply the generate-and-test paradigm to construct all symmetric, completely balanced binary trees with a given number of nodes.

<pre>scala> Tree.symmetricBalancedTrees(5, "x")
res0: List[Node[String]] = List(T(x T(x . T(x . .)) T(x T(x . .) .)), T(x T(x T(x . .) .) T(x . T(x . .))))</pre>

</dd>

<dt id="p59">**[P59](p59.scala) (**) Construct height-balanced binary trees.**</dt>

<dd>In a height-balanced binary tree, the following property holds for every node: The height of its left subtree and the height of its right subtree are almost equal, which means their difference is not greater than one.

Write a method `Tree.hbalTrees` to construct height-balanced binary trees for a given height with a supplied value for the nodes. The function should generate all solutions.

<pre>scala> Tree.hbalTrees(3, "x")
res0: List[Node[String]] = List(T(x T(x T(x . .) T(x . .)) T(x T(x . .) T(x . .))), T(x T(x T(x . .) T(x . .)) T(x T(x . .) .)), ...</pre>

</dd>

<dt id="p60">**[P60](p60.scala) (**) Construct height-balanced binary trees with a given number of nodes.**</dt>

<dd>Consider a height-balanced binary tree of height _H_. What is the maximum number of nodes it can contain? Clearly, _MaxN_ = 2<sup>_H_</sup> - 1\. However, what is the minimum number _MinN_? This question is more difficult. Try to find a recursive statement and turn it into a function `minHbalNodes` that takes a height and returns _MinN_.

<pre>scala> minHbalNodes(3)
res0: Int = 4</pre>

On the other hand, we might ask: what is the maximum height _H_ a height-balanced binary tree with _N_ nodes can have? Write a `maxHbalHeight` function.

<pre>scala> maxHbalHeight(4)
res1: Int = 3</pre>

Now, we can attack the main problem: construct all the height-balanced binary trees with a given nuber of nodes.

<pre>scala> Tree.hbalTreesWithNodes(4, "x")
res2: List[Node[String]] = List(T(x T(x T(x . .) .) T(x . .)), T(x T(x . T(x . .)) T(x . .)), ...</pre>

Find out how many height-balanced trees exist for _N_ = 15.

</dd>

<dt id="p61">**[P61](p61.scala) (*) Count the leaves of a binary tree.**</dt>

<dd>A leaf is a node with no successors. Write a method `leafCount` to count them.

<pre>scala> Node('x', Node('x'), End).leafCount
res0: Int = 1</pre>

</dd>

<dt id="pP61A">**[61A](p61a.scala) (*) Collect the leaves of a binary tree in a list.**</dt>

<dd>A leaf is a node with no successors. Write a method `leafList` to collect them in a list.

<pre>scala> Node('a', Node('b'), Node('c', Node('d'), Node('e'))).leafList
res0: List[Char] = List(b, d, e)</pre>

</dd>

<dt id="p62">**[P62](p62.scala) (*) Collect the internal nodes of a binary tree in a list.**</dt>

<dd>An internal node of a binary tree has either one or two non-empty successors. Write a method `internalList` to collect them in a list.

<pre>scala> Node('a', Node('b'), Node('c', Node('d'), Node('e'))).internalList
res0: List[Char] = List(a, c)</pre>

</dd>

<dt id="p62B">**[P62B](p62b.scala) (*) Collect the nodes at a given level in a list.**</dt>

<dd>A node of a binary tree is at level _N_ if the path from the root to the node has length _N_-1\. The root node is at level 1\. Write a method `atLevel` to collect all nodes at a given level in a list.

<pre>scala> Node('a', Node('b'), Node('c', Node('d'), Node('e'))).atLevel(2)
res0: List[Char] = List(b, c)</pre>

Using `atLevel` it is easy to construct a method `levelOrder` which creates the level-order sequence of the nodes. However, there are more efficient ways to do that.

</dd>

<dt id="p63">**[P63](p63.scala) (**) Construct a complete binary tree.**</dt>

<dd>A complete binary tree with height _H_ is defined as follows: The levels 1,2,3,...,_H_-1 contain the maximum number of nodes (i.e 2<sup>(_i_-1)</sup> at the level _i_, note that we start counting the levels from 1 at the root). In level _H_, which may contain less than the maximum possible number of nodes, all the nodes are "left-adjusted". This means that in a levelorder tree traversal all internal nodes come first, the leaves come second, and empty successors (the `End`s which are not really nodes!) come last.

Particularly, complete binary trees are used as data structures (or addressing schemes) for heaps.

We can assign an address number to each node in a complete binary tree by enumerating the nodes in levelorder, starting at the root with number 1\. In doing so, we realize that for every node _X_ with address _A_ the following property holds: The address of _X_'s left and right successors are 2*_A_ and 2*_A_+1, respectively, supposed the successors do exist. This fact can be used to elegantly construct a complete binary tree structure. Write a method `completeBinaryTree` that takes as parameters the number of nodes and the value to put in each node.

<pre>scala> Tree.completeBinaryTree(6, "x")
res0: Node[String] = T(x T(x T(x . .) T(x . .)) T(x T(x . .) .))</pre>

</dd>

<dt id="p64">**[P64](p64.scala) (**) Layout a binary tree (1).**</dt>

<dd>![](p64.gif)As a preparation for drawing a tree, a layout algorithm is required to determine the position of each node in a rectangular grid. Several layout methods are conceivable, one of them is shown in the illustration on the right.

In this layout strategy, the position of a node _v_ is obtained by the following two rules:

*   x(_v_) is equal to the position of the node _v_ in the inorder sequence
*   y(_v_) is equal to the depth of the node _v_ in the tree

In order to store the position of the nodes, we add a new class with the additional information.

<pre>case class PositionedNode[+T](override val value: T, override val left: Tree[T], override val right: Tree[T], x: Int, y: Int) extends Node[T](value, left, right) {
  override def toString = "T[" + x.toString + "," + y.toString + "](" + value.toString + " " + left.toString + " " + right.toString + ")"
}</pre>

Write a method `layoutBinaryTree` that turns a tree of normal `Node`s into a tree of `PositionedNode`s.

<pre>scala> Node('a', Node('b', End, Node('c')), Node('d')).layoutBinaryTree
res0: PositionedNode[Char] = T[3,1](a T[1,2](b . T[2,3](c . .)) T[4,2](d . .))</pre>

The tree at right may be constructed with `Tree.fromList(List('n','k','m','c','a','h','g','e','u','p','s','q'))`. Use it to check your code.

</dd>

<dt id="p65">**[P65](p65.scala) (**) Layout a binary tree (2).**</dt>

<dd>![](p65.gif)An alternative layout method is depicted in the illustration opposite. Find out the rules and write the corresponding method. Hint: On a given level, the horizontal distance between neighboring nodes is constant.

Use the same conventions as in problem [P64](#p64).

<pre>scala> Node('a', Node('b', End, Node('c')), Node('d')).layoutBinaryTree2
res0: PositionedNode[Char] = T[3,1]('a T[1,2]('b . T[2,3]('c . .)) T[5,2]('d . .))</pre>

The tree at right may be constructed with `Tree.fromList(List('n','k','m','c','a','e','d','g','u','p','q'))`. Use it to check your code.

</dd>

<dt id="p66">**[P66](p66.scala) (***) Layout a binary tree (3).**</dt>

<dd>![](p66.gif)Yet another layout strategy is shown in the illustration opposite. The method yields a very compact layout while maintaining a certain symmetry in every node. Find out the rules and write the corresponding method. Hint: Consider the horizontal distance between a node and its successor nodes. How tight can you pack together two subtrees to construct the combined binary tree?

Use the same conventions as in problem [P64](#p64) and [P65](#p65). Note: This is a difficult problem. Don't give up too early!

<pre>scala> Node('a', Node('b', End, Node('c')), Node('d')).layoutBinaryTree3
res0: PositionedNode[Char] = T[2,1]('a T[1,2]('b . T[2,3]('c . .)) T[3,2]('d . .))</pre>

Which layout do you like most?

</dd>

<dt id="p67">**[P67](p67.scala) (**) A string representation of binary trees.**</dt>

<dd>![](p67.gif)Somebody represents binary trees as strings of the following type (see example opposite):

<pre>a(b(d,e),c(,f(g,)))</pre>

Write a method which generates this string representation, if the tree is given as usual (in `Node`s and `End`s). Use that method for the `Tree` class's and subclass's `toString` methods. Then write a method (on the `Tree` object) which does this inverse; i.e. given the string representation, construct the tree in the usual form.

For simplicity, suppose the information in the nodes is a single letter and there are no spaces in the string.

<pre>scala> Node('a', Node('b', Node('d'), Node('e')), Node('c', End, Node('f', Node('g'), End))).toString
res0: String = a(b(d,e),c(,f(g,)))

scala> Tree.fromString("a(b(d,e),c(,f(g,)))")
res1: Node[Char] = a(b(d,e),c(,f(g,)))</pre>

</dd>

<dt id="p68">**[P68](p68.scala) (**) Preorder and inorder sequences of binary trees.**</dt>

<dd>We consider binary trees with nodes that are identified by single lower-case letters, as in the example of problem [P67](#p67).

a) Write methods `preorder` and `inorder` that construct the preorder and inorder sequence of a given binary tree, respectively. The results should be lists, e.g. `List('a','b','d','e','c','f','g')` for the preorder sequence of the example in problem [P67](#p67).

<pre>scala> Tree.string2Tree("a(b(d,e),c(,f(g,)))").preorder
res0: List[Char] = List(a, b, d, e, c, f, g)

scala> Tree.string2Tree("a(b(d,e),c(,f(g,)))").inorder
res1: List[Char] = List(d, b, e, a, c, g, f)</pre>

b) If both the preorder sequence and the inorder sequence of the nodes of a binary tree are given, then the tree is determined unambiguously. Write a method `preInTree` that does the job.

<pre>scala> Tree.preInTree(List('a', 'b', 'd', 'e', 'c', 'f', 'g'), List('d', 'b', 'e', 'a', 'c', 'g', 'f'))
res2: Node[Char] = a(b(d,e),c(,f(g,)))</pre>

What happens if the same character appears in more than one node? Try, for instance, `Tree.preInTree(List('a', 'b', 'a'), List('b', 'a', 'a'))`.

</dd>

<dt id="p69">**[P69](p69.scala) (**) Dotstring representation of binary trees.**</dt>

<dd>We consider again binary trees with nodes that are identified by single lower-case letters, as in the example of problem [P67](#p67). Such a tree can be represented by the preorder sequence of its nodes in which dots (.) are inserted where an empty subtree (`End`) is encountered during the tree traversal. For example, the tree shown in problem [P67](#p67) is represented as `"abd..e..c.fg..."`. First, try to establish a syntax (BNF or syntax diagrams) and then write two methods, `toDotstring` and `fromDotstring`, which do the conversion in both directions.

<pre>scala> Tree.string2Tree("a(b(d,e),c(,f(g,)))").toDotstring
res0: String = abd..e..c.fg...

scala> Tree.fromDotstring("abd..e..c.fg...")
res1: Node[Char] = a(b(d,e),c(,f(g,)))</pre>

</dd>

</dl>

The file containing the full class definitions for this section is [tree.scala](tree.scala).

## Multiway Trees

![](p70.gif)A multiway tree is composed of a root element and a (possibly empty) set of successors which are multiway trees themselves. A multiway tree is never empty. The set of successor trees is sometimes called a forest.

The code to represent these is somewhat simpler than the code for binary trees, partly because we don't separate classes for nodes and terminators, and partly because we don't need the restriction that the value type be ordered.

<pre>case class MTree[+T](value: T, children: List[MTree[T]]) {
  def this(value: T) = this(value, List())
  override def toString = "M(" + value.toString + " {" + children.map(_.toString).mkString(",") + "})"
}

object MTree {
  def apply[T](value: T) = new MTree(value, List())
  def apply[T](value: T, children: List[MTree[T]]) = new MTree(value, children)
}</pre>

The example tree is, thus:

`MTree('a', List(MTree('f', List(MTree('g'))), MTree('c'), MTree('b', List(MTree('d'), MTree('e')))))`

The starting code skeleton for this section is [mtree1.scala](mtree1.scala).

<dl>

<dt id="pP70B">**P70B Omitted; we can only create well-formed trees.**</dt>

<dt id="pP70C">**[P70C](p70c.scala) (*) Count the nodes of a multiway tree.**</dt>

<dd>Write a method `nodeCount` which counts the nodes of a given multiway tree.

<pre>scala> MTree('a', List(MTree('f'))).nodeCount
res0: Int = 2</pre>

</dd>

<dt id="p70">**[P70](p70.scala) (**) Tree construction from a node string.**</dt>

<dd>![](p70.gif)We suppose that the nodes of a multiway tree contain single characters. In the depth-first order sequence of its nodes, a special character ^ has been inserted whenever, during the tree traversal, the move is a backtrack to the previous level.

By this rule, the tree in the figure opposite is represented as:

<pre>afg^^c^bd^e^^^</pre>

Define the syntax of the string and write a function `string2MTree` to construct an `MTree` from a `String`. Make the function an implicit conversion from `String`. Write the reverse function, and make it the toString method of MTree.

<pre>scala> MTree('a', List(MTree('f', List(MTree('g'))), MTree('c'), MTree('b', List(MTree('d'), MTree('e'))))).toString
res0: String = afg^^c^bd^e^^^</pre>

</dd>

<dt id="p71">**[P71](p71.scala) (*) Determine the internal path length of a tree.**</dt>

<dd>We define the internal path length of a multiway tree as the total sum of the path lengths from the root to all nodes of the tree. By this definition, the tree in the figure of problem [P70](3p70) has an internal path length of 9\. Write a method `internalPathLength` to return that sum.

<pre>scala> "afg^^c^bd^e^^^".internalPathLength
res0: Int = 9</pre>

</dd>

<dt id="p72">**[P72](p72.scala) (*) Construct the postorder sequence of the tree nodes.**</dt>

<dd>Write a method `postorder` which constructs the postorder sequence of the nodes of a multiway tree. The result should be a `List`.

<pre>scala> "afg^^c^bd^e^^^".postorder
res0: List[Char] = List(g, f, c, d, e, b, a)</pre>

</dd>

<dt id="p73">**[P73](p73.scala) (**) Lisp-like tree representation.**</dt>

<dd>There is a particular notation for multiway trees in Lisp. Lisp is a prominent functional programming language. In Lisp almost everything is a list.

Our example tree would be represented in Lisp as `(a (f g) c (b d e))`. The following pictures give some more examples.

![](p73.png)

Note that in the "lispy" notation a node with successors (children) in the tree is always the first element in a list, followed by its children. The "lispy" representation of a multiway tree is a sequence of atoms and parentheses '(' and ')', with the atoms separated by spaces. We can represent this syntax as a Scala `String`. Write a method `lispyTree` which constructs a "lispy string" from an `MTree`.

<pre>scala> MTree("a", List(MTree("b", List(MTree("c"))))).lispyTree
res0: String = (a (b c))</pre>

As a second, even more interesting, exercise try to write a method that takes a "lispy" string and turns it into a multiway tree.

[Note: Much of this problem is taken from the wording of the same problem in the Prolog set. This is certainly one way of looking at Lisp notation, but it's not how the language actually represents that syntax internally. I can elaborate more on this, if requested. <[PMG](mailto:phil_g@pobox.com)>]

</dd>

</dl>

The complete source file for this section is [mtree.scala](mtree.scala).

## Graphs

![](graph1.gif)A graph is defined as a set of nodes and a set of edges, where each edge is a pair of nodes.

The class to represent a graph is mutable, which isn't in keeping with pure functional programming, but a pure functional data structure would make things much, much more complicated. [Pure functional graphs with cycles require laziness; I think Scala can handle it, but I think that would add too much of a barrier to the following questions. <[PMG](mailto:phil_g@pobox.com)>]

Our `Graph`s use an incidence list internally. Each has a list of nodes and a list of edges. Each node also has a list of edges that connect it to other nodes. In a directed graph, nodes that are the target of arcs do not have references to those arcs in their adjacency list.

<pre>abstract class GraphBase[T, U] {
  case class Edge(n1: Node, n2: Node, value: U) {
    def toTuple = (n1.value, n2.value, value)
  }
  case class Node(value: T) {
    var adj: List[Edge] = Nil
    def neighbors: List[Node] = adj.map(edgeTarget(_, this).get)
  }

  var nodes: Map[T, Node] = Map()
  var edges: List[Edge] = Nil

  // If the edge E connects N to another node, returns the other node,
  // otherwise returns None.
  def edgeTarget(e: Edge, n: Node): Option[Node]

  override def equals(o: Any) = o match {
    case g: GraphBase[T,U] => (nodes.keys.toList -- g.nodes.keys.toList == Nil &&
                               edges.map(_.toTuple) -- g.edges.map(_.toTuple) == Nil)
    case _ => false
  }

  def addNode(value: T) = {
    val n = new Node(value)
    nodes = Map(value -> n) ++ nodes
    n
  }
}

class Graph[T, U] extends GraphBase[T, U] {
  override def equals(o: Any) = o match {
    case g: Graph[T,U] => super.equals(g)
    case _ => false
  }

  def edgeTarget(e: Edge, n: Node): Option[Node] =
    if (e.n1 == n) Some(e.n2)
    else if (e.n2 == n) Some(e.n1)
    else None

  def addEdge(n1: T, n2: T, value: U) = {
    val e = new Edge(nodes(n1), nodes(n2), value)
    edges = e :: edges
    nodes(n1).adj = e :: nodes(n1).adj
    nodes(n2).adj = e :: nodes(n2).adj
  }
}

class Digraph[T, U] extends GraphBase[T, U] {
  override def equals(o: Any) = o match {
    case g: Digraph[T,U] => super.equals(g)
    case _ => false
  }

  def edgeTarget(e: Edge, n: Node): Option[Node] =
    if (e.n1 == n) Some(e.n2)
    else None

  def addArc(source: T, dest: T, value: U) = {
    val e = new Edge(nodes(source), nodes(dest), value)
    edges = e :: edges
    nodes(source).adj = e :: nodes(source).adj
  }
}</pre>

The full initial Graph code, which also includes objects for creating graphs, is in [graph1.scala](graph1.scala).

There are a few ways to create a graph from primitives. The _graph-term form_ lists the nodes and edges separately:

<pre>Graph.term(List('b', 'c', 'd', 'f', 'g', 'h', 'k'),
           List(('b', 'c'), ('b', 'f'), ('c', 'f'), ('f', 'k'), ('g', 'h')))</pre>

The _adjacency-list form_ associates each node with its adjacent nodes. In an undirected graph, care must be taken to ensure that all links are symmetric--if b is adjacent to c, c must also be adjacent to b.

<pre>Graph.adjacent(List(('b', List('c', 'f')), ('c', List('b', 'f')), ('d', Nil),
                    ('f', List('b', 'c', 'k')), ('g', List('h')), ('h', List('g')),
                    ('k', List('f'))))</pre>

The representations we introduced so far are bound to our implementation and therefore well suited for automated processing, but their syntax is not very user-friendly. Typing the terms by hand is cumbersome and error-prone. We can define a more compact and "human-friendly" notation as follows: A graph is represented by a string of terms of the type X or Y-Z separated by commas. The standalone terms stand for isolated nodes, the Y-Z terms describe edges. If an X appears as an endpoint of an edge, it is automatically defined as a node. Our example could be written as:

<pre>[b-c, f-c, g-h, d, f-b, k-f, h-g]</pre>

We call this the _human-friendly form_. As the example shows, the list does not have to be sorted and may even contain the same edge multiple times. Notice the isolated node d.

![](graph2.gif)When the edges of a graph are _directed_, we call them arcs. These are represented by ordered pairs. Such a graph is called directed graph. To represent a directed graph, the forms discussed above are slightly modified. The example graph opposite is represented as follows:

_graph-term form_:

<pre>Digraph.term(List('r', 's', 't', 'u', 'v'),
             List(('s', 'r'), ('s', 'u'), ('u', 'r'), ('u', 's'), ('v', 'u')))</pre>

_adjacency-list form_:

<pre>Digraph.adjacent(List(('r', Nil), ('s', List('r', 'u')), ('t', Nil),
                      ('u', List('r', 's')), ('v', List('u'))))</pre>

(Note that the adjacency-list form is the same for graphs and digraphs.)

_human-friendly form_:

<pre>[s>r, t, u>r, s>u, u>s, v>u]</pre>

![](graph3.gif)Finally, graphs and digraphs may have additional information attached to nodes and edges (arcs). For the nodes, this is no problem, as we can put any type into them. On the other hand, for edges we have to extend our notation. Graphs with additional information attached to edges are called labeled graphs.

_graph-term form_:

<pre>Digraph.termLabel(List('k', 'm', 'p', 'q'),
                  List(('m', 'q', 7), ('p', 'm', 5), ('p', 'q', 9)))</pre>

_adjacency-list form_:

<pre>Digraph.adjacentLabel(
  List(('k', Nil), ('m', List(('q', 7))), ('p', List(('m', 5), ('q', 9))),
       ('q', Nil)))</pre>

_human-friendly form_:

<pre>[p>q/9, m>q/7, k, p>m/5]</pre>

The notation for labeled graphs can also be used for so-called multi-graphs, where more than one edge (or arc) is allowed between two given nodes.

<dl>

<dt id="p80">**[P80](p80.scala) (***) Conversions.**</dt>

<dd>Write methods to generate the graph-term and adjacency-list forms from a `Graph`. Write another method to output the human-friendly form for a graph. Make it the `toString` method for `Graph`. Write more functions to create graphs from strings.

Hint: You might need separate functions for labeled and unlabeled graphs.

<pre>scala> Graph.fromString("[b-c, f-c, g-h, d, f-b, k-f, h-g]").toTermForm
res0: (List[String], List[(String, String, Unit)]) = (List(d, k, h, c, f, g, b),List((h,g,()), (k,f,()), (f,b,()), (g,h,()), (f,c,()), (b,c,())))

scala> Digraph.fromStringLabel("[p>q/9, m>q/7, k, p>m/5]").toAdjacentForm
res1: List[(String, List[(String, Int)])] = List((m,List((q,7))), (p,List((m,5), (q,9))), (k,List()), (q,List()))</pre>

</dd>

<dt id="p81">**[P81](p81.scala) (**) Path from one node to another one.**</dt>

<dd>Write a method named `findPaths` to find acyclic paths from one node to another in a graph. The method should return all paths.

<pre>scala> Digraph.fromStringLabel("[p>q/9, m>q/7, k, p>m/5]").findPaths("p", "q")
res0: List[List[String]] = List(List(p, q), List(p, m, q))

scala> Digraph.fromStringLabel("[p>q/9, m>q/7, k, p>m/5]").findPaths("p", "k")
res1: List[List[String]] = List()</pre>

</dd>

<dt id="p82">**[P82](p82.scala) (*) Cycle from a given node.**</dt>

<dd>Write a method named `findCycles` to find closed paths (cycles) starting at a given node in a graph. The method should return all cycles.

<pre>scala> Graph.fromString("[b-c, f-c, g-h, d, f-b, k-f, h-g]").findCycles("f")
res0: List[List[String]] = List(List(f, c, b, f), List(f, b, c, f))</pre>

</dd>

<dt id="p83">**[P83](p83.scala) (**) Construct all spanning trees.**</dt>

<dd>![](p83.gif)Write a method `spanningTrees` to construct all spanning trees of a given graph. With this method, find out how many spanning trees there are for the graph depicted to the right. The data of this example graph can be found below. When you have a correct solution for the `spanningTrees` method, use it to define two other useful methods: `isTree` and `isConnected`. Both are five-minute tasks!

Graph:

<pre>Graph.term(List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'),
           List(('a', 'b'), ('a', 'd'), ('b', 'c'), ('b', 'e'),
                ('c', 'e'), ('d', 'e'), ('d', 'f'), ('d', 'g'),
                ('e', 'h'), ('f', 'g'), ('g', 'h')))</pre>

<pre>scala> Graph.fromString("[a-b, b-c, a-c]").spanningTrees
res0: List[Graph[String,Unit]] = List([a-b, b-c], [a-c, b-c], [a-b, a-c])</pre>

</dd>

<dt id="p84">**[P84](p84.scala) (**) Construct the minimal spanning tree.**</dt>

<dd>![](p84.gif)Write a method `minimalSpanningTree` to construct the minimal spanning tree of a given labeled graph. Hint: Use Prim's Algorithm. A small modification of the solution of [P83](#p83) does the trick. The data of the example graph to the right can be found below.

Graph:

<pre>Graph.termLabel(
  List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'),
       List(('a', 'b', 5), ('a', 'd', 3), ('b', 'c', 2), ('b', 'e', 4),
            ('c', 'e', 6), ('d', 'e', 7), ('d', 'f', 4), ('d', 'g', 3),
            ('e', 'h', 5), ('f', 'g', 4), ('g', 'h', 1)))</pre>

<pre>scala> Graph.fromStringLabel("[a-b/1, b-c/2, a-c/3]").minimalSpanningTree
res0: Graph[String,Int] = [a-b/1, b-c/2]</pre>

</dd>

<dt id="p85">**[P85](p85.scala) (**) Graph isomorphism.**</dt>

<dd>Two graphs _G_<sub>1</sub>(_N_<sub>1</sub>,_E_<sub>1</sub>) and _G_<sub>2</sub>(_N_<sub>2</sub>,_E_<sub>2</sub>) are isomorphic if there is a bijection f: _N_<sub>1</sub> â†’ _N_<sub>2</sub> such that for any nodes _X_,_Y_ of _N_<sub>1</sub>, _X_ and _Y_ are adjacent if and only if f(_X_) and f(_Y_) are adjacent.

Write a method that determines whether two graphs are isomorphic.

<pre>scala> Graph.fromString("[a-b]").isIsomorphicTo(Graph.fromString("[5-7]"))
res0: Boolean = true</pre>

</dd>

<dt id="p86">**[P86](p86.scala) (**) Node degree and graph coloration.**</dt>

<dd>a) Write a method `Node.degree` that determines the degree of a given node.

<pre>scala> Graph.fromString("[a-b, b-c, a-c, a-d]").nodes("a").degree
res0: Int = 3</pre>

b) Write a method that lists all nodes of a graph sorted according to decreasing degree.

<pre>scala> Graph.fromString("[a-b, b-c, a-c, a-d]").nodesByDegree
res1: List[Graph[String,Unit]#Node] = List(Node(a), Node(c), Node(b), Node(d))</pre>

c) Use Welsh-Powell's algorithm to paint the nodes of a graph in such a way that adjacent nodes have different colors. Make a method `colorNodes` that returns a list of tuples, each of which contains a node and an integer representing its color.

<pre>scala> Graph.fromString("[a-b, b-c, a-c, a-d]").colorNodes
res2: List[(Graph[String,Unit]#Node,Int)] = List((Node(a),1), (Node(b),2), (Node(c), 3), (Node(d), 2))</pre>

</dd>

<dt id="p87">**[P87](p87.scala) (**) Depth-first order graph traversal.**</dt>

<dd>Write a method that generates a depth-first order graph traversal sequence. The starting point should be specified, and the output should be a list of nodes that are reachable from this starting point (in depth-first order).

<pre>scala> Graph.fromString("[a-b, b-c, e, a-c, a-d]").nodesByDepthFrom("d")
res0: List[String] = List(c, b, a, d)</pre>

</dd>

<dt id="p88">**[P88](p88.scala) (**) Connected components.**</dt>

<dd>Write a function that splits a graph into its connected components.

<pre>scala> Graph.fromString("[a-b, c]").splitGraph
res0: List[Graph[String,Unit]] = List([a-b], [c])</pre>

</dd>

<dt id="p89">**[P89](p89.scala) (**) Bipartite graphs.**</dt>

<dd>Write a function that determines whether a given graph is bipartite.

<pre>scala> Digraph.fromString("[a>b, c>a, d>b]").isBipartite
res0: Boolean = true

scala> Graph.fromString("[a-b, b-c, c-a]").isBipartite
res1: Boolean = false

scala> Graph.fromString("[a-b, b-c, d]").isBipartite
res2: Boolean = true

scala> Graph.fromString("[a-b, b-c, d, e-f, f-g, g-e, h]").isBipartite
res3: Boolean = false</pre>

</dd>

</dl>

The complete source file for this section is [graph.scala](graph.scala).

## Miscellaneous Problems

<dl>

<dt id="p90">**[P90](p90.scala) (**) Eight queens problem**</dt>

<dd>This is a classical problem in computer science. The objective is to place eight queens on a chessboard so that no two queens are attacking each other; i.e., no two queens are in the same row, the same column, or on the same diagonal.

Hint: Represent the positions of the queens as a list of numbers 1.._N_. Example: `List(4, 2, 7, 3, 6, 8, 5, 1)` means that the queen in the first column is in row 4, the queen in the second column is in row 2, etc. Use the generate-and-test paradigm.

</dd>

<dt id="p91">**[P91](p91.scala) (**) Knight's tour.**</dt>

<dd>Another famous problem is this one: How can a knight jump on an _N_Ã—_N_ chessboard in such a way that it visits every square exactly once?

Hints: Represent the squares by pairs of their coordinates of the form (_X_, _Y_), where both _X_ and _Y_ are integers between 1 and _N_. (Alternately, define a Point class for the same purpose.) Write a function jumps(_N_, (_X_, _Y_)) to list the squares that a knight can jump to from (_X_, _Y_) on a _N_Ã—_N_ chessboard. And finally, represent the solution of our problem as a list of knight positions (the knight's tour).

It might be nice to find more than one tour, but a computer will take a long time trying to find them all at once. Can you make a lazy list that only calculates the tours as needed?

Can you find only "closed tours", where the knight can jump from its final position back to its starting position?

</dd>

<dt id="p92">**[P92](p92.scala) (***) Von Koch's conjecture.**</dt>

<dd>Several years ago I met a mathematician who was intrigued by a problem for which he didn't know a solution. His name was Von Koch, and I don't know whether the problem has been solved since. [The "I" here refers to the author of the Prolog problems. <[PMG](mailto:phil_g@pobox.com)>]

![](p92a.gif)

Anyway the puzzle goes like this: Given a tree with _N_ nodes (and hence _N_-1 edges), find a way to enumerate the nodes from 1 to _N_ and, accordingly, the edges from 1 to _N_-1 in such a way, that for each edge _K_ the difference of its node numbers is equal to _K_. The conjecture is that this is always possible.

For small trees the problem is easy to solve by hand. However, for larger trees, and 14 is already very large, it is extremely difficult to find a solution. And remember, we don't know for sure whether there is always a solution!

Write a function that calculates a numbering scheme for a given tree. What is the solution for the larger tree pictured below?

![](p92b.gif)

</dd>

<dt id="p93">**P93 (***) An arithmetic puzzle.**</dt>

<dd>Given a list of integer numbers, find a correct way of inserting arithmetic signs (operators) such that the result is a correct equation. Example: With the list of numbers `List(2,3,5,7,11)` we can form the equations 2-3+5+7 = 11 or 2 = (3*5+7)/11 (and ten others!).  

</dd>

<dt id="p94">**P94 (***) Generate K-regular simple graphs with N nodes.**</dt>

<dd>In a K-regular graph all nodes have a degree of _K_; i.e. the number of edges incident in each node is _K_. How many (non-isomorphic!) 3-regular graphs with 6 nodes are there? See also a [table of results](p94.txt) and a [Java applet](https://prof.ti.bfh.ch/hew1/informatik3/prolog/p-99/GraphLayout/index.html) that can represent graphs geometrically.  

</dd>

<dt id="p95">**P95 (**) English number words.**</dt>

<dd>On financial documents, like checks, numbers must sometimes be written in full words. Example: 175 must be written as one-seven-five. Write a function fullWords(num: Int) to print (non-negative) integer numbers in full words.  

</dd>

<dt id="p96">**P96 (**) Syntax checker.**</dt>

<dd>![](p96.gif)In a certain programming language (Ada) identifiers are defined by the syntax diagram (railroad chart) opposite. Transform the syntax diagram into a system of syntax diagrams which do not contain loops; i.e. which are purely recursive. Using these modified diagrams, write a function isIdentifier that can check whether or not a given string is a legal identifier.  

</dd>

<dt id="p97">**[P97](p97.scala) (**) Sudoku. [(alternate solution)](p97b.scala)**</dt>

<dd>Sudoku puzzles go like this:

<pre>   Problem statement                 Solution

    .  .  4 | 8  .  . | .  1  7	     9  3  4 | 8  2  5 | 6  1  7	     
            |         |                      |         |
    6  7  . | 9  .  . | .  .  .	     6  7  2 | 9  1  4 | 8  5  3
            |         |                      |         |
    5  .  8 | .  3  . | .  .  4      5  1  8 | 6  3  7 | 9  2  4
    --------+---------+--------      --------+---------+--------
    3  .  . | 7  4  . | 1  .  .      3  2  5 | 7  4  8 | 1  6  9
            |         |                      |         |
    .  6  9 | .  .  . | 7  8  .      4  6  9 | 1  5  3 | 7  8  2
            |         |                      |         |
    .  .  1 | .  6  9 | .  .  5      7  8  1 | 2  6  9 | 4  3  5
    --------+---------+--------      --------+---------+--------
    1  .  . | .  8  . | 3  .  6	     1  9  7 | 5  8  2 | 3  4  6
            |         |                      |         |
    .  .  . | .  .  6 | .  9  1	     8  5  3 | 4  7  6 | 2  9  1
            |         |                      |         |
    2  4  . | .  .  1 | 5  .  .      2  4  6 | 3  9  1 | 5  7  8</pre>

Every spot in the puzzle belongs to a (horizontal) row and a (vertical) column, as well as to one single 3Ã—3 square (which we call "square" for short). At the beginning, some of the spots carry a single-digit number between 1 and 9\. The problem is to fill the missing spots with digits in such a way that every number between 1 and 9 appears exactly once in each row, in each column, and in each square.

</dd>

<dt id="p98">**P98 (***) Nonograms.**</dt>

<dd>Around 1994, a certain kind of puzzles was very popular in England. The "Sunday Telegraph" newspaper wrote: "Nonograms are puzzles from Japan and are currently published each week only in The Sunday Telegraph. Simply use your logic and skill to complete the grid and reveal a picture or diagram." As a programmer, you are in a better situation: you can have your computer do the work! Just write a little program ;-).

The puzzle goes like this: Essentially, each row and column of a rectangular bitmap is annotated with the respective lengths of its distinct strings of occupied cells. The person who solves the puzzle must complete the bitmap given only these lengths.

<pre>          Problem statement:          Solution:

          |_|_|_|_|_|_|_|_| 3         |_|X|X|X|_|_|_|_| 3           
          |_|_|_|_|_|_|_|_| 2 1       |X|X|_|X|_|_|_|_| 2 1         
          |_|_|_|_|_|_|_|_| 3 2       |_|X|X|X|_|_|X|X| 3 2         
          |_|_|_|_|_|_|_|_| 2 2       |_|_|X|X|_|_|X|X| 2 2         
          |_|_|_|_|_|_|_|_| 6         |_|_|X|X|X|X|X|X| 6           
          |_|_|_|_|_|_|_|_| 1 5       |X|_|X|X|X|X|X|_| 1 5         
          |_|_|_|_|_|_|_|_| 6         |X|X|X|X|X|X|_|_| 6           
          |_|_|_|_|_|_|_|_| 1         |_|_|_|_|X|_|_|_| 1           
          |_|_|_|_|_|_|_|_| 2         |_|_|_|X|X|_|_|_| 2           
           1 3 1 7 5 3 4 3             1 3 1 7 5 3 4 3              
           2 1 5 1                     2 1 5 1                      </pre>

For the example above, the problem can be stated as the two lists `[[3],[2,1],[3,2],[2,2],[6],[1,5],[6],[1],[2]]` and `[[1,2],[3,1],[1,5],[7,1],[5],[3],[4],[3]]` which give the "solid" lengths of the rows and columns, top-to-bottom and left-to-right, respectively. Published puzzles are larger than this example, e.g. 25Ã—20, and apparently always have unique solutions.

</dd>

<dt id="p99">**P99 (***) Crossword puzzle.**</dt>

<dd>Given an empty (or almost empty) framework of a crossword puzzle and a set of words. The problem is to place the words into the framework.

![](p99.gif)The particular crossword puzzle is specified in a text file which first lists the words (one word per line) in an arbitrary order. Then, after an empty line, the crossword framework is defined. In this framework specification, an empty character location is represented by a dot (.). In order to make the solution easier, character locations can also contain predefined character values. The puzzle opposite is defined in the file [p99a.dat](p99a.dat), other examples are [p99b.dat](p99b.dat) and [p99d.dat](p99d.dat). There is also an example of a puzzle ([p99c.dat](p99c.dat)) which does not have a solution.

Words are strings of at least two characters. A horizontal or vertical sequence of character places in the crossword puzzle framework is called a site. Our problem is to find a compatible way of placing words onto sites.

Hints: (1) The problem is not easy. You will need some time to thoroughly understand it. So, don't give up too early! And remember that the objective is a clean solution, not just a quick-and-dirty hack!

(2) For efficiency reasons it is important, at least for larger puzzles, to sort the words and the sites in a particular order. For this part of the problem, the solution of [P28](#p28) may be very helpful.

</dd>

</dl>
