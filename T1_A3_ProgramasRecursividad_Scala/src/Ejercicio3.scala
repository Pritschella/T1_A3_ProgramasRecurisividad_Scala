import scala.io.StdIn._

object Ejercicio3 {
   def factorial(inicio:Int, num:Int, resultado:Int): Unit = {
    if(inicio <= num){
      factorial(inicio+1, num, resultado * inicio)
    }else{
      println("El resultado es: " + resultado)
    }
  }
  
  def main(args: Array[String]): Unit = {
    println("Ingrese un número: ")
    var num = readInt()
    
    factorial(1, num, 1)
  }
}