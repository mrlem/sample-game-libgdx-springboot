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

I provide a set of empty projects combining all these, for a fake game named "singularity" (change this name to suite your needs). You'll find:
* client: the game client project (using LibGDX)
* engine/server: the server project (using SpringBoot)
* engine/protocol: the common protocol project

Tested all this with IDEA IntelliJ, but it should compile & run just as well in command line.

## What I don't provide

I don't provide any kind of classes / architecture to guide the way you code the came, this is not my point. Use LibGDX & SpringBoot docs for this! I also chose those libraries because of their excellent documentations.
