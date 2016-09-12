package fokot.scala.first

import org.specs2.mutable.Specification

class FirstServiceTest extends Specification {

  "Plus should add five" >> {
    FirstService plus 3 mustEqual 58
  }

}
