import scala.scalajs.js.JSApp
import org.scalajs.dom
import scalatags.JsDom.all._

object Library extends JSApp {

   def main(): Unit = {
      val message = "Hello World"
      println(message)
      dom.document.getElementById("message-box").innerHTML = message 
   }

}
