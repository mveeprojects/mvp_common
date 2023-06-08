import Dependencies._
import Monitoring.kamonSettings

name := "mvpcommon"
organization := "mveeprojects"
version := "0.1"

scalaVersion := "2.13.11"

libraryDependencies ++=
  kamonMetricsDependencies

lazy val root = Project("mvpcommon", file("."))
  .settings(kamonSettings)
  .enablePlugins(JavaAgent)

//ThisBuild/scalacOptions ++= Seq("-unchecked", "-deprecation")