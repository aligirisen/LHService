FROM mongo
RUN apt update && \
apt install iproute2 -y && \
apt install iputils-ping -y
