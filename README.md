# Chess Threats & Gaussian Elimination (Java)

A modular Java utility project covering coordinate-based geometry algorithms and linear algebra matrix transformations, adhering strictly to constraint-driven programming practices.

## Overview
This project contains two distinct algorithmic implementations developed in standard Java:
1. Infinite Board Chess Threat Detection: An analytical coordinate-evaluating engine determining capture threats for Bishop, Rook, and Knight without iterative loops.
2. In-Place Gaussian Elimination: An algorithmic matrix row-reduction pipeline transforming arbitrary floating-point 2D matrices into row echelon form.

## Algorithmic Modules

### 1. Infinite-Grid Chess Threats (`CheckThreats`)
- Determines threats exerted by Bishop (diagonal), Rook (orthogonal), or Knight (L-shaped delta jumps) against a target coordinate.
- Operates on an unbounded integer grid supporting arbitrary positive and negative integer coordinates.
- Implemented with zero iterative loops (O(1) execution path using algebraic and geometric assertions).

### 2. Matrix Row Reduction (`gaussianElimination`)
- Implements in-place Gaussian elimination on 2D double-precision arrays (`double[][] matrix`).
- Handles singular edge cases, including null matrices and zero-dimension arrays.
- Employs partial pivoting / row swaps to maintain numerical stability without external libraries (relying solely on `java.lang.Math`).

## Method Signatures
- public static boolean CheckThreats(int type, int x1, int y1, int x2, int y2)
- public static void gaussianElimination(double[][] matrix)

## Requirements
- Java Development Kit (JDK 8 or higher).

## Build & Run
Compile the Java source files:
javac *.java

Run tests or entry point:
java Main
