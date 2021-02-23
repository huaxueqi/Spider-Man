FROM java:8

EXPOSE 8080

ADD  name.jar   app.jar


ENTRYPOINT ["java","-jar","/app.jar"]