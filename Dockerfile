FROM library/openjdk:8-jdk-slim

WORKDIR /home/apps/
ADD target/provider-0.0.1-SNAPSHOT.jar .
ADD target/lib ./lib
ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]

