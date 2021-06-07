# Jadwiga The Chatbot - Developer Guide

## Building the app

Run `package` task in *sbt shell*.

## Running the app from command line

You can run the app from command line:

```shell
> scala target/scala-2.13/jadwiga_2.13-0.1.jar
```

or 

```shell
> java -jar target/scala-2.13/jadwiga_2.13-0.1.jar
```

## Building Windows executable

1. Add [sbt-assembly](https://github.com/sbt/sbt-assembly) plugin as a dependency in `project/plugins.sbt` file:  
    ```scala
    addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.15.0")
    ```
1. run `assembly` task in *sbt shell*, 
1. Download & install [launch4j](http://launch4j.sourceforge.net/),
1. Use `launch4j-config.xml`,
1. Generate executable.
