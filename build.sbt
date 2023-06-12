import Dependencies._
import Monitoring.kamonSettings
import sbtassembly.MergeStrategy

organization := "mveeprojects"
name := "mvp_common"
version := "0.1"

scalaVersion := "2.13.11"

libraryDependencies ++=
  kamonMetricsDeps ++
    dropwizardMetricsDeps

lazy val root = Project("mvp_common", file("."))
  .settings(kamonSettings)
  .enablePlugins(JavaAgent)
  .settings(assemblySettings: _*)

lazy val mergeStrategy = assembly / assemblyMergeStrategy := {
  case PathList("META-INF", _*)   => MergeStrategy.discard
  case PathList("reference.conf") => MergeStrategy.concat
  case _                          => MergeStrategy.first
}

lazy val jarName = assembly / assemblyJarName := "mvp_common.jar"

lazy val assemblySettings = Seq(mergeStrategy, jarName)
