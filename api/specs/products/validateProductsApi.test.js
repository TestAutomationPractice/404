'use strict';



const superagent = require('superagent');
require('superagent-retry')(superagent);
const request = require('supertest');
const config = require('../../configuration/config.json');

function makeid(length) {
    var result           = '';
    var characters       = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
    var charactersLength = characters.length;
    for ( var i = 0; i < length; i++ ) {
       result += characters.charAt(Math.floor(Math.random() * charactersLength));
    }
    return result;
 }

describe('/products tests', () => {


    test('Validate GET :: /movies', async() => {
        
        const response = await request(config.baseUrl).get('movies')
            .set('Content-Type', 'application/json')
            .retry(3);
        await expect(response.statusCode).toBe(200);
      
    });


    test('Validate POST :: /movies', async() => {


        const response = await request(config.baseUrl).post('login')
        .send({"username":"admin","password":"password"})
        .retry(3);
        
        const resp = await request(config.baseUrl).post('movies')
            .set('Content-Type', 'application/json')
            .set('user',response.body.id)
            .send({"movie":{"rating":2,"title":makeid(7),"description":makeid(10),"categories":["Comedy"],"image":"https://www.google.com","director":makeid(4),"reviews":[],"rented":false}})
            .retry(3);
        await expect(resp.statusCode).toBe(200);
      

    });


   
});