
name := "scala-programming-projects"

version := "0.1"

scalaVersion := "2.13.1"

lazy val retirement_calculator =
  project
    .enablePlugins(JavaAppPackaging)
    .settings(
      libraryDependencies ++= Dependencies.retirementCalculatorDependencies
    )