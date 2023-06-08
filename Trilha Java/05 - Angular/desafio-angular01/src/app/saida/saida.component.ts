import { Component, OnInit } from '@angular/core';
import { Media } from '../types/Media';
import { ListaMediasService } from '../lista-medias.service';
import { NotificacaoService } from '../notificacao.service';

@Component({
  selector: 'app-saida',
  templateUrl: './saida.component.html',
  styleUrls: ['./saida.component.css']
})
export class SaidaComponent implements OnInit{
  medias: Media[] = [];

  constructor(
    private listaMediasService: ListaMediasService,
    private notificacaoService: NotificacaoService
    ){}

  ngOnInit(): void {
    this.medias = this.listaMediasService.mostraMedias();   
  }

  apagarMedia(nomeRemover: string){
    this.medias = this.medias.filter(media => media.nome !== nomeRemover);
    this.listaMediasService.apagaMedia(nomeRemover);
    this.medias = this.listaMediasService.mostraMedias();   
    this.notificacaoService.notifivar("Média excluída com sucesso");
  }

  apagaTudo(){
    this.medias = [];
    this.listaMediasService.limpaLista();
    this.medias = this.listaMediasService.mostraMedias();   
    this.notificacaoService.notifivar("Lista de Médias excluída com sucesso");
  }

  alterarMedia(media: Media){
    this.listaMediasService.alterarMedia(media);
  }
  
}
