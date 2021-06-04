name := "Jadwiga"

version := "0.1"

scalaVersion := "2.13.6"

idePackagePrefix := Some("com.mhalab")

// https://stackoverflow.com/questions/41372978/unknown-artifact-not-resolved-or-indexed-error-for-scalatest
ThisBuild / useCoursier := false

libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.7"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.7" % "test"