#!/bin/bash

CERT_NAME=selfsigned

rm $CERT_NAME.*

openssl req -newkey rsa:2048 -nodes -keyout $CERT_NAME.key -x509 -days 365 -out $CERT_NAME.crt -config CA-config.txt

openssl x509 -text -noout -in $CERT_NAME.crt

openssl pkcs12 -inkey $CERT_NAME.key -in $CERT_NAME.crt -export -out $CERT_NAME.p12 -passout pass:abcd1234

openssl pkcs12 -in $CERT_NAME.p12 -noout -info -passin pass:abcd1234

cp selfsigned.p12 ../springboot3-webflux/src/main/resources