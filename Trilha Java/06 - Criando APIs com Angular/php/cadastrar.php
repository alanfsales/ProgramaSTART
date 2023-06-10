<?php

//Incluir a conexão
include("conexao.php");


//Obter dados
$obterDados = file_get_contents("php://input");

//Extrair dados do Json
$extrair = json_decode($obterDados);

//Separa os dados do Json
$nomeCurso = $extrair->cursos->nomeCurso;
$valorCurso = $extrair->cursos->valorCurso;

//SQL
$sql = "INSERT INTO cursos (nomeCurso, valorCurso) VALUES('$nomeCurso', $valorCurso)";
mysqli_query($conexao, $sql);

//Exportar os dados cadastrados
$curso = [
    'nomeCurso' => $nomeCurso,
    'valorCurso' => $valorCurso
];

json_encode(['curso' =>$curso]);

?>