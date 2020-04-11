import sbt._

object Dependencies {

  val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"

  val commonDependencies: Seq[ModuleID] = Seq(scalaTest % Test)

  val retirementCalculatorDependencies: Seq[ModuleID] = commonDependencies
}
