<h1 align="center">第一章JAVA程序设计概述</h1>

## 1.1 JAVA程序设计平台

## 1.2 JAVA"白皮书"的关键术语

* 1 、简单性
  * JAVA没有头文件、指针运算（甚至指针语法)、结构、 联合、操作符重载、虚基类等。
  * Java 微型版（Java Micro Edition(JavaME)), 这个版本适用于嵌人式设备。
* 2 、面向对象
  * 面向对象设计是一种程序设计技术。 它将重点放在教椐（即对象）和对象的接口上。
  * Java 与 C++ 的主要不同点在于多重继承， 在 Java 中，取而代之的是更简单的接口概念。
  * 与 C++ 相比，Java 提供了更丰富的运行时自省功能。
* 3 、分布式
  * Java 应用 程序能够通过 URL 打开和访问网络上的对象，其便捷程度就好像访问本地文件一样。
* 4 、健壮性
  * Java 和 C++ 最大的不同在于 Java 采用的指针模型可以消除重写内存和损坏数据的可能性。
  * Java 编译器能够检测许多在其他语言中仅在运行时才能够检测出来的问题。 
* 5 、安全性
  * 使用 Java 可以构建防病毒、 防篡改的系统。 
  * 虚拟机的安全性，它让我们不必再担心来自恶意代码的攻击。 
  * Java 一开始就设计成能够防范各种攻击，其中包括： 
    * 运行时堆栈溢出。 如蠕虫和病毒常用的攻击手段。 
    * 破坏自己的进程空间之外的内存。 
    * 未经授权读写文件。 
* 6 、体系结构中立 
* 7 、可移植性
	* 在 Java 中，数据类型具有固定的大小， 这消除了代码移植时令 人头痛的主要问题。
	* 二进制数据以固定的格式进行存储和传输， 消除了字节顺序的困扰。
	* 字符串是用标准的 Unicode 格式存储的。 
* 8 、解释型
	* Java 解释器可以在任何移植了解释器的机器上执行 Java 字节码。
* 9 、高性能 
* 10 、多线程 
* 11 、动态性

## 1.3 Java applet 与 Internet

## 1.4 Java 发展简史

<table>
   <tr>
      <td>时间</td>
      <td>版本</td>
      <td>语言新特性 </td>
      <td>类与接口的数量</td>
   </tr>
   <tr>
      <td>1991年</td>
      <td>项目被命名为"Green"</td>
      <td></td>
      <td></td>
   </tr>
   <tr>
      <td></td>
      <td>语言命名为“Oak”</td>
      <td></td>
      <td></td>
   </tr>
   <tr>
      <td></td>
      <td>改名为JAVA</td>
      <td></td>
      <td></td>
   </tr>
   <tr>
      <td>1992年</td>
      <td>第一个产品，称之为“ *7”</td>
      <td></td>
      <td></td>
   </tr>
   <tr>
      <td></td>
      <td>Green 项目换名 —  “ First Person 公司”</td>
      <td></td>
      <td></td>
   </tr>
   <tr>
      <td>1994年</td>
      <td>First Person 公司解散</td>
      <td></td>
      <td></td>
   </tr>
   <tr>
      <td>1996年1月23日</td>
      <td>Sun 发布了 Java 的第 1 个版本（Java 1.0）</td>
      <td>语言本身 </td>
      <td>211</td>
   </tr>
   <tr>
      <td>1997年2月19日</td>
      <td>Java 1.1</td>
      <td>内部类 </td>
      <td>477</td>
   </tr>
   <tr>
      <td>1998年12月8日</td>
      <td>Java 1.2</td>
      <td>strictfp 修饰符 </td>
      <td>1524</td>
   </tr>
   <tr>
      <td>2000年5月8日</td>
      <td>Java 1.3</td>
      <td>无</td>
      <td>1840</td>
   </tr>
   <tr>
      <td>2002年2月6日</td>
      <td>Java 1.4</td>
      <td>断言</td>
      <td>2723</td>
   </tr>
   <tr>
      <td>2004年9月30日</td>
      <td>Java 1.5->Java5.0</td>
      <td>泛型类、 “ for each” 循环、 可变元参数、 自动装箱、 元数据、 枚举、 静态导入</td>
      <td>3279</td>
   </tr>
   <tr>
      <td>2006年12月11日</td>
      <td>Java 6</td>
      <td>无</td>
      <td>3793</td>
   </tr>
   <tr>
      <td>2009年</td>
      <td>被 Oracle 收购</td>
      <td></td>
      <td></td>
   </tr>
   <tr>
      <td>2011年7月28日</td>
      <td>Java 7</td>
      <td>基于字符串的 switch、 钻石操作符、 二进制字面量、 异常处理改进</td>
      <td>4024</td>
   </tr>
   <tr>
      <td>2014年3月18日</td>
      <td>Java 8</td>
      <td> lambda 表达式，包含默认方法的接口， 流和日期 / 时间库</td>
      <td>4240</td>
   </tr>
   <tr>
      <td>2017年9月21日</td>
      <td>Java 9</td>
      <td></td>
      <td></td>
   </tr>
   <tr>
      <td>2018年3月20日</td>
      <td>Java 10</td>
      <td></td>
      <td></td>
   </tr>
   <tr>
      <td>2018年9月25日</td>
      <td>Java 11</td>
	  <td></td>
	  <td></td>
   </tr>
