import scalaj.http._
import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.DefaultHttpClient

object ReverseString extends App {
  def main(args: Array[String]) = {
    // val input = scala.io.StdIn.readLine("> ")
    // println(input.reverse)

    val response: HttpResponse[String] = Http("http://randomword.setgetgo.com/get.php").param("","").toString
    println(response.body)
  }

}
