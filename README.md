# Setup Skaffold and MicroK8s for Spring Boot local development

### Features coverd in this repo:
- Setup skaffold and deploy to local microk8s
- Spring boot 3.0 snapshot
- Enabled HTTP2 in Webflux and HTTPS in ingress
- Nginx ingress URL rewrite 
- Simple testing case for Webflux
- Grafana, Prometheus, Pushgateway
- Simple Grafana dashboard for Webflux 
- Generate self-signed cert, import into p12 keystore with openssl
- Google jib build image and register to microk8s private registry (localhost:32000)
- ConfigMap volume mapping (Secret, data, hostPath)
- Spring native build  

### Modules enable for microk8s
- dns
- registry
- storage
- ingress
- dns
- cert-manager

### Tools installed in Development VM

Oracle JDK 17
Spring Tools Suite 4
lombok
skaffold
microk8s

install
- oracle jdk 17-lts
- spring tool suite 4
- lombok
- docker
- openssh-server
- kubectl
- skaffold
  https://storage.googleapis.com/skaffold/releases/v1.39.1/skaffold-linux-amd64
- microk8s
- Maven (maven wrapper)
- VS Code + Google Cloud extension
- k9s
- helm

config
- install lombok
- add docker, microk8s group
- docker login to docker hub (for push image)
- dump microk8s config to kubectl

/etc/docker/config

{
    "auths": {
        "https://index.docker.io/v1/": {
            "auth": "a3dvbmdodW5nOlhpcVFSREM0ZGQzTkNXNA=="
        }
    }
}


