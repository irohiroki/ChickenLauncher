ChickenLauncher
===============

This is a [CraftBukkit](http://dl.bukkit.org/) plugin that enables you to take a chicken out of a chunk of wool, like a illusionist!

[Demo](http://youtu.be/IHxXTrZ6i-M)

Installation
------------

You need a CraftBukkit server. Compile the source and make a jar file with the commands below:

    javac src/*.java -d bin -classpath <path/to/craftbukkit.jar> -sourcepath src -target <your_java_version> -source <your_java_version> -J-Dfile.encoding=UTF8
    jar -cf dist/ChickenLauncher.jar *.yml -C bin .

`<your_java_version>` might be `1.6`. Then copy the jar to the `plugins` directory of your CraftBukkit setup. That's it!

Action
------

Pick a block of wool in hand and left click the **AIR**. A chicken pops out!

License
-------

This software is licensed under the MIT license.

Copyright 2014 Hiroki Yoshioka
