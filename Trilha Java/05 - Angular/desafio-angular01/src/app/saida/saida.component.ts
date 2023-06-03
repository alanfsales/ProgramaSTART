import { Component, OnInit } from '@angular/core';
import { Media } from '../types/Media';
import { ListaMediasService } from '../lista-medias.service';

@Component({
  selector: 'app-saida',
  templateUrl: './saida.component.html',
  styleUrls: ['./saida.component.css']
})
export class SaidaComponent implements OnInit{
  medias: Media[] = [];

  constructor(private listaMedias: ListaMediasService){}

  ngOnInit(): void {
    this.medias = this.listaMedias.mostraMedias();   
  }

  apagarMedia(nomeRemover: string){
    this.medias = this.medias.filter(media => media.nome !== nomeRemover);
    this.listaMedias.apagaMedia(nomeRemover);
  }

  apagaTudo(){
    this.medias = [];
    this.listaMedias.limpaLista();
  }
  
}
