Problem

You're given a string composed of lowercase English letters and digits (0-9). Your task is to write a function digitLetters that returns an object containing two properties:

digits: representing the count of numeric characters in the string
letters: representing the count of alphabetic characters in the string
The function digitLetters should accept one parameter:

str: a string value.
Here are some examples:

digitLetters("hello123") should return {digits: 3, letters: 5}, as there are 3 numeric characters (1, 2, 3) and 5 alphabetic characters (h, e, l, l, o).

{Try it}(sh .guides/runner.sh javac Problem01.java java -cp . Problem01 "hello123")

digitLetters("abcd") should return {digits: 0, letters: 4}, as there are no numeric characters and 4 alphabetic characters (a, b, c, d).

{Try it}(sh .guides/runner.sh javac Problem01.java java -cp . Problem01 "abcd")

## Submit


1234 :: { digits: 4, letters: 0 }
abcd :: { digits: 0, letters: 4 }
1234abc :: { digits: 4, letters: 3 }
