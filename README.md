This project demonstrates that when deploying a SpringBoot project to Glassfish, it behaves strangely.

Namely:
1) it generates a number of missing-classes exceptions that are not referenced by the project directly
2) any attempt to do a System.out or a Logger.log results the output being eaten and never showing up in either the Console nor the container's log
 