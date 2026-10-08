# Java Study Plan — Learning by Breaking Code

A hands-on roadmap to master **Java** and get ready for **technical interviews**.
The order is driven by what interviews ask the most: **OOP and modifiers → concurrency → JVM and advanced topics**.

> Tick the boxes (`- [x]`) as you go, so this file also works as a progress tracker on GitHub.

---

## The Method

Every topic is a **numbered module** (`mXX_topicName/`) inside this folder, and each one follows the same loop:

1. **Watch** the related lessons from [Maratona Java Virado no Jiraya (DevDojo)](https://www.youtube.com/watch?v=VKjFuX91G5Q&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW).
2. **Run** the module's `Main.java` and read the code next to the output.
3. **Break it on purpose.** Every file has 🧪 *experiments* in its comments: uncomment a line, remove a modifier, add an `extends`... Read the compiler error and understand **why** the rule exists. Then undo it.
4. **Build your own** small class using the concept (like `Pessoa` in `m01`), with comments in your own words.
5. **Interview round:** answer the module's questions out loud, as if in a real interview, and get feedback.

A module is **done** when you can answer all of its interview questions without looking at the code.

---

## Part 1 — OOP and the Language Core

### ✅ m01 — Member Modifiers
`m01_memberModifiers/` · DevDojo: 54–56, 61–63, 77–79

- [x] `private` vs `public` on fields and methods
- [x] Encapsulation: validating input in a setter
- [x] `final` fields: assigned once, by nobody, inside or outside the class
- [x] `static` and `static final` constants (`Pessoa.IDADE_MINIMA`)
- [ ] `static` counter shared by all instances (create 3 objects and compare with/without `static`)
- [ ] Throw `IllegalArgumentException` instead of printing "Error"

**Interview questions**
- Difference between a field with no modifier and a `protected` field?
- `final int[] arr = {1, 2, 3};` — can you do `arr[0] = 10`? And `arr = new int[5]`?
- Why can't a `static` method use `this`?

### ✅ m02 — Class Modifiers
`m02_classModifiers/` · DevDojo: 08, 71–75

- [x] `public` class: one per file, same name as the file
- [x] Package-private class: invisible outside its package
- [x] `abstract` class: can't be instantiated, can have constructors and concrete methods
- [x] `final` class: can't be extended (`String`, `Integer`)
- [x] `sealed` + `permits`, `non-sealed` (Java 17)
- [x] Exhaustive `switch` over a sealed hierarchy (no `default`)
- [ ] All 9 🧪 experiments done

**Interview questions**
- Why is `String` a `final` class?
- Why is `abstract final` illegal? And `abstract static` on a method?
- What problem do sealed classes solve? Why does every permitted subclass need `final`, `sealed` or `non-sealed`?

### m03 — Packages and `protected`
`m03_packages/` · DevDojo: 08, 73

- [ ] Packages, `import`, fully qualified names, static imports
- [ ] `protected` vs package-private across packages (`a.Pai`, `b.Filho`, `b.Estranho`)
- [ ] The `protected` trap: a subclass in another package can only access it **through inheritance**
- [ ] `private` is per class, not per object (accessing `other.field` inside `equals`)
- [ ] Build the access table yourself from the experiments

**Interview questions**
- Rank `private`, package-private, `protected`, `public` from most to least restrictive.
- Can a subclass in another package call `parent.protectedField` on a `Parent` instance it received as a parameter?

### m04 — Classes, Objects and Constructors
`m04_classesAndObjects/` · DevDojo: 39–53, 58–59

- [ ] Objects vs references; two references to the same object
- [ ] Constructors, overloading, constructor chaining with `this(...)`
- [ ] **Pass-by-value** with primitives and with references
- [ ] Varargs
- [ ] `static` vs instance initializer blocks

**Interview questions**
- Is Java pass-by-value or pass-by-reference? Prove it with a reassignment example.
- What happens to the default constructor when you declare another constructor?

### m05 — Inheritance and Polymorphism
`m05_inheritance/` · DevDojo: 71–75

- [ ] `extends`, `super`, `super(...)` in constructors
- [ ] **Initialization order** (static blocks → instance blocks → constructors, parent before child)
- [ ] Overriding rules: visibility can widen but not narrow, covariant returns, checked exceptions
- [ ] Static methods are **hidden**, not overridden
- [ ] Interfaces: `default`, `static` and `private` methods
- [ ] Abstract class vs interface: when to use each
- [ ] Composition over inheritance

**Interview questions**
- `Parent p = new Child(); p.staticMethod(); p.instanceMethod();` — which versions run, and why?
- In what order do the blocks and constructors run when you do `new Child()`?

### m06 — The `Object` Contract and Immutability
`m06_objectContract/`

- [ ] `equals` and `hashCode`: the contract and what breaks in a `HashMap` without it
- [ ] `toString`
- [ ] Immutable class recipe: `final` class, `private final` fields, no setters, defensive copies
- [ ] Records (Java 16+)

**Interview questions**
- If two objects are `equals`, must they have the same `hashCode`? And the other way around?
- Are only `private final` fields enough to make a class immutable?

### m07 — Nested Classes
`m07_nestedClasses/` · DevDojo: 189–192

- [ ] Static nested vs inner class (and the hidden reference to the outer instance)
- [ ] Local and anonymous classes
- [ ] Anonymous class vs lambda; effectively final

**Interview question:** why can an inner class cause a memory leak?

### m08 — Exceptions
`m08_exceptions/`

- [ ] Hierarchy: `Throwable`, `Error`, `Exception`, `RuntimeException`
- [ ] Checked vs unchecked; when to create custom exceptions
- [ ] `try/catch/finally`, multi-catch, `try-with-resources`
- [ ] What happens when `finally` has a `return`

### m09 — Generics and Collections
`m09_collections/`

- [ ] Generics, bounded types, wildcards (PECS), type erasure
- [ ] `List`, `Set`, `Map`, `Queue`, `Deque` and their complexities
- [ ] **How `HashMap` works internally** (buckets, collisions, treeification, resize)
- [ ] `Comparable` vs `Comparator`
- [ ] `ConcurrentModificationException` and fail-fast iterators

### m10 — Functional Java
`m10_functional/`

- [ ] Lambdas, functional interfaces, method references
- [ ] Streams: `map`, `filter`, `flatMap`, `reduce`, collectors, `groupingBy`
- [ ] `Optional` done right
- [ ] Modern features: `var`, text blocks, switch expressions, pattern matching

---

## Part 2 — Concurrency

### m11 — Threads
`m11_threads/` · DevDojo: 220–228

- [ ] `Thread`, `Runnable`, thread lifecycle and states
- [ ] Race condition: break a counter with two threads, then fix it
- [ ] `synchronized` (method vs block), intrinsic locks
- [ ] `wait` / `notify` / `notifyAll` and producer-consumer
- [ ] Deadlock: create one on purpose, then fix it

### m12 — Concurrency API
`m12_concurrencyApi/` · DevDojo: 229–245

- [ ] Atomic classes (`AtomicInteger`) vs `synchronized`
- [ ] `ReentrantLock`, `ReadWriteLock`
- [ ] `ExecutorService`, thread pools, `Callable`, `Future`
- [ ] `CompletableFuture`: chaining, combining, error handling
- [ ] `ConcurrentHashMap`, `CountDownLatch`, `Semaphore`

### m13 — Memory Model and Virtual Threads
`m13_memoryModel/`

- [ ] `volatile`: **visibility, not atomicity** (prove `volatile int count; count++` is still broken)
- [ ] Happens-before; safe publication with `final` fields
- [ ] Thread-safe singleton (double-checked locking, holder idiom, enum)
- [ ] Virtual threads (Java 21): when they help and when they don't

**Interview questions (Part 2)**
- `synchronized` vs `volatile` vs `AtomicInteger`: when do you use each?
- Why is `HashMap` not thread-safe, and how does `ConcurrentHashMap` solve it?
- What are the four conditions for a deadlock?

---

## Part 3 — Deep Dives and Interview Ready

### m14 — JVM and Memory
- [ ] Class loading; stack vs heap; what lives where
- [ ] Garbage collection: generations, G1, ZGC (overview)
- [ ] Memory leaks in Java; `StackOverflowError` vs `OutOfMemoryError`
- [ ] JIT; strong, soft, weak and phantom references

### m15 — Design Patterns and Testing
- [ ] Singleton, Factory, Builder, Strategy, Observer, Decorator
- [ ] SOLID with examples
- [ ] JUnit 5 and Mockito; TDD on a few LeetCode solutions

### m16 — Spring Boot
- [ ] IoC and dependency injection, beans and scopes
- [ ] REST API with validation and `@ControllerAdvice`
- [ ] JPA/Hibernate, the N+1 problem, `@Transactional` pitfalls
- [ ] Mini project: a LeetCode progress tracker API

### m17 — Interview Simulation
- [ ] Low-level design: LRU cache, parking lot, rate limiter
- [ ] 5 timed coding mocks (45 min, 1 medium problem + follow-ups)
- [ ] Behavioral: 5–6 stories using the STAR method

---

## DSA Track (LeetCode)

Solved in `src/main/java/leetcode/`, roughly following the [NeetCode Roadmap](https://neetcode.io/roadmap). Do 3–5 problems a week alongside the Java modules.

| Pattern | Problems |
|---|---|
| Arrays & Strings | - [x] Remove Element<br>- [x] Longest Common Prefix<br>- [x] Find the Index of the First Occurrence in a String<br>- [ ] Two Sum<br>- [ ] Merge Sorted Array<br>- [ ] Remove Duplicates from Sorted Array |
| Stack | - [x] Valid Parentheses<br>- [ ] Min Stack<br>- [ ] Daily Temperatures |
| Hashing | - [ ] Contains Duplicate<br>- [ ] Valid Anagram<br>- [ ] Group Anagrams<br>- [ ] Top K Frequent Elements |
| Two Pointers | - [ ] Valid Palindrome<br>- [ ] 3Sum<br>- [ ] Container With Most Water |
| Sliding Window | - [ ] Best Time to Buy and Sell Stock<br>- [ ] Longest Substring Without Repeating Characters |
| Binary Search | - [ ] Binary Search<br>- [ ] Search in Rotated Sorted Array |
| Linked List | - [ ] Reverse Linked List<br>- [ ] Merge Two Sorted Lists<br>- [ ] Linked List Cycle |
| Trees | - [ ] Invert Binary Tree<br>- [ ] Maximum Depth of Binary Tree<br>- [ ] Validate Binary Search Tree<br>- [ ] Binary Tree Level Order Traversal |
| Heap | - [ ] Kth Largest Element in a Stream<br>- [ ] K Closest Points to Origin |
| Backtracking | - [ ] Subsets<br>- [ ] Combination Sum |
| Graphs | - [ ] Number of Islands<br>- [ ] Course Schedule |
| Dynamic Programming | - [ ] Climbing Stairs<br>- [ ] House Robber<br>- [ ] Coin Change |
| Advanced | - [ ] LRU Cache<br>- [ ] Merge Intervals<br>- [ ] Implement Trie |

### Problem-Solving Routine (use it on every problem)

1. **Understand:** restate the problem; ask about constraints and edge cases.
2. **Examples:** walk through 1–2 examples by hand.
3. **Brute force:** say it out loud with its complexity.
4. **Optimize:** find the bottleneck; pick a better data structure or pattern.
5. **Code** with meaningful names.
6. **Test** by dry-running the examples and edge cases.
7. **Complexity:** state final time and space.

---

## Resources

- [Maratona Java Virado no Jiraya — DevDojo](https://www.youtube.com/watch?v=VKjFuX91G5Q&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW) (free, Portuguese) · [source code](https://github.com/devdojobr/maratona-java-virado-no-jiraya)
- [Oracle — Controlling Access to Members of a Class](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)
- [Jenkov — Java Concurrency Tutorial](https://jenkov.com/tutorials/java-concurrency/index.html)
- *Effective Java* — Joshua Bloch (chapter 4, "Classes and Interfaces", is a must for modules m01–m06)
- *Java Concurrency in Practice* — Brian Goetz
- [NeetCode Roadmap](https://neetcode.io/roadmap)
