const express = require ('express');
const path = require('path');
const front = express ();
const cors = require ('cors');
const dbmysql = require('./config/dbconfig');
const mongo = require('mongodb').MongoClient;

front.use(express.static('../reactjs'));
front.use(cors());
front.listen(8080, () => {
    console.log ('Server is listening on port 8080');
});

front.get('/nodejsselectall', (req, res) => {
    dbmysql.query('SELECT * FROM USER', (err, result) => {
        if (err) {
            console.log(err);
        }
        res.send(result);
    });
});

front.get('/nodejsselect', (req, res) => {
    var select = 'SELECT * FROM USER WHERE USERNAME = ?'
    var name = req.query.username;
    dbmysql.query(select, name, (err, result) => {
        if (err) {
            console.log(err);
        }
        res.send(result);
    });
});

front.get('/nodejsdelete', (req, res) => {
    var dele = 'DELETE FROM USER WHERE USERNAME = ?'
    var name = req.query.username;
    dbmysql.query(dele, name, (err, result) => {
        if (err) {
            console.log(err);
        }
        res.send(result);
    });
});

var jsonParser = front.jsonParser();
var urlencodedParser = front.urlencoded({ extended: false });
front.post('/nodejsinsert', urlencodedParser, (req, res) => {   
    
    var inse = 'INSERT INTO USER (USERNAME, EMAIL, PASSWORD) VALUES (?, ?, ?)'
    var names = req.body.username;
    console.log(names);    
    dbmysql.query(inse, names, (err, result) => {
        if (err) {
            console.log(err);
        }
        res.send(result);
    });
});

front.get('/nodejsupdate', (req, res) => {
    dbmysql.query('UPDATE USER SET email = "cc@hotmail.com" WHERE username = "eric"', (err, result) => {
        if (err) {
            console.log(err);
        }
        res.send("Successful Update");
    });
});

front.get('/mongoretrieve', function(req, res){    
    mongo.connect('mongodb://localhost:27017/', function(err, db){
        if (err) throw err;
        var dbmongo = db.db('test');
        /*dbmongo.collection('user').findOne({}, function(err, result){
            if (err) throw err;
            //console.log(result.email);
            res.send(result);
            db.close();
        });*/
        dbmongo.collection('user').find({}).toArray(function(err, result){
            if (err) throw err;
            res.send(result);
            db.close();
        });
    });                
});

front.get('/mongoinsert', function(req, res){    
    mongo.connect('mongodb://localhost:27017/', function(err, db){
        if (err) throw err;
        var dbmongo = db.db('test');
        dbmongo.collection('user').insertOne({"email":'ddd@gmail.com', "password":'123456', "username":'derek'}, function(err, data){
            if (err){
                res.send('Failure');
            }
            else {
                console.log(data);
                db.close();
            }
            
        });
    }); 
});

front.get('/mongodelete', function(req, res){    
    mongo.connect('mongodb://localhost:27017/', function(err, db){
        if (err) throw err;
        var dbmongo = db.db('test');
        dbmongo.collection('user').deleteOne({"email":'ddd@gmail.com', "password":'123456', "username":'derek'}, function(err, data){
            console.log(data);
            db.close();
        });
    }); 
});

front.get('/mongoupdate', function(req, res){    
    mongo.connect('mongodb://localhost:27017/', function(err, db){
        if (err) throw err;
        var dbmongo = db.db('test');
        dbmongo.collection('user').updateOne({"email":'ddd@gmail.com'},{$set:{"username":'derick'}}, function(err, data){
            console.log(data);
            db.close();
        });
    }); 
}); 