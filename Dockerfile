FROM bellsoft/liberica-openjdk-alpine:latest
RUN apk add -U tzdata
ENV TZ America/Lima
RUN ln -snf /usr/share/zoneinfo/${TZ} /etc/localtime
RUN echo "${TZ}" > /etc/timezone
VOLUME /tmp
EXPOSE 9100
ADD ./target/ms-oauth-security-0.0.1-SNAPSHOT.jar ms-oauth-security.jar
ENTRYPOINT ["java", "-jar", "/ms-oauth-security.jar"]