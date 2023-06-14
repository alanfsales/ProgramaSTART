import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Curso } from './curso';
import { CursoService } from './curso.service';

@Component({
  selector: 'app-curso',
  templateUrl: './curso.component.html',
  styleUrls: ['./curso.component.css']
})
export class CursoComponent implements OnInit {

  //Vetor de cursos
  vetor: Curso[] = [];

  //Objeto da classe curso
  curso = new Curso();

  //Construtor
  constructor(private curso_servico: CursoService){}

  //Inicializador
  ngOnInit(): void {
    //Ao iniciar o sistema, deverá lista os cursos
    this.selecao();
  }

  //Cadastrar
  cadastro(){
    this.curso_servico.cadastrarCurso(this.curso).subscribe(
      (res: Curso[]) => {
        //Adiciona dados ao vetor
        this.vetor = res;

        //Limpar os atributos
        this.curso.nomeCurso = "";
        this.curso.valorCurso = 0;

        //Atualizar a listagem
        this.selecao();
      }
    )
  }

  //Seleção
  selecao(){
    this.curso_servico.obterCursos().subscribe(
      (res: Curso[]) => {
        this.vetor = res;
      }
    )
  }

  //Alterar
  alterar(){
    this.curso_servico.atuaizarCurso(this.curso).subscribe(
      (res) => {
        //Atualizar o vetor
        this.vetor = res;

        //Limpar os valores do objeto
        this.curso.nomeCurso = "";
        this.curso.valorCurso = 0;

        //Atualiza a listagem
        this.selecao();
      }
    )
  }

  //Remover
  remover(c: Curso){
    this.curso_servico.removerCurso(c).subscribe(
      (res: Curso[]) => {
        this.vetor = res;

        this.curso.nomeCurso = "";
        this.curso.valorCurso = 0;

        this.selecao();
      }
    )
  }

  //Selecionar curso específico
  selecionarCurso(c: Curso){
    this.curso.idCurso = c.idCurso;
    this.curso.nomeCurso = c.nomeCurso;
    this.curso.valorCurso = c.valorCurso;
  }

}
