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

### 一、JAVA程序的执行过程（以Test.java为例）
* 编译 编译命令：javac Test.java
* 执行 执行命令：java Test（注意，Test后面没有.class）

### 二、编译java程序的其他方式

* `javac -d . -encoding UTF-8 Test.java` （注意：`-d`和点号之间有空格）

  >解释：
  * `-d`选项指定生成的类文件放在那里；
  * `.`(点) 是指当前目录；
  * `-encoding`选项指定编译的字符集，因为我的系统默认编码集市GBK，而Java文件是用UTF-8生成的，所以要指定字符集；
  * 命令完成后，在当前目录生成包的目录。

### 三、jar命令的用法详解

* 1、jar命令参数：
 
  * jar命令格式：jar {c t x u f }[ v m e 0 M i ][-C 目录]文件名...
 
    >其中{ctxu}这四个参数必须选选其一。[v f m e 0 M i ]是可选参数，文件名也是必须的。
 
    * -c  创建一个jar包
    * -t 显示jar中的内容列表
    * -x 解压jar包
    * -u 添加文件到jar包中
    * -f 指定jar包的文件名
    * -v 生成详细的报造，并输出至标准设备
    * -m 指定manifest.mf文件.(manifest.mf文件中可以对jar包及其中的内容作一些一设置)
    * -0 产生jar包时不对其中的内容进行压缩处理
    * -M 不产生所有文件的清单文件(Manifest.mf)。这个参数与忽略掉-m参数的设置
    * -i 为指定的jar文件创建索引文件
    * -C 表示转到相应的目录下执行jar命令,相当于cd到那个目录，然后不带-C执行jar命令
 
* 2、jar使用范例：
 
  * (1)创建jar包

    >jar cf hello.jar hello

    * 利用test目录生成hello.jar包,如hello.jar存在,则覆盖
 
  * (2)创建并显示打包过程

    >jar cvf hello.jar hello

    * 利用hello目录创建hello.jar包,并显示创建过程

      >例：
      ```
      E:\>jar cvf hello.jar hello
      标明清单(manifest)
      增加：hello/(读入= 0) (写出= 0)(存储了 0%)
      增加：hello/TestServlet2.class(读入= 1497) (写出= 818)(压缩了 45%)
      增加：hello/HelloServlet.class(读入= 1344) (写出= 736)(压缩了 45%)
      增加：hello/TestServlet1.class(读入= 2037) (写出= 1118)(压缩了 45%)
      ```
  * (3)显示jar包：

    >jar tvf hello.jar   
    
    * 查看hello.jar包的内容;指定的jar包必须真实存在，否则会发生FileNoutFoundException。
 
  * (4)解压jar包：

    >jar xvf hello.jar

    * 解压hello.jar至当前目录
 
  * (5)jar中添加文件：
	
    >jar uf hello.jar HelloWorld.java

    * 将HelloWorld.java添加到hello.jar包中
 
  * (6)创建不压缩内容jar包：
	
    >jar cvf0 hello.jar *.class

    * 利用当前目录中所有的.class文件生成一个不压缩jar包
 
  * (7)创建带manifest.mf文件的jar包：
	
    >jar cvfm hello.jar manifest.mf hello

    * 创建的jar包多了一个META-INF目录,META-INF止录下多了一个manifest.mf文件,至于manifest.mf的作用,后面会提到.
 
  * (8)忽略manifest.mf文件：
	
    >jar cvfM hello.jar hello

    * 生成的jar包中不包括META-INF目录及manifest.mf文件
 
  * (9)加`-C`应用：`jar cvfm RoadApplet.jar RoadApplet.mf *.class `：打包
	
    >jar cvfm hello.jar mymanifest.mf -C hello/

    * 表示在切换到hello目录下然后再执行jar命令
 
  * (10)`-i`为jar文件生成索引列表：当一个jar包中的内容很好的时候，你可以给它生成一个索引文件，这样看起来很省事。
	
    >jar i hello.jar

    * 执行完这条命令后，它会在hello.jar包的META-INF文件夹下生成一个名为INDEX.LIST的索引文件，它会生成一个列表，最上边为jar包名。
 
  * (11)导出解压列表：

    >jar tvf hello.jar >hello.txt   
    
    * 如果你想查看解压一个jar的详细过程，而这个jar包又很大，屏幕信息会一闪而过，这时你可以把列表输出到一个文件中，慢慢欣赏！
 
  * (12)`jar -cvf hello.jar hello/*`

    >例如原目录结构如下：
     ``` 
     hello
       |---com
       |---org
     ```
 
    * 你本想只把com目录和org目录打包，而这时jar命令会连同hello目洋也一块打包进。这点大家要注意。jar命令生成的压缩文件会包含它后边出的目录。我们应该进入到hello目录再执行jar命令。
    * 注意：manifest.mf这个文件名，用户可以任指定，但jar命令只认识Manifest.mf，它会对用户指定的文件名进行相应在的转换，这不需用户担心。
 
* 3、Manifest.mf文件编写规则：

  * (1)不能有空行和空格的地方
    
    >第一行不可以是空行( 第一行的行前不可以有空行)，行与行之间不能有空行，第行的行尾不可以有空格
  
  * (2)一定要有空行的地方

    >最后一行得是空行(在输完你的内容后加一个回车就OK)

  * (3)一定有空格的地方
     
    >key: value       在分号后面一定要写写一个空格

* 4、怎样使用jar包中的类

  ```java
  public final class Person{
     public static int age(){
     return 30;
     }
  }
  ```
	* 将上面的文件打成一个jar包
    ```
    ->javac Person.java
    ->jar cvf person.jar Person.class
    ```
  * 再写一个类对其进行调用:
    ```java
    public class MyAge{
          public static void getAge(){
             System.out.println(Person.age());
          }
    }
    ```
    * 调试
      ```
      ->javac MyAge.java
      ->java -classpath person.jar MyAge
      ```

* 5、创建可执行jar包

  * 有时自己写个程序，类一大堆，时间一长连自己都不知道那个是主类，而且有可能用到图片或其它文件一大堆，看得也乱，这时你可以考虑把它做成一个可执行jar包...
 
    * (1)编辑manifest.mf文件加入下面一行
      ```
      Main-Class: MyApplet
      ```
      * 注意:Main-Class的大小定，冒号后的空格,MyApplet后一定输入回车，然后保存。

    * (2)打包
      ```
      jar cvfm FirstApplet.jar manifest.mf MyApplet.class
      ```
      * 注意:manifest.mf指定为存放Mani-Class: MyApplet文件的class路径(如：hello.Hello)或者文件名(applet)

    * (3)可执行jar的使用
      ```
      java -jar FirstApplet.jar
      ```
      * 也可以<applet></applet>中使用:
        ```
        <applet code=MyApplet archive=FirstApplet.jar width=200 height=100></applet>
        ```
    * 注意：类并没有给出，随便写一个就行，类名包名自己随意定，相应的更改就可以...
 
* 6、扩展自己的类
 
  * 在JDK的安装目录\jre\lib\ext目录下，SUN为大家为我们扩展自己类的提供了方便，大家可以将自己的类文件打成.jar包放在此目录下，它由ExtClassLoader类装器负责进行装载，ExtClassLoader类装器是AppClassLoader类装载器的父装载器，AppClassLoader主要负责加载CLASSPATH路径下的文件，而在java中采用的又是委托父装载器的机制，所以此目录下存放的jar中的类文件不做任何的设置，类装载器就可以找到正常的加载。
 
  * 如果你的.jar是给applet小应用程序看的，可以在打成jar包之前，在其manifest.mf加入下面两行。
    ```
    Class-Path: FirstApplet.jar
    Class-path: SecondApplet.jar
    Main-Class: MyApplet
    ```
  * 注意：Class-path可以设置多项，直接写jar包名既可。Main-Class主要当jar中有多个.class类文件时,java并不知道那个才是主类，所以要指定，如果jar包中只有一个类当然可以不指定。
 
  * Java调用类的顺序：java\lib\ext中的类--->Manifest.mf中指定的类-->当前目录中的类-->set CLASSPATH中指定的类。
  
* 7、调用URL网络上的jar包
 
  * (1)生成jar包的URL
    ```java
    URL u=new URL("jar:"+"FirstAppplet.jar"+!/");
    ```
 
  * (2)建立jarURLConnection对象
    ```java
    JarURLConnection juc=(JarURLConnection)u.openConnection();
    ```
 
  * (3)返回jar包中主类的名字
    ```java
    Attributes attr=juc.getMainAttributes();
    String name=attr.getValue("Mani-Class");
    ```
 
    * 一定要确保自己的jar包中的manifest.mf中已正确的设置了Mani-Class属性，再强调一下一定要注意规则。
 
  * (4)根据得到的主类名创建Class对象
    ```java
    Class c=Class.forName(name);
    ```
  * (5)根据Class对象调用其main方法：
    ```java
    Method cm=c.getMethod("main",new Class[]{String.class});
    cm.invoke(null,new Object[]{});
    ```
    * 提示:上边用到了Reflection反射机制的相关知识，大家如果多反射机制有兴趣，可查看java.lang.reflect包中的相关内容.
 
* 8、JAR命令使用技巧：
 
  * (1)jar创建压ZIP文件
    ```
    jar cvfM TestZIP.jar test
    ```
      * 加M参数为了不生成META-INF相关内容
      * 然后将TestZIP.jar改为TestZIP.zip就可以。

  * (2)使用WinRAR解压.jar文件

    * 上边已经说过了，说JAR文件是一种特殊的压缩文件，所以它当然可以用我们常用的一些解压缩工具来解了。

  * (3)用WinRAR生成.jar文件

    * 我们已经说过JAR包与ZIP包主要区别就是JAR包中多一个META-INF的目录，META-INF目录下有一个manifest.mf文件，我们只要建立好相关的目录一压缩就可以了。

      >目录的结构如下：
      ```
      TestJar
          |--META-INF
                |--manifest.mf
      ```

## 2.3使用集成开发环境

* Eclipse
* NetBeans
* IntelliJ IDEA 

## 2.4运行图形化应用程序

## 2.5构建并运行 applet
