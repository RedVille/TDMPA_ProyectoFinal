var express = require('express');
var router = express.Router();

var mysql = require('mysql2');

var conn = mysql.createConnection({
    host:'localhost',
    user:'root',
    password:'',
    database:'vampi_escuela',
    port:'3306'
})



conn.connect(function(err){
    if(err)
    console.log("ERROR AL CONECTAR CON BD: ", err);
    else
    console.log("CONECTADO A BASE DE DATOS");
})

////////////////////////////////////////////////////


//LOGIN Y LOGOUT

router.post("/getNameById/:id", (req, res)=>{
    var id = req.params.id
    var sql = "CALL stp_GetNameById(?)"
    var parametros = [id]
    conn.query(sql,parametros, (err, result)=>{
        if(err){
            console.log("ERROR EN CONSULTA: ", err)
            res.send(JSON.stringify("ERROR EN CONSULTA: " + err));
        }else{
            console.log(result[0]);
            res.send(result[0][0]);
        }
    })
})

router.post("/login", (req, res) => {
    var usuario = req.body

    var sql = "CALL stp_login(?,?)"
    var parametros = [usuario.usuario, usuario.password]
    conn.query(sql,parametros, (err, result)=>{
        if(err){
            console.log("ERROR EN CONSULTA: ",err)
            res.send(JSON.stringify("ERROR EN CONSULTA:"+err));
        }
        else{
            console.log(result[0]);
            var resultado = result[0]
            if(resultado[0] != undefined){
                var respuesta = {
                    mensaje: "Bienvenido(a)",
                    login: true,
                    id: resultado[0].id
                }
                res.send(respuesta);
            }else{
                var respuesta = {
                    mensaje: "Credenciales incorrectas",
                    login: false,
                    id: 0
                }
                res.send(respuesta);
            }
        }
    })
})

router.post("/logout", (req, res)=>{
    res.send("sesión cerrada correctamente")
})


//////////////////////////////////////////////////////////////

//REGISTRO

router.post('/adduser', (req, res) => {

    var usuario = req.body
    var sql = "CALL stp_adduser(?,?,?,?,?,?)"
    var data = [usuario.usuario, usuario.nombre, usuario.apellido, usuario.correo, usuario.password, usuario.cumple]

    conn.query(sql, data, (err, results) =>{
        if(err){
            console.log('ERROR EN LA CONSULTA: ', err);
        }else{
            console.log(results[0]);
            res.send(results[0]);
        }
    })
})

////////////////////////////////////////////////////////////////////

//GETUSERBYID

router.get('/getmoviebyid/:ID', function(req, res){
    var id = req.params.ID

    var sql = "CALL stp_getmoviebyid(?)"

    var data = [id]
    conn.query(sql, data, function(err, results){
        if(err){
            console.log('ERROR EN LA CONSULTA: ', err);
        }else{
            console.log(results[0]);
            res.send(results[0]);
        }
    })
})

////////////////////////////////////////////////////////////////////

//GETALLMOVIES

router.get('/getallmovies', function(req, res){

    var sql = "CALL stp_getallmovies()";
    conn.query(sql, function(err, results){
        if(err){
            console.log('ERROR EN LA CONSULTA: ', err);
        }else{
            console.log(results[0]);
            res.send(results[0]);
        }
    })
})


/////////////////////////////////////////////////////////////////////

//GETMOVIESBYCATEGORY

router.get('/getmoviesbycategory/:CATEGORIA', function(req, res){
    var categoria = req.params.CATEGORIA

    var sql = "CALL stp_getmoviesbycategory(?)"

    var data = [categoria]
    conn.query(sql, data, function(err, results){
        if(err){
            console.log('ERROR EN LA CONSULTA: ', err);
        }else{
            console.log(results[0]);
            res.send(results[0]);
        }
    })
})



////////////////////////////////////////////////////////////////////////

//GETMOVIESBYNAME

router.get('/getmoviesbyname/:TITULO', function(req, res){
    var titulo = req.params.TITULO

    var sql = "CALL stp_getmoviesbyname(?)"

    var data = [titulo]
    conn.query(sql, data, function(err, results){
        if(err){
            console.log('ERROR EN LA CONSULTA: ', err);
        }else{
            console.log(results[0]);
            res.send(results[0]);
        }
    })
})


////////////////////////////////////////////////////////////////////////

//ADDLIST

router.post('/addtomylista', (req, res) => {

    var usuario = req.body
    var sql = "CALL stp_addtomylista(?,?)"
    var data = [usuario.id_peli, usuario.id_usuario]

    conn.query(sql, data, (err, results) =>{
        if(err){
            console.log('ERROR EN LA CONSULTA: ', err);
        }else{
            console.log(results[0]);
            res.send(results[0]);
        }
    })
})


//////////////////////////////////////////////////////////////////////

//ADDMOVIES

router.post('/addmovies', (req, res) => {

    var usuario = req.body
    var sql = "CALL stp_addmovies(?,?,?,?)"
    var data = [usuario.titulo, usuario.categoria, usuario.ruta, usuario.imagen]

    conn.query(sql, data, (err, results) =>{
        if(err){
            console.log('ERROR EN LA CONSULTA: ', err);
        }else{
            console.log(results[0]);
            res.send(results[0]);
        }
    })
})

