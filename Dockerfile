FROM openjdk:17
ADD target/springboot-images.jar springboot-images.jar
ENTRYPOINT ["java", "-jar", "/springboot-images.jar"]