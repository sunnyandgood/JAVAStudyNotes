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
      <td>模块化——Jigsaw、交互式命令行——Jshell、默认的垃圾回收器——G1、进程操作改进、竞争锁的性能优化、分段代码缓存、优化字符串占用空间 </td>
      <td></td>
   </tr>
   <tr>
      <td>2018年3月20日</td>
      <td>Java 10</td>
      <td>局部变量的类型推断、应用类数据共享(CDS) 、额外的 Unicode 语言标签扩展、基于时间的版本控制、根证书、并行全垃圾回收器 G1、移除 Native-Header 自动生成工具、垃圾回收器接口、线程-局部变量管控、在备用存储装置上的堆分配、试验性的基于 Java 的 JIT 编译器、合并 JDK 多个代码仓库到一个单独的储存库中</td>
      <td></td>
   </tr>
   <tr>
      <td>2018年9月25日</td>
      <td>Java 11</td>
	  <td></td>
	  <td></td>
   </tr>
</table>

