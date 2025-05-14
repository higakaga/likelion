#!/usr/bin/env bash
REPOSITORY=/home/ubuntu/deploystudy # [프로젝트 이름]

# java 명령어로 돌아가는 프로세스 아이디
CURRENT_PID=$(pgrep -fla action | grep java | awk '{print $1}')

if [ -n "$CURRENT_PID" ]; then # 프로세스가 있으면
	kill -15 $CURRENT_PID
	sleep 5
fi

JAR_NAME=$(ls -tr $REPOSITORY/*.jar | tail -n 1) #실 행 파일 이름
echo "> JAR NAME: $JAR_NAME"
chmod +x $JAR_NAME # 권한 추가
nohup java -jar -Duser.timezone=Asia/Seoul $JAR_NAME >> $REPOSITORY/nohup.out 2>&1 &