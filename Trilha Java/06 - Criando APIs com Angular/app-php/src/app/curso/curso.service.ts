import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { Curso } from './curso';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class CursoService {

  //URL base
  url = "http://localhost/api/php/";

   //Vetor de cursos
   vetor: Curso[] = [];

  constructor(private http: HttpClient) { }

  //Obter todos os cursos
  obterCursos(): Observable<Curso[]>{
    return this.http.get(this.url+"listar").pipe(
      map((res: any) => {
        console.log(res);
        this.vetor = res['cursos'];
        return this.vetor;
      })
    )
  }

  //Cadastrar curso
  cadastrarCurso(c: Curso): Observable<Curso[]>{
    return this.http.post(this.url+'cadastrar', {cursos: c})
      .pipe(map((res: any) => {
        this.vetor.push(res['cursos']);
        return this.vetor;
      }))
  }

  //remover curso
  removerCurso(c: Curso): Observable<Curso[]>{
    let params = new HttpParams().set("idCurso", c.idCurso!.toString());
    return this.http.delete(this.url+'excluir', {params: params})
    .pipe(map((res) => {
      const filtro = this.vetor.filter((curso) =>{
        return curso['idCurso'] !== + c.idCurso!;
      });

      return this.vetor = filtro;
    }))
  }
}
