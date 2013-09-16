COMP3109 Todo List
=============================

Overall Milestones
------------------

- [ ] Parse program
- [ ] Semantic checks
- [ ] Error reporting
- [ ] Produce Intermediate Code
- [ ] Create Interpretter to execute Intermediate Code

Code Block Creation
-------------------

- [ ] Assignment
- [ ] If-Then Statement
- [ ] If-Then-Else Statement
- [ ] Function return


Instructions
------------

- [ ] Load Constant - lc
- [ ] Load Instructions - ld
- [ ] Store Instructions - st
- [ ] Arithmetic Instructions - add, sub, mul, div
- [ ] Comparison - lt, gt, cmp
- [ ] Branch Instructions - br
- [ ] Return Instruction - ret
- [ ] Call Instruction - call


Task One
--------
- [ ] Define semantics
- [ ] Parse program
- [ ] Do semantic checks
- [ ] Report errors

Task Two
--------
- [ ] Create intermediate code in lisp syntax
- [ ] Define basic blocks with non-negative numbers
- [ ] Break complex expressions into individual instructions using registers

Task Three
----------

- [ ] Create interpretter that executes intermediate code
- [ ] Process one instruction at a time
- [ ] have environment for each instruction
- [ ] check for main function
- [ ] function calls should have correct number of arguments
- [ ] functions get new environment with args

Test Cases
----------

- [ ] Generic Program
- [ ] Recursion


Rules
-----

 * Variables have to be declared before use
 * Functions may have seperate namespace - same variable names allowed
 * Variables are all signed (+ or -) integers
 * Language is case-sensitive