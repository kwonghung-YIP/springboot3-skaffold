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

### Modules enable for microk8s
- dns
- registry
- storage
- ingress
- dns
- cert-manager

### Tools installed in Development VM

Spring Boot 3 + Skaffold + HTTP2 + Grafana,Prometheus,PushGateway + Microk8s + dev VM
