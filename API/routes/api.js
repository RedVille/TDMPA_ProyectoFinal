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

// & getCalif

router.post('/getCalif', function(req, res){

    var usuario = req.body
    var sql = "CALL stp_select_calif(?,?)"

    var data = [usuario.idmateria, usuario.matricula]

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

// ! editCalif

router.put('/editCalif', function(req, res){

    var usuario = req.body
    var sql = "CALL stp_update_calif(?,?,?,?)"

    var data = [usuario.iddetalle_alumno, usuario.calif1, usuario.calif2, usuario.calif3]

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

// & getMateriaById

router.get("/getMateriaById/:idmateria", (req, res)=>{
    var idmateria = req.params.idmateria
    var sql = "CALL stp_select_materia_by_id(?)"
    var parametros = [idmateria]
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

module.exports = router 
