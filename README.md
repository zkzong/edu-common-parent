# educommonparent

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
