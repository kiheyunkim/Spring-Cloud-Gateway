package com.kihyeonkim.springcloudgateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class SpringCloudGatewayApplication

fun main(args: Array<String>) {
	runApplication<SpringCloudGatewayApplication>(*args)
}
