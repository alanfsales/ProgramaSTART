<?php 
    //Variáveis de acesso
    $url = "localhost";
    $usuario = "root";
    $senha = "abc121314";
    $base = "api";

    //Conexão
    $conexao = mysqli_connect($url, $usuario, $senha, $base);

    //Arrumar caracteres especiais
    mysqli_set_charset($conexao, "utf8");
?>