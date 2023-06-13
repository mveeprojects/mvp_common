import Dependencies._
import Monitoring.kamonSettings

organization := "mveeprojects"
name := "mvp_common"
version := "0.1"

scalaVersion := "2.13.11"

libraryDependencies ++=
  kamonMetricsDependencies ++
    pureConfigDependencies

lazy val root = Project("mvp_common", file("."))
  .settings(kamonSettings)
  .enablePlugins(JavaAgent)
