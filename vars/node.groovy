#!/usr/bin/groovy

def call(Map parameters = [:], body) {
  println parameters
  body()
}
