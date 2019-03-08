object Bmi {
  def main(args: Array[String]): Unit = {
    val height: Double = 1.75
    val weight: Double  = 65
    printf("BMI=%s",weight/(Math.pow(height, 2)))
  }
}
