# KToolJa

[![Project](https://img.shields.io/badge/Project-K--ToolJa-4B0082.svg?style=plastic)](https://kariminf.github.com/k-toolja)
[![License](https://img.shields.io/badge/License-Apache_2-4B0082.svg?style=plastic)](http://www.apache.org/licenses/LICENSE-2.0)
[![Travis](https://img.shields.io/travis/kariminf/k-toolja.svg?style=plastic)](https://travis-ci.org/kariminf/k-toolja)
[![codecov](https://img.shields.io/codecov/c/github/kariminf/k-toolja.svg?style=plastic)](https://codecov.io/gh/kariminf/k-toolja)
[![jitpack](https://jitpack.io/v/kariminf/k-toolja.svg)](https://jitpack.io/#kariminf/k-toolja)


**Karim Tools Java kit**

Used to back the other projects with tools such as:
* Mathematical functions
* File management
* Simple plugins management
These tools can be found in other libraries, but in this project a lighter version of
what we need is enough.

## Using the project

You can download the jar from "release" section and link it to your project;
Or you can use https://jitpack.io to manage dependency.
Replace "tag" with the release tag; for example "1.0.0".

### Gradle

Add this to your "build.gradle":
```
repositories {
    ...
    maven { url 'https://jitpack.io' }
}

dependencies {
    compile 'com.github.kariminf:k-toolja:tag'
}
```

### Maven

```xml
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
</repositories>

<dependency>
	    <groupId>com.github.kariminf</groupId>
	    <artifactId>k-toolja</artifactId>
	    <version>tag</version>
</dependency>
```

## License

Copyright (C) 2016-2017 Abdelkrime Aries

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
