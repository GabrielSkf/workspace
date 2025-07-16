import { Component } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-board',
  templateUrl: './board.component.html',
  styleUrls: ['./board.component.scss'],  
  imports: [
    CommonModule,
    FormsModule
  ],
})
export class BoardComponent {
  boardSizeX = 0;
  boardSizeY = 0;
  squares: number[] = [];

  submit() {
    if (
      this.boardSizeX < 6 || this.boardSizeX > 12 ||
      this.boardSizeY < 6 || this.boardSizeY > 12
    ) {
      alert('Valores devem estar entre 6 e 12.');
      return;
    }

    const total = this.boardSizeX * this.boardSizeY;
    this.squares = Array.from({ length: total }, (_, i) => i);
  }
  
  getSquareImage(index: number): string {
    const row = Math.floor(index / this.boardSizeX);
    const col = index % this.boardSizeX;
    const isLight = (row + col) % 2 === 0;

    return isLight ? 'light.svg' : 'dark.svg';
}


}
