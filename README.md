# Maven practice project
練習 Maven 相關操作與 pom.xml設定

運行產生 Target資料夾與相關依賴檔案
```shell
mvn clean compile assembly:single
```

運行得到結果！
```shell
java -jar target/mask-project-1.0-SNAPSHOT-jar-with-dependencies.jar
```
```
 _______________
< Hello World ! >
 ---------------
        \   ^__^
         \  (oo)\_______
            (__)\       )\/\
                ||----w |
                ||     ||
```

