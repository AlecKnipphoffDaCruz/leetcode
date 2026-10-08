# Java Study Plan — From Basics to Advanced

A structured roadmap to master **Java** and prepare for **technical interviews**.
It combines two tracks that run in parallel:

- **Java Track** — the language, the JDK and the ecosystem (this folder: `javaBasicsTraining`)
- **DSA Track** — data structures and algorithms practiced on LeetCode (`src/main/java/leetcode`)

> Tick the boxes (`- [x]`) as you go, so this file also works as a progress tracker on GitHub.

---

## How to Use This Plan

1. Work through the phases **in order**. Each phase builds on the previous one.
2. For every topic: **read → write code → explain it out loud** (as if in an interview).
3. Each module gets its own package here, e.g. `javaBasicsTraining/phase01_basics/`, with small runnable classes and a short `notes.md`.
4. Do the **DSA Track** problems listed in each phase alongside the Java topics.
5. Finish each phase with the **checkpoint**: if you can't answer the questions without looking, review before moving on.

**Suggested pace:** ~1 to 2 weeks per phase, 1 to 2 hours a day. Consistency beats intensity.

---

## Phase 1 — Fundamentals

**Goal:** write simple programs comfortably and understand what Java does under the hood.

- [ ] JDK vs JRE vs JVM, compiling (`javac`) and running (`java`), bytecode
- [ ] Program structure: `class`, `main`, packages, imports
- [ ] Primitive types (`int`, `long`, `double`, `char`, `boolean`...) and their sizes
- [ ] Wrapper classes, autoboxing/unboxing, and the `Integer` cache pitfall (`==` vs `equals`)
- [ ] Operators, precedence, integer division, overflow, casting
- [ ] Control flow: `if/else`, `switch` (classic and new arrow syntax), loops, `break`/`continue`
- [ ] Arrays (1D and 2D), `Arrays.sort`, `Arrays.fill`, `Arrays.toString`
- [ ] `String`: immutability, String pool, `equals` vs `==`, common methods
- [ ] `StringBuilder` and why concatenation inside loops is slow
- [ ] Methods: parameters, return values, overloading, **pass-by-value** (also for objects)
- [ ] `Scanner` and basic console input/output

**DSA Track:** arrays and strings
- [x] Remove Element
- [x] Longest Common Prefix
- [x] Find the Index of the First Occurrence in a String
- [ ] Two Sum
- [ ] Palindrome Number
- [ ] Roman to Integer
- [ ] Merge Sorted Array
- [ ] Remove Duplicates from Sorted Array

**Checkpoint:**
- Why is `String` immutable, and what are the benefits?
- Is Java pass-by-value or pass-by-reference?
- What does `Integer a = 127, b = 127; a == b` return? And with `128`?

---

## Phase 2 — Object-Oriented Programming

**Goal:** model problems with classes and understand the four pillars well enough to explain them.

- [ ] Classes, objects, constructors, `this`, constructor chaining
- [ ] Access modifiers: `private`, default, `protected`, `public`
- [ ] Encapsulation: getters/setters and when *not* to use them
- [ ] `static` members, static blocks, and `final` (variables, methods, classes)
- [ ] Inheritance, `super`, method overriding, `@Override`
- [ ] Polymorphism: upcasting, downcasting, `instanceof` (with pattern matching)
- [ ] Abstract classes vs interfaces (default and static methods in interfaces)
- [ ] Composition over inheritance
- [ ] `Object` methods: `equals`, `hashCode` (and their contract), `toString`
- [ ] Inner classes: static nested, inner, local, anonymous
- [ ] Enums (with fields, methods and `switch`)
- [ ] Records (Java 16+) for immutable data
- [ ] SOLID principles

**DSA Track:** stacks and simple simulation
- [x] Valid Parentheses
- [ ] Min Stack
- [ ] Implement Queue using Stacks
- [ ] Baseball Game

**Checkpoint:**
- If you override `equals`, why must you also override `hashCode`?
- Abstract class or interface: when do you pick each?
- Explain each SOLID principle with a small example.

---

## Phase 3 — Exceptions, Generics and Collections

**Goal:** know the Collections Framework well enough to pick the right structure in an interview without thinking twice.

- [ ] Exception hierarchy: `Throwable`, `Error`, `Exception`, `RuntimeException`
- [ ] Checked vs unchecked exceptions
- [ ] `try/catch/finally`, multi-catch, `try-with-resources`, custom exceptions
- [ ] Generics: generic classes and methods, bounded types, wildcards (`? extends`, `? super`, PECS)
- [ ] Type erasure and its limitations
- [ ] `List`: `ArrayList` vs `LinkedList` (and their complexities)
- [ ] `Set`: `HashSet`, `LinkedHashSet`, `TreeSet`
- [ ] `Map`: `HashMap`, `LinkedHashMap`, `TreeMap`; `getOrDefault`, `merge`, `computeIfAbsent`
- [ ] **How `HashMap` works internally** (buckets, hashing, collisions, treeification, resizing)
- [ ] `Queue` / `Deque`: `ArrayDeque`, `PriorityQueue` (min-heap and max-heap)
- [ ] `Comparable` vs `Comparator`, `Comparator.comparing(...).thenComparing(...)`
- [ ] `Iterator`, `ConcurrentModificationException`
- [ ] `Collections` and `Arrays` utility methods; immutable collections (`List.of`, `Map.of`)

