case class Person(var firstName:String, var lastName:String, var age:Int)

def process(p:Person):String = {
  return p.firstName + " " + p.lastName + " " +
    (p match
      {
        case Person(_, _, a) if a > 30 => "is an Old Timer"
        case Person(_, "Goodsen", _) => "comes from a good family"
        case Person(first, last, age) if age < 18 => " is a minor of " + age
        case _ => "cannot be classified"				
      }
	)
}
println(process(Person("Keith", "Goodsen", 33)))
println(process(Person("John", "Goodsen", 23)))
println(process(Person("Eric", "Noordam", 16)))
println(process(Person("Susan", "Noordam", 28)))
