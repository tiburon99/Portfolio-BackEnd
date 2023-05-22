FROM amazoncorretto:11-alpine-jdk
MAINTAINER FrancoTiviroliLardet
COPY target/francotiviroli-0.0.1-SNAPSHOT.jar ftiviroli-app.jar
ENTRYPOINT ["java","-jar","/ftiviroli-app.jar"] 
