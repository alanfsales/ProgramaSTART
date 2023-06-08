import { Component } from '@angular/core';
import { Media } from '../types/Media';
import { ListaMediasService } from '../lista-medias.service';
import { SaidaComponent } from '../saida/saida.component';
import { NotificacaoService } from '../notificacao.service';
import { FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-entrada',
  templateUrl: './entrada.component.html',
  styleUrls: ['./entrada.component.css']
})
export class EntradaComponent {

  nome = "";
  n1 = 0;
  n2 = 0;
   
  constructor(
    private listaMedias: ListaMediasService,
    private notificacaoService: NotificacaoService
  ){ }

  addMedia(){
    this.listaMedias.addMedia({nome: this.nome, n1: this.n1, n2: this.n2}); 
    this.notificacaoService.notifivar("Média calculada e salva com sucesso");
  }

}
