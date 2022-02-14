# Spring-Cloud-Gateway

spring-cloud-Gateway

* spring webflux에 최적화된 gateway
* spring web용에는 적절하지 않을 수 있으며 zuul1을 사용해야함(zuul1은 deprecated 됨)

```yaml
spring:
  cloud:
    gateway:
      routes:
        - id: user-service # 라우팅 할 대상의 id 지정
          uri: lb://USER-SERVICE  # 라우팅 할 MSA를 지정하며 lb는 로드 밸런싱(round-robin)으로 하도록 함.
          predicates:
            - Path=/user-service/** # 주소가 predicates에 맞는 형식인 경우 위의 uri로 요청을 보냄
          filters:
            - RewritePath=/user-service/, / # "/user-service/" 로 요청이 들어오면 uri의 "/"으로 매핑시켜줌
```