/////////////////////////////////////////////////////////////////////////

//DELETEMOVIES

router.delete("/deletemovies/:ID", function(req, res){
    var id = req.params.ID
    var sql = "CALL stp_deletemovies(?)"
    var data = [id]
    conn.query(sql, data, function(err, results){
        if(err){
            console.log('ERROR EN LA CONSULTA: ', err);
        }else{
            console.log(results[0]);
            if(results[0].length != 0){
                res.send(JSON.stringify("NO SE HA ELIMINADO EL REGISTRO"))
            }else
            res.send(JSON.stringify("SE HA ELIMINADO EL REGISTRO"));
        }
    })
})


/////////////////////////////////////////////////////////////////////////////

//CREATEGROUP


router.post('/creategroup', (req, res) => {

    var usuario = req.body
    var sql = "CALL stp_creategroup(?,?,?,?,?)"
    var data = [usuario.nombre, usuario.tipo, usuario.imagen, usuario.descripcion, usuario.id_admin]

    conn.query(sql, data, (err, results) =>{
        if(err){
            console.log('ERROR EN LA CONSULTA: ', err);
        }else{
            console.log(results[0]);
            res.send(results[0]);
        }
    })
})


//////////////////////////////////////////////////////////////////////////////

//GETGROUPBYTYPE

router.get('/getgroupbytype/:TIPO', function(req, res){
    var tipo = req.params.TIPO

    var sql = "CALL stp_getgroupbytype(?)"

    var data = [tipo]
    conn.query(sql, data, function(err, results){
        if(err){
            console.log('ERROR EN LA CONSULTA: ', err);
        }else{
            console.log(results[0]);
            res.send(results[0]);
        }
    })
})

///////////////////////////////////////////////////////////////////////////////////

//GETGROUPBYID

router.get('/getgroupbyid/:ID', function(req, res){
    var id = req.params.ID

    var sql = "CALL stp_getgroupbyid(?)"

    var data = [id]
    conn.query(sql, data, function(err, results){
        if(err){
            console.log('ERROR EN LA CONSULTA: ', err);
        }else{
            console.log(results[0]);
            res.send(results[0]);
        }
    })
})

///////////////////////////////////////////////////////////////////////////////////

//ADDUSERINTOGROUP


router.post('/adduserintogroup', (req, res) => {

    var usuario = req.body
    var sql = "CALL stp_adduserintogroup(?,?)"
    var data = [usuario.id_usuario, usuario.id_grupo]

    conn.query(sql, data, (err, results) =>{
        if(err){
            console.log('ERROR EN LA CONSULTA: ', err);
        }else{
            console.log(results[0]);
            res.send(results[0]);
        }
    })
})

///////////////////////////////////////////////////////////////////////////////////

//GETALLFRIENDS

router.get('/getallfriends/:ID', function(req, res){
    var id = req.params.ID

    var sql = "CALL stp_getallfriends(?)";

    var data = [id]
    
    conn.query(sql, data, function(err, results){
        if(err){
            console.log('ERROR EN LA CONSULTA: ', err);
        }else{
            console.log(results[0]);
            res.send(results[0]);
        }
    })
})

///////////////////////////////////////////////////////////////////////////////////

//ADDFRIEND

router.post('/addfriend', (req, res) => {

    var usuario = req.body

    var sql = "CALL stp_addfriend(?,?)"
    var data = [usuario.id_usuario1, usuario.id_usuario2]

    conn.query(sql, data, (err, results) =>{
        if(err){
            console.log('ERROR EN LA CONSULTA: ', err);
        }else{
            console.log(results[0]);
            res.send(results[0]);
        }
    })
})

///////////////////////////////////////////////////////////////////////////////////

//GETUSERBYID

router.get('/getuserbyid/:ID', function(req, res){
    var id = req.params.ID

    var sql = "CALL stp_getuserbyid(?)"

    var data = [id]
    conn.query(sql, data, function(err, results){
        if(err){
            console.log('ERROR EN LA CONSULTA: ', err);
        }else{
            console.log(results[0]);
            res.send(results[0]);
        }
    })
})

///////////////////////////////////////////////////////////////////////////////////

//ADDFRIEND

router.put('/edituser', function(req, res){

    var usuario = req.body
    var sql = "CALL stp_edituser(?,?,?,?,?,?,?)"

    var data = [usuario.id_usuario, usuario.usuario, usuario.nombre, usuario.apellido, usuario.correo, usuario.password, usuario.cumple]

    conn.query(sql, data, function(err, results){
        if(err){
            console.log('ERROR EN LA CONSULTA: ', err);
        }else{
            console.log(results[0]);
            res.send(results[0]);
        }
    })
})

///////////////////////////////////////////////////////////////////////////////////

//GETMYLIST

router.get('/getmylist/:ID', function(req, res){
    var id = req.params.ID

    var sql = "CALL stp_getmylist(?)"

    var data = [id]
    conn.query(sql, data, function(err, results){
        if(err){
            console.log('ERROR EN LA CONSULTA: ', err);
        }else{
            console.log(results[0]);
            res.send(results[0]);
        }
    })
})

module.exports = router 

//para acceder al modulo apartir del app.js