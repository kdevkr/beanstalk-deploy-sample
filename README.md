# Beanstalk Deploy Sample  

For AWS Beanstalk Java SE Platform (Amazon Linux 2)

- Spring Boot War Packaging
- Procfile Generation
- Zip Application Bundle

## Build
```sh
./gradlew zipBeanstalk
# build/distributions/beanstalk-1.0.0.zip

./gradlew zipBeanstalk -Pversion='1.0.1'
# build/distributions/beanstalk-1.0.1.zip
```

## Logs  
- /var/log/eb-engine.log
- /var/log/web.stdout.log