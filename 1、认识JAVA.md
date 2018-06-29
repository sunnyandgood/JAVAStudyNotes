* **JAVA分三类**
 1. Java SE：Java Standard Edition(J2SE)
 2. Java ME: Java Mobile Edition(J2ME)
 3. Java EE：Java Enterprise Edition(J2EE)
 
* **JDK和Jre**
 1. JDK：Java Development Kit （Java开发必备）
 2. JRE：Java Runtime Environment （Java执行环境）
 3. 配置环境
    1.	下载JDK
    2.	安装JDK
    3.	设定环境变量（可以是用户变量，也可以是系统变量），指向JDK安装目录中的bin目录
    4.	通过运行，输入cmd打开命令行窗口，输入java –version，显示出Java版本信息
* **编写Java程序**
 1. 用windows记事本来编写Java程序
 2. 用Editplus，UltraEdit等高级文本编辑工具编写
 3. 用专业的IDE（Integrated Development Environment）编写

    注：所有的Java代码，其后缀都是以java结尾。
* **Java程序的执行过程（以Test.java为例）**
 1. **编译** 编译命令：java Test.java
 2. **执行** 执行命令：java Test（注意，Test后面没有.class）
 
     class文件是字节码文件，程序最终执行的就是这个字节码(bytecode)文件
* Java与JVM
 1. Java是跨平台的语言，真正执行的不是二进制代码，而是字节码。
 2. JVM（Java Virtual Machine，Java虚拟机）
 3. Java是跨平台的，而JVM不是跨平台的（JVM是由C语言编写的）
 4. Java之所以能够做到跨平台，本质原因在于JVM不是跨平台的。
