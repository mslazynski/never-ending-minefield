import scala.scalajs.js.JSApp
//import scalatags.JsDom.all._

object Library extends JSApp {

   def h1(str: String) :String = {
     "<h1>"+str+"</h1>"
   }


   def main(): Unit = {
     println(h1("Hello World!"))
}

}
