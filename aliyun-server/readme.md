## 上传本地文件到服务器
scp /Users/lbl/IT/projects/my-project-demo/aliyun-server/target/aliyun-server-1.0.0-SNAPSHOT.jar root@39.106.11.81:/opt/

## 启动命令

nohup java -jar aliyun-server-1.0.0-SNAPSHOT.jar >/opt/logs/provider.log &
