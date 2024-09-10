package practical_10

object q1 {
  class Rational(n: Int, m: Int) {
    require(m != 0, "Denominator cannot be zero") // Ensure denominator is not zero
    val number: Int = n / m

    def neg = new Rational(-n, m)

    override def toString: String = s"$n/$m"
  }

  def main(args: Array[String]): Unit = {
    val x = new Rational(7, 11)
    print(s"$x" + "\n After negation: ")
    println(x.neg)
  }
}
