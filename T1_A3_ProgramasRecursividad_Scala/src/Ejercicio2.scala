import scala.io.StdIn._

object Ejercicio2 {
  def divisores(num:Int, resto:Int) : Unit = {
   if(resto > 0){
     if(num % resto == 0){
       println("Los divisores son: " + resto)
     }
     divisores(num, resto-1)
   }
   
  }
  
  def main(args: Array[String]): Unit = {
    println("Ingrese un número:")
    var num = 0
    num = readInt()
   
    divisores(num, num)
    
  }
  
}