#!/usr/bin/groovy

def call(Map parameters = [:], body) {
  println parameters
  node {
    body()
  }
}
