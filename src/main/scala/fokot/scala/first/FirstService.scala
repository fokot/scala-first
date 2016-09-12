package fokot.scala.first

trait FirstService {

  def plus(i: Int): Int
}

object FirstService extends FirstService {

  override def plus(i: Int) = i + 55
}
