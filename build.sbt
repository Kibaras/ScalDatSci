normalizedName := "ScalaForDataSci"

organization := "data.kabalo"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scalanlp" %% "breeze"          % "0.13.1",
  "org.scalanlp" %% "breeze-natives"  % "0.13.1",
  "org.scalanlp" %% "breeze-viz"      % "0.13.1"
)

resolvers += "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"