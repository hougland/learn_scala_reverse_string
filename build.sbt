lazy val root = (project in file(".")).
  settings(
    name := "reversestring",
    version := "1.0",
    scalaVersion := "2.11.7"
  )

libraryDependencies += "org.scalaj" % "scalaj-http_2.8.1" % "0.3.0"
