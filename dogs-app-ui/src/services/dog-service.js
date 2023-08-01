import http from './axios-common';

export function getAllDogs(){
    return http.get("/all");
}

export function getNumberOfDogs(){
    return http.get("/number");
}

