import scala.io.StdIn._

object Ejercicio5 {
  def divisores(n:Int, cont:Int, cont2:Int): Unit={
    var contx=cont2
    if(cont>0){
    if(n%cont == 0){
      contx+=1
    }
    divisores(n, cont-1, contx)
    }else{
      println("El resultado es: "+cont2)
    }
  }
  
  def main(args: Array[String]): Unit = {
    println("Ingrese un número: ")
    val n = readInt()
    divisores(n, n, 0)
  }
}