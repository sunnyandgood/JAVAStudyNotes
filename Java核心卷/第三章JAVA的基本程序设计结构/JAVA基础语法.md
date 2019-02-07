<div align=center><h1>JAVA基础语法</h1></div>

* 1、在 Java 中，不区分变量的声明与定义。</br>
  C++ 注释：C 和 C++区分变量的声明与定义。例如：
  ```java
  int i = 10;是一个定义，而
  extern int i;是一个声明。
  在 Java 中，不区分变量的声明与定义。
  ```


* 2、const是Java 保留的关键字，但目前并没有使用。在 Java 中，必须使用 final定义常量。
* 3、整数被 0 除将会产生一个异常，而浮点数被 0 除将会得到无穷大或 NaN 结果。

   <div align=center><img src="./img/002.png"></div>
   <div align=center><img src="./img/003.png"></div>

* 4、整数余数的问题
  ```java
  System.out.println(-12%5);//-2
  System.out.println(12%-5);//2
  ```

* 5、当使用两个数值进行二元操作时（例如 n+f，n 是整数，f 是浮点数)，先要将两个操作数转换为同一种类型，然后再进行计算。
	* 如果两个操作数中有一个是double 类型，另一个操作数就会转换为double 类型。
	* 否则，如果其中一个操作数是 float 类型，另一个操作数将会转换为 float 类型。
	* 否则，如果其中一个操作数是 long 类型，另一个操作数将会转换为 long 类型。
	* 否则，两个操作数都将被转换为 int 类型。


* 6、强制类型转换
	* 强制类型转换通过截断小数部分将浮点值转换为整型。
	* 如果想对浮点数进行舍人运算，以便得到最接近的整数（在很多情况下，这种操作更有用)，那就需要使用 Math_round 方法：
	  ```java
	  double xz 9.997;
	  int nx = (int) Math.round(x);
	  ```

	现在，变量 nx 的值为 10。当调用 round 的时候，仍然需要使用强制类型转换（int)。其原因是 round方法返回的结果为 long 类型，由于存在信息丢失的可能性，所以只有使用显式的强制类型转换才能够将 long类型转换成 int 类型。

* 

