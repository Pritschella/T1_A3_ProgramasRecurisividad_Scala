import scala.io.StdIn._

object Ejercicio4 {
  def cocientes(n1: Int, n2:Int):Unit={
    
    var cociente1=(n1/n2)
    println(cociente1)
    if(cociente1>0)
    cocientes(cociente1, n2)
  }
  
  def main(args: Array[String]): Unit = {
    println("Ingresa Dividendo: ")
    val n1= readInt()
    println("Ingresa Divisor: ")
    val n2= readInt()
    
    println("----------")
    
    cocientes(n1, n2)
  }
}