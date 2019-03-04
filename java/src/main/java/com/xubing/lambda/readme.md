## 什么是lambda表达式
lambda表达式是一段可以传递的代码，它可以被执行一次或者多次.lambda和匿名内类类似,但它更加的便捷
在java8之前向其它代码传递一段代码一般我们是构建一个类的对象，在他的某个方
法中包含我们需要传递的代码.

我们以给一个string数组排序为例，深入学习lambda.
我们要排序的数组
```
 String[] strs = {"java", "lambda", "effective", "think", "Jvm", "test"};
```

我们利用arrays的sort方法给数组排序,要传递一个Comparator对象，实现compare方法.比如按字符串的长度排序
我们先利用匿名类创建一个比较器:
```
Comparator comparator = new Comparator<String>() {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() < o2.length() ? -1 : 1;
    }
};

Arrays.sort(strs, comparator);
```
**lambda表达式的写法**

         Arrays.sort(strs, (String s1, String s2) ->(s1.length() < s2.length() ? -1 : 1));
         
当我第一次看到这段代码的时候就被它的简洁所吸引。
         
**lambda表达式的格式**

参数, 箭头 ->, 以及一个表达式,如果代码无法用一个表达式表达，可以直接使用大括号{},和我们java中的方法一样
```
        Arrays.sort(strs, (String s1, String s2) -> {
            if (s1.length() < s2.length()) {
                return -1;
            } else {
                return 1;
            }
        });
```
如果lambda表达式的参数类型是可以被推导的,那么可以省略参数类型
```
Comparator<String> comparator = (s1, s2) ->(s1.length() < s2.length() ? -1: 1);
```
如果该方法只有一个参数，并且该参数的类型是可以被推导出来的，你甚至可以省略小括号

lambda表达式的返回类型总是可以从上下文中推导出来。

### 函数式接口
对于只包含一个抽象方法的接口，可以通过lambda表达式创建该接口的对象，这些接口被称为函数式接口，比如我们常用的Runnable和Comparator接口都是函数式接口。java 8新增了@FunctionalInterface
注解，表明某一个接口是函数式接口，如果一个接口不是函数式接口则会报错

```
Runnable run = () -> System.out.println("hello lambda");

```

我们以上面的字符串排序为例，sort方法会接收一个实现了Comparator<String>的实例类，调用该对象的
compare方法会执行lambda表达式总的代码。这些对象和类的管理完全依赖于如何实现，比传统的内部类效率
更高。

### 方法引用
如果你想传递给其他代码的操作已经有实现的方法了，比如你希望不区分大小写的对字符串进行排序，那么可以
传入下面这个方法引用:
```
 Arrays.sort(strs, String::compareToIgnoreCase);
 
```
格式如下:
>对象或者类名::方法名

### 构造器引用
同方法引用类似，不同的是在构造器引用中方法名是new


