# wordCount
Fast Tree Visitor

CS542 Design Patterns

Author(s): Niraj Kadu
e-mail(s): nkadu1@binghamton.edu

PURPOSE:

Design a simple taskmanager code in Java

FILES:

Following are the files that are necessary for the project to run:-
1)PopulateTreeVisitor.java
2)wordCountVisitor.java
3)TreeInfo.java
4)FileProcessor.java	
5)PerformanceTab.java
6)PopulateTreeVisitorInterface.java
7)wordCountVisitorInterface.java
8)MyLogger.java

SAMPLE OUTPUT:
---TAB(s) BEGIN---
---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 1949304  Memory  Free: 109060  Memory  Cached: 1539620
CPU Idle: 94.8  CPU User Level: 4.4  CPU System Level: 0.6

---TAB(s) END---
## To clean:
ant -buildfile src/build.xml clean

## To compile: 
ant -buildfile src/build.xml all

## To run
ant -buildfile src/build.xml run <args>
ant -buildfile src/build.xml run -Darg0=input100M.txt -Darg2=output.txt -Darg2=1

## To create tarball for submission
ant -buildfile src/build.xml tarzip
