<?php

//Inclui a conexão
include("conexao.php");

//Sql
$sql = "SELECT * FROM cursos";

//Executa 
$executar = mysqli_query($conexao, $sql);

//Vetor
$cursos = [];

//Índive
$indice = 0;

//Laço
while ($linha = mysqli_fetch_assoc($executar)) {
    $cursos[$indice]['idCurso'] = $linha['idCurso'];
    $cursos[$indice]['nomeCurso'] = $linha['nomeCurso'];
    $cursos[$indice]['valorCurso'] = $linha['valorCurso'];

    $indice++;
}

//Json
Json_encode(['cursos' =>$cursos]);


?>