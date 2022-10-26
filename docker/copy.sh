#!/bin/sh

# 复制项目的文件到对应docker路径，便于一键生成镜像。
usage() {
	echo "Usage: sh copy.sh"
	exit 1
}


# copy sql
echo "begin copy sql "
cp ../sql/ry_20220814.sql ./mysql/db
cp ../sql/ry_config_20220510.sql ./mysql/db

# copy html
echo "begin copy html "
cp -r ../xc-ui/dist/** ./nginx/html/dist


# copy jar
echo "begin copy xc-gateway "
cp ../xc-gateway/target/xc-gateway.jar ./ruoyi/gateway/jar

echo "begin copy xc-auth "
cp ../xc-auth/target/xc-auth.jar ./ruoyi/auth/jar

echo "begin copy xc-visual "
cp ../xc-visual/xc-monitor/target/xc-visual-monitor.jar  ./ruoyi/visual/monitor/jar

echo "begin copy xc-modules-system "
cp ../xc-modules/xc-system/target/xc-modules-system.jar ./ruoyi/modules/system/jar

echo "begin copy xc-modules-file "
cp ../xc-modules/xc-file/target/xc-modules-file.jar ./ruoyi/modules/file/jar

echo "begin copy xc-modules-job "
cp ../xc-modules/xc-job/target/xc-modules-job.jar ./ruoyi/modules/job/jar

echo "begin copy xc-modules-gen "
cp ../xc-modules/xc-gen/target/xc-modules-gen.jar ./ruoyi/modules/gen/jar

