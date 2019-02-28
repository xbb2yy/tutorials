Java中如何判断一个String是不是代表一个数字的最佳方式



## 问题

> 如何判断一个String能否转成一个数字对象？

## 检查几种方式

* 利用异常来检查

  ```java
   try {
       int i = Integer.parseInt(string);
       return true;
   } catch (NumberFormatException e) {
       e.printStackTrace();
       return false;
   }
  ```

  

* 正则判断

```
return str.matches("^-?\\d+$");
```

* 判断ASCII 码的值

```java
if (str == null) {
	return false;
}
int length = str.length();
if (length == 0) {
	return false;
}
int i = 0;
if (str.charAt(0) == '-') {
    if (length == 1) {
    	return false;
    }
    i = 1;
}
for (; i < length; i++) {
    char c = str.charAt(i);
    if (c <= '/' || c >= ':') {
   		 return false;
    }
}
return true;
```

## 效率 benchmark

上述上中方法都可行，那么哪种效率最高呢？我们写一个简单的基准测试

```java
 String str = "12345" +
         "" +
         "" +
         "" +
         "" +
         "" +
         "" +
         "" +
         "6789";
 long startTime = System.currentTimeMillis();
 for(int i = 0; i < 1000000; i++)
 IsInt(str);
 long endTime = System.currentTimeMillis();
 System.out.print("ByException: ");
 System.out.println(endTime - startTime);
```



测试结果：

String 为“123456789”时

| 方法     | 用时（ms） |
| -------- | ---------- |
| 异常方法 | 34         |
| 正则     | 336        |
| 字符判断 | 17         |

String为“abcdefghijkl”时

| 方法     | 用时（ms） |
| -------- | ---------- |
| 异常方法 | 774        |
| 正则     | 299        |
| 字符判断 | 7          |



以上是结果多次测试取得平均值



我们可以看到第三种方法拥有最高的效率。第一种方法如果是个数字效率比较高，如果不是，则性能大幅度下降，这是因为如果不是数字，会进行异常处理，在堆上生成异常对象会消耗较多的时间。而正则两种情况下效率都比较低，所以比较推荐第三种方法。





