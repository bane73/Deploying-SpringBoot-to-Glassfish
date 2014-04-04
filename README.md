This project demonstrates that when deploying a SpringBoot project to Glassfish, it behaves strangely.

Namely:

1. it generates a number of missing-classes exceptions that are not referenced by the project directly
2. any attempt to do a System.out or a Logger.log results the output being eaten and never showing up in either the Console nor the container's log

I built this app by referencing this tutorial at Spring's blog:
https://spring.io/blog/2014/03/07/deploying-spring-boot-applications

I describe the problem in greater detail over at Stack Overflow:
http://stackoverflow.com/questions/22864509/spring-boot-app-deployed-to-glassfish-is-giving-strange-results
 
