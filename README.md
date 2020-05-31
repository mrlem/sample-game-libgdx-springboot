# Kotlin Sample Game Template
Sample game project using:
* kotlin
* gradle
* libgdx for client
* spring-boot for server
* and a common protocol project

## Purpose
I like to develop small game prototypes, more specifically networked games. As a language, I like Java, and lately I like [Kotlin](https://kotlinlang.org) even more.
* game client: [LibGDX](https://libgdx.badlogicgames.com) is a fantastic framework
* game server: for rapid prototyping, I really like [SpringBoot](https://projects.spring.io/spring-boot)

Combining these the way I like takes time and can turn into a gradle nightmare, especially:
* if you want to work separately on client & server projects
* want those projects to share some common code, like say classes for a network protocol

Hope this saves you time to get started: because when an idea comes into your mind, you just don't want to waste your precious time, energy and enthousiasm for these infrastructure stuff. You just just to code the damn thing :)

## What I provide

I provide a set of empty projects combining all these containing the bare minimum to get started, for a game named **sample** (change this name to suite your needs). You'll find:
* **sample**: the game client project (using LibGDX), wth a simple scene2d stage
* **sample-engine**: including a **server** module (using SpringBoot) and a **protocol** module (shared with the client)

Tested all this with IDEA IntelliJ and from the command line.

## How do I run things?

The desktop client:
```shell
cd client/desktop
../gradlew run
```

The server:
```shell
cd engine/server
../gradlew bootRun
```

## What I don't provide

I don't provide any kind of classes / architecture to guide the way you code the game, this is not my point. Use LibGDX & SpringBoot docs for this! I also chose those libraries because of their excellent documentations.

## Credits

A huge thanks for those who provide those marvellous tools to the community:
* https://kotlinlang.org
* https://gradle.org/
* https://projects.spring.io/spring-boot/
* https://libgdx.badlogicgames.com
* https://libktx.github.io/
