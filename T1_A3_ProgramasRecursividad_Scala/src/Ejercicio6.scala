import scala.io.StdIn._

object Ejercicio6 {

  def dec_to_bin(n:Int, s:String): Unit={
    var resto = 0
    var n2 = n
    var cadena = s
    if(n2>=2){
      resto= n%2
      n2=n2/2
      cadena=resto+cadena
      
      println(cadena)
      dec_to_bin(n2, cadena)
    }else{
      cadena=n2+cadena
      println(cadena)
    }
      
  }
  
  def main(args: Array[String]): Unit = {
   println("Ingrese el numero decimal: ")
    val n = readInt()
    
    dec_to_bin(n, "")
    
    
  }
}