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


var x = new Array[String]()


val l=List(1,7,2,8,5,6,3,9,14,12,4,10)
def filter(inLst:List[Int],cond:(Int)=>Boolean):List[Int]={
  if(inLst==Nil) Nil
  else if(cond(inLst.head)) inLst.head::filter(inLst.tail,cond)
  else filter(inLst.tail,cond)
}
def isodd(v:Int)= v%2==1
filter(l,isodd)  // produces List(1, 7, 5, 3, 9)

res23: List[Int] = List(1, 7, 5, 3, 9)
filter(lst,(v:Int)=> v%2==0) // equivalent to the line above