# Java 正则表达式学习手册

## 正则表达式

###1.1.什么是正则表达式

正则表达式是对字符串操作的一种逻辑公式，就是用事先定义好的一些特定字符、及这些特定字符的组合，
组成一个“规则字符串”，这个“规则字符串”用来表达对字符串的一种过滤逻辑，可以用来寻找编辑处理文
本。正则表达式的英文缩写一般是regrex

>Once a source character has been used in a match, it cannot be reused. For 
example, the regex aba will match ababababa only two times (aba_aba__).

###1.2.举例
一个简单的正则就是一个字符串，比如"hello world"正则匹配"hello world", .英文点号是另一个
正则的例子，它匹配任意**单个字符**，它会匹配"1"或者"a"等。
.表一，正则例子

Regrex | Matches
------ | -----
this is text | 精准匹配文本"this is text"
this\s+is\s+text | 匹配"this"后跟一个或多个空格然后跟"is"然后跟一个或多个空格最后加"text" <br>比如"this is           text"
^\d+(\.\d+)? | 匹配一个一个或多个数字开头，?表示匹配0个或者多个\.转义了表示匹配.<br>,所以这表达式可以匹配任何正的实数，比如1.1 5 500 2.345

###1.3.语言支持
大多数编程语言都支持正则，比如不幸的实他们都有些轻微的区别

## 2.预备知识
既然是java中的正则表达式，那么一定要有一定的java基础知识，我们使用[JUnit](http://www.vogella.com/tutorials/JUnit/article.html)
来验证我们的结果。

## 3.正则表达式规则

###3.1.通用的匹配符

Regular Expression	|  Description
|----------------     | ---------------|
.            |    Matches any character
^regex | Finds regex that must match at the beginning of the line.
regex$   |  Finds regex that must match at the end of the line.
[abc] | Set definition, can match the letter a or b or c
[abc][vz]  | Set definition, can match a or b or c followed by either v or z.
[^abc]    |   When a caret appears as the first character inside square brackets, it negates the pattern. This pattern matches any character except a or b or c.
[a-d1-7]  |   Ranges: matches a letter between a and d and figures from 1 to 7, but not d1.
X &#124; Z  | Finds X or Z.
XZ | Finds X directly followed by Z.
$ | Checks if a line end follows.
### 3.2.元字符
元字符有特殊的定义，它使一些通用的表达式更加简单， 比如\w 可以表示任意字母

表达式 | 描述
-------------- | ---------------
\d | 任意数字
\D | 非数字
\w | 任意字母
\W | 非字母
\s | 空白字符
\S | 非空白字符
\b | 匹配一个单词边界，也就是指单词和空格间的位置（即正则表达式的“匹配”有两种概念，一种是<br>匹配字符，一种是匹配位置，这里的\b就是匹配位置的）。例如，“er\b”可以<br>匹配“never”中的“er”，但不能匹配“verb”中的“er”。

>大写和小写往往表示相反的意思

### 3.3.量词
量词表示一个元素出现的频率，符号?、*、+和{}定义正则表达式的数量。

表达式 | 描述
---------- | ----------
* | 零次或者多次
+ | 一次或者多次
? | 零次或者一次
/{;n, m} | n和m次之间
{n} | n次
*? | 懒惰匹配零次或者多次

### 3.4.分组

我们可以使用小括号"()"来指定要重复的子表达式，然后对这个子表达式进行重复，例如：(abc)? 表示0个或1个abc 这里一 个括号的表达式就表示一个分组 。
除此之外这些组也创建了一个反向引用指向对应的正则。这些反向引用保存了匹配该组的字符串
```
        String str = "abcdefg1gg23ihfg1gg";
        String regex = "(fg)(.)(gg)";
        Pattern pattern = Pattern.compile(regex);
        String s = str.replaceAll(regex, "$1$3");
        System.out.println(s);
        输出结果abcdefggg23ihfggg

```
通过$你可以引用组，$1是第一个组，$2是第二个组

### 3.5.非获取匹配，正向否定预查
非获取匹配，正向否定预查，在任何不匹配pattern的字符串开始处匹配查找字符串，该匹配不需要获取供以后
使用。例如“Windows(?!95|98|NT|2000)”能匹配“Windows3.1”中的“Windows”，但不能匹配“Windows2000”中的“Windows”。

### 3.6.模式修饰符

+ (?i)即匹配时不区分大小写。表示匹配时不区分大小写。
+ (?s)即Singleline(单行模式)。表示更改.的含义，使它与每一个字符匹配（包括换行 符\n）。
+ (?m)即Multiline(多行模式) 。 表示更改^和$的 含义，使它们分别在任意一行的行首和行尾匹配，而不仅仅在整个字符串的开头和结尾匹配。(在此模式下,$的 精确含意是:匹配\n之前的位置以及字符串结束前的位置.) 
+ (?x)：表示如果加上该修饰符，表达式中的空白字符将会被忽略，除非它已经被转义。 
+ (?e)：表示本修饰符仅仅对于replacement有用，代表在replacement中作为PHP代码。 
+ (?A)：表示如果使用这个修饰符，那么表达式必须是匹配的字符串中的开头部分。比如说"/a/A"匹配"abcd"。 
+ (?E)：与"m"相反，表示如果使用这个修饰符，那么"$"将匹配绝对字符串的结尾，而不是换行符前面，默认就打开了这个模式。 
+ (?U)：表示和问号的作用差不多，用于设置"贪婪模式"。

### 3.7.反斜杠
java中反斜杠是转义字符, 我们需要\\表示一个单个的\, 用\\w表示\w, \\\\表示一个\,因为正则中
\也是一个转义字符。

## String中字符串


+ [参考链接](http://www.vogella.com/tutorials/JavaRegularExpressions/article.html)
+ [贪婪模式与非贪婪模式](http://www.jb51.net/article/31491.htm)


JBL





