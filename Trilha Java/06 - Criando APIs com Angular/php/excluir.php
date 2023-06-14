<?php

//Incluir a conexão
include("conexao.php");


//Obter dados
//$obterDados = file_get_contents("php://input");


//Extrair dados do Json
//$extrair = json_decode($obterDados);

//Separa os dados do Json
//$idCurso = $extrair->cursos->idCurso;
$idCurso = $_GET['idCurso'];

//SQL
$sql = "DELETE FROM cursos WhERE idCurso= $idCurso";
mysqli_query($conexao, $sql);

?>