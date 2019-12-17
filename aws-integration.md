# AWS

JDK Version 11 does not compile well on AWS. Use JDK Version 9. Degraded health message appears.

```java
java.lang.UnsupportedClassVersionError: com/todo/app/AppApplication has been compiled by a more recent version of the 
Java Runtime (class file version 55.0), this version of the Java Runtime only recognizes class file versions up to 52.0
```
