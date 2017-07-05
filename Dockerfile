FROM java
RUN ["apt-get","install","unzip","-y"]
COPY ["./it.unibo.computer.MainComputer-1.0.zip","./"]
RUN ["unzip","./it.unibo.computer.MainComputer-1.0.zip","-d","./"]
EXPOSE -P "8020"
CMD ["java","-jar","./it.unibo.computer.MainComputer-1.0/BLS distribuito RC-1.0.jar"]