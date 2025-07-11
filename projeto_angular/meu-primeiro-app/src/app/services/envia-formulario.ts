import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EnviaFormulario {
  
  constructor() {}

  enviaInformacaoParaBackend(info: string) {
    console.log("enviando para o backend");
  }

}
