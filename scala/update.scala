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