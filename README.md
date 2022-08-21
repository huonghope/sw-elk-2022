# 2022 주한 베트남 유학생 SW교육 프로그램

### "ELK" is the acronym for three open source projects: Elasticsearch, Logstash, and Kibana. Elasticsearch is a search and analytics engine. Logstash is a server‑side data processing pipeline that ingests data from multiple sources simultaneously, transforms it, and then sends it to a "stash" like Elasticsearch. Kibana lets users visualize data with charts and graphs in Elasticsearch.

#### Install Elasticsearch
```bash
# Ubuntu package 업데이트
sudo apt-get update

# Java JDK 설치
sudo apt-get install openjdk-11-j

# 설치 성공되었으면 버전을 확인
java –version

# 환경변수 추가 (참고로 profile나 ./bashrc에서 추가 권장)
export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
export PATH=$JAVA_HOME/bin/:$PATH
export CLASS_PATH=$JAVA_HOME/lib:$CLASS_PATH

# Elasticsearch 서비스를 동작 확인하기 위해서 포트를 세팅
sudo ufw disable
sudo iptables –F
sudo apt-get install iptables-persistent netfilter-persistent
sudo apt install net-tools

# Elasticsearch 기본 포트:9200 / Kibana 기본 포트: 5601
sudo iptables -A INPUT -p tcp --dport 9200 -j ACCEPT

# 포트 설정 확인
netstat –nap

# Ubuntu package 다시 업데이트
sudo apt-get update

# 저장소에 접근 허락해주는 package 설치
sudo apt install apt-transport-https

# 패키지 리포지토리에서 설치
wget -qO - https://artifacts.elastic.co/GPG-KEY-elasticsearch | sudo apt-key add –
sudo sh -c 'echo "deb https://artifacts.elastic.co/packages/7.x/apt stable main" >
/etc/apt/sources.list.d/elastic-7.x.list'

# Ubuntu package 다시 업데이트
sudo apt update

# Elasticsearch 패키지 설치
sudo apt install elasticsearch

# Elasticsearch 서비스를 시작
sudo systemctl enable elasticsearch.service
sudo service elasticsearch start

# Elasticsearch 서비스를 종료
sudo service elasticsearch stop

```

#### Install Logstash
```bash
# Ubuntu package 업데이트
sudo apt-get update

# Java JDK 설치
sudo apt-get install openjdk-11-j

# 설치 성공되었으면 버전을 확인
java –version

# 환경변수 추가 (참고로 profile나 ./bashrc에서 추가 권장)
export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
export PATH=$JAVA_HOME/bin/:$PATH
export CLASS_PATH=$JAVA_HOME/lib:$CLASS_PATH

# Ubuntu package 다시 업데이트
sudo apt-get update

# 저장소에 접근 허락해주는 package 설치
sudo apt install apt-transport-https

# 패키지 리포지토리에서 설치
wget -qO - https://artifacts.elastic.co/GPG-KEY-elasticsearch | sudo apt-key add –
sudo sh -c 'echo "deb https://artifacts.elastic.co/packages/7.x/apt stable main" >
/etc/apt/sources.list.d/elastic-7.x.list'

# Ubuntu package 다시 업데이트
sudo apt update

# Logstash 패키지 설치
sudo apt install logstash

# Logstash 서비스를 시작
sudo systemctl enable logstash
sudo service logstash start

# Logstash 서비스를 종료
sudo service logstash stop

```

#### Install Kibana
```bash
# Ubuntu package 업데이트
sudo apt-get update

# Java JDK 설치
sudo apt-get install openjdk-11-j

# 설치 성공되었으면 버전을 확인
java –version

# 환경변수 추가 (참고로 profile나 ./bashrc에서 추가 권장)
export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
export PATH=$JAVA_HOME/bin/:$PATH
export CLASS_PATH=$JAVA_HOME/lib:$CLASS_PATH

# Kibana서비스를 동작 확인하기 위해서 포트를 세팅
sudo ufw disable
sudo iptables –F
sudo apt-get install iptables-persistent netfilter-persistent
sudo apt install net-tools

# Kibana 기본 포트: 5601
sudo iptables -A INPUT -p tcp --dport 5601 -j ACCEPT

# 포트 설정 확인
netstat –nap


# Ubuntu package 다시 업데이트
sudo apt-get update

# 저장소에 접근 허락해주는 package 설치
sudo apt install apt-transport-https

# 패키지 리포지토리에서 설치
wget -qO - https://artifacts.elastic.co/GPG-KEY-elasticsearch | sudo apt-key add –
sudo sh -c 'echo "deb https://artifacts.elastic.co/packages/7.x/apt stable main" >
/etc/apt/sources.list.d/elastic-7.x.list'

# Ubuntu package 다시 업데이트
sudo apt update

# Kibana 패키지 설치
sudo apt install logstash

# Kibana 서비스를 시작
sudo systemctl enable kibana
sudo service kibana start

# Logstash 서비스를 종료
sudo service kibana stop

```