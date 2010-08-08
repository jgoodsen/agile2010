object Square {
   def unapply(p: Pair[Int, Int]) = p match {
		case(x,y) if x == y => Some(x)
		case _ => None
	}
}
(2,2) match {
  case Square(side) => side*side
  case _ => -1
}

def usePersonas(arr: String*) = {..}

usePersonas("jane") // sweet
usePersonas("joe", "eric") // sweet

Without varargs:

def useUglePersonas(arr: Array[String]) = {...}
useUglyPersonas(Array("joe", "eric")) // ugly

object Join {
	def apply(l: String*) = l.mkString(",")
	def unapplySeq(s: String) = Some(s.split(","))
}
Join("1", "2", "3") match {
	case Join("1", _*) => println("starts with 1")
	case _ => println("doesn't start with 1")
}

case class Square(side: Int)
val s = Square(2) // apply() is defined
s.side => 2 // member is exported
val Square(x) = s // uapply() is defined
