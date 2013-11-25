import com.banno.license.Plugin.LicenseKeys._
import com.banno.license.Licenses._

licenseSettings

license := apache2("Copyright 2011-2013 T8 Webware")

removeExistingHeaderBlock := true

name := "salat-avro"

version := "0.0.9-1"

organization := "com.banno.salat.avro"

scalaVersion := "2.9.1"

credentials += Credentials(Path.userHome / ".ivy2" / ".banno_credentials")

publishMavenStyle := true

publishTo := Some("Banno Repo" at (if (version.toString.endsWith("SNAPSHOT")) "http://nexus.banno.com/nexus/content/repositories/snapshots" else "http://nexus.banno.com/nexus/content/repositories/releases"))

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.12" % "test",
  "com.novus" %% "salat-core" % "1.9.2",
  "org.json4s" %% "json4s-native" % "3.2.5",
  "com.github.nscala-time" %% "nscala-time" % "0.6.0",
  "org.apache.avro" % "avro" % "1.7.4"
)