**DSA Track:** hashing, two pointers, sliding window
- [ ] Contains Duplicate
- [ ] Valid Anagram
- [ ] Group Anagrams
- [ ] Top K Frequent Elements
- [ ] Valid Palindrome
- [ ] 3Sum
- [ ] Container With Most Water
- [ ] Best Time to Buy and Sell Stock
- [ ] Longest Substring Without Repeating Characters
- [ ] Longest Repeating Character Replacement

**Checkpoint:**
- What happens in a `HashMap` when two keys have the same hash?
- What is the time complexity of `get` in a `HashMap`, `TreeMap` and `ArrayList`?
- When do you use `ArrayDeque` instead of `Stack`, and why?

---

## Phase 4 — Functional Java and Modern Features

**Goal:** write concise, modern Java (8 → 21) the way it's written at companies today.

- [ ] Lambdas and functional interfaces (`Function`, `Predicate`, `Consumer`, `Supplier`, `BiFunction`)
- [ ] Method references (`Class::method`)
- [ ] Streams API: `map`, `filter`, `reduce`, `flatMap`, `sorted`, `distinct`, `limit`
- [ ] Collectors: `toList`, `toMap`, `groupingBy`, `partitioningBy`, `joining`, `counting`
- [ ] Lazy evaluation, intermediate vs terminal operations
- [ ] `Optional` — and how to use it correctly (and how not to)
- [ ] `var` (local type inference)
- [ ] Text blocks (`"""`)
- [ ] Switch expressions and pattern matching for `switch`
- [ ] Sealed classes and interfaces
- [ ] Record patterns
- [ ] Date/Time API (`LocalDate`, `LocalDateTime`, `Duration`, `ZonedDateTime`)

**DSA Track:** binary search and linked lists
- [ ] Binary Search
- [ ] Search in Rotated Sorted Array
- [ ] Find Minimum in Rotated Sorted Array
- [ ] Koko Eating Bananas
- [ ] Reverse Linked List
- [ ] Merge Two Sorted Lists
- [ ] Linked List Cycle
- [ ] Remove Nth Node From End of List
- [ ] Reorder List

**Checkpoint:**
- Difference between `map` and `flatMap`?
- Why shouldn't `Optional` be used as a field or method parameter?
- What problem do sealed classes solve?

---

## Phase 5 — JVM Internals and Memory

**Goal:** answer "what happens under the hood" questions — they separate juniors from mid/seniors.

- [ ] JVM architecture: class loader, runtime data areas, execution engine
- [ ] Stack vs heap; what lives where
- [ ] Garbage collection: generations, minor vs major GC, G1, ZGC (overview)
- [ ] Memory leaks in Java (yes, they exist) and how to spot them
- [ ] `StackOverflowError` vs `OutOfMemoryError`
- [ ] JIT compilation
- [ ] Strong, soft, weak and phantom references
- [ ] Immutability and defensive copies
- [ ] Basic tools: `jconsole`, VisualVM, `jstack`, `jmap`

**DSA Track:** trees
- [ ] Invert Binary Tree
- [ ] Maximum Depth of Binary Tree
- [ ] Same Tree
- [ ] Diameter of Binary Tree
- [ ] Balanced Binary Tree
- [ ] Binary Tree Level Order Traversal
- [ ] Validate Binary Search Tree
- [ ] Lowest Common Ancestor of a BST
- [ ] Kth Smallest Element in a BST

**Checkpoint:**
- Where are objects, local variables and static variables stored?
- How does the GC decide an object can be collected?
- Give an example of a memory leak in Java.

---

## Phase 6 — Concurrency and Multithreading

**Goal:** understand threads well enough to discuss race conditions and choose the right tools.

- [ ] `Thread`, `Runnable`, `Callable`, thread lifecycle
- [ ] Race conditions, `synchronized`, intrinsic locks
- [ ] `volatile` and the Java Memory Model (happens-before)
- [ ] `wait`/`notify` and the producer-consumer problem
- [ ] `ExecutorService`, thread pools, `Future`
- [ ] `CompletableFuture` (chaining, combining, error handling)
- [ ] `java.util.concurrent`: `ConcurrentHashMap`, `AtomicInteger`, `CountDownLatch`, `Semaphore`, `ReentrantLock`
- [ ] Deadlock, livelock, starvation — and how to prevent them
- [ ] Virtual threads (Java 21)
- [ ] Thread-safe singleton

**DSA Track:** heaps and backtracking
- [ ] Kth Largest Element in a Stream
- [ ] Last Stone Weight
- [ ] K Closest Points to Origin
- [ ] Task Scheduler
- [ ] Subsets
- [ ] Combination Sum
- [ ] Permutations
- [ ] Word Search

**Checkpoint:**
- `synchronized` vs `volatile` vs `AtomicInteger`: when do you use each?
- Why is `HashMap` not thread-safe, and how does `ConcurrentHashMap` solve it?
- What are virtual threads, and when do they help?

