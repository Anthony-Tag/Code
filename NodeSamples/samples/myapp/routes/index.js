var express = require('express');
//var bodyParser=require('body-parser')
var nuller=require('multer')
//var router = express.Router();
var app=express()

/* GET home page. */
// router.get('/', function(req, res, next) {
//   res.render('index', { title: 'Not a Express' });
// });

// router.get('/hello', function(req, res, next) {
//   res.render('index', { title: 'Hello World!' });
// });

// router.post('/postme', function(req, res, next) {
//   res.render('index', { title: 'post me' });
// });

app.get('/', function(req, res){
  res.render('form')
});

app.set('view engine', 'pug')
app.set('views', './views')
//applicaation/json
app.use(express.json())

//application/xwxw
app.use(express.json({ extended:true }))

//for parseing form data
//app.use(upload.array())
app.use(express.static('public'))

app.post('/', function(req, res){
  console.log(req.body)
  res.send("request received")

});
module.exports = app;
