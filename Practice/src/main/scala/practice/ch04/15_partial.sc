// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < 15_partial.sc to run them all at once.
// 偏函数之所以“偏”，原因在于它们并不处理所有可能的输入，而只处
//理那些能与至少一个case 语句匹配的输入。
val f: PartialFunction[Char, Int] = { case '+' => 1 ; case '-' => -1 }
f('-') 
f.isDefinedAt('0')

f('0') 
