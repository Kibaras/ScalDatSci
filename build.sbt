normalizedName := "ScalaForDataSci"

organization := "data.kabalo"

scalaVersion := "2.11.8"

libraryDependencies ++= {
  val breeze_v = "0.13.2"

  Seq(
    "org.scalanlp" %% "breeze"          % breeze_v,
    "org.scalanlp" %% "breeze-natives"  % breeze_v,
    "org.scalanlp" %% "breeze-viz"      % breeze_v
  )
}

resolvers += "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"