(1 to 10).foreach(arg=>println("hello world " + arg))

case class Person(firstName:String, lastName:String)
var joe = Person("Joe", "Bartender")
var mary = Person("Mary", "Smith")
var mary2 = Person("Mary", "Smith") 
joe == mary 
mary == mary2

abstract class Employee
case class SalariedEmployee(id:Int, name:String, ssn:String, salary:Double) extends Employee
object EmployeeFactory {
  def makeSalariedEmployee(id:Int) = { SalariedEmployee(id, "Joe Blow", "123-45-6789", 60000) }	
}

var salariedEmployee = EmployeeFactory.makeSalariedEmployee(1)
salariedEmployee.name
salariedEmployee.ssn



		

