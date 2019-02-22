//如果想让 case 类的所有子类都必须在申明该类的相同的文件中定义，可
//以将样例类的通用超类声明为sealed，叫做密封类，密封就是外部用户不能在
//其他文件中定义子类。
// 样例类可以模拟出枚举类型
sealed abstract class TrafficLightColor

case object Red extends TrafficLightColor

case object Yellow extends TrafficLightColor

case object Green extends TrafficLightColor

for (color <- Array(Red, Yellow, Green))
  println(
    color match {
      case Red => "stop"
      case Yellow => "hurry up"
      case Green => "go"
    })
