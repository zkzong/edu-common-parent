# educommonparent

```
<property name="filters" value="config" />
<property name="connectionProperties" value="config.decrypt=true" />
```
spring-mybatis配置了上面的内容，则数据库的连接必须加密

**参考：**[https://github.com/alibaba/druid/wiki/%E4%BD%BF%E7%94%A8ConfigFilter](https://github.com/alibaba/druid/wiki/%E4%BD%BF%E7%94%A8ConfigFilter)

`java -cp druid-1.0.16.jar com.alibaba.druid.filter.config.ConfigTools you_password`
druid加密的版本和web中使用的版本要一致

JDK要用1.7或以下版本
