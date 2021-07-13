const express = require('express')
const app=express()
const port=3000

app.use('/static/', express.static(`NodeExamples`))
app.use(express.static(`NodeExamples`))

app.get('/', function(req,res){
    res.send("Hello World!")
})

app.post('/', function(req, res){
    res.send("Post Method")
})
app.delete('/', function(req, res){
    res.send("Delete Method")
})
app.put('/', function(req, res){
    res.send("Put Method")
})
// app.static(root, [options])



app.listen(port, ()=>{
    console.log('Example app listening at http://localhost:${port}')
})