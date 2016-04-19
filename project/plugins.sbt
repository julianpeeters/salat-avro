addSbtPlugin("com.banno" % "sbt-license-plugin" % "0.0.4")

resolvers += Resolver.url(
  "bintray-banno-sbt-plugins",
  url("https://dl.bintray.com/banno/oss/"))(
  Resolver.ivyStylePatterns)


resolvers += Resolver.file("Local Ivy Repository", file("/home/USER/.ivy2/local/"))(Resolver.ivyStylePatterns)