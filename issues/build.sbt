name := "sapphire-demo-issues"

organization := "com.sfxcode"

version := "0.9.4"

scalaVersion := "2.11.2"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

scalacOptions += "-target:jvm-1.7"

mainClass := Some("com.sfxcode.sapphire.core.demo.issues.Application")

addCompilerPlugin("org.scalamacros" % "paradise" % "2.0.1" cross CrossVersion.full)

resolvers ++= Seq(
  "sfxcode-releases" at "https://raw.github.com/sfxcode/mvn-repo/master/releases",
  "sfxcode-snapshots" at "https://raw.github.com/sfxcode/mvn-repo/master/snapshots"
)

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.3.12" % "test"
)


libraryDependencies += "com.sfxcode.sapphire" %% "sapphire-control" % "0.9.4"

libraryDependencies += "org.scalafx" %% "scalafxml-core" % "0.2.1"