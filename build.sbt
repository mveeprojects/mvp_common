import Dependencies._
import Monitoring.kamonSettings

name := "mvp_common"
organization := "mveeprojects"
version := "0.1"

scalaVersion := "2.13.11"

libraryDependencies ++=
  kamonMetricsDependencies

lazy val root = Project("mvp_common", file("."))
  .settings(kamonSettings)
  .enablePlugins(JavaAgent)