---

## Phase 7 — Testing, Design Patterns and Clean Code

**Goal:** write code a team would happily review.

- [ ] JUnit 5: `@Test`, `@BeforeEach`, `@ParameterizedTest`, assertions
- [ ] Mockito: mocks, stubs, `verify`
- [ ] TDD basics (red → green → refactor) — try it on a few LeetCode solutions
- [ ] Creational patterns: Singleton, Factory, Builder
- [ ] Structural patterns: Adapter, Decorator, Facade
- [ ] Behavioral patterns: Strategy, Observer, Template Method
- [ ] Clean code: naming, small methods, avoiding side effects
- [ ] Maven: lifecycle, dependencies, scopes
- [ ] Git workflow: branches, meaningful commits, pull requests

**DSA Track:** graphs
- [ ] Number of Islands
- [ ] Clone Graph
- [ ] Max Area of Island
- [ ] Rotting Oranges
- [ ] Pacific Atlantic Water Flow
- [ ] Course Schedule
- [ ] Number of Connected Components in an Undirected Graph

**Checkpoint:**
- Implement a Builder for a class with 6 fields.
- Explain Strategy vs Template Method.
- What is the difference between a mock and a stub?

---

## Phase 8 — Backend Ecosystem (Spring Boot)

**Goal:** connect everything into a real backend application — most Java jobs require it.

- [ ] Spring core: IoC, dependency injection, beans, scopes
- [ ] Spring Boot: auto-configuration, starters, `application.properties`/`yml`, profiles
- [ ] REST APIs: `@RestController`, `@RequestMapping`, DTOs, validation, exception handling (`@ControllerAdvice`)
- [ ] JDBC basics and SQL (joins, indexes, transactions)
- [ ] JPA/Hibernate: entities, relationships, lazy vs eager, the N+1 problem
- [ ] Spring Data JPA repositories
- [ ] Transactions: `@Transactional`, propagation, isolation
- [ ] Spring Security basics, JWT
- [ ] Integration tests with `@SpringBootTest` and Testcontainers
- [ ] Docker basics for running the app and the database

**Mini project:** build a small REST API (e.g. a task manager or a LeetCode progress tracker) using everything from this phase.

**DSA Track:** dynamic programming (1D)
- [ ] Climbing Stairs
- [ ] Min Cost Climbing Stairs
- [ ] House Robber
- [ ] House Robber II
- [ ] Longest Palindromic Substring
- [ ] Decode Ways
- [ ] Coin Change
- [ ] Longest Increasing Subsequence
- [ ] Word Break

**Checkpoint:**
- How does dependency injection work in Spring?
- What is the N+1 problem, and how do you fix it?
- What happens when a `@Transactional` method calls another one in the same class?

---

## Phase 9 — Advanced and Interview Ready

**Goal:** close the gaps and simulate the real thing.

- [ ] Reflection and annotations (create a custom annotation)
- [ ] Java I/O and NIO (`Files`, `Path`)
- [ ] Serialization and JSON (Jackson)
- [ ] Performance: profiling, benchmarking with JMH (overview)
- [ ] System design fundamentals: caching, load balancing, queues, databases (SQL vs NoSQL)
- [ ] Low-level design practice: parking lot, LRU cache, rate limiter, elevator
- [ ] Behavioral interview: prepare 5–6 stories using the STAR method

**DSA Track:** advanced
- [ ] LRU Cache
- [ ] Implement Trie (Prefix Tree)
- [ ] Merge Intervals
- [ ] Insert Interval
- [ ] Non-overlapping Intervals
- [ ] Unique Paths
- [ ] Longest Common Subsequence
- [ ] Find Median from Data Stream
- [ ] Merge k Sorted Lists
- [ ] Trapping Rain Water

**Mock interviews:**
- [ ] 5 timed mock interviews (45 min: 1 medium problem + follow-ups)
- [ ] 2 low-level design mocks
- [ ] 1 full loop simulation (coding + design + behavioral)

---

## Interview Problem-Solving Routine

Use this for **every** LeetCode problem, not just in mocks:

1. **Understand:** restate the problem and ask about input size, edge cases and constraints.
2. **Examples:** walk through 1–2 examples by hand, including an edge case.
3. **Brute force:** say the naive solution and its complexity out loud.
4. **Optimize:** find the bottleneck and pick a better data structure or pattern.
5. **Code:** write clean code with meaningful names.
6. **Test:** dry-run your code with the examples and edge cases.
7. **Complexity:** state the final time and space complexity.

---

## Resources

- [Official Java Tutorials (dev.java)](https://dev.java/learn/)
- [Java SE 21 API Docs](https://docs.oracle.com/en/java/javase/21/docs/api/)
- *Effective Java* — Joshua Bloch (a must-read for interviews)
- *Java Concurrency in Practice* — Brian Goetz
- [NeetCode Roadmap](https://neetcode.io/roadmap) — the DSA Track roughly follows its order
- [Baeldung](https://www.baeldung.com/) — practical Java and Spring articles
- [Refactoring Guru](https://refactoring.guru/design-patterns) — design patterns explained
