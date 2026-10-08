# LeetCode & Java in Practice

My training ground for **Java technical interviews**, with two tracks:

- **Java Track** — hands-on modules that teach the language by *breaking code on purpose*
- **DSA Track** — my solutions to [LeetCode](https://leetcode.com/) problems, grouped by pattern

## Tech Stack

- Java 21
- Maven (Maven Wrapper included)

## Organization

```
src/main/java/
├── leetcode/                                   # DSA Track
│   └── <ProblemName>/
│       ├── Solution.java                       # same format used by LeetCode
│       └── instruction.md                      # problem statement
└── com/example/leetcode/javaBasicsTraining/    # Java Track
    ├── STUDY_PLAN.md                           # full roadmap with checklists
    ├── m01_memberModifiers/
    ├── m02_classModifiers/
    └── mXX_<topic>/                            # one numbered module per topic
        ├── Main.java                           # run it first
        └── ...                                 # examples with 🧪 experiments in the comments
```

## How the Java Track Works

Each module is a small, runnable set of examples about one topic. The learning loop is:

1. **Watch** the related lessons from [Maratona Java (DevDojo)](https://www.youtube.com/watch?v=VKjFuX91G5Q&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW).
2. **Run** the module's `Main.java` and read the code next to the output.
3. **Break it on purpose** — every file has 🧪 experiments: uncomment a line or remove a modifier, read the compiler error and understand *why* the rule exists.
4. **Build** a small class of my own using the concept.
5. **Answer** the module's interview questions out loud.

## Roadmap

| Part | Modules | Status |
|------|---------|--------|
| **1. OOP & Language Core** | m01 Member Modifiers · m02 Class Modifiers · m03 Packages & `protected` · m04 Classes & Constructors · m05 Inheritance & Polymorphism · m06 `Object` Contract & Immutability · m07 Nested Classes · m08 Exceptions · m09 Generics & Collections · m10 Functional Java | 🟡 2/10 |
| **2. Concurrency** | m11 Threads · m12 Concurrency API · m13 Memory Model & Virtual Threads | ⚪ 0/3 |
| **3. Deep Dives & Interview** | m14 JVM & Memory · m15 Design Patterns & Testing · m16 Spring Boot · m17 Interview Simulation | ⚪ 0/4 |
| **DSA Track** | Arrays & Strings · Stack · Hashing · Two Pointers · Sliding Window · Binary Search · Linked List · Trees · Heap · Backtracking · Graphs · DP | 🟡 4 solved |

👉 Full plan with checklists, DevDojo lessons and interview questions: [STUDY_PLAN.md](src/main/java/com/example/leetcode/javaBasicsTraining/STUDY_PLAN.md)

## Author

**Alec Knipphoff da Cruz**

- GitHub: [@AlecKnipphoffDaCruz](https://github.com/AlecKnipphoffDaCruz)
- LinkedIn: [alec-knipphoff-da-cruz](https://www.linkedin.com/in/alec-knipphoff-da-cruz-155358314)
