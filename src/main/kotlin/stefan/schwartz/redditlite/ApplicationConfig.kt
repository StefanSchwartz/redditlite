package stefan.schwartz.redditlite

import org.springframework.boot.CommandLineRunner
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ApplicationConfig {
    @Bean
    fun commandLineRunner(ctx: ApplicationContext): CommandLineRunner {
        return CommandLineRunner { args: Array<String> ->
            println("Let's inspect the beans provided by Spring Boot:")
            val beanNames: Array<String> = ctx.beanDefinitionNames
            beanNames.sort()
            for (beanName in beanNames) {
                println(beanName)
            }
        }
    }
}