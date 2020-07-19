# JASpringAdminBoot

Custom Spring Admin Boot

# RUN DOCKER ADMIN - BOOT  

## Valores de ejemplo:

docker run -d -t --network host -w "/workspace/logs-api" \
-e ADMINBOOT_SERVER_PORT="9999" \
-e ADMINBOOT_SERVER_SECUR_USER_NAME="admin" \
-e ADMINBOOT_SERVER_SECUR_USER_PASSWORD="XXXXX" \
-e ADMINBOOT_SERVER_NOTIFYMAIL_TO="araucovillar@gmail.com" \
-e ADMINBOOT_SERVER_MAIL_HOST="smtp.gmail.com" \
-e ADMINBOOT_SERVER_MAIL_PORT="587" \
-e ADMINBOOT_SERVER_MAIL_USER="araucovillar@gmail.com" \
-e ADMINBOOT_SERVER_MAIL_PASSWORD="XXXXX" \
-e ADMINBOOT_SERVER_MAIL_PROTOCOL="smtp" \
-e ADMINBOOT_SERVER_MAIL_TESTCONNECT="false" \
-e ADMINBOOT_SERVER_NOTIFYMAIL_ENABLED="true" \
-e BUILD_PROFILE="prod" \
 021dad090253 \
--net=host -p 8099:9999 