</table>

--------------------

### JDK Version 1.0

1996-01-23 Oak(橡树)

* 初代版本，伟大的一个里程碑，但是是纯解释运行，使用外挂JIT，性能比较差，运行速度慢。

-------------------

### JDK Version 1.1

1997-02-19

* JDBC(Java DataBase Connectivity);
* 支持内部类;
* RMI(Remote Method Invocation) ;
* 反射;
* Java Bean;

------------------

### JDK Version 1.2

1998-12-08 Playground(操场)

* 集合框架;
* JIT(Just In Time)编译器;
* 对打包的Java文件进行数字签名;
* JFC(Java Foundation Classes), 包括Swing 1.0, 拖放和Java2D类库;
* Java插件;
* JDBC中引入可滚动结果集,BLOB,CLOB,批量更新和用户自定义类型;
* Applet中添加声音支持.

----------------

JDK Version 1.3

2000-05-08 Kestrel(红隼)

* Java Sound API;
* jar文件索引;
* 对Java的各个方面都做了大量优化和增强;

--------------

JDK Version 1.4

2004-02-06 Merlin(隼)

* XML处理;
* Java打印服务;
* Logging API;
* Java Web Start;
* JDBC 3.0 API;
* 断言;
* Preferences API;
* 链式异常处理;
* 支持IPV6;
* 支持正则表达式;
* 引入Imgae I/O API.

--------------

JAVA 5

2004-09-30 Tiger(老虎)

泛型;
	增强循环,可以使用迭代方式;
	自动装箱与自动拆箱;
	类型安全的枚举;
	可变参数;
	静态引入;
	元数据(注解);
	Instrumentation;
JAVA 6

2006-12-11 Mustang(野马)

支持脚本语言;
	JDBC 4.0API;
	Java Compiler API;
	可插拔注解;
	增加对Native PKI(Public Key Infrastructure), Java GSS(Generic Security Service),Kerberos和LDAP(Lightweight Directory Access Protocol)支持;
	继承Web Services;
JAVA 7

2011-07-28 Dolphin(海豚)

switch语句块中允许以字符串作为分支条件;
	在创建泛型对象时应用类型推断;
	在一个语句块中捕获多种异常;
	支持动态语言;
	支持try-with-resources(在一个语句块中捕获多种异常);
	引入Java NIO.2开发包;
	数值类型可以用二进制字符串表示,并且可以在字符串表示中添加下划线;
	钻石型语法(在创建泛型对象时应用类型推断);
	null值得自动处理;
JAVA 8

2014-03-18 


	Lambda 表达式 − Lambda允许把函数作为一个方法的参数（函数作为参数传递进方法中。
	
	
	方法引用 − 方法引用提供了非常有用的语法，可以直接引用已有Java类或对象（实例）的方法或构造器。与lambda联合使用，方法引用可以使语言的构造更紧凑简洁，减少冗余代码。
	
	
	默认方法 − 默认方法就是一个在接口里面有了一个实现的方法。
	
	
	新工具 − 新的编译工具，如：Nashorn引擎 jjs、 类依赖分析器jdeps。
	
	
	Stream API −新添加的Stream API（java.util.stream） 把真正的函数式编程风格引入到Java中。
	
	
	Date Time API − 加强对日期与时间的处理。
	
	
	Optional 类 − Optional 类已经成为 Java 8 类库的一部分，用来解决空指针异常。
	
	
	Nashorn, JavaScript 引擎 − Java 8提供了一个新的Nashorn javascript引擎，它允许我们在JVM上运行特定的javascript应用。
	
	
	详细参考:http://www.runoob.com/java/java8-new-features.html
	
JAVA 9

2017-09-22

