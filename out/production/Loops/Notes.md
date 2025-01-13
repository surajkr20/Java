
<!-- 
java => platform independent
jvm => java virtual machine (is not platform independent), jvm work for java code to execute, but it's only stand byte code not java java syntax.

java working flow ---
java code =>> java compiler(javac), through converted in =>> byte code(.class)
and then byte code run on jvm,

how many java files, but jvm start execution from first file, is called main(specific signature = public static void main(string a[]))

main looking for this signature = public static void main(string a[])

java code >> compiler(javac) >> byte code >> jvm >> public static void main(string a[])

JRE(java run time environment) => responsible for java code run any where with the help of jre(jvm is also part of jre)
inside the jdk >> jre >> jvm

-->

<!-- java is object orientend programming language, oop means everything should be an object, and to create an object we need to class -->

<!-- Data types in java

1.  integer data types, below type and total consuming memory
    1. int - 4 bytes
    2. long - 8 bytes
    3. short - 2 bytes
    4. byte - 1 bytes

2. float data types --
    float - 4 bytes
    double - 8 bytes

3. character data types store 2 bytes of memory - java followed unicode not asciicode
    characters contain in single quote(ex- 'a', 'K', '1', '@' etc)
    char - 2 bytes

4. boolean data types - only true & false not consider 0 & 1 in java

 -->