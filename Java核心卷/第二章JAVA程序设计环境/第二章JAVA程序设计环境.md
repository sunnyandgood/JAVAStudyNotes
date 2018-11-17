<h1 align="center">第二章JAVA程序设计环境</h1>

## 2.1 安装 Java 开发工具包

###  一、Java 术语 
* **JDK**（Java SE开发包，Java Development Kit） ：编写Java 程序的程序员使用的软件；**它包含虚拟机，包含编译器**。
* **JRE**（ Java 运行时环境，Java Runtime Environment）： 运行 Java 程序的用户使用的软件；**它包含虚拟机，但不包含编译器**。
* Server JRE：在服务器上运行 Java 程序的软件 
* **SE**（ Java 标准版,Standard Edition）：用于桌面或简单服务器应用的 Java 平台 
* **ME**（Java 移动版，Micro Edition）：用于手机和其他小搜设备的 Java 平台
* **EE**（Java 企业版,Enterprise Edition）：用于复杂服务器应用的 Java 平台 
* Java FX：图形化用户界面的一个替代工具包， 在 Oracle 的 Java SE 发布版本中提供
* OpenJDK：JavaSE 的一个免费开源实现，不包含浏览器集成或 JavaFX 
* J2（Java 2）：一个过时的术语，用于描述1998 年 〜 2006 年之间的 Java 版本 
* SDK（软件开发包，Software Development Kit）：一个过时的术语， 用于描述 1998 年 ~ 2006 年之间的 JDK 
* u（Update）：Oracle 的术语， 表示 bug 修正版本
* NetBeans：Oracle 的集成开发环境

## 2.2使用命令行工具

### JAVA程序的执行过程（以Test.java为例）
* 编译 编译命令：javac Test.java
* 执行 执行命令：java Test（注意，Test后面没有.class）

### 编译java程序的其他方式

* `javac -d . -encoding UTF-8 Test.java` （注意：`-d`和点号之间有空格）

  >解释：

`jar cvfm RoadApplet.jar RoadApplet.mf *.dass `：打包

## 2.3使用集成开发环境

* Eclipse
* NetBeans
* IntelliJ IDEA 

## 2.4运行图形化应用程序

## 2.5构建并运行 applet
