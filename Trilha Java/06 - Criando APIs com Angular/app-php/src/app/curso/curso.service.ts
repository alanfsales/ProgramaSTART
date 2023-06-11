import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
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
        this.vetor = res['cursos'];
        return this.vetor;
      })
    )
  }
}
