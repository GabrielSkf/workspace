import { Component, EventEmitter, inject, Input, Output } from '@angular/core';
import { EnviaFormulario } from '../../services/envia-formulario';

@Component({
  selector: 'app-home',
  imports: [],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {
  private enviaFormularioService = inject(EnviaFormulario)
  name = "Gabriel";
  idButton = "Teste";
  deveMostrarTitulo = false;
  listItems = ['alo','teste','som']

  @Input("name") testee!: string;

  @Output() emitindoValorName = new EventEmitter<string>();
  
  submit() {
    this.emitindoValorName.emit(this.name);
    this.enviaFormularioService.enviaInformacaoParaBackend("enviando informação")
  }

  // meuBooleano = false;

  // atualizaBooleano(valor: boolean) {
  //   this.meuBooleano = valor;
  // }

}
