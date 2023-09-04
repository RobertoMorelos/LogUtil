# LogUtil
LogUtil is a useful library for enabling/disabling logs.
This is very useful because we don't have to worry anymore about deleting logs when we are going to publish our app, we just have to disable them.

# Download
### For Gradle
##### Step 1. Add the JitPack repository to your build file.
Add it in your root build.gradle at the end of repositories:
```
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```
##### Step 2. Add the dependency.
```
dependencies {
    compile 'com.github.RobertoMorelos:LogUtil:1.0.0'
}
```
### For Maven
##### Step 1. Grab it via Maven.
```
<repositories>
  <repository>
      <id>jitpack.io</id>
      <url>https://jitpack.io</url>
  </repository>
</repositories>
```
##### Step 2. Add the dependency.
```
<dependency>
    <groupId>com.github.RobertoMorelos</groupId>
    <artifactId>LogUtil</artifactId>
    <version>1.0.0</version>
</dependency>
```

# How to use it
##### Step 1. Enable the logs in your Application class.
```
public class MyApp extends Application {

  @Override
  public void onCreate() {
      super.onCreate();

      // Here you can set any boolean value to enable/disable logs.
      // I'm using the Android variable from BuildConfig to check my environment.
      // If I'm in debug mode (development) I want to be able to see all logs.
      // If I want to publish my app then it won't be debug anymore and all my logs won't be shown.
      LogU.enableLogs(BuildConfig.DEBUG);
  }
}
```
##### Step 2. Use it anywhere you want!
```
LogU.v(TAG, "You are seeing this log only in debug mode!");
```

# License
Licensed under the MIT License.