模块系统：模块是一个包的容器，Java 9 最大的变化之一是引入了模块系统（Jigsaw 项目）。
	REPL (JShell)：交互式编程环境。
	HTTP 2 客户端：HTTP/2标准是HTTP协议的最新版本，新的 HTTPClient API 支持 WebSocket 和 HTTP2 流以及服务器推送特性。
	改进的 Javadoc：Javadoc 现在支持在 API 文档中的进行搜索。另外，Javadoc 的输出现在符合兼容 HTML5 标准。
	多版本兼容 JAR 包：多版本兼容 JAR 功能能让你创建仅在特定版本的 Java 环境中运行库程序时选择使用的 class 版本。
	集合工厂方法：List，Set 和 Map 接口中，新的静态工厂方法可以创建这些集合的不可变实例。
	私有接口方法：在接口中使用private私有方法。我们可以使用 private 访问修饰符在接口中编写私有方法。
	进程 API: 改进的 API 来控制和管理操作系统进程。引进 java.lang.ProcessHandle 及其嵌套接口 Info 来让开发者逃离时常因为要获取一个本地进程的 PID 而不得不使用本地代码的窘境。
	改进的 Stream API：改进的 Stream API 添加了一些便利的方法，使流处理更容易，并使用收集器编写复杂的查询。
	改进 try-with-resources：如果你已经有一个资源是 final 或等效于 final 变量,您可以在 try-with-resources 语句中使用该变量，而无需在 try-with-resources 语句中声明一个新变量。
	改进的弃用注解 @Deprecated：注解 @Deprecated 可以标记 Java API 状态，可以表示被标记的 API 将会被移除，或者已经破坏。
	改进钻石操作符(Diamond Operator) ：匿名类可以使用钻石操作符(Diamond Operator)。
	改进 Optional 类：java.util.Optional 添加了很多新的有用方法，Optional 可以直接转为 stream。
	多分辨率图像 API：定义多分辨率图像API，开发者可以很容易的操作和展示不同分辨率的图像了。
	改进的 CompletableFuture API ： CompletableFuture 类的异步机制可以在 ProcessHandle.onExit 方法退出时执行操作。
	轻量级的 JSON API：内置了一个轻量级的JSON API
	响应式流（Reactive Streams) API: Java 9中引入了新的响应式流 API 来支持 Java 9 中的响应式编程。
	详细参考:http://www.runoob.com/java/java9-new-features.html
JAVA 10

2018-03-21

根据官网的公开资料，共有12个重要特性，如下：

JEP286，var 局部变量类型推断。
	JEP296，将原来用 Mercurial 管理的众多 JDK 仓库代码，合并到一个仓库中，简化开发和管理过程。
	JEP304，统一的垃圾回收接口。
	JEP307，G1 垃圾回收器的并行完整垃圾回收，实现并行性来改善最坏情况下的延迟。
	JEP310，应用程序类数据 (AppCDS) 共享，通过跨进程共享通用类元数据来减少内存占用空间，和减少启动时间。
	JEP312，ThreadLocal 握手交互。在不进入到全局 JVM 安全点 (Safepoint) 的情况下，对线程执行回调。优化可以只停止单个线程，而不是停全部线程或一个都不停。
	JEP313，移除 JDK 中附带的 javah 工具。可以使用 javac -h 代替。
	JEP314，使用附加的 Unicode 语言标记扩展。
	JEP317，能将堆内存占用分配给用户指定的备用内存设备。
	JEP317，使用 Graal 基于 Java 的编译器，可以预先把 Java 代码编译成本地代码来提升效能。
	JEP318，在 OpenJDK 中提供一组默认的根证书颁发机构证书。开源目前 Oracle 提供的的 Java SE 的根证书，这样 OpenJDK 对开发人员使用起来更方便。
	JEP322，基于时间定义的发布版本，即上述提到的发布周期。版本号为\$FEATURE.\$INTERIM.\$UPDATE.\$PATCH，分别是大版本，中间版本，升级包和补丁版本。
JAVA 11

2018-09-25 

翻译后的新特性有：

181:Nest-Based访问控制
	309:动态类文件常量
	315:改善Aarch64 intrinsic
	318:无操作垃圾收集器
	320:消除Java EE和CORBA模块
	321:HTTP客户端(标准)
	323:局部变量的语法λ参数
	324:Curve25519和Curve448关键协议
	327:Unicode 10
	328:飞行记录器
	329:ChaCha20和Poly1305加密算法
	330:发射一列纵队源代码程序
	331:低开销堆分析
	332:传输层安全性(Transport Layer Security,TLS)1.3
	333:动作:一个可伸缩的低延迟垃圾收集器 (实验)
	335:反对Nashorn JavaScript引擎
	336:反对Pack200工具和API
