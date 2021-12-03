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

////////////////////////////////////////////////////////////////////

// & getUserByMatricula

router.get("/getUserByMatricula/:matricula", (req, res)=>{
    var matricula = req.params.matricula
    var sql = "CALL stp_select_user_by_matricula(?)"
    var parametros = [matricula]
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

////////////////////////////////////////////////////////////////////

// ! login

router.post("/login", (req, res) => {
    var usuario = req.body

    var sql = "CALL stp_login(?,?)"
    var parametros = [usuario.matricula, usuario.contrasena]
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
                    matricula: resultado[0].matricula
                }
                res.send(respuesta);
            }else{
                var respuesta = {
                    mensaje: "Credenciales incorrectas",
                    login: false,
                    matricula: 0
                }
                res.send(respuesta);
            }
        }
    })
})

////////////////////////////////////////////////////////////////////

// ^ editUser

router.put('/editUser', function(req, res){

    var usuario = req.body
    var sql = "CALL stp_editar_usuario(?,?,?,?,?,?)"

    var data = [usuario.matricula, usuario.foto, usuario.nombre, usuario.appaterno, usuario.apmaterno, usuario.correo]

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

// ? getMateriaByAlumno

router.get("/getMateriaByAlumno/:matricula", (req, res)=>{
    var matricula = req.params.matricula
    var sql = "CALL stp_select_materia_by_alumno(?)"
    var parametros = [matricula]
    conn.query(sql,parametros, (err, result)=>{
        if(err){
            console.log("ERROR EN CONSULTA: ", err)
            res.send(JSON.stringify("ERROR EN CONSULTA: " + err));
        }else{
            console.log(result[0]);
            res.send(result[0]);
        }
    })
})

////////////////////////////////////////////////////////////////////

// * getMateriaByMaestro

router.get("/getMateriaByMaestro/:matricula", (req, res)=>{
    var matricula = req.params.matricula
    var sql = "CALL stp_select_materia_by_maestro(?)"
    var parametros = [matricula]
    conn.query(sql,parametros, (err, result)=>{
        if(err){
            console.log("ERROR EN CONSULTA: ", err)
            res.send(JSON.stringify("ERROR EN CONSULTA: " + err));
        }else{
            console.log(result[0]);
            res.send(result[0]);
        }
    })
})

////////////////////////////////////////////////////////////////////

// ~ getAlumnosByMateria

router.get("/getAlumnosByMateria/:idmateria", (req, res)=>{
    var idmateria = req.params.idmateria
    var sql = "CALL stp_select_alumnos_by_materia(?)"
    var parametros = [idmateria]
    conn.query(sql,parametros, (err, result)=>{
        if(err){
            console.log("ERROR EN CONSULTA: ", err)
            res.send(JSON.stringify("ERROR EN CONSULTA: " + err));
        }else{
            console.log(result[0]);
            res.send(result[0]);
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