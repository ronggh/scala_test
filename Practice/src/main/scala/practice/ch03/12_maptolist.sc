// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < repl-session.scala to run them all at once.
// 将一元函数map(),flatMap()应用于集合
val names = List("Peter", "Paul", "Mary")

// map()函数映射，应用于集合中的每一个元素，并产生一个新元素
names.map(_.toUpperCase) // List("PETER", "PAUL", "MARY")

for (n <- names) yield n.toUpperCase

def ulcase(s: String) = Vector(s.toUpperCase(), s.toLowerCase())

names.map(ulcase)

// flatmap()映射,应用于集合中的每一个元素，产生一个集合，并将所有元素串接在一起
names.flatMap(ulcase)

names.foreach(println)
