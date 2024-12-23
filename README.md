![Licence](https://img.shields.io/badge/licence-none-green.svg)
[![GitHub Release](https://img.shields.io/github/release/lihengming/spring-boot-api-project-seed.svg)](https://github.com/lihengming/spring-boot-api-project-seed/releases)
## Introduction
Spring Boot API Project Seed is a seed project based on Spring Boot & MyBatis. It is used to quickly build small and medium API, RESTful API projects.

## Features & Offerings
- Best practice project structure, configuration files, lean POM
- Unified response wrapper and generation tools
- Unified exception handling
- Simple interface signature authentication
- Encapsulating common base method abstractions
- Integrate Druid database connection pooling and monitoring using Druid Spring Boot Starter
- use FastJsonHttpMessageConverter, raising the speed of the JSON serialization
- Integrate MyBatis, general Mapper plug-in, PageHelper plug-in, and achieve zero SQL for single table business
- Provide code generator to generate Model, Mapper, MapperXML, Service, ServiceImpl, Controller and other basic code according to the table name, and the Controller template provides POST and RESTful by default. According to the requirements in ` ` ` CodeGenerator. GenController (tableName) ` ` ` method you choose, use the POST template by default. The code template can be extended according to the needs of the actual project. Since each company's business is different, only some basic and general templates are provided, ** mainly to provide an idea ** to reduce the repetition of code writing. In the use of actual projects, I have actually written a large number of templates according to the abstraction of the company's business. Using templates also helps keep your team's coding style consistent
 
## 快速开始
1. 克隆项目
2. 对```test```包内的代码生成器```CodeGenerator```进行配置，主要是JDBC，因为要根据表名来生成代码
3. 如果只是想根据上面的演示来亲自试试的话可以使用```test resources```目录下的```demo-user.sql```，否则忽略该步
3. 输入表名，运行```CodeGenerator.main()```方法，生成基础代码（可能需要刷新项目目录才会出来）
4. 根据业务在基础代码上进行扩展
5. 对开发环境配置文件```application-dev.properties```进行配置，启动项目，Have Fun！
 
## 开发建议
- 表名，建议使用小写，多个单词使用下划线拼接
- Model内成员变量建议与表字段数量对应，如需扩展成员变量（比如连表查询）建议创建DTO，否则需在扩展的成员变量上加```@Transient```注解，详情见[通用Mapper插件文档说明](https://mapperhelper.github.io/docs/2.use/)
- 建议业务失败直接使用```ServiceException("message")```抛出，由统一异常处理器来封装业务失败的响应结果，比如```throw new ServiceException("该手机号已被注册")```，会直接被封装为```{"code":400,"message":"该手机号已被注册"}```返回，无需自己处理，尽情抛出
- 需要工具类的话建议先从```apache-commons-*```和```guava```中找，实在没有再造轮子或引入类库，尽量精简项目

 test
## 技术选型&文档
- Spring Boot
- MyBatis
- MyBatisb
- MyBatis PageHelper
- Druid Spring Boot Starter
- Fastjson
