# edu-common-parent
[![Build Status](https://travis-ci.org/zkzong/edu-common-parent.svg?branch=master)](https://travis-ci.org/zkzong/edu-common-parent)

```
<property name="filters" value="config" />
<property name="connectionProperties" value="config.decrypt=true" />
```
spring-mybatis配置了上面的内容，则数据库的连接必须加密

**参考：**[https://github.com/alibaba/druid/wiki/%E4%BD%BF%E7%94%A8ConfigFilter](https://github.com/alibaba/druid/wiki/%E4%BD%BF%E7%94%A8ConfigFilter)

`java -cp druid-1.0.16.jar com.alibaba.druid.filter.config.ConfigTools you_password`

druid加密的版本和web中使用的版本要一致

---

<font color=red>**Caused by: java.lang.reflect.MalformedParameterizedTypeException**</font>

<font color=red>**Caused by: java.lang.IllegalStateException: Context namespace element 'annotation-config' and its parser class [org.springframework.context.annotation.AnnotationConfigBeanDefinitionParser] are only available on JDK 1.5 and higher**</font>

原因：dubbo依赖的spring版本过低

解决办法：删除dubbo依赖的默认spring包

```xml
  <dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>dubbo</artifactId>
    <version>2.5.3</version>
    <exclusions>
      <exclusion>
        <groupId>org.springframework</groupId>
        <artifactId>spring</artifactId>
      </exclusion>
    </exclusions>
  </dependency>
```

[http://www.cnblogs.com/digdeep/p/5268779.html](http://www.cnblogs.com/digdeep/p/5268779.html)

## 使用Maven构建Dubbo服务的可执行jar包
Dubbo服务的运行方式：
1、使用Servlet容器运行（ Tomcat、 Jetty等） ----不可取
缺点：增加复杂性（端口、管理）
浪费资源（内存）
2、自建Main方法类来运行（ Spring容器） ----不建议（本地调试可用）
缺点： Dobbo本身提供的高级特性没用上
自已编写启动类可能会有缺陷
3、使用Dubbo框架提供的Main方法类来运行（ Spring容器） ----建议使用
优点：框架本身提供（ com.alibaba.dubbo.container.Main）
可实现优雅关机（ ShutdownHook）
注意点：
spring-context.xml
`<import resource="classpath:spring/spring-xxx.xml" />`


使用IDEA运行有问题，使用eclipse运行没问题
DubboProvider
