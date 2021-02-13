import scala.io.StdIn._

object Ejercicio7 {
  def vocales(s:String, cont:Int, cont2:Int):Unit ={
    var contx=cont2
    if(cont<s.length()){
    if(s.charAt(cont).isLetter){
      if(s.charAt(cont).toLower=='a' || s.charAt(cont).toLower=='e' || s.charAt(cont).toLower=='i' || s.charAt(cont).toLower=='o' || s.charAt(cont).toLower=='u'){
        contx+=1
      }
    }
    vocales(s, cont+1, contx)
    }else{
      println("Las vocales son: "+contx)
    }
    
  }
  
  def main(args: Array[String]): Unit = {
    println("Ingrese una cadena: ")
    val s = readLine()
    
    vocales(s, 0, 0)
  }
}