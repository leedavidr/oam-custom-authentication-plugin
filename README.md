# oam-custom-authentication-plugin
Oracle OAM Custom Authentication Plugin

### Requirements

* JDK 7+

### Usage

See Oracle documentation <https://docs.oracle.com/cd/E27559_01/dev.1112/e27134/authnapi.htm>

1. Modify MANIFEST.MF generation in `build.gradle`

2. Modify `src/main/resources/CustomAuthenticationPlugin.xml`

3. Modify `src/main/java/com/kastling/plugin/CustomAuthenticationPlugin.java` for the actual plugin code

4. Run command to build jar

```
./gradlew clean build
```

### Notes

This project is set up to help quickly build a custom OAM authentication plugin.
It does not have any code for the actual authentication.