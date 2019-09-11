name := "zinc-bug"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies += "org.typelevel" %% "cats-core" % "2.0.0"

addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.10.3")

scalacOptions += "-Ypartial-unification"