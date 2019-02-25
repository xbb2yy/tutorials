## 安装docker
docker官方只支持centos7以上的版本, 我尝试在6.5装过, 能成功,但为了不必要的问题,我们最好是
在7上安装
如何查看centos版本

        cat /etc/redhat-release

安装docker
 yum -y install docker-io
 
以服务启动docker

service docker start

## 安装mysql

docker search mysql  \#在docker仓库中搜索mysql


docker pull mysql:5.6 \# 安装mysql5.6

运行mysql

docker run -p 53306:3306 -v $PWD/mysql:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=password --name mysql5719 -d 16f9fffc75d8






       