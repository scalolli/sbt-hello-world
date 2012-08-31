import org.scalatest._

class ExampleSpec extends FunSuite {

  test("return a welcome message") {
    val msg = new Hello display("Basu")
    assert(msg == "Hello, welcome: Basu")
  }

}
