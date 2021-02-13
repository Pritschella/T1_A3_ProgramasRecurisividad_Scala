

object Ejercicio1 {
       /*
      * Programa que mueste la sumatoria de numeros enteros desde un limite inicial hasta un limite final
      */
   def sumatoriaRecursiva(n1:Int, n2:Int, sum:Int) : Unit = {
     if(n1 <= n2){
       println("Las sumatorias son: " + (sum + n1))
       sumatoriaRecursiva(n1 + 1, n2, sum + n1)
     }
  }//sumatoriaRecursiva

  
  def main(args: Array[String]): Unit = {
    
    var num1 = 0
    println("Ingresa un número entero: ")
    num1 = readInt();
    var num2 = 0
    println("Ingresa un número entero: ")
    num2 = readInt();
    
    sumatoriaRecursiva(num1, num2, 0)
    
  }
}