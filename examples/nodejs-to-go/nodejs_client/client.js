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
        container = process.argv[3];
        getContainerStats(client, container);
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

function getContainerStats(client, container) {
    let call = client.getContainerStats({container: container});

    call.on('data', function (stats) {
        console.log("\u001B[2J\u001B[0;0f") // clear screen

        console.log(new Date(), stats);
    });
}



