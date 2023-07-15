const express = require ('express');
const path = require('path');
const front = express ();
const cors = require ('cors');
const bodyparser = require ('body-parser');
const dbmysql = require('./config/dbconfig');
const mongo = require('mongodb').MongoClient;
 
var jsonParser = bodyparser.json();
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

//var urlencodedParser = bodyparser.urlencoded({ extended: false });
front.post('/nodejsinsert', jsonParser, (req, res) => {       
    var inse = 'INSERT INTO USER (USERNAME, EMAIL, PASSWORD) VALUES (?, ?, ?)'
    var name = req.body.username;
    var email = req.body.email;
    var password = req.body.password;
    var names = [name, email, password];
    console.log(names);    
    dbmysql.query(inse, names, (err, result) => {
        if (err) {
            console.log(err);
        }
        res.send("Successful Add");
    });
});

front.post('/nodejsupdate', jsonParser, (req, res) => {
    var upda = 'UPDATE USER SET EMAIL = ? WHERE USERNAME = ?'
    var name = req.body.username;
    var email = req.body.email;
    var names = [email, name];
    console.log(names);    
    dbmysql.query(upda, names, (err, result) => {
        if (err) {
            console.log(err);
        }
        res.send("Successful Update");
    });
});

front.get('/mongoselectall', function(req, res){    
    mongo.connect('mongodb://localhost:27017/', function(err, db){
        if (err) throw err;
        var dbmongo = db.db('test');
        dbmongo.collection('user').find({}).toArray(function(err, result){
            if (err) throw err;
            res.send(result);
            db.close();
        });
    });                
});
front.get('/mongoselect', function(req, res){    
    mongo.connect('mongodb://localhost:27017/', function(err, db){
        if (err) throw err;
        var dbmongo = db.db('test');
        //console.log(req.query.username);
        dbmongo.collection('user').findOne({"username": req.query.username}, function(err, result){
            if (err) throw err;
            res.send(result);
            db.close();
        });
    });                
});

front.get('/mongodelete', function(req, res){    
    mongo.connect('mongodb://localhost:27017/', function(err, db){
        if (err) throw err;
        var dbmongo = db.db('test');
        dbmongo.collection('user').deleteOne({"username":req.query.username}, function(err, data){
            if (err) throw err;
            res.send(result);
            db.close();
        });
    }); 
});

front.post('/mongoinsert', jsonParser, function(req, res){    
    mongo.connect('mongodb://localhost:27017/', function(err, db){
        if (err) throw err;
        var dbmongo = db.db('test');
        dbmongo.collection('user').insertOne({"username":req.body.username, "email":req.body.email, "password":req.body.password}, function(err, data){
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

front.post('/mongoupdate', jsonParser, function(req, res){    
    mongo.connect('mongodb://localhost:27017/', function(err, db){
        if (err) throw err;
        var dbmongo = db.db('test');
        dbmongo.collection('user').updateOne({"username":req.body.username},{$set:{"email":req.body.email}}, function(err, data){
            console.log(data);
            db.close();
        });
    }); 
}); 