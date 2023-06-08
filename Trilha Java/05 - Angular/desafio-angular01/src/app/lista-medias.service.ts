import { Injectable } from '@angular/core';
import { Media } from './types/Media';


@Injectable({
  providedIn: 'root'
})
export class ListaMediasService {
  listaMedias: Media [] = [];

  addMedia(media: Media){
    this.listaMedias.push(media);
    localStorage.setItem("listaMedias", JSON.stringify(this.listaMedias))
  }

  mostraMedias(){
    this.listaMedias = JSON.parse(localStorage.getItem("listaMedias") || "[]");
    return this.listaMedias;
  }

  apagaMedia(nomeRemover: string){
    this.listaMedias = this.listaMedias.filter(media => media.nome !== nomeRemover);
    localStorage.setItem("listaMedias", JSON.stringify(this.listaMedias))
  }

  limpaLista(){
    this.listaMedias = [];
    localStorage.clear();
  }

  alterarMedia(media: Media){

  }

}
