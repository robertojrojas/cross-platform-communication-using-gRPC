'use strict';

const PROTO_PATH = '../pb/docker/service.proto';

const fs = require('fs');
const process = require('process');
const grpc = require('grpc');
const serviceDef = grpc.load(PROTO_PATH);
const PORT = 9090;

const client = new serviceDef.DockerService(`localhost:${PORT}`, grpc.credentials.createInsecure());


var option = parseInt(process.argv[2], 10);

switch (option) {
    case 1:
        getAllContainers(client);
        break;
    case 2:
        addPhoto(client);
        break;
    case 5:
        saveAll(client);
        break;
}


function getAllContainers(client) {
    let call = client.getAllContainers({}, function(err, response) {
        if (err) {
           console.log(err);
        } else {
           console.log(response);
        }
    });
}



