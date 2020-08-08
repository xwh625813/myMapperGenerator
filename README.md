#  **MybatisGenerator 使用方法**

##  一、文件说明

1、generator.properties

​									——配置连接数据库地址

2、generatorConfig.xml

​									——配置生成文件后的存放地址

3、CommentGenerator.java

​									——通用设置

4、Generator.java

​									——启动类

## 二、修改步骤

1、连接你需要连接的数据

```
jdbc.driverClass=com.mysql.cj.jdbc.Driver
jdbc.connectionURL=jdbc:mysql://localhost:3306/cloud_platform?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai
jdbc.userId=root
jdbc.password=123456
```

2、修改生成文件后所存放的位置（只需修改如下两个位置即可）

```
<!--        1、配置 Generator通用配置-->
<commentGenerator type="com.example.demo.CommentGenerator">
    <!-- 是否去除自动生成的注释 true：是 ： false:否 -->
    <property name="suppressAllComments" value="true"/>
    <property name="suppressDate" value="true"/>
    <property name="addRemarkComments" value="true"/>
</commentGenerator>
```

```
<!--        2、配置 生成文件存放位置-->
<javaModelGenerator targetPackage="com.example.demo.model" targetProject="src\main\java"/>

<sqlMapGenerator targetPackage="com.example.demo.mapper" targetProject="src\main\resources"/>

<javaClientGenerator type="XMLMAPPER" targetPackage="com.example.demo.mapper"
                     targetProject="src\main\java"/>
```

3、POM.XML文件所需要的依赖

```
<!-- 数据库连接工具-->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
</dependency>

<!-- MyBatis 生成器 -->
<dependency>
    <groupId>org.mybatis.generator</groupId>
    <artifactId>mybatis-generator-core</artifactId>
    <version>1.3.7</version>
</dependency>
<!-- MyBatis-->
<dependency>
    <groupId>org.mybatis</groupId>
    <artifactId>mybatis</artifactId>
    <version>3.4.6</version>
</dependency>
<!--Swagger-UI API文档生产工具-->
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.7.0</version>
</dependency>
```

### 三、总结

​	如下载后可在原有的项目基础上进行生成代码，为做演示已生成的文件作为展示，需要可自行删除，使用起来只需4个文件即可，修改如上所属即可实现。