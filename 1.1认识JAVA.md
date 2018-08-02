# 第一节、认识JAVA

<div align="center"><img src="https://github.com/sunnyandgood/JAVAStudyNotes/blob/master/img/JAVA%E5%B1%82%E6%AC%A1%E5%9B%BE.png"/></div>

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
* JAVA的注解
 1. 单行注释：以`//`开头，`//`后面的所有内容均被当做注释处理。
 2. 多行注释：以`/*开头，以*/结束`，中间的所有内容均被当做注释处理。（注：多行注释不可嵌套）
 3.文档注释：以`/ **开头，以* /结束` 。
* 栈与堆
 1. 栈（`stack`）：存放原生数据类型（先进后出，后进先出）
 2. 堆（`heap`）：存放对象
 * IDE（`Integrated Development Environment`）集成开发环境
 1. `NetBeans   http://netbeans.org/`
 2. `JBuilder`
 3. `Intellij IDEA`
 4. `Eclipse`(日蚀、月蚀)